package e503;

/** @author nacho*/
public class E503 {

    public static void main(String[] args) {
        try {
            Aplicacion app = new Aplicacion();
            Usuario user1 = app.login("juan", "1234");
            System.out.println(user1);

        } catch (Exception ex) {
            System.out.println("Servicio temporalmente interrumpido: "
                    + ex.getMessage());
        }
    }
}
