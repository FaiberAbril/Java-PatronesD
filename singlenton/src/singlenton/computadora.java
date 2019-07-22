/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singlenton;

/**
 *
 * @author HARGEZ
 */
public class computadora {

    private marcianos mar = marcianos.getinstance();

    public computadora() {
        
    }
    
    public void crearMarcianos(){
       marcianos.crearbaMarcianos();
    }
    
    
    
    
}
