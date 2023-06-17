package pr21;

/**
 *
 * @author nacho
 */
public class PR21 {

    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria(12345, "Ignacio Camacho", 1000.00);
        CuentaBancaria cuenta2 = new CuentaBancaria(67890, "Carlos Madrigal", 50000.00);

        System.out.println("No. Cuenta: " + cuenta1.getNumeroCuenta()
                + " \nNombre del cliente: " + cuenta1.getNombreCliente()
                + "\nSaldo actual: " + cuenta1.getSaldoCuenta());

        cuenta1.depositarSaldo(1500.50);
        System.out.println("\n¡Han depositado a tu cuenta!");
        System.out.println(cuenta1);

        System.out.println("No. Cuenta: " + cuenta2.getNumeroCuenta()
                + " \nNombre del cliente: " + cuenta2.getNombreCliente()
                + "\nSaldo actual : " + cuenta2.getSaldoCuenta());

        cuenta2.retirarSaldo(3500.75);
        System.out.println("\n!Has retirado dinero de tu cuenta!");
        System.out.println(cuenta2);
    }
}
