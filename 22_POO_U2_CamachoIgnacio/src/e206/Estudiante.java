package e206;

/**
 *
 * @author nacho
 */
public class Estudiante {
    //Atributos
    private String nombre;
    private int numControl;
    private String carrera;

    //Constructores
    public Estudiante() {

    }

    public Estudiante(String n, int nc, String c) {
        this.nombre = n;
        this.numControl = nc;
        this.carrera = c;
    }

    public Estudiante(String nombre, String carrera) {
        this.nombre = nombre;
        this.carrera = carrera;
    }

    //Métodos
    @Override
    public String toString() {
        String textoSalida;

        textoSalida = "Objeto Estudiante \n"
                + "Nombre del estudiante: " + this.nombre + "\n"
                + "Numero de Control: " + this.numControl + "\n"
                + "Programa educativo: " + this.carrera + "\n";

        return textoSalida;
    }
    //Setters & Getters
    public String getNombre() {
        return nombre;
    }

    public int getNumControl() {
        return numControl;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumControl(int numControl) {
        this.numControl = numControl;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

}
