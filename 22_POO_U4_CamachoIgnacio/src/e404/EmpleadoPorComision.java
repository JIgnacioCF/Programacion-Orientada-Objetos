package e404;

/**@author nacho*/
public class EmpleadoPorComision extends Empleado implements Pagos{
    //Atributos
    protected double ventasBrutas;
    protected double comisionVentas;
    
    //Constructor
    EmpleadoPorComision(String nombre, String numEmpleado, double ventas,
            double comision){
        super(nombre, numEmpleado);
        this.ventasBrutas = ventas;
        this.comisionVentas= comision;
    }
    @Override
    public double ingresos(){
        return this.ventasBrutas*(this.comisionVentas/100);
    }
    
    @Override
    public String toString() {
        return String.format("%s"
                + "Ventas Totales: $ %.2f\n"
                + "Comision: %.2f%%\n"
                + "salario: %.2f",super.toString(), this.ventasBrutas, 
                this.comisionVentas, this.ingresos());
    }
}
