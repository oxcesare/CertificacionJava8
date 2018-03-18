/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.escuela.capitulo.uno.clasesAvanzadas;

/**
 *
 * @author consultor006
 */
public class TestObjetos {

    public static void main(String[] args) {
        String s1 = "Canada";
        String s2 = s1;
        if(s1==s2)
            System.out.println("s1==s2"); //Referencia de Objetos 
        if(s1.equals(s2)) // Referencia de Contenido 
            System.out.println("s1.equals(s2)");
            
    }

}
