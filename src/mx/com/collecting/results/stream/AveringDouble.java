/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.collecting.results.stream;

import java.util.stream.*;
import java.util.Map;

/**
 *
 * @author cesaralducinruiz
 * 
 * En la Collectors estan todos los métodos para Collecting results
 * para Java 8 
 */
public class AveringDouble {

    public void m() {
        Stream<String> ohMy = Stream.of("leones", "Panteras", "Tigres");        
        Map<String, Integer> map = ohMy.collect(Collectors.toMap(s ->s, String::length));
        System.out.println("Map"+" "+ map);

    }

}
