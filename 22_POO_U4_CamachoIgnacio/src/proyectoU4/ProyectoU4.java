package proyectoU4;

/**
 *
 * @author jose ignacio camacho fuentes
 */
public class ProyectoU4 {
    public static void main(String[] args) {
        Carnes producto1 = new Carnes("Carne de Res","Angus Beef",2,"Filete",500,500.0);
        Electronicos producto2= new Electronicos("Moto g30","Motorola",1,"Telefonia","Plata",5500.0);
        Lacteos producto3 = new  Lacteos("Oikos","Danone",4,"Yoghurt", 150, 14.90);
        Bebidas producto4 = new Bebidas("Sprite","FEMSA",2,"Limon",1.5,34.50);
        Licores producto5 = new Licores("Vodka","Absolut Vodka",1,"Tamarindo",0.9,350.0,50);
        
        System.out.println(producto1);
        System.out.println(producto2);
        System.out.println(producto3);
        System.out.println(producto4);
        System.out.println(producto5);
    }
 
}
