package e211;

/**
 * @author nacho
 */
public class Profesor {
    //Atributos
    private int numProfesor;
    private String nombre;
    
    //Constructores
    public Profesor(){
        
    }

    public Profesor(int numProfesor, String nombre) {
        this.numProfesor = numProfesor;
        this.nombre = nombre;
    }
    
    //Metodos
    public int asignarCalif(int calif){
        return calif;
    }
}
