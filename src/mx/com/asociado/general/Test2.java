/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.asociado.general;

import java.util.function.*;


/**
 *
 * @author consultor006
 */
public class Test2 {
    public static void main (String []args){
        Function<Integer,String> converter = (i)-> Integer.toString(i);
        
        System.out.println("Metodos de la interface funcional Function"+ " " + converter.apply(Integer.SIZE));
        
        System.out.println("Metodos de la interface funcional Function"+ " " + converter.apply(Integer.SIZE));
    }
}
