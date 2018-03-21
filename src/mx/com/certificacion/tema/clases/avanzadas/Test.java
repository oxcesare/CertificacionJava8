/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.clases.avanzadas;

import javax.xml.transform.OutputKeys;

/**
 *
 * @author consultor006
 */
public class Test {
    
    public static void main(String[] args) {
        String c="[ERR]";
        String d= "ERRsdasd";
        
        if(c.indexOf("[ERR]")>-1){
            System.out.println("SI 1");
        }
        
        if(d.indexOf("ERRsdasd")>-1){
            System.out.println("SI  2");
        }       
    }
 
}
