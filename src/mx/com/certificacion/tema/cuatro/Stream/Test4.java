/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.cuatro.Stream;

import java.util.stream.*;
/**
 *
 * @author consultor006
 * 
 * Declarar un Stream, meterlo dentro de un collect
 * y despues se puede hacer uso de cualquier basic Collectors.
 * 
 * Tambien se puede hacer uso de Collecting metiendonse en MAP
 * 
 * 
 * 
 */
public class Test4 {
    public static void main(String[] args) {
        Stream<String> ohMy = Stream.of("lions","tigers","bears");
        String result = ohMy.collect(Collectors.joining(","));
        
        
        
    }
}
