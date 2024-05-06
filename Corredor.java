public class Corredor {
    String nombre;
    Boolean certificadoAlDia;
    int puntaje = 0;
    int distanciaMaxima = 0;
    int cantidadCarrerasParticipadas = 0;


   public Corredor(String nombre, boolean certificadoAlDia){
       this.nombre = nombre;
       this.certificadoAlDia = certificadoAlDia;
   }

   public void setPuntaje(int puntaje) {
       this.puntaje += puntaje;
   }

   public int  getCantidadCarreras(){
       return this.cantidadCarrerasParticipadas;
   }


  public void aumentarCantidad() {
       this.cantidadCarrerasParticipadas += 1;
  }
  public String getNombre(){
       return this.nombre;
  }

}
