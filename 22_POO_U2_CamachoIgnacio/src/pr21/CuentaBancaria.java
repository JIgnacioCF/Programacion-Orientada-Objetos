package pr21;

/**
 * @author nacho
 */
public class CuentaBancaria {
    //Atributos
    private int numeroCuenta;
    private String nombreCliente;
    private double saldoCuenta;

    //Constructores
    public CuentaBancaria() {
    }

    public CuentaBancaria(int numeroCuenta, String nombreCliente,
            double saldoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.nombreCliente = nombreCliente;
        this.saldoCuenta = saldoCuenta;
    }

    //Setters Getters
    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setSaldoCuenta(double saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public double getSaldoCuenta() {
        return saldoCuenta;
    }

    //Métodos
    public void retirarSaldo(double cantidad) {
        if (this.saldoCuenta > 0) {
            this.saldoCuenta -= cantidad;
        } else {
            System.out.println("¡Saldo insuficiente!");
        }
    }

    public void depositarSaldo(double cantidad) {
        this.saldoCuenta += cantidad;
    }

    //sobreescribir el metodo toString()
    @Override
    public String toString() {
        return String.format("Numero de Cuenta: %d\nNombre del Cliente: %s\n"
                + "Saldo s: %.2f\n", this.numeroCuenta, this.nombreCliente,
                this.saldoCuenta);
    }
}
