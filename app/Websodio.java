package app;
public class Websodio extends Episodio{

    public Websodio (int numero, String nombre, String link){
        super(numero, nombre);
        //super sirve para llamar a un constructor de la clase MADRE
        this.link = link;
    }


    public String link;

    //Redefinimos para reproducir un Websodio
    //Utilizo la misma accion pero para algo completamente diferente

    @Override
    public void reproducir(){
        System.out.println("Reproduciendo websodio del link " + this.link);
    }

}
