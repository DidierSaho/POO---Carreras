import  java.util.ArrayList;
import  java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Corredor implements Patrocinable {
    private String nombre;
    private Boolean certificadoAlDia;
    private int puntaje = 0;

    private int distanciaMaxima = -9999;
    private int cantidadCarrerasParticipadas = 0;

    //private HashSet<Integer> distancias;




   public Corredor(String nombre, boolean certificadoAlDia){
       this.nombre = nombre;
       this.certificadoAlDia = certificadoAlDia;
       //distancias = new HashSet<>();// no usar hash

   }

   public void agregarDistancia(int distancia) {
       int valor = distancia;
           if (valor > distanciaMaxima) {
               distanciaMaxima = valor;
           }
       }



    public int getMaximaDistancia(){
       return distanciaMaxima;
    }




   public boolean getCertificado(){
       return this.certificadoAlDia;
   }
   public void setPuntaje(int puntaje) {
       this.puntaje += puntaje;
   }

    public void setCantidadCarrerasParticipadas(int cantidad) {
        this.cantidadCarrerasParticipadas += cantidad;
    }

   public int getPuntaje(){
       return this.puntaje;
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

    @Override
    public boolean esPatrocinable() {
        boolean bandera = false;
        if(this.getCantidadCarreras() >3) {
            bandera = true;
        }
        return bandera;
    }
}
