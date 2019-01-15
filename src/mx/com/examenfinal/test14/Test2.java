/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.examenfinal.test14;

import java.util.stream.Stream;

/**
 *
 * @author cesaralducinruiz
 * 
 * Esta clase muestra el uso del metodo anyMatch 
 * para encontrar si algun elemento de un stream hace match 
 * con la condicion 
 * 
 * anyMatch recibe como parametro un Predicate<? super T> predicate
 * 
 * Se debe de intepretar Predicate como una operacion 
 */
public class Test2 {
    
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.iterate(1, i -> i+1);
        boolean a = stream.anyMatch(i -> i>5);
        //boolean b = stream.allMatch(i -> i>5);
        System.out.println("a"+a);
        //System.out.println("b"+b);
        
    }
    
}
