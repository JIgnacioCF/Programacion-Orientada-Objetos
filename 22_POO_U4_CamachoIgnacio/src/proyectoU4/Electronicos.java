package proyectoU4;

/**
 *
 * @author jose ignacio camacho fuentes
 */
public class Electronicos extends Producto implements Precio {
    //Atributos
    protected String tipoAparato;
    protected String color;
    protected double costo;

    public Electronicos(String nombre, String marca, int cantidad, 
                        String tipoAparato, String color, double costo) {
        super(nombre, marca, cantidad);
        this.tipoAparato = tipoAparato;
        this.color = color;
        this.costo = costo;
    }

    
    @Override
    public double precio(){
        return costo*cantidad;
    }

    @Override
    public String toString() {
        return String.format("%s\n"
                + "Tipo: %s\n"
                + "Color: %s\n"
                + "Precio: %.2f\n", 
                super.toString(),
                this.tipoAparato,
                this.color,
                this.precio());
    }    
}
