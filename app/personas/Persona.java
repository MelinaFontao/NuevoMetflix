package app.personas;

public abstract class Persona {
    //Una clase abstracta significa que no se instanciara
    //Tampoco le vamos a poner ningun CONSTRUCTOR
    //Cuando quiera instanciar una clase ABSTRACTA, va a dar error
    
    private String nombre;

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

}
