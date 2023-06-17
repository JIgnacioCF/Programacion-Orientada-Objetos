package e302;

/**
 * @author nacho
 */
public class Ave extends Animal {
    //Atributos
    protected String especie;
    protected boolean volar;
    
     //Constructor
    public Ave(){
        
    }
    
    public Ave(String nombre,int edad, String alimento, String especie,
                boolean volar){
        super.nombre = nombre;
        super.edad = edad;
        super.alimento = alimento;
        this.especie = especie;
        this.volar = volar;
    }
    
    //Métodos
    public void volar(){
        if (this.volar) {
            System.out.println("Soy un  ave y puedo volar muy alto!");
        }else{
            System.out.println("Soy una ave pero mi especie no puede volar!");
        }
    }
    
    @Override
    public void comunicarse(){
        System.out.println("Puedo cantar como un ruiseñor lalala");  
    }
    
    @Override
    public String toString(){
        return String.format("Soy una ave!!\n"
                + "Mi nombre es %s\n"
                + "Pertenezco a la especie %s\n"
                + "Me gusta comer %s\n"
                + "y tengo %d años\n",
                super.nombre,
                this.especie, 
                super.alimento,
                super.edad);
    }
    
}
