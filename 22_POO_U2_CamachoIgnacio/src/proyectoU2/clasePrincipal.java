package proyectoU2;

/**
 *@authors 
 * José Ignacio Camacho Fuentes
 * Juan Valentin Gutierrez Carmona
 */
public class clasePrincipal {
    public static void main(String[] args) {
        Biblioteca biblioteca1 = new Biblioteca(20,"Tecnologia", true);
        Biblioteca biblioteca2 = new Biblioteca(50,"Ciencias Básicas",false);      
        
        Libro libro1 = new Libro(20,"Programacion Orientada a Objetos");
        Libro libro2 = new Libro(50,"Quimica I");
        
        Empleado empleado1 = new Empleado(10,"Marisol Dominguez");
        Empleado empleado2 = new Empleado(12,"Carlos Hernandez");        
        
        Estudiante estudiante1 = new Estudiante(19130192,"Ignacio Camacho");
        Estudiante estudiante2 = new Estudiante(19130123,"Valentin Gutierrez");
        
        System.out.println(estudiante1);
        estudiante1.prestamoLibro("Programación Orientada a Objetos");
        System.out.println(libro1);
        System.out.println(biblioteca1);        
        System.out.println(empleado1);
        empleado1.registrarLibro("Calculo Diferencial");
        System.out.println("*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/**/*/*/*/*/\n");        
        
        System.out.println(estudiante2);
        estudiante2.regresarLibro("Quimica I");
        System.out.println(libro2);
        System.out.println(biblioteca2);
        System.out.println(empleado2);
        empleado2.registrarLibro("Ecuaciones Diferenciales");
    }
}
