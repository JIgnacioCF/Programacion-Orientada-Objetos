package e404;

/**
 *
 * @author nacho
 */
public class EmpleadoAsalariado extends Empleado implements Pagos{
    //Atributo
    public double salarioSemanal;
    
    //Constructor
    public EmpleadoAsalariado(String nombre, String numEmpleado, double salario){
        super(nombre,numEmpleado);
        this.salarioSemanal=salario;
        
    }

    @Override
    public double ingresos() {
        return this.salarioSemanal;
    }

    @Override
    public String toString() {
        return String.format("%s"
                + "Salario: $ %.2f\n",super.toString(), this.salarioSemanal);
    }   
}
