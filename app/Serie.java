package app;

import java.util.ArrayList;
import java.util.List;

public class Serie extends Contenido {
    public List<Temporada> temporadas = new ArrayList<>();

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


}
