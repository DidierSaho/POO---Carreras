public  abstract class Carrera {

    protected String nombre;
    protected int distancia;

    protected  Carrera(String nombre, int distancia) {
        this.nombre = nombre;
        this.distancia = distancia;
    }


    public abstract void anotar(Corredor corredor);

    public abstract void devolverParticipantes();

}