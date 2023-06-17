package e209;

/**
 * @author nacho
 */
public class Fecha {

    private int dia;
    private int mes;
    private int anio;

    //Sobrecarga Constructor
    public Fecha() {

    }

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    //metodos
    private int comprobarMes(int mes) {
        if (mes > 0 && mes <= 12) {
            return mes;
        } else {
            System.out.printf("Mes invalido (%d), se establecio en 1 el mes!!", mes);
            return 1;
        }
    }

    private int comprobarDia(int dia) {
        int diasPorMes[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 31};
        if (dia > 0 && dia <= diasPorMes[this.mes]) {
            return dia;
        }
        if (mes == 2 && dia == 29 && (anio % 400 == 0 || (anio % 4 == 0 && anio % 100 != 0))) {
            return dia;
        } else {
            System.out.printf("Dia invalido (%d)!!, se establecio en 1 el dia", dia);
        }
        return dia;
    }

    @Override
    public String toString() {
        return String.format("%d/%d/%d", this.dia, this.mes, this.anio);
    }
}
