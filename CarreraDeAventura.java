import java.util.HashSet;

public class CarreraDeAventura extends Carrera implements Patrocinable {

    private HashSet<Corredor> corredores;
    private int desnivel = 0;
    private int puntaje = 0;

    protected CarreraDeAventura(String nombre, int distancia, int desnivel) {
        super(nombre, distancia);
        this.desnivel = desnivel;
        this.puntaje = calcularPuntaje();
        corredores = new HashSet<>();
    }

    private int calcularPuntaje() {
        return (desnivel / 1000 + distancia / 20);
    }


    @Override
    public void anotar(Corredor corredor) {
        corredores.add(corredor);
        corredor.aumentarCantidad();
        corredor.setPuntaje(this.puntaje);
        corredor.agregarDistancia(this.distancia);
    }

    @Override
    public void devolverParticipantes() {
        for (Corredor corredor : corredores) {
            System.out.print(corredor.getNombre() + ' ');
        }

    }

    @Override
    public boolean esPatrocinable() {
        boolean bandera = false;
        if (this.desnivel >2000) {
            for (Corredor corredor: corredores) {
                if (corredor.getPuntaje() >= 5) {
                    bandera = true;
                    break;
                }
            }
        }
        return bandera;
    }
//        if (corredores.size() >=1 || this.desnivel >= 2000) {
//            for (Corredor corredor: corredores) {
//                if (corredor.getPuntaje() >= 5) {
//                    bandera = true;
//
//                }
//            }
//        }

}
