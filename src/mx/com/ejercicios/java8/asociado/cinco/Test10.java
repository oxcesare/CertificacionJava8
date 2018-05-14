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
public class Test10 {

    public static void main(String[] args) {
        String s = "Team USA";
        String y = "Team UK";

        s.concat(y);
        System.out.println(s);  // Team USA
        modify(s, y); //Al no asignarse 
        System.out.println(s);  //Vuelve a imprimir Team USA porque no se esta creando un nuevo objeto
        s = modify(s, y); // se crea un nuevo objeto 
        System.out.println(s);  //Se imprime el valor del nuevo objeto 

    }

    public static String modify(String one, String two) {
        String mod = "";

        mod = two.concat("AND") + one.substring(4);

        return mod;
    }
}
