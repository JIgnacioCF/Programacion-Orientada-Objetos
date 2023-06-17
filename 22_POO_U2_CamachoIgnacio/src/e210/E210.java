package e210;

/**
 * @author nacho
 */
public class E210 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(1234,"Ignacio Camacho");
        CuentaBancaria cuenta1 = new CuentaBancaria(999955,
                cliente1.getNumeroCliente(),100.00);
        System.out.println(cliente1);
        System.out.println(cuenta1);
        
        cuenta1.depositar(15000.00);
        cuenta1.retirar(800.00);
        System.out.println(cuenta1);
    }
}
