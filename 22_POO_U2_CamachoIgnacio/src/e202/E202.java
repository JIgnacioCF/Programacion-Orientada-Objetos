package e202;

/**
 * @author nacho
 */
public class E202 {
    public static void main(String[] args) {
        //Instanciamos el objeto personal
        Estudiante estudiante1 = new Estudiante();
        
        //Asignar valores a2 los atributos
        estudiante1.nombre="Ignacio";
        estudiante1.numControl=19030192;
        estudiante1.carrera="Sistemas";
        System.out.println("Mi nombre es "+ estudiante1.nombre);
        System.out.println("Mi numero de control es "+ estudiante1.numControl);
        System.out.println("Pertenezco a la carrera " + estudiante1.carrera);
        estudiante1.hablaIngles();
        estudiante1.comePizza();
        System.out.println("");
        
        Estudiante estudiante2 = new Estudiante();
        estudiante2.nombre="Maricarmen";
        estudiante2.numControl=19030172;
        estudiante2.carrera="SGestion";
        System.out.println("Mi nombre es "+ estudiante2.nombre);
        System.out.println("Mi numero de control es "+ estudiante2.numControl);
        System.out.println("Pertenezco a la carrera " + estudiante2.carrera);
        estudiante2.comePizza();
    }
}
