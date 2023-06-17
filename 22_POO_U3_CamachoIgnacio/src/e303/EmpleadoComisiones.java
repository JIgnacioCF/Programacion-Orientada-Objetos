package e303;

/**
 * @author nacho
 */
public class EmpleadoComisiones extends Empleado {
    //Atributos
    protected double ventasMensuales;
    protected double comisiones;

    //Constructores
    public EmpleadoComisiones(double ventasMensuales, double comisiones,
            int numEmpleado, String nombre, String puesto) {
        super(numEmpleado, nombre, puesto);
        this.ventasMensuales = ventasMensuales;
        this.comisiones = comisiones;
    }

    //Métodos
    public double ingresos() {
        return (this.ventasMensuales * (this.comisiones / 100));
    }

    @Override
    public String toString() {
        return String.format("%s"
                + "Ventas Mensuales $: %.2f\n"
                + "Comisión: %.2f\n",
                super.toString(), this.ventasMensuales, this.comisiones);
    }
}
