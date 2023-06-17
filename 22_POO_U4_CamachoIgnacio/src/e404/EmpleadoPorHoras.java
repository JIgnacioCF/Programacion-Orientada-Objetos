package e404;

/**
 *
 * @author nacho
 */
public class EmpleadoPorHoras extends Empleado implements Pagos{
    //Atributos
    protected double pagoPorHora;
    protected int horasTrabajadas;
    
    //Constructor
    public EmpleadoPorHoras(String nombre, String numEmpleado, double pagoHora,
    int horas){
        super(nombre, numEmpleado);
        this.pagoPorHora = pagoHora;
        this.horasTrabajadas= horas;   
}

    @Override
    public double ingresos() {
        if (horasTrabajadas>40) {
            return 40*pagoPorHora+(((horasTrabajadas-40)*pagoPorHora)*1.5);
        }else{
            return horasTrabajadas*pagoPorHora;
        }
    } 
    
    @Override
    public String toString() {
        return String.format("%s"
                + "Pago por hora: $ %.2f\n"
                + "Horas trabajadas: %d\n"
                + "salario: %.2f",super.toString(), this.pagoPorHora, 
                this.horasTrabajadas, this.ingresos());
    }
}
