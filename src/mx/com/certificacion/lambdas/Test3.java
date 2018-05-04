/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.lambdas;

import java.util.*;

/**
 *
 * @author consultor006
 */
interface Carnivore {

    default int calories(List<String> food) {
        return food.size() * 100;
    }

    int eat(List<String> foods);
}

class Tiger implements Carnivore {

    public int eat(List<String> foods) {
        System.out.println("Eating " + foods);
        return foods.size() * 200;
    }
}

public class Test3 {

    public static int size(List<String> names) {
        return names.size() * 2;
    }

    public static void process(List<String> names, Carnivore c) {
        c.eat(names);
    }

    public static void main(String[] args) {
        List<String> fnames = Arrays.asList("a", "b", "c");
        Tiger t = new Tiger();
        //process(fnames, t::eat);
        //process(fnames, Carnivore::calories); //Incorrecto
        //process(fnames, Tiger::eat); //Incorrecto
        //process(fnames, t::calories);
        //process(fnames, Tiger::eat);
          //process(fnames, Carnivore::calories);
          
        
    }
}
