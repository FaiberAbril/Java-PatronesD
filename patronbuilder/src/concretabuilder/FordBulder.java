
package concretabuilder;

import builder.Autobuilder;
import producto.Motor;


public class FordBulder  extends Autobuilder{
      @Override
    public void buildermotor() {
        Motor motor = new Motor();
        motor.setNumero(2312);
        motor.setPotencia("24 hp");
        auto.setMotor(motor);
    }

    @Override
    public void bulidermodelo() {
        auto.setMarca("ford");
    }

    @Override
    public void buildermarca() {
          auto.setModelo("focus");
    }

    @Override
    public void bulderpuerts() {
         auto.setCantidaddepuertas(2);
    }
}
