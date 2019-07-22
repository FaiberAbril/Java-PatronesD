/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HARGEZ
 */
public class documentopdf  implements Documento{
    
    protected componentepdf herramienta = new componentepdf();

    @Override
    public void setContenido(String contendio) {
        herramienta.pdffijacontendio(contendio);
    }

    @Override
    public void dibuja() {
       herramienta.pdfpreparavisulizacion();
       herramienta.pdfrefresca();
       herramienta.pdffinlizarvisulizacion();
    }

    @Override
    public void imprime() {
        herramienta.pdfenviarimpresor();
    }
    
}
