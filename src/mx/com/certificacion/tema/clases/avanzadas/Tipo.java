/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.clases.avanzadas;

/**
 *
 * @author consultor006
 */
public class Tipo {

    public static void main(String[] args) {
        int counter=0;
        for (int i = 5; i > 0; i--) {
            System.out.println("i="+i);
            for(int x=0; x<i;x++){
                System.out.println("x="+x);
                counter++;
            }            
        }      
        System.out.println(counter);          
    }
}
