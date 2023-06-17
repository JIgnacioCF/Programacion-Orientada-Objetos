package e211;

/**
 * @author nacho
 */
public class Materia {
    //Atributos
    private String nombreMateria;
    private int calificacion;
    
    //Constructores
    public Materia(){
        
    }

    public Materia(String nombreMateria, int calificacion) {
        this.nombreMateria = nombreMateria;
        this.calificacion = calificacion;
    }

    public Materia(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public int getCalificacion() {
        return calificacion;
    }
}
