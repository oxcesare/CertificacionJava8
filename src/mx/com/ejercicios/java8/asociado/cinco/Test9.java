/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.ejercicios.java8.asociado.cinco;



/**
 *
 * @author consultor006
 * 
 * Esta clase imprime el valor de "null"  
 * Es correcto hacer un cast  null a integer
 * 
 */


public class Test9 {
    public static void main(String[] args) {
        Integer [][] arr = {{0,3,12},{2, (Integer)null,4}};        
        System.out.println(arr[1][1]);        
    }
}
