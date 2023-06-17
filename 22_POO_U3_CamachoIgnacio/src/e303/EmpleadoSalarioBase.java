package e303;

/**
 * @author nacho
 */
public class EmpleadoSalarioBase extends Empleado {
    //Atributos
    protected double salarioBase;

    //Constructor
    public EmpleadoSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public EmpleadoSalarioBase(double salarioBase, int numEmpleado,
            String nombre, String puesto) {
        super(numEmpleado, nombre, puesto);
        this.salarioBase = salarioBase;
    }

    @Override
    public String toString() {
        return String.format("%s"
                + "Salario base: %.2f\n",
                super.toString(), this.salarioBase);
    }
}
