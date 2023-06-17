package e402;

/**
 *
 * @author nacho
 */
public class Perro extends Animal {
//Atributos
    protected String raza;

    //metodo
    public void olfatear() {
        System.out.println("Mmm que rico huele esta comida!");
    }

    @Override
    public void comunicarse() {
        System.out.println("Puedo ladrar muy fuerte!");
    }
}
