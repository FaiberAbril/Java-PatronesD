/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concretabuilder;

import builder.Autobuilder;
import producto.Motor;

/**
 *
 * @author HARGEZ
 */
public class Fiatbuilder extends Autobuilder{

    @Override
    public void buildermotor() {
        Motor motor = new Motor();
        motor.setNumero(123213);
        motor.setPotencia("23 hp");
        auto.setMotor(motor);
    }

    @Override
    public void bulidermodelo() {
        auto.setMarca("fiat");
    }

    @Override
    public void buildermarca() {
          auto.setMarca("fiat");
    }

    @Override
    public void bulderpuerts() {
         auto.setCantidaddepuertas(2);
    }
    
}
