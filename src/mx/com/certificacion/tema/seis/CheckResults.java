/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.seis;

/**
 *
 * @author consultor006
 */
public class CheckResults {

    private static int counter = 0;

    public static void main(String[] args) {
        new Thread(() -> {
         for(int i=0; i<500; i++)
             CheckResults.counter++; // accesando a una variable de clase
        }).start();
        
        while(CheckResults.counter<100){
            System.out.println("Not reached yet");
        }
        System.out.println("Reached!!");
    }
}
