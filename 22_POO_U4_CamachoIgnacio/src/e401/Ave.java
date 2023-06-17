package e401;

/**@author José Ignacio Camacho Fuentes*/
public class Ave extends Animal{
    //Atributos
    protected String especie;
    protected boolean volar;
    
    //Constructores
    public Ave(){
        
    }

    public Ave(String nombre, String alimento, String especie, boolean volar) {
        super.nombre = nombre;
        super.alimento = alimento;
        this.especie = especie;
        this.volar = volar;
    }
    
    //Método
    public void volar(){
        if (volar) {
            System.out.println("Soy un ave, puedo volar muy alto!\n");
        }else{
            System.out.println("Mi especie no puede volar!\n");
        }
    }
    
    //Polimorfismo
    @Override
    public void comunicarse(){
        System.out.println("Puedo cantar como un ruiseñor!");
    }
    
    @Override
    public String toString(){
        return String.format("Soy un ave!! \n"
                + "Mi nombre es %s\n"
                + "ME gusta comer %s\n"
                + "Soy de la especie %s",
                super.nombre,
                super.alimento,
                this.especie);
    }
}
