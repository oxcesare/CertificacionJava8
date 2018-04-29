/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.siete;

import static java.lang.Math.random;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author consultor006
 */
public class Aleatorios {
    public static void main(String[] args) {
        for(int i=0; i<=5; i++){
            int n = ThreadLocalRandom.current().nextInt(0, 47);
               int m = 46;
               int mi =1;
               if(n<m&&n>mi){
                  System.out.println(""+n);
               }
        }
    }
}
