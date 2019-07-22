/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p_fabrica.utilidades;

import com.interfaces.Iconexion;


public class ConexionMsql implements Iconexion{
    
    private String host;
    private String puerto;
    private String usuario;
    private String contrasena;

    public ConexionMsql(String host, String puerto, String usuario, String contrasena) {
        this.host = "localhost";
        this.puerto = "123";
        this.usuario = "admin";
        this.contrasena = "123";
    }

    @Override
    public void conectar() {
        System.out.println("se conecsto");
    }

    @Override
    public void desconecstar() {
        System.out.println("se desconecto");
       }
    
    
    
    
    
   
    
}
