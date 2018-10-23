/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.stream.api.uno;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author consultor006
 * 
 * Clase que obtiene un conjunto de rangos y despues particiona estos en dos grupos.
 * y los almacena en una variable de tipo objeto. 
 */
public class UsoRangoClose {

    public static void main(String[] args) {

        /**  Imprime un rango de valores desde el 10 al 15 **/
        
        /**  Se pone boxed() para que regrese los elementos a Stream del tipo Integer**/
        Stream<Integer> values = IntStream.rangeClosed(10, 15).boxed(); 
        Object obj = values.collect(Collectors.partitioningBy(x->x%2==0)); 
        System.out.println(obj);

    }

}
