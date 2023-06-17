package proyectoU4;

/**
 *
 * @author jose ignacio camacho fuentes
 */
public class Bebidas extends Producto implements Precio{
    //Atributos
    protected String sabor;
    protected double litros;
    protected double costo;

    public Bebidas(String nombre, String marca, int cantidad, String sabor, 
                   double litros, double costo) {
        super(nombre, marca, cantidad);
        this.sabor = sabor;
        this.litros = litros;
        this.costo = costo;
    }
    
    public double precio(){
        return costo*cantidad;
    }
    
    @Override
    public String toString() {
        return String.format("%s\n"
                + "Sabor: %s\n"
                + "Cantidad: %.2f\n"
                + "Precio: %.2f\n",
                super.toString(),
                this.sabor,
                this.litros,
                this.precio());
    }
}
