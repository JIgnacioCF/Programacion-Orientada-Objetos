package proyectoU2;

/**
 *@authors 
 * José Ignacio Camacho Fuentes
 * Juan Valentin Gutierrez Carmona
 */
public class Libro {
  //Atributos
    private int numeroLibro;
    private String tituloLibro;
    
    //Constructores
    public Libro() {
    }

    public Libro(int numeroLibro, String tituloLibro) {
        this.numeroLibro = numeroLibro;
        this.tituloLibro = tituloLibro;
    }
    
    //Setters 
    public void setNumeroLibro(int numeroLibro) {
        this.numeroLibro = numeroLibro;
    }

    public void setTituloLibro(String tituloLibro) {
        this.tituloLibro = tituloLibro;
    }
    
    //Getters
    public int getNumeroLibro() {
        return numeroLibro;
    }

    public String getTituloLibro() {
        return tituloLibro;
    }
    
    //Métodos
    @Override
    public String toString() {
        return String.format("Numero del libro: %d\n"
                + "Titulo del libro: %s\n",
                this.numeroLibro,
                this.tituloLibro);
    }    
}
