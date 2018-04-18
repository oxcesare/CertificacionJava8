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
 * Si asignamos un char a un short, este ultimo toma el valor 
 * correspondiente al equivalente a char, siempre y cuando entre
 * dentro del rango de valores aceptados.
 */
public class Test1 {
    public static void main(String[] args) {
        int i=0;
        char a ='a';
        short s=1;
        
        i=a;
        
        System.out.println(i);
    }
}
