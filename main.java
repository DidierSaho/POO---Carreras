public class main {
    public static void main(String[] args) {
       CarreraDeCalle calle = new CarreraDeCalle("2kmBelgrano",10);

       Corredor Didier = new Corredor("Didier", true);
       Corredor Carlos = new Corredor("Carlos", true);

       calle.anotar(Didier);
       calle.anotar(Carlos);

       calle.devolverParticipantes();

       calle.getDatosCarrera();

       System.out.println(Didier.getCantidadCarreras());

    }
}
