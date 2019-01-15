/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.examenfinal.test14;

import java.util.stream.*;

/**
 *
 * @author cesaralducinruiz
 * 
 * Esta clase demuestra el uso de un Stream que recibe 
 * como parametro un objeto Character despues los ordena
 * encuentra el primero.
 * 
 * Ordena los elementos y quedarían a,b,c,
 * 
 * Posteriormente si nosotros no podemos el metodo get 
 * nos regresa el valor pero como un opcional. 
 */
public class Test4 {

    public static void main(String[] args) {
        Stream<Character> stream = Stream.of('c', 'b', 'a');
        System.out.println(stream.sorted().findFirst().get());

    }

}
