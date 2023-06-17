package e503;

import java.io.File;
import java.io.FileInputStream;
import java.net.URL;
import java.util.Properties;

/**@author nacho*/
public class Aplicacion {

    public Usuario login(String usuario, String password) throws
            ErrorFisicoException {
        FileInputStream archivo = null;
        try {
            Properties p = new Properties();
            p.load(getClass().getResourceAsStream("usuario.properties"));
            String usr = p.getProperty("usrname");
            String pwd = p.getProperty("password");
            Usuario usuario1 = null;

            if (usr.equals(usuario) && pwd.equals(password)) {
                usuario1 = new Usuario();
                usuario1.usuario = usr;
                usuario1.password = pwd;
                usuario1.nombre = p.getProperty("nombre");
                usuario1.email = p.getProperty("email");
            }
            return usuario1;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException("Error verificando los datos...", ex);

        }
    }
}
