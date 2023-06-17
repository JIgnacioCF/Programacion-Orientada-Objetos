package e603;

import java.io.Serializable;

/**@author nacho
 */
public class Empleado implements Serializable {
    //Atributos
    public static final long serialVersionUID = 1L;
    protected String nombre;
    protected int numEmpleado;

    //Constructores
    public Empleado(String nombre, int numEmpleado) {
        this.nombre = nombre;
        this.numEmpleado = numEmpleado;
    }

    //Polimorfismo
    @Override
    public String toString() {
        return String.format("Empleado: %s\n"
                + "Numero de Empleado: %d\n",
                this.nombre,
                this.numEmpleado);
    }
}
