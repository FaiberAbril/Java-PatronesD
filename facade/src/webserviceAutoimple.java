
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
public class webserviceAutoimple {
    
    protected catalogo catalogo = new ComponenteCatalogo();
    protected gestionDocumento gDocumentos = new componenteGestionDocumento();
    
    
    public String documentos(int indice){
      return gDocumentos.documento(indice);
    }
    
    public List<String> buscarVehiculo(int precioMedio , int desviacionmax)
    {
      return catalogo.buscaVehiculos(precioMedio - desviacionmax , precioMedio + desviacionmax);
    } 
    
}
