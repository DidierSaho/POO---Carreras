import java.util.HashSet;

public class CarreraRecreativa extends Carrera{
    private HashSet<Corredor> corredores;
    protected CarreraRecreativa(String nombre, int distancia) {
        super(nombre, distancia);
        corredores = new HashSet<>();
    }



    @Override
    public void anotar(Corredor corredor) {
        corredores.add(corredor);
        corredor.aumentarCantidad();
        corredor.agregarDistancia(this.distancia);
    }

    @Override
    public void devolverParticipantes() {
        for (Corredor corredor : corredores) {
            System.out.print(corredor.getNombre() + ' ');
        }
    }
}
