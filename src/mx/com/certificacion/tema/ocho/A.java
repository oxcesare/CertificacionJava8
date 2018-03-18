/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.ocho;

/**
 *
 * @author consultor006
 */
public class A {

    public static void main(String[] args) {
        String c="1";
        String d = new String(c);
        String e="11";
        if(c.equals(d)){
            System.out.println("Contenido"); //de valor
        }        
        if(c==e){ //valida contenido pero con la referencia del objeto es decir son objetos String
            System.out.println("Referencia");
        }
    }
    
}
