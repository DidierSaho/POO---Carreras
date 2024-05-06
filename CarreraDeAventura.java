import java.util.HashSet;

public class CarreraDeAventura extends Carrera{

    private HashSet<Corredor> corredores;
    private int desnivel = 0;
    private int puntaje = 0;
    protected CarreraDeAventura(String nombre, int distancia, int desnivel, int puntaje) {
        super(nombre, distancia);
        this.desnivel = desnivel;
        this.puntaje = calcularPuntaje();
    }

    private int calcularPuntaje(){
       return (desnivel / 1000 + distancia /20);
    }
    @Override
    public void anotar(Corredor corredor) {
        corredores.add(corredor);
        corredor.aumentarCantidad();
    }
    @Override
    public void devolverParticipantes() {
        for (Corredor corredor: corredores) {
            System.out.print(corredor.getNombre() + ' ');
        }

    }
}
