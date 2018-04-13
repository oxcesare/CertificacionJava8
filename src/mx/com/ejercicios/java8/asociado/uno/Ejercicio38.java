/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.ejercicios.java8.asociado.uno;

/**
 *
 * @author consultor006
 * 
 * Ejemplo que recuerda el concepto de cambio por valor
 * 
 * Al ser un nuevo objeto se queda el valor como esta 
 */

public class Ejercicio38 {
    public static void main(String[] args) {
        Ejercicio38 q = new Ejercicio38();
        StringBuilder sb = new StringBuilder("This");
        q.changeThis(sb);
        System.out.println(sb);                
    }    
    public void changeThis(StringBuilder str){
        System.out.println(str+" ");
        str = new StringBuilder("that");
        
    }
}