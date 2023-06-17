package e211;

/**
 * @author nacho
 */
public class E211 {

    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante(1930192, "Ignacio Camacho");
        Profesor profesor1 = new Profesor(123, "Carlos Madrigal");
        Materia materia1 = new Materia("Programación Orientada a Objetos", 89);

        materia1.setCalificacion(profesor1.asignarCalif(100));
        estudiante1.consultarCalif(materia1.getCalificacion());
    }
}
