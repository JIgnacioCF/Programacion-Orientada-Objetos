package e502;

/**@author nacho */
public class E502 {

    public static void main(String[] args) {
        try {
            System.out.println("Hola a todos!");
            int i = Integer.parseInt("No es una cadena numerica!");
            return;

        } catch (NumberFormatException ex) {
            System.out.println("entre al catch!");

        } finally {
            System.out.println("Esto sale siempre");
        }
    }
}
