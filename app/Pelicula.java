package app;

import app.personas.*;

public class Pelicula extends Contenido implements INominable {
    //Al implementar INominable, significa que ahora Pelicula tiene que crear
    //los dos metodos de la interfase
    public int duracion;
    public Director director;
    public boolean filmadaEnIMAX;

    public int getDuracion(){
        return this.duracion;
    }

    public void setDuracion(int duracion){
        this.duracion = duracion;
    }

    public void reproducir(){ 
        System.out.println("Reproduciendo pelicula:  " + this.getNombre());

    }

    @Override
    public boolean ganoPreviamente() {
        // Este es el contenido de la funcion.
        //Aca va nuestra logica de saber si una peli fue nominada o no
        return false;
    }

    @Override
    public void reproducirTrailerNominacion() {
        System.out.println("Reproduciendo avances de " + this.getNombre());
        
    }

}

