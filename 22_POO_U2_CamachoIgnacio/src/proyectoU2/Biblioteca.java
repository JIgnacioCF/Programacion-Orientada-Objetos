package proyectoU2;

/**
 *@authors 
 * José Ignacio Camacho Fuentes
 * Juan Valentin Gutierrez Carmona
 */
public class Biblioteca {
    //Atributos
    private int numeroLibro;
    private String ubicacionLibro;
    private boolean disponible;
    
    //Constructores
    public Biblioteca() {
        
    }

    public Biblioteca(int numeroLibro, String ubicacionLibro, boolean disponible) {
        this.numeroLibro = numeroLibro;
        this.ubicacionLibro = ubicacionLibro;
        this.disponible = disponible;
    }
    //Setters
    public void setNumeroLibro(int numeroLibro) {
        this.numeroLibro = numeroLibro;
    }

    public void setUbicacionLibro(String ubicacionLibro) {
        this.ubicacionLibro = ubicacionLibro;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    //Getters
    public int getNumeroLibro() {
        return numeroLibro;
    }

    public String getUbicacionLibro() {
        return ubicacionLibro;
    }

    public boolean isDisponible(boolean libro) {
        return disponible;        
    }

    //Métodos
    @Override
    public String toString() {
        return String.format("Numero del Libro: %d\n"
                + "Ubicación del libro: %s\n"
                + "¿Esta disponible?: %b\n", 
                this.numeroLibro,
                this.ubicacionLibro,
                this.disponible);
    }    
}
