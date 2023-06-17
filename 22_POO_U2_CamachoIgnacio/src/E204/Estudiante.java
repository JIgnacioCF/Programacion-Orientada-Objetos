package E204;

/**
 *
 * @author nacho
 */
public class Estudiante {
    //Atributos
    public String nombre;
    public int numControl;
    public String carrera;
    
    //Constructor(es)
    public Estudiante(){
        
    }
    public Estudiante(String nom, int nc, String carr){
        nombre = nom;
        numControl = nc;
        carrera = carr;
        
    }
    public Estudiante(String nombre){
        this.nombre= nombre;
    }
}
