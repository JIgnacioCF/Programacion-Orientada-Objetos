package E204;

/**
 * @author nacho
 */
public class E204 {

    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante();
        estudiante1.nombre = "Pedro";
        estudiante1.numControl = 20030456;
        estudiante1.carrera = "Sistemas";

        System.out.println(estudiante1.nombre);
        System.out.println(estudiante1.numControl);
        System.out.println(estudiante1.carrera);
        
        Estudiante estudiante2 = new Estudiante("Maria",19030678,"TICS");
        System.out.println(estudiante2.nombre);
        System.out.println(estudiante2.numControl);
        System.out.println(estudiante2.carrera);
        
        Estudiante estudiante3 = new Estudiante("Ignacio");
        System.out.println(estudiante3.nombre);
    }

}
