/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.ejercicios.java8.asociado.cinco;

/**
 *
 * @author consultor006
 * Se estan comparando dos objetos string, no el contenido
 * por lo tanto no son iguales e imprime la longitud de la cadena del else.
 * 
 * Recordar que == es para objetos y Equals es para contenidos. 
 * 
 * 
 * En la segunda validacion el metodo reverse no existe para String
 * solo para StringBuilder
 */
public class Test5 {
    public static void main(String[] args) {
        if("This string" == new String("This string")){
            System.out.println("This string".toLowerCase());
        }else{
            System.out.println("This string".length());
        }
        
        if("This string" == new String("This string")){
            //System.out.println("This string".reverse());
        }else{
            System.out.println("This string".length());
        }
        
        //Método reverse solo existe en StringBuffer
        StringBuffer bf = new StringBuffer("Sting");
        System.out.println("bf.reverse();"+bf.reverse());
        
        
    }
 
}
