package e401;

/**@author José Ignacio Camacho Fuentes*/
public class E401 {

    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.comunicarse();

        Perro perro1 = new Perro();
        perro1.nombre = "Manchas";
        perro1.alimento="Croquetas";
        perro1.raza="Dalmata";
        System.out.println(perro1);
        perro1.comunicarse();
        
        System.out.println("");
        animal1.comunicarse();
        Ave ave1 = new Ave();
        ave1.nombre = "Enojon";
        ave1.alimento="Pasto";
        ave1.especie="avestrus";
        ave1.volar = false;
        System.out.println(ave1);
        ave1.comunicarse();
        ave1.volar();

        Perro perro2 = new Perro("huesos", "Filete", "Chihuahua");
        System.out.println(perro2);
        perro2.comunicarse();
        perro2.olfatear();
        

        Ave ave2 = new Ave("Choco", "Alpiste", "Pato", true);
        System.out.println(ave2);
        ave2.comunicarse();
        ave2.volar();        
    }
}
