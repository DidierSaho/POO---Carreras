import  java.util.ArrayList;
import  java.util.HashSet;
import java.util.Set;


public class CarreraDeCalle extends Carrera implements Patrocinable{

    private HashSet<Corredor> corredores;



    protected CarreraDeCalle(String nombre, int distancia) {
        super(nombre, distancia);
        corredores = new HashSet<>();
    }

    @Override
    public void anotar(Corredor corredor) {
       if (this.distancia >= 10 && corredor.getCertificado()) {
           corredores.add(corredor);
           corredor.aumentarCantidad();
           corredor.agregarDistancia(this.distancia);
       } else if (this.distancia < 10) {
           corredores.add(corredor);
           corredor.aumentarCantidad();
           corredor.agregarDistancia(this.distancia);

       }

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
       if (corredores.size() >= 100) {
           bandera = true;
       }
       return bandera;

    }
}