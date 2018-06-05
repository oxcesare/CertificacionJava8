/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.lambdas.uno;

import java.util.Arrays;
import java.util.List;
import static javax.swing.event.DocumentEvent.EventType.INSERT;

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

public class TestClass {

    public static int size(List<String> names) {
        return names.size() * 2;
    }

    public static void process(List<String> names, Carnivore c) {
        c.eat(names);
    }

    public static void main(String[] args) {
        List<String> fnames = Arrays.asList("a", "b", "c");
        Tiger t = new Tiger();
        
       //process(fnames, t::eat);  //Compila sin problemas 
       //process(fnames, t::calories); //Compila sin problemas 
       //process(fnames, TestClass::size); //Compila sin problemas 
       //process(fnames, Carnivore::calories); //Compila con error, mala invocacion a los métodos de la interface
       //process(fnames, Tiger::eat); aparentemente esta bien pero debe de ser la invocacion mediante el objeto no con el nombre de la clase 
       
       
      
    
    }
}
