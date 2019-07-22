package singlenton;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        marcianos mar = marcianos.getMarcianos();
        computadora comp = new computadora();
        jugador jug = new jugador();
        int disparos;
          Scanner sc = new Scanner(System.in);               
        do{
            System.out.println("inicio del programa");
              disparos = sc.nextInt();   
              for(int i = 0 ; i< disparos ; i ++){
                jug.destruirmarciano();
              }
               comp.crearMarcianos();
               marcianos.cuantosquedan();
        } while(disparos !=0);
        
        
      
        

    }
}
