public class main {
    public static void main(String[] args) {
       CarreraDeCalle calle = new CarreraDeCalle("Carrera en la Calle",10);
       CarreraDeAventura aventura = new CarreraDeAventura("Carrera de Aventura",60,2000);
       CarreraRecreativa recreativa = new CarreraRecreativa("Carrera Recreativa", 40);


       Corredor Didier = new Corredor("Didier", true);
       Corredor Carlos = new Corredor("Carlos", true);
       Corredor Pedro = new Corredor("Pedro", false);

       calle.anotar(Didier);
       calle.anotar(Carlos);
       calle.anotar(Pedro); // No se anota porque su certificado no esta al dia.
       calle.devolverParticipantes();
       System.out.println();

       aventura.anotar(Didier);
       recreativa.anotar(Didier);

       System.out.println(Didier.getPuntaje());
       System.out.println(Didier.getCantidadCarreras());


    }
}
