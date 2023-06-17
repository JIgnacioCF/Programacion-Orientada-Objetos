package e209;

/**
 * @author nacho
 */
public class Empleado {

    private String nombre;
    private String apellidoPaterno;
    private Fecha fechaNacimiento;
    private Fecha fechaContratacion;

    //Sobrecarga Constructor
    public Empleado() {

    }

    public Empleado(String nombre, String apellidoPaterno,
            Fecha fechaNacimiento, Fecha fechaContratacion) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaContratacion = fechaContratacion;
    }

    public Empleado(String nombre, String apellidoPaterno) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s\n"
                + "Apellido Paterno: %s\n"
                + "Fecha nacimiento: %s\n"
                + "Fecha contratacion: %s\n",
                this.nombre,
                this.apellidoPaterno,
                this.fechaNacimiento,
                this.fechaContratacion);
    }
}
