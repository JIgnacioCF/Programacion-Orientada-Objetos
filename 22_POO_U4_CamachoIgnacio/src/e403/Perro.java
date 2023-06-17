package e403;

/**
 *
 * @author nacho
 */
public class Perro extends Animal implements Habilidades {
    //Atributos
    protected String raza;

    public void olfatear() {
        System.out.println("Que rico huelen las croquetas!");
    }

    @Override
    public void comunicarse() {
        System.out.println("Güaauu Güaaau ladro fuerte!");
    }

    @Override
    public void comer() {
        System.out.println("Que ricas estan estaas croquetas!");
    }
}
