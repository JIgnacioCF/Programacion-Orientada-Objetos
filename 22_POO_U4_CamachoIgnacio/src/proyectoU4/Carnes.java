package proyectoU4;

/**
 *
 * @author jose ignacio camacho fuentes
 */
public class Carnes extends Producto implements Precio {

    //Atributos
    protected String tipoCorte;
    protected int gramos;
    protected double costo;

    public Carnes(String nombre, String marca, int cantidad, String tipoCorte, 
                    int gramos, double costo) {
        super(nombre, marca, cantidad);
        this.tipoCorte = tipoCorte;
        this.gramos = gramos;
        this.costo = costo;
    }

    @Override
    public double precio() {
        return costo/1000*(gramos);
    }

    @Override
    public String toString() {
        return String.format("%s\n"
                + "Corte: %s\n"
                + "Peso en gramos: %d\n"
                + "Precio: %.2f\n",
                super.toString(),
                this.tipoCorte,
                this.gramos,
                this.precio());
    }    
}
