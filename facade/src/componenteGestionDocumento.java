/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HARGEZ
 */
public class componenteGestionDocumento implements gestionDocumento{

    @Override
    public String documento(int indice) {
        return "Documento numero " + indice;
    }
    
}
