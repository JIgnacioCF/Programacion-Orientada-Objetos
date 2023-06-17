package e205;

/**
 *
 * @author nacho
 */
public class E205 {

    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Luis", 123456, "Gestión");
        Estudiante estudiante2 = new Estudiante();
        //estudiante2.nombre = "Luisa";
        estudiante2.setNombre("Luisa");
        //System.out.println(estudiante2.nombre);
        System.out.println(estudiante2.getNombre());
    }
    
}
