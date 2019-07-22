/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuario;

import concretabuilder.FordBulder;
import director.Autocrear;
import producto.Auto;

/**
 *
 * @author HARGEZ
 */
public class main {
    public static void main(String[] args) {
        Autocrear director = new Autocrear();
        director.setAutobuilder(new FordBulder());
        director.constructorAuto();
        Auto auto = director.getAuto();
        
        System.out.println(auto.getMarca());
        System.out.println(auto.getMotor());
    }
}
