
package com.controllers;


public class Conexion {
    
   private static Conexion variable;
    
    private Conexion(){
      
    }
    
    public static Conexion getInstancia(){
      if(variable== null){
       variable = new Conexion();
      }
      return variable;
    }
    
    public void conectar(){
        System.out.println("Me conecte a la db");
    }
    
    public void desconectar(){
        System.out.println("me desconecte");
    }
    
    
    
}
