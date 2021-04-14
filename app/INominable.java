package app;

public interface INominable {
    //INTERFASES: Conjuntos de nombres de métodos bajo un mismo nombre.
    //Las interfases NO hay atributos
    //Las interfases NO TIENEN CUERPO DE METODO
    //Las interfases SOLO tienen TIPO DE METODO y EL VALOR QUE DEVUELVEN
    //tampoco tienen public porque el hecho de ser interfases, todas seran publicas.
    //En el caso de tener que implementar varias interfases se hace asi:
    //implements INominable, otra interfase, otra, etc

    
    
    //Quienes sean nominables van a tener los siguientees metodos

    boolean ganoPreviamente();
    void reproducirTrailerNominacion();
}
