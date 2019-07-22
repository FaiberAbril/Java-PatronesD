
package constructorconcreto;

import java.util.ArrayList;
import java.util.List;


public abstract class Documentacion {
    
    protected List<String> contendio = new ArrayList<String>();
    
    public abstract void agregarDocumento(String documento);
    public abstract void imprime();
}
