package E203;
import java.util.Scanner;
/**
 * @author nacho
 */
public class Estudiante {
    public static void main(String[] args) {
        //Atributos
        String nombre;
        int numControl;
        String carrera;
    }
    //Métodos
    public void hablaIngles() {
        System.out.println("I speak english!!");
    }

    public void comePizza() {
        System.out.println("mmm me gusta la pizza!!");
    }

    public int materiaFavorita(String materia) {
        int cal;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Calificación: ");
        cal = entrada.nextInt();
        System.out.println("La calificación de" + materia);

        return cal;
    }
}
