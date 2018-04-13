/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.capitulo.uno;

/**
 *
 * @author consultor006
 */
public class Test {
    public static void main(String[] args) {
        int counter=0;
        
        outer:
         for(int i=5; i>0;i--){
             inner: 
             for(int x=0; x<i;x++){
                 if(x==3){
                     break inner;
                 }
                 counter++;
             }
         }
        System.out.println(counter);
    }
}
