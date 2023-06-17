package e303;

/**
 * @author nacho
 */
public class E303 {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado();
        empleado1.numEmpleado = 123;
        empleado1.nombre = "Ignacio";
        empleado1.puesto = "Cajero";

        Empleado empleado2 = new Empleado(321, "Carlos", "Gerente");
        System.out.println(empleado1);
        System.out.println(empleado2);

        Empleado empleado3 = new EmpleadoSalarioBase(6783.5608, 89, "Ramiro",
                "Recursos Humanos");
        System.out.println(empleado3);

        EmpleadoComisiones empleado4 = new EmpleadoComisiones(25000, 28.96331,
                20, "Pedro", "Administrativo");
        System.out.println(empleado4);
        System.out.printf("Su Salario es $: %.2f\n", empleado4.ingresos());
    }
}
