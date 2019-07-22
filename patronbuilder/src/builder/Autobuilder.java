/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

import producto.Auto;

/**
 *
 * @author HARGEZ
 */
public abstract class Autobuilder {
    protected  Auto auto;

    public Auto getAuto() {
        return auto;
    }
    
    public void crearAuto(){
       auto = new Auto();
    }
    
    
    public abstract void buildermotor();
    public abstract void bulidermodelo();
    public abstract void buildermarca();
    public abstract void bulderpuerts();
    
    
}
