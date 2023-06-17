package e209;

/**
 *
 * @author nacho
 */
public class E209 {
    public static void main(String[] args) {
        Fecha nacimeinto = new Fecha(29,02,2001);
        Fecha contrat = new Fecha(1,1,2022);
        Empleado E1 = new Empleado("Alexander", "Rodriguez ",nacimeinto, contrat);
        System.out.println(E1);
    }
}
