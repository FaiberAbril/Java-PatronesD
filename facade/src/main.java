
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author HARGEZ
 */
public class main {

    public static void main(String[] args) {
        webservirAuto webser = (webservirAuto) new webserviceAutoimple();
        System.out.println(webser.documento(0));
        System.out.println(webser.documento(1));

        List<String> resultado = webser.buscarVehiculo(600, 1000);

        if (resultado.size() > 0) {
            System.out.println("vehiculo (s) cuyo precio esta comprendido " + "entre 500 y 7000");

            for (String res : resultado) {
                System.out.println(" " + res);
            }
        }

    }

}
