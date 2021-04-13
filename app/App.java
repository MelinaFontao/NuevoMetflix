import java.util.*;

public class App {


    public static Scanner Teclado = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        //A partir de Metflix, buscar la temporada 5 episodio 1 de la serie
        //How i met your mother y
        //reproducir el episodio.

        //Vamos a instanciar a Metflix:
        Metflix miMetflix = new Metflix();

        System.out.println("Inicializando catalogo de Metflix");//No hace nada, solo se ve bonito.

        miMetflix.inicializarCatalogo();//Estoy llamando al metodo que crea las pelis y series.

        //Metflix es el encargado de buscar una serie. Vamos a tener que enviar un metodo que se llame BuscarSerie
        //Si la serie es encontrada, creo una variable que guarde el resultado, sino esta serie encontrada se me pierde.

        //Creo la variable
        Serie serieBuscada = miMetflix.buscarSerie("DanMachi"); //Aca guarde el resultado de la serie encontrada en buscarSerie

        if (serieBuscada == null){
            System.out.println("Serie no existe");
            return; //No reproduce nada mas
        }
   
        //Asigno la serie encontrada en una variable
        Temporada temporada = serieBuscada.buscarTemporada(1);
   
        //Asigno el episodio encontrado en una variable
        Episodio episodio = temporada.buscarEpisodio(7);
   
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


        //Vamos a reproducir una pelicula
        Pelicula peliculaBuscada = miMetflix.buscarPelicula("Naruto Shippuden: The Lost Tower | La torre perdida");

        if (peliculaBuscada == null){
            System.out.println("Pelicula no existe");
            return;
        }

        Pelicula pelicula = peliculaBuscada;
        pelicula.reproducir();



    }
}

