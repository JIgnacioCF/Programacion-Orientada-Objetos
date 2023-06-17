package e302;

/**
 *
 * @author nacho
 */
public class E302 {
    public static void main(String[] args) {
        Animal animal= new Animal();        
        animal.comunicarse();
        Perro perro2 = new  Perro("Manchas",5,"Tortillas","Dalmata");
        Ave ave1 = new Ave("Gonzo",2,"Semillas de girasol","periquito", false);
        
        Perro perro = new Perro();
        perro.nombre="Firulais";
        perro.raza="Chihuahua";
        perro.edad=2;
        perro.alimento="Croquetas";
        System.out.println(perro);
        perro.comunicarse();
        perro.olfatear();
        
        System.out.println(perro2);
        perro2.olfatear();
        
        System.out.println(ave1);
        ave1.volar();
        
    }
}
