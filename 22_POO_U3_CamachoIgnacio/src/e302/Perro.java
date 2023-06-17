package e302;

/**
 * @author nacho
 */
public class Perro extends Animal {
    //Atributos
    protected String raza;
    
    //Constructor
    public Perro(){
        
    }
    
    public Perro(String nombre,int edad, String alimento, String raza){
        super.nombre = nombre;
        super.edad = edad;
        super.alimento = alimento;
        this.raza = raza;
    }
    //Método
    public void olfatear(){
        System.out.println("Mmmmm que rico huele la comida!!\n");
    }
    
    @Override
    public void comunicarse(){
        System.out.println("Puedo ladrar muy fuerte!!\n");
    }    
    @Override
    public String toString(){
        return String.format("Soy un perro!!\n"
                + "Mi nombre es %s\n"
                + "Pertenezco a la raza %s\n"
                + "Me gusta comer %s\n"
                + "y tengo %d años\n",
                super.nombre,
                this.raza, 
                super.alimento,
                super.edad);
    }
}
