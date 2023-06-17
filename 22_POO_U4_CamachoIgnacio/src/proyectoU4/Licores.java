package proyectoU4;

/**
 *
 * @author jose ignacio camacho fuentes
 */
public class Licores extends Bebidas implements Precio {
    //Atributos
    protected int importe;
    
//cosntructor
    public Licores(String nombre, String marca, int cantidad, String sabor, 
            double litros, double costo, int importe) {
        super(nombre, marca, cantidad, sabor, litros, costo);
        this.importe = importe;
    }

     public double precio(){
         return costo + importe;
     }
     
     @Override
     public String toString() {
        return String.format("%s\n"
                + "Importe: %d\n",
                super.toString(),
                this.importe);
     }    
}
