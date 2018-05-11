/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.ejercicios.java8.asociado.cinco;

import java.util.ArrayList;

/**
 *
 * @author consultor006
 */
public class Test6 {
    
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        
        try {
            System.out.println(arr.get(2)); //Forma correcta de invocar la posicion de una lista
            //System.out.println(arr[2]); //Compila con error porque asi se invoca la posicion en un arreglo
            System.out.println(arr.get(5)); //Forma correcta de invocar la posicion de una lista
        } catch (Exception e) {
            System.out.println(e);
        }
    }    
}
