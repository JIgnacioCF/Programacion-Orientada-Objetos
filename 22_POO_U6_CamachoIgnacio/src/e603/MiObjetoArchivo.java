package e603;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 *
 * @author nacho
 */
public class MiObjetoArchivo extends ObjectOutputStream {

    @Override
    protected void writeStreamHeader() throws IOException {
    //no hace nada
    }

    //Constructores
    public MiObjetoArchivo() throws IOException {
        super();
    }

    public MiObjetoArchivo(OutputStream out) throws IOException {
        super(out);
    }
}
