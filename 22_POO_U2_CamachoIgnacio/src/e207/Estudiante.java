package e207;

/**
 *
 * @author nacho
 */
public class Estudiante {
    //Atributos
    private String nombre;
    private int numControl;
    private String carrera;

    //Constructores
    public Estudiante() {

    }

    public Estudiante(String n, int nc, String c) {
        this.nombre = n;
        this.numControl = nc;
        this.carrera = c;
    }

    //Métodos
    @Override
    public String toString() {
        String textoSalida;

        textoSalida = "Objeto Estudiante \n"
                + "Nombre del estudiante: " + this.nombre + "\n"
                + "Numero de Control: " + this.numControl + "\n"
                + "Programa educativo: " + this.carrera + "\n";

        return textoSalida;
    }

    @Override
    public boolean equals(Object objeto) {
        boolean duplicado;
        Estudiante estX = (Estudiante) objeto;

        if (this.numControl == estX.numControl) {
            duplicado = true;
        } else {
            duplicado = false;
        }
        return duplicado;
    }
}
