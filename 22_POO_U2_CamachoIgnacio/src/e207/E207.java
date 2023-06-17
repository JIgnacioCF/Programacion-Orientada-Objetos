package e207;

/**
 *
 * @author nacho
 */
public class E207 {

    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Sebastian", 200130190, "Sistemas");
        Estudiante e2 = new Estudiante("Julia", 200130190, "Gestión");

        System.out.println(e1);
        System.out.println(e2);

        if (e1.equals(e2)) {
            System.out.println("¡¡ALERTA!! El numero de control esta duplicado!");
        } else {
            System.out.println("¡Numeros de control correctos!");
        }
    }
}
