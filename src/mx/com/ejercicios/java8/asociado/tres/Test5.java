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
 * uso del operador ++ 
 * 
 * Si ponemos ++count primero se incrementa la variable 
 * y despues se imprime
 * 
 * Si ponemos count++ primero se imprime la variable y después se
 * incrementa 
 * 
 * 
 */
public class Test5 {
    public static void main(String[] args) {
        int count =1;
        
        System.out.println(count);
        System.out.println(++count);
        System.out.println(count++);
        System.out.println(count);
        
    }
}
