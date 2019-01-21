/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.examenfinal.test20;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 *
 * @author cesaralducinruiz
 *
 * Clase que demuestra el uso de la clase Optional
 * 
 * En el objeto opt se guarda el valor de aplicar un Stream
 * 
 * se aplican el metodo sorted y posteriormente el metodo findFirts
 */
public class Test2 {

    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        list.add(5.4);
        list.add(1.2);
        list.add(7.4);
        //Optional<Double> opt = list.stream().sorted().findFirst();
        Optional<Double> opt = list.stream().sorted().findAny();
        System.out.println(opt.get() + " " + list.get(0));
        
        //opt.get() Imprime el resultado
        
        Map<Integer, Integer> map = new HashMap<>();
        //map.computeIfAbsent(Integer.SIZE, mappingFunction)
        
        
    }
}
