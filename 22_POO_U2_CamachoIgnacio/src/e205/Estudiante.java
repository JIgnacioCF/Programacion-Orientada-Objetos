package e205;
/**
 * @author nacho
 */
public class Estudiante {

    //Atributos

    private String nombre;
    private int numControl;
    private String carrera;

    //Constructor
    public Estudiante(){
        
    }
    public Estudiante(String nombre, int numControl, String carrera) {
        this.nombre = nombre;
        this.numControl = numControl;
        this.carrera = carrera;
    }
    //Setters y Getters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }    

    public void setNumControl(int numControl) {
        this.numControl = numControl;
    }
    public int getNumControl() {
        return numControl;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    public String getCarrera() {
        return carrera;
    }   
}
