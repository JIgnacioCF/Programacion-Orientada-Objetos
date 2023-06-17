package proyectoU4;

/**
 *
 * @author jose ignacio camacho fuentes
 */
public class Lacteos extends Producto implements Precio {
    //Atributos
    protected String tipoLacteo;
    protected double litroGramo;
    protected double precioLacteo;

    public Lacteos(String nombre, String marca, int cantidad, String tipoLacteo,
                   double litroGramo, double precioLacteo) {
        super(nombre, marca, cantidad);
        this.tipoLacteo = tipoLacteo;
        this.litroGramo = litroGramo;
        this.precioLacteo = precioLacteo;
    }    
    
    @Override
    public double precio(){
        return precioLacteo*cantidad;
    }

    @Override
    public String toString() {
        return String.format("%s\n"
                + "Tipo de Lacteo: %s\n"
                + "Cantidad %.2f\n"
                + "Precio: %.2f\n",
                super.toString(),
                this.tipoLacteo,
                this.litroGramo,
                this.precio());
    }    
}
