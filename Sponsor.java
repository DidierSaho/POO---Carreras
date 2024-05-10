import java.util.HashSet;
public class Sponsor {

    String nombre;
    int cantidadSponsoreados = 0;
    private HashSet<Patrocinable> setPatrocinable = new HashSet<>();

   public int  getCantidadPatrocinada(){
       return cantidadSponsoreados;
   }

   public void patrocinar(Patrocinable objetoPatrocinable) {
       if (objetoPatrocinable.esPatrocinable()) {
           setPatrocinable.add(objetoPatrocinable);
           cantidadSponsoreados+=1;
       }
   }
//    public void patrocinar(CarreraDeCalle carrera) {
//        if (carrera.esPatrocinable()) {
//            setPatrocinable.add(carrera);
//            cantidadSponsoreados+=1;
//        }
//    }
//
//    public void patrocinar(CarreraDeAventura carrera) {
//        if (carrera.esPatrocinable()) {
//            setPatrocinable.add(carrera);
//            cantidadSponsoreados+=1;
//        }
//    }
//
//    public void patrocinar(Corredor corredor) {
//        if (corredor.esPatrocinable()) {
//            setPatrocinable.add(corredor);
//            cantidadSponsoreados+=1;
//        }
//    }

//    public void patrocinar(CarreraRecreativa carrera) {
//        if (carrera.esPatrocinable()) {
//            setPatrocinable.add(carrera);
//        }
//    } Supuestamente se agregaria en el futuro



}