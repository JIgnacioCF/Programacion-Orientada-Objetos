package e601;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author nacho
 */
public class E601 {

    public static void main(String[] args) throws IOException {
        try {
            FileWriter archivo = new FileWriter("./src/e601/archivo.txt");
            for (int x = 0; x < 10; x++) {
                archivo.write("Fila numero " + x + "\n");
            }
            archivo.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
