package e503;

/**@author nacho*/
public class ErrorFisicoException extends Exception {

    public ErrorFisicoException(Exception ex) {
        super("Ocurrio un error fisico", ex);
    }
}
