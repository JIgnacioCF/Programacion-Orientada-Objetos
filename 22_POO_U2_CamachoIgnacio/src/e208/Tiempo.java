package e208;

/***
 * @author nacho
 */
public class Tiempo {

    private int segundo;
    private int minuto;
    private int hora;

    //constructores
    public Tiempo() {

    }

    public Tiempo(int segundo, int minuto, int hora) {
        this.segundo = segundo;
        this.minuto = minuto;
        this.hora = hora;
    }

    public Tiempo(int minuto, int hora) {
        this.minuto = minuto;
        this.hora = hora;
    }

    //Setters & Getters
    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getSegundo() {
        return segundo;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getHora() {
        return hora;
    }

    @Override
    public String toString() {
        return String.format("%d:%02d:%02d %s", ((getHora() == 0 || getHora() == 12)
                ? 12 : getHora() % 12), getMinuto(), getSegundo(), (getHora() > 12
                        ? "AM" : "PM"));
    }
}
