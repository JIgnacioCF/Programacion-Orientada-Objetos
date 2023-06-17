package e503;

/**@author nacho*/
public class Usuario {
    protected String usuario;
    protected String password;
    protected String nombre;
    protected String email;

    @Override
    public String toString() {
        return String.format("nombre: %s\n Email: %s\n",
                this.nombre,
                this.email);
    }    
}
