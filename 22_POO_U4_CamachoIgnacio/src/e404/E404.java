package e404;

/**
 *
 * @author nacho
 */
public class E404 {
    public static void main(String[] args) {
        EmpleadoAsalariado empleado1= new EmpleadoAsalariado("José Lopez","A4567",12345);
        EmpleadoPorHoras empleado2 = new EmpleadoPorHoras("Maria O'connor","D007",10,45);
        EmpleadoPorComision empleado3 = new EmpleadoPorComision("Carlos Perez","V009",123456.0,10.0);
        EmpleadoBaseMasComision empleado4 = new EmpleadoBaseMasComision("Tomas Hernandez","XF78",
        23567,4.5,3467.50);
        
        System.out.println(empleado1);        
        System.out.println(empleado2);        
        System.out.println(empleado3);        
        System.out.println(empleado4);
    }    
}
