package e404;

/**
 *
 * @author nacho
 */
abstract public class Empleado {
    //Atributos
    protected String nombre;
    protected String numeroEmpleado;

    public Empleado(String nombre, String numeroEmpleado) {
        this.nombre = nombre;
        this.numeroEmpleado = numeroEmpleado;
    }

    @Override
    public String toString() {
        return String.format("Datos del empleado\n"
                        + "Nombre: %s\n"
                        + "Numero Empleado: %s\n", this.nombre, this.numeroEmpleado);
    }    
}
