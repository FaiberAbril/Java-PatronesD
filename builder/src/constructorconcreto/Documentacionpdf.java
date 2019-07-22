/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructorconcreto;

import constructorconcreto.Documentacion;

/**
 *
 * @author HARGEZ
 */
public class Documentacionpdf extends Documentacion{
    
     @Override
    public void agregarDocumento(String documento) {
         if(documento.startsWith("<pdf>")){
            contendio.add(documento);
         }

    }

    @Override
    public void imprime() {
        System.out.println("documentacion pdf");
        for(String s: this.contendio){
           System.out.println(s);
        }
    }  
    
}
