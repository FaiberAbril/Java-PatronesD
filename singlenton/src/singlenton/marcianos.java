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
public class marcianos {

    private static marcianos intance;
    private static int cantidad;

    private marcianos() {
        cantidad = 10;
    }

    public static marcianos getinstance() {
        if (intance == null) {
            intance = new marcianos();
        }
        return intance;
    }

    public static marcianos getMarcianos() {
        return intance;
    }

    public static void derribaMarcianos() {
        System.out.println("derribe un marciano");

        if (cantidad > 0) {
            cantidad--;
        }
    }
    
     public static void crearbaMarcianos() {
        System.out.println("crar un marciano");

        if (cantidad > 0) {
            cantidad++;
        }
    }
    
    

    public static void cuantosquedan() {
        if (cantidad > 0) {
            System.out.println("quedan " + cantidad);
        }else{
            System.out.println("bien gano");
        }
    }

}


