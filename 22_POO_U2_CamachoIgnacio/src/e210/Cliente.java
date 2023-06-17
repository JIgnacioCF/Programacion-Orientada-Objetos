package e210;

/**
 *
 * @author nacho
 */
public class Cliente {
    //Atributos
    private int numeroCliente;
    private String nombre;

    public int getNumeroCliente() {
        return numeroCliente;
    }
    
    public Cliente(){
        
    }

    public Cliente(int numeroCliente, String nombre) {
        this.numeroCliente = numeroCliente;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Datos del cliente\n"
                + "Numero Cliente: "+this.numeroCliente
                +"\tNombre: "+this.nombre;
    }    
}
