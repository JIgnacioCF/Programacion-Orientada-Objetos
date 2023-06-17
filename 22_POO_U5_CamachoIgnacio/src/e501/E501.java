package e501;

import java.util.InputMismatchException;
import java.util.Scanner;

/**@author nacho */

public class E501 {

    public static void main(String[] args) {
        int num1, num2;
        Scanner entrada = new Scanner(System.in);
        boolean continuarCiclo = true;
        do {
            try {
                System.out.println("Ingrese el numerador: ");
                num1 = entrada.nextInt();
                System.out.println("Ingrese del denominador: ");
                num2 = entrada.nextInt();

                System.out.printf("\nResultado %d/%d = %d\n",
                        num1, num2, num1 / num2);
                continuarCiclo = false;
            } catch (ArithmeticException ex) {
                System.out.println("Cero es un denominador invalido!!");
                System.out.printf("\nExcepción: %s\n", ex);
            } catch (InputMismatchException ex) {
                System.out.println("Debes introducir solo numeros!!");
                entrada.nextLine();
                System.out.printf("\nExcepción: %s\n", ex);
            }
        } while (continuarCiclo);
    }
}
