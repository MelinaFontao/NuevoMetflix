package app;

import java.util.*;

public class App {

    public static Scanner Teclado = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        Scanner Entrada = new Scanner (System.in);
        int opcion;
        String opcionpelicula;
        String opcionserie;
        int opcionTemporada;
        int opcionEpisodio;


        //A partir de Metflix, buscar la temporada 5 episodio 1 de la serie
        //How i met your mother y
        //reproducir el episodio.

        //Vamos a instanciar a Metflix:
        Metflix miMetflix = new Metflix();
    
        System.out.println("Inicializando catalogo de Metflix");//No hace nada, solo se ve bonito.

        miMetflix.inicializarCatalogo();//Estoy llamando al metodo que crea las pelis y series.

        System.out.println("Que desea mirar en Metflix?");
        System.out.println("1. Pelicula");
        System.out.println("2. Serie");
        System.out.println("3. Ver el trailer de los actores y peliculas nominadas");

        opcion = Entrada. nextInt();

        switch (opcion){
         case 1:
          
            miMetflix.listaPeliculas();
            System.out.println("Ingrese el nombre de la pelicula que quiere reproducir: ");
            opcionpelicula = Teclado.nextLine();

            //Vamos a reproducir una pelicula
           Pelicula peliculaBuscada = miMetflix.buscarPelicula(opcionpelicula);

            if (peliculaBuscada == null){
              System.out.println("Pelicula no existe");
               return;
            }

           Pelicula pelicula = peliculaBuscada;
           pelicula.reproducir();
  
         break;
         
         
         case 2:

           miMetflix.listaSeries();
           System.out.println("Ingrese el nombre de la serie que quiere reproducir: ");
           opcionserie = Teclado.nextLine();

            //Metflix es el encargado de buscar una serie.
            // Vamos a tener que enviar un metodo que se llame BuscarSerie
           //Si la serie es encontrada, creo una variable que guarde el resultado,
           // sino esta serie encontrada se me pierde.

          //Creo la variable
           Serie serieBuscada = miMetflix.buscarSerie(opcionserie); 
           //Aca guarde el resultado de la serie encontrada en buscarSerie

           if (serieBuscada == null){
            System.out.println("Serie no existe");
            return; //No reproduce nada mas
           }
   
           //Asigno la serie encontrada en una variable

           System.out.println("Ingrese el numero de temporada de la serie que quiere reproducir: ");
           opcionTemporada = Teclado.nextInt();


           Temporada temporada = serieBuscada.buscarTemporada(opcionTemporada);

           System.out.println("Ingrese el numero de episodio de la serie que quiere reproducir: ");
           temporada.listaEpisodios();

           opcionEpisodio = Teclado.nextInt();

           //Asigno el episodio encontrado en una variable
           Episodio episodio = temporada.buscarEpisodio(opcionEpisodio);
   
           //Llamamos al metodo reproducir episodio
           episodio.reproducir();

           //Ahora quiero imprimir un cartel que diga:
           //que lo que se acaba de reproducir arriba es un
           //websodio o un episodio
           //pero en un print aparte.

          if (episodio instanceof Websodio){
            System.out.println("El episodio era una Websodio");

          }
          else{
            System.out.println("Es un episodio");
          }

          //Ahora quiero que si es un Websodio, imprima el link del websodio.

          if (episodio instanceof Websodio){
            //Castear: es el proceso donde "desenmascaramos" a una variable.
            Websodio websodio = (Websodio) episodio;
            System.out.println("El link del websodio es: " + websodio.link);
          }
           
          break;
          case 3:

            //Voy a llamar al metodo de reproducir el trailer

            miMetflix.mostrarNominaciones();
          break;
         
         
          default: 
             System.out.println("El dato ingresado no es una opcion valida.");
            

        }


    }
}

