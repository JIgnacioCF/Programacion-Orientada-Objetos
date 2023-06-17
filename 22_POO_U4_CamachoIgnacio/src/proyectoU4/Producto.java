package proyectoU4;

/**@author José Ignacio Camacho Fuentes
 */
public class Producto {
    //Atributos
    protected String nombre;
    protected String marca;
    protected int cantidad;

    public Producto(String nombre, String marca, int cantidad) {
        this.nombre = nombre;
        this.marca = marca;
        this.cantidad= cantidad;
    }
    
    @Override
    public String toString() {
        return String.format("Datos del Producto\n"
                + "Nombre: %s\n"
                + "Marca: %s\n"
                + "Unidades: %d",
                this.nombre,
                this.marca,
                this.cantidad);
    }    
}
