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
 * Esta clase compila con error debido a que no se puede asignar
 * un String a un StringBuilder 
 * 
 * Esta sintaxis es incorrecta static StringBuilder  sb ="wordl";
 * 
 * Lo que si es correcto es concatenar un String con un StringBuilder                                                                                                                
 */
public class Test10 {
    
    static String s = "hello";
    static StringBuilder  sb = new StringBuilder("world");
    //static StringBuilder  sb ="wordl";
    
    public static void main(String[] args) {
        System.out.println(s.concat(sb.toString()));
    }
    
}
