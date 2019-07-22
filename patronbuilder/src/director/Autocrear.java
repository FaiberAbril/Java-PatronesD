/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package director;

import builder.Autobuilder;
import producto.Auto;

/**
 *
 * @author HARGEZ
 */
public class Autocrear {
    
    private Autobuilder autobuilder;
    
    public void constructorAuto(){
       autobuilder.crearAuto();
       autobuilder.buildermarca();
       autobuilder.bulidermodelo();
       autobuilder.bulderpuerts();
    }

    public void setAutobuilder(Autobuilder autobuilder) {
        this.autobuilder = autobuilder;
    }
    
    public Auto getAuto(){
      return autobuilder.getAuto();
    }
    
}
