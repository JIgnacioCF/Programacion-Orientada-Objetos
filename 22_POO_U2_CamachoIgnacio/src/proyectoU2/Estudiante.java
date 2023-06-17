package proyectoU2;

/**
 *@authors 
 * José Ignacio Camacho Fuentes
 * Juan Valentin Gutierrez Carmona
 */
public class Estudiante {
    //Atributos
    private int numControl;
    private String nombreEstudiante;

    //Constructores
    public Estudiante() {
    }

    public Estudiante(int numControl, String nombreEstudiante) {
        this.numControl = numControl;
        this.nombreEstudiante = nombreEstudiante;
    }
    
    //Setters
    public void setNumControl(int numControl) {
        this.numControl = numControl;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    //Getters
    public int getNumControl() {
        return numControl;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    //Métodos
    public void prestamoLibro(String libro) {
        System.out.println("Pidió prestado el libro " + libro + "\n");
    }

    public void regresarLibro(String libro) {
        System.out.println("Ya regreso el libro " + libro + "\n");
    }

    @Override
    public String toString() {
        return String.format("Numero de Control: %s\n"
                + "Nombre del Estudiante: %s",
                this.numControl,
                this.nombreEstudiante);
    }
}
