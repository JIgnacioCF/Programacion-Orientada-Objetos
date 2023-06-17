package e303;

/**
 * @author nacho
 */
public class Empleado {
    //Atributos
    protected int numEmpleado;
    protected String nombre;
    protected String puesto;

    //Sobrecargamos los constructores
    public Empleado() {    }

    public Empleado(int numEmpleado, String nombre, String puesto) {
        this.numEmpleado = numEmpleado;
        this.nombre = nombre;
        this.puesto = puesto;
    }

    @Override
    public String toString() {
        return String.format("Datos del empleado: \n"
                + "Numero de Empleado: %d\n"
                + "Nombre: %s\n"
                + "Puesto: %s\n",
                this.numEmpleado,
                this.nombre,
                this.puesto);
    }
}
