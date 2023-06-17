package e401;

/**@author José Ignacio Camacho Fuentes*/
public class Perro extends Animal{
    //Atributos
    protected String raza;
    
    //Constructores
    public Perro(){
        
    }

    public Perro(String nombre, String alimento, String raza) {
        super.nombre= nombre;
        super.alimento=alimento;
        this.raza = raza;
    }
    
    //Método
    public void olfatear(){
        System.out.println("mmm que rico huele a "+super.alimento+"\n");
    }
    
    //Polimorfismo o sobreescritura
    @Override
    public void comunicarse(){
        System.out.println("Puedo ladrar muy fuerte!!");
    }

    @Override
    public String toString() {
        return String.format("Soy un perro!!\n"
                + "Mi nombre es %s\n"
                + "Me gusta comer %s\n"
                + "Soy de la raza %s",
                super.nombre,
                super.alimento,
                this.raza);
    } 
}
