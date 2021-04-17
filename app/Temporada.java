package app;

import java.util.ArrayList;
import java.util.List;

public class Temporada{
    private int numero;
    private String nombre; // Esto es el nombre de la temporada
    private List<Episodio> episodios = new ArrayList<>();

    public List<Episodio> getEpisodios(){
        return this.episodios;
    }
 
    public void setActores(List<Episodio> episodios) {
        this.episodios = episodios;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public Episodio buscarEpisodio(int numeroEpisodio){ 
        //Episodio es lo que me va a devolver el metodo
        //buscarEpisodio es el nombre del metodo
        //int numeroEpisodio es el numero de episodio que tengo que buscar

        for (Episodio episodio: this.episodios){
            //Aca como tenemos que comparar (y para eso hay que leer),
            //No vamos a usar el setter sino el getter
            if (episodio.getNumero() == numeroEpisodio){
                return episodio;
            }
        }
        return null;
    }

}