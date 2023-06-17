package e602;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author nacho
 */
public class E602 {

    public static void main(String[] args) {
        LecturaArchivo acceso = new LecturaArchivo();
        acceso.leer();
    }
}

class LecturaArchivo {

    FileReader entrada;

    public void leer() {
        try {
            entrada = new FileReader("./src/e601/archivo.txt");
            BufferedReader miBufer = new BufferedReader(entrada);
            String lineaTexto = "";
            while (lineaTexto != null) {
                lineaTexto = miBufer.readLine();
                if (lineaTexto != null) {
                    System.out.println(lineaTexto);
                }
            }
            entrada.close();
        } catch (IOException ex) {
            System.out.println("El archivo no fue encontrado!");
        } finally {
            try {
                entrada.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
