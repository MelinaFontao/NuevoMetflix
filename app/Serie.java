package app;

import java.util.ArrayList;
import java.util.List;

public class Serie extends Contenido {
    private List<Temporada> temporadas = new ArrayList<>();

    public List<Temporada> getTemporadas(){
        return this.temporadas;
    }
 
    public void setTemporadas(List<Temporada> temporadas) {
        this.temporadas = temporadas;
    } 

    //Serie es la encargada de buscar las temporadas
    //Creamos el metodo para buscar la temporada:

    public Temporada buscarTemporada(int numeroTemporada){
        for (Temporada temporada: this.temporadas){
            if(temporada.getNumero() == numeroTemporada){ //si esto es verdadero, encontre la temporada.
                return temporada;
            }
        }
        return null;
    }

    // metodo para imprimir la lista de temporadas

    public void listaTemporadas() {
        System.out.println("Listando las temporadas disponibles");

        System.out.println("***************");

        for (Temporada temporada: this.temporadas){

            System.out.println("Temporada: " + temporada.getNumero()); 

        }
    }


}
