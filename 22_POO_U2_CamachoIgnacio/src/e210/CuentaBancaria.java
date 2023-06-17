package e210;

/**
 *
 * @author nacho
 */
public class CuentaBancaria {
    //atributos
    private int numeroCuenta;
    private int numeroCliente;
    private double saldo;
    
    //constructores
    public CuentaBancaria(){
        
    }
    
    public CuentaBancaria(int numeroCuenta, int numeroCliente, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.numeroCliente = numeroCliente;
        this.saldo = saldo;
    }
    
    //Métodos
    public double depositar(double cantidad){
        System.out.println("Cantidad depositada: "+cantidad);
        this.saldo+= cantidad;
        return this.saldo;
    }
    
    public double retirar(double cantidad){
        System.out.println("Cantidad Retirada: "+cantidad);
        this.saldo-= cantidad;
        return this.saldo;
    }

    @Override
    public String toString() {
        return "Datos de la cuenta: \n"
                + "Numero Cuenta: "+this.numeroCuenta
                +"\tSaldo: "+this.saldo;
    }    
}
