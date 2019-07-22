/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HARGEZ
 */
public class usuario {
    
    public static void main(String[] args) {
        Documento documento1, documento2;
        
        documento1 = new documentohtml();
        documento1.setContenido("hello");
        documento1.dibuja();
        
        
        documento2 = new documentopdf();
        documento2.setContenido("hola");
        documento2.dibuja();
    }
    
}
