package e301;

/**
 * @author nacho
 */
public class e301 {
    public static void main(String[] args) {
        Mujer mujer1 = new Mujer();
        Hombre hombre1 = new Hombre();
        
        mujer1.nombre = "Karla";
        mujer1.dormir();
        mujer1.maquillarse();
        
        hombre1.nombre = "Ignacio";
        hombre1.comer();
        hombre1.afeitarse();
    }
}
