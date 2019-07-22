/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HARGEZ
 */
public class componentepdf {
    
    protected String contenido;
    
    
    public void pdffijacontendio(String contendio){
        this.contenido = contendio;
    }
    
    public void pdfpreparavisulizacion(){
        System.out.println("visualizar pdf :comienzo");
    }
    
    public void pdfrefresca(){
        System.out.println("visulizar pdf :" + contenido);
    }
    
    public void pdffinlizarvisulizacion(){
            System.out.println("visualizar pdf : final");
    }
    
    public void pdfenviarimpresor(){
        System.out.println("impresion Pdf " +  contenido);
    
    }
    
    
}
