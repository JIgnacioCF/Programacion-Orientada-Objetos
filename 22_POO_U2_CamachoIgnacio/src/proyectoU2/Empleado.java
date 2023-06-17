package proyectoU2;

/**
 *@authors 
 * José Ignacio Camacho Fuentes
 * Juan Valentin Gutierrez Carmona
 */
public class Empleado {
    //Atributos
    private int numeroEmpleado;
    private String nombreEmpleado;
    
    //Constructores
    public Empleado() {
    }

    public Empleado(int numeroEmpleado, String nombreEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
        this.nombreEmpleado = nombreEmpleado;
    }
    
    //Setters
    public void setNumeroEmpleado(int numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }
    
    //Getters
    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }
    
    //Métodos
    public void registrarLibro(String libro){
        System.out.println("Registro el libro: "+libro+" con exito!\n");  
    }

    @Override
    public String toString() {
        return String.format("Numero de empleado: %d\n"
                + "Nombre empleado: %s",
                this.numeroEmpleado,
                this.nombreEmpleado);
    }   
}
