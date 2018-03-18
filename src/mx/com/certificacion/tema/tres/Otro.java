/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.tres;

import java.sql.Date;

/**
 *
 * @author consultor006
 */
public class Otro {
    
    public static void main(String[] args) {
        Test t = null;
        t = new Test();
        
        if(t==null){
            System.out.println("Objeto Null");
        }else{
            System.out.println("Objeto"+ " " + t.toString());
        }       
        if(t.equals("")){
            System.out.println("Objeto Vacio");
        }
        
    }
}
