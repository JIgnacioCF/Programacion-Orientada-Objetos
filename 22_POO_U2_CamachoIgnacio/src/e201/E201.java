package e201;

/**
 * @author nacho
 */
public class E201 {
    public static void main(String[] args) {
        //Instanciamos el objeto personal
        Persona persona1= new Persona();
        
        //Asignar valores a los atributos
        persona1.nombre="Juan Carlos";
        persona1.edad=50;
        persona1.altura=1.69;
        
        //Desplegar información de persona
        System.out.println(persona1.nombre);
        System.out.println(persona1.edad + " años");
        System.out.println("Altura: "+persona1.altura);
    }
}
