/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.ejercicios.java8.asociado.tres;

/**
 *
 * @author consultor006
 * 
 * Declarar el ciclo for de la siguiente manera hace que la clase
 * compile con error 
 * 
 *          for (y; y < x; y+=x) {
                   System.out.println(y+",");
            }
     Originalmente así estaba el código, se modifica para ver la impresion
     * correcta de la informacion
            
 */
public class Test12 {
    public static void main(String[] args) {
        for (int x = 0; x < 5; ++x) {
            System.out.println(++x+",");                
               for (int y =0; y < x; y+=x) {
                   System.out.println(y+",");
            }
        }
    }
   
}
