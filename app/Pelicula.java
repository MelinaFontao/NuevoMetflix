import personas.*;

public class Pelicula extends Contenido{
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

}

