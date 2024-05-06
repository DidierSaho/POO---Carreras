import  java.util.ArrayList;
import  java.util.HashSet;
import java.util.Set;


public class CarreraDeCalle extends Carrera{

    private HashSet<Corredor> corredores;


    protected CarreraDeCalle(String nombre, int distancia) {
        super(nombre, distancia);
        corredores = new HashSet<>();
    }

    public void anotar(Corredor corredor) {
       if (this.distancia >= 10 && corredor.certificadoAlDia) {
           corredores.add(corredor);
           corredor.aumentarCantidad();
       } else if (this.distancia < 10) {
           corredores.add(corredor);
           corredor.aumentarCantidad();

       } else{
           System.out.println("No tiene el certificado al dia");
       }

    }

    public Set<Corredor> obtenerCorredores(){
        return corredores;
    }

    @Override
    public void devolverParticipantes() {
        for (Corredor corredor : corredores) {
            System.out.print(corredor.getNombre() + ' ');
        }
    }


}