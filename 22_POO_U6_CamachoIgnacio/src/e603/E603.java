package e603;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author nacho
 */
public class E603 {

    public static void main(String[] args) throws IOException {
        Empleado empleado1 = new Empleado("Jorge Alcaraz", 1200);
        Empleado empleado2 = new Empleado("Julia Rodriguez", 4567);
        Empleado empleado3 = new Empleado("Armando Hoyos", 6667);

        try {
            ObjectOutputStream archivo = new ObjectOutputStream(
                    new FileOutputStream("./src/e603/empleados.ddr"));

            archivo.writeObject(empleado1);
            archivo.writeObject(empleado2);
            archivo.writeObject(empleado3);

            //leer el archivo
            ObjectInputStream arch = new ObjectInputStream(
                    new FileInputStream("./src/e603/empleados.ddr"));
            while (true) {
                Empleado empleadoX = (Empleado) arch.readObject();
                System.out.println(empleadoX);
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
