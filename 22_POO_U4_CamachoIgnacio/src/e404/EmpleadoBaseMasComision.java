package e404;

/***
 * @author nacho
 */
public class EmpleadoBaseMasComision extends EmpleadoPorComision implements Pagos{
    //Atributo
    protected double salarioBase;
    
    //Constructor
    public EmpleadoBaseMasComision(String nombre, String numEmpleado, 
            double ventas, double comision, double salario){
        super(nombre, numEmpleado, ventas, comision);
        this.salarioBase = salario;        
    }
    @Override
    public double ingresos(){
        return super.ingresos()+this.salarioBase;
    }
    
    @Override
    public String toString() {
        return String.format("%s"
                + "Salario Base: $ %.2f\n"
                + "salario: %.2f",
                super.toString(), 
                this.salarioBase, 
                this.ingresos());
    }
}
