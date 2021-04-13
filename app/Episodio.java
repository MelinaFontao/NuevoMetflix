import personas.*;

public class Episodio {

    //CONSTRUCTOR => NO es una funcion
    //Es algo que nos permite instanciar un OBJETO en memoria
    //y al mismo tiempo pasarle una serie de pametros para
    //ponerle una iniciacion
    //Se tiene que llamar EXACTAMENTE IGUAL a la clase
    //Es una forma de instaciar el objeto con ya valores que podemos definir
    //Al usar un contructor con parametros, a la hora de llamarlo se tienen que usar
    //TODOS los parametros.
    //LAS SUBCLASES NO HEREDAN AL CONSTRUCTOR DE LA CLASE MADRE
    public Episodio(int numero, String nombre){
        this.numero = numero;
        this.nombre = nombre;
    }

    //Al crear un constructor que tiene todos los datos del constructor
    //creado anteriormente, se puede "llamar" al constructor anterior
    public Episodio(int numero, String nombre, int duracion){
        this(numero, nombre); //Llamando al constructor de 2 parametros
        //Si se hace esto primero se tiene que llamar al constructor base, sino de rompe
        this.duracion = duracion;
    }


    private int numero;
    //Cuando pongo private significa que nadie puede acceder a esta variable
    private String nombre;
    private int duracion; // en minutos
    public Director director;
    public String sinopsis; 

    //GETTERS / SETTERS => Encapsulan a la variable para tener un control de que se puede hacer y que no
    //GETTER => permite leer un valor de atributo
    //SETTER => permite asignar un valor a un atributo

    //GETTER
    //Metodo para leer
    public int getNumero(){
        return this.numero;
    }

    //SETTER: palabra "set" + Nombre atributo + (parametro)
    //Metodo para escribir
    public void setNumero(int numero){
        if (numero <= 0){
            return;
        }
        this.numero = numero;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getDuracion(){
        return this.duracion;
    }

    public void setDuracion(int duracion){
        this.duracion = duracion;
    }

    public String getSinopsis(){
        return this.sinopsis;
    }

    public void setSinopsis(String sinopsis){
        this.sinopsis = sinopsis;
    }

   

   
    //Creamos un metodo para reproducir el episodio
    public void reproducir(){ //void se utiliza para metodos que no devuelven nada.
        System.out.println("Reproduciendo episodio:  " + nombre);

    }


}

