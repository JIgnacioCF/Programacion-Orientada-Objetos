package e402;

/**
 *
 * @author nacho
 */
abstract public class Animal {
    //Atributos
    protected String nombre;
    protected String alimento;
    
    //Métodos
    abstract public void comunicarse();
        
    public void comer(){
        System.out.println("Que rico estoy comiendo");
    }
}
