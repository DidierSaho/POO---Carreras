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
//       calle.devolverParticipantes();
//       System.out.println();

       aventura.anotar(Didier);
       recreativa.anotar(Didier);
       aventura.anotar(Didier);

       System.out.println(Didier.getMaximaDistancia()); // funciona

//       System.out.println(Didier.getPuntaje());
//       System.out.println(Didier.getCantidadCarreras());


       Sponsor saucony = new Sponsor();
       Corredor Paul = new Corredor("Paul", true);
       Paul.setPuntaje(16); // los hice de manera auxiliar para la prueba
       Paul.setCantidadCarrerasParticipadas(2); // los hice de manera auxiliar para la prueba

       Corredor Monica = new Corredor("Monica", true);
       Monica.setCantidadCarrerasParticipadas(10);

       CarreraDeAventura PatagorinaRun = new CarreraDeAventura("PatagoniaRun", 45,1900);
       PatagorinaRun.anotar(Paul);

       CarreraDeCalle CarreraMaya = new CarreraDeCalle("Carrera Maya",1000);
       CarreraMaya.anotar(Didier);
       CarreraMaya.anotar(Paul);
       CarreraMaya.anotar(Monica);

       saucony.patrocinar(PatagorinaRun);
       saucony.patrocinar(Monica);

       saucony.patrocinar(Paul);
       saucony.patrocinar(CarreraMaya);
       System.out.println(saucony.getCantidadPatrocinada());


    }

}
