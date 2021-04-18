package app;

import java.util.ArrayList;
import java.util.List;
import app.personas.*;//En este caso hace referencia a todas las clases del paquete

public abstract class Contenido {
    //No se podra crear ningun contenido, solo sus subclases (series o peliculas)
    
    protected String nombre;
    public Genero genero;
    public Idioma idioma;
    //Idioma origen
    protected int añoLanzamiento;
    public Actor actor;
    private List<Actor> actores = new ArrayList<>();

    public List<Actor> getActores(){
       return this.actores;
    }

    public void setActores(List<Actor> actores) {
        this.actores = actores;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getAñoLanzamiento(){
        return this.añoLanzamiento;
    }

    public void setAñoLanzamiento(int añoLanzamiento){
        this.añoLanzamiento = añoLanzamiento;
    }

    

}
