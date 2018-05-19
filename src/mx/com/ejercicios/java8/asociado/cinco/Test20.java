/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.ejercicios.java8.asociado.cinco;

/**
 *
 * @author consultor006
 */
public class Test20 {
    public static void main(String[] args) {
        Long l =3l; //Si no se especifica que es un long el valor manda error en tiempo de compilacion 
       // for(;l<10;l++){ // declaracion correcta de un ciclo for 
            
       //}
            System.out.println(l.hashCode());
            System.out.println(l.toString());
            System.out.println(l.equals(l));
    }
}
