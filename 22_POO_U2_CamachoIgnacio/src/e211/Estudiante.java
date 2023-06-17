package e211;

/**
 * @author nacho
 */
public class Estudiante {
  //Atributos
    private int numControl;
    private String nombreEstudiante;
    
    //Construcotres    
    public Estudiante(){
        
    }

    public Estudiante(int numControl, String nombreEstudiante) {
        this.numControl = numControl;
        this.nombreEstudiante = nombreEstudiante;
    }
    
    public void consultarCalif(int calif){
        System.out.println("Su calificación es: "+ calif);
    }
}

