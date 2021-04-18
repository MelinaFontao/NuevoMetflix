package app;

import java.util.ArrayList;
import java.util.List;
import app.personas.*;

public class Metflix {
    public List<Pelicula> peliculas = new ArrayList<>();
    public List<Serie> series = new ArrayList<>();
    public List<INominable> nominados = new ArrayList();



    //Metodo que inicializa el catalogo con las pelis/series que querramos

    public void inicializarCatalogo(){
       //Este metodo no devuelve nada, pero rellena las listas tanto de peliculas
       //como de series
       //La infomacion de las listas, en este caso, no seria codeada sino que 
       //ingresada por nosotros mismos.

       //Pelis: Titanic, Batman: El caballero de la noche.
       //Declaro la variable pelicula que la llamo titanic
       //Pelicula titanic; //declara una variable que apuntara a una Pelicula. 
       //Creo el espacio de memoria y la instancie llamando a new
       //titanic = new Pelicula(); //Estas dos ultimas lineas: Pelicula titanic = new Pelicula();

       
       Pelicula titanic = new Pelicula("Titanic", 1997, 210 );


       //A esa variable titanic le puse nombre, duracion y año de lanzamiento
       //titanic.setNombre("Titanic");
       //titanic.setAñoLanzamiento(1997);
       //titanic.duracion = 210; // 3hs 30min



       //Creo un actor, con la variable actor, lo instacio y le pongo nombre
       Actor actor = new Actor();
       actor.setNombre ("Leo Dicaprio");

       //Agrego a la lista de actores del objeto titanic
       titanic.getActores().add(actor);//metodo Add -> agregar a una lista

       //Recien ahora estoy agregando a Titanic al catalogo
       this.peliculas.add(titanic); //this se usa para agregar a la lista de una misma clase.

       //Pelicula:Batman: el caballero de la noche---------------------------------------------------
       Pelicula batman = new Pelicula("Batman: el caballero de la noche", 2008, 152 );
       //Pelicula batman = new Pelicula();
       //batman.setNombre("Batman: el caballero de la noche");
       //batman.setAñoLanzamiento(2008);
       //batman.duracion = 152;


       //No voy a declarar otra variable actor, voy a reusar
       //siempre primero antes de reusar
       //re instanciar

       actor = new Actor(); //Creo un nuevo actor, pero referenciado con la variable actor
       actor.setNombre("Christian Bale");

       batman.getActores().add(actor);

       this.peliculas.add(batman);

      //Lo agrego en la lista de Nominados
       this.nominados.add(batman);
       this.nominados.add(actor);

       //Pelicula: Naruto Shippuden: The Lost Tower | La torre perdida---------------------------------------------
       Pelicula narutoPeli = new Pelicula("Naruto Shippuden: The Lost Tower | La torre perdida", 2010, 85 );

       actor = new Actor(); 
       actor.setNombre("Junko Takeuchi");
       narutoPeli.getActores().add(actor);

       actor = new Actor(); 
       actor.setNombre ("Emiko Shinohara");
       narutoPeli.getActores().add(actor);

       this.peliculas.add(narutoPeli);

       //Pelicula: DanMachi: Arrow of the Orion---------------------------------------------

       Pelicula danMachiPeli = new Pelicula(" DanMachi: Arrow of the Orion", 2019, 82 );
       //Pelicula danMachiPeli = new Pelicula();
      // danMachiPeli.setNombre(" DanMachi: Arrow of the Orion");
       //danMachiPeli.setAñoLanzamiento(2019);
       //danMachiPeli.duracion = 82;

       actor = new Actor(); 
       actor.setNombre ("Inori Minase");
       danMachiPeli.getActores().add(actor);

       actor = new Actor(); 
       actor.setNombre ("Yoshitsugu Matsuoka");
       danMachiPeli.getActores().add(actor);

       this.peliculas.add(danMachiPeli);


       //How I met your mother. Serie------------------------------------------------------------------------------

       Serie howIMetYM = new Serie();
       howIMetYM.setNombre("How I met your mother") ;
       howIMetYM.setAñoLanzamiento (2005);

       actor = new Actor();
       actor.setNombre ("Neil Patrick Harris");

       howIMetYM.getActores().add(actor);

       actor = new Actor();
       actor.setNombre ("Cobie Smulders");

       howIMetYM.getActores().add(actor);

       //T5: E11
       Temporada temporada = new Temporada();
       temporada.setNumero(5);

       //Creo el episodio
       //Antes tenia el constructor sin parametros asi
       //Episodio episodio = new Episodio();
       //episodio.setNombre("The last cigarrette");
       //episodio.setNumero(11);
       //Ahora cuando creo en Episodio el nuevo constructor CON parametros sera asi:
       Episodio episodio = new Episodio(11, "The last cigarrette" );
       //Asi simplifico codigo haciendo desaparecer dos lineas
       episodio.setDuracion(43);

       //vinculo temporada con episodio
       temporada.getEpisodios().add(episodio);

       episodio = new Episodio(1, "Definitions");
       episodio.setDuracion(41);

       temporada.getEpisodios().add(episodio);

       //Agrego la temporada
       howIMetYM.getTemporadas().add(temporada);
       //Creo un Websodio
       Websodio ws = new Websodio(35, "Nombre websodio en Internet", "http://miepisodios.com/websodio.avi");
       episodio.setDuracion(42);

       //Aca no creamos nada nuevo, porque el Websodio, al ser un episodio, 
       //va a estar en la lista de episodios
       //Sin embargo hay que redefinir a la hora de reproducir

       temporada.getEpisodios().add(ws);


       //Creo otra temporada

       //T3
       temporada = new Temporada();
       temporada.setNumero (3);

       //Creo el episodio
       episodio = new Episodio(1, "Wait for it");

       //vinculo temporada con episodio
       temporada.getEpisodios().add(episodio);

       episodio = new Episodio(4, "Little boys");

       temporada.getEpisodios().add(episodio);

       //Agrego la temporada
       howIMetYM.getTemporadas().add(temporada);
       
       // Aca esta toda la serie con 2 temporadas y cada una con 2 episodios.
       this.series.add(howIMetYM);

        //The BigBang Theory. Serie---------------------------------------------------------------------------

        Serie bigBangT = new Serie();
        bigBangT.setNombre ("The BigBang Theory");
        bigBangT.setAñoLanzamiento (2009);
 
        actor = new Actor();
        actor.setNombre ("Kaley Cuoco");
 
        bigBangT.getActores().add(actor);
 
       
        //T5: E11
        temporada = new Temporada();
        temporada.setNumero (1);
 
        //Creo el episodio
        episodio = new Episodio(1, "Pilot");
 
        //vinculo temporada con episodio
        temporada.getEpisodios().add(episodio);
 
        episodio = new Episodio(9, "The Cooper - Hofstadter Polarization");
 
        temporada.getEpisodios().add(episodio);
 
        //Agrego la temporada
        bigBangT.getTemporadas().add(temporada);
 
        this.series.add(bigBangT);


        //Serie: Danmachi------------------------------------------------------------------
        Serie danMachi = new Serie();
        danMachi.setNombre ("DanMachi");
        danMachi.setAñoLanzamiento (2015);
 
        actor = new Actor();
        actor.setNombre ("Inori Minase");

        danMachi.getActores().add(actor);
        
        actor = new Actor();
        actor.setNombre ("Yoshitsugu Matsuoka");

        danMachi.getActores().add(actor);
       
        //T1: E6 y E7
        temporada = new Temporada();
        temporada.setNumero (1);
 
        //Creo el episodio
        episodio = new Episodio(6, "Razon (Liliruca Arde)");
 
        //vinculo temporada con episodio
        temporada.getEpisodios().add(episodio);
 
        episodio = new Episodio(7, "La princesa de la espada (Aiz Wallenstein)");
 
        temporada.getEpisodios().add(episodio);
 
        //Agrego la temporada
        danMachi.getTemporadas().add(temporada);
 
        this.series.add(danMachi);

        //Serie: Naruto Shippuden ----------------------------------------------------------------
        Serie narutoSH = new Serie();
        narutoSH.setNombre ("Naruto Shippuden") ;
        narutoSH.setAñoLanzamiento (2007);
 
        actor = new Actor();
        actor.setNombre ("Junko Takeuchi");

        narutoSH.getActores().add(actor);
        
        actor = new Actor();
        actor.setNombre ("Emiko Shinohara");

        narutoSH.getActores().add(actor);
       
        //T12: E4 y E5
        temporada = new Temporada();
        temporada.setNumero (12);
 
        //Creo el episodio
        episodio = new Episodio(4, "El destello naranja");
 
        //vinculo temporada con episodio
        temporada.getEpisodios().add(episodio);
 
        episodio = new Episodio(5, "Objetivo: Nueve colas");
 
        temporada.getEpisodios().add(episodio);

        episodio = new Episodio(19, "Por mi amigo");
 
        temporada.getEpisodios().add(episodio);
 
 
        //Agrego la temporada
        narutoSH.getTemporadas().add(temporada);
 
        this.series.add(narutoSH);


    }

    
    //metodo: buscar serie
    public Serie buscarSerie(String nombreABuscar){
        //Serie es lo que el metodo nos tiene que devolver
        //String nombreABuscar es un parametro que necesitamos para buscar una serie por su nombre
    
       //series = | serie1 | serie2 | serie25 |serie40 |
       //vamos a usar el foreach: que sirve para recorrer listas
       //este ciclo, tiene una variable, que apunta en cada vuelta
       //a cada elemento de la lista
       //o sea la primera vez, va a apuntar a serie1, despues a serie2, despues
       //a serie25 hasta que termina.

       for (Serie serie : this.series) {
           //pregunto si el nombre de la serie actual
           //que estoy recorriendo es la que necesito

           if (serie.getNombre().equals(nombreABuscar)){
               return serie; //devuelvo esta serie
           }
       }
       //Si llego hasta aca, es porque no encontro la serie.
       return null;

    } 


    //metodo: buscar pelicula
    public Pelicula buscarPelicula(String nombrePelicula){
        for (Pelicula pelicula : this.peliculas) {

            if(pelicula.getNombre().equals(nombrePelicula)){
                return pelicula; 
            }
            
        }
        return null;
    }

    //metodo para imprimir la lista de peliculas

    public void listaPeliculas() {
        System.out.println("Listando las peliculas");

        System.out.println("***************");

        for (Pelicula pelicula : this.peliculas){

            System.out.println("Pelicula: " + pelicula.nombre);

        }
    }

    // metodo para imprimir la lista de series

    public void listaSeries() {
        System.out.println("Listando las series");

        System.out.println("***************");

        for (Serie serie : this.series){

            System.out.println("Serie: " + serie.nombre);

        }
    }

    /*public void listaTemporadas() {
        System.out.println("Listando las temporadas de la serie elegida: ");

        System.out.println("***************");

        for (Temporada temporada : Serie.danMachi.getTemporadas){

            System.out.println("Temporada: " + temporada.setNumero);

        }
    }*/



    //Creo un metodo para mostrar las nominaciones

    public void mostrarNominaciones(){
        //voy a imprimir el trailer de nominados.

        int totalPelis = 0;
        int totalActores = 0;

        for (INominable nominado : this.nominados) {
            nominado.reproducirTrailerNominacion();

            if(nominado instanceof Pelicula){
                totalPelis++;
            }
            else{
                if (nominado instanceof Actor){
                    totalActores++;

                }
            }
        }

        System.out.println("Peliculas nominadas: " + totalPelis);
        System.out.println("Actores nominados: " + totalActores);
    }
   

    //buscar un director
    

}

