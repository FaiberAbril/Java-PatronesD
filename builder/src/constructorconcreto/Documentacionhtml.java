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
public class Documentacionhtml extends Documentacion{

    @Override
    public void agregarDocumento(String documento) {
         if(documento.startsWith("<html>")){
            contendio.add(documento);
         }

    }

    @Override
    public void imprime() {
        System.out.println("documentacion html");
        for(String s: this.contendio){
           System.out.println(s);
        }
    }
    
}
