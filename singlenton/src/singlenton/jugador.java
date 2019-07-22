
package singlenton;


public class jugador {
    private marcianos mar;

    public jugador() {
      mar = marcianos.getMarcianos();
    }
    
    public void destruirmarciano(){
      marcianos.derribaMarcianos();
    }
    
    
}
