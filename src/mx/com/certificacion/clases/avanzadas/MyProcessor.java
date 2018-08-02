/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.clases.avanzadas;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.UnaryOperator;

/**
 *
 * @author consultor006
 *
 * Clase que genera un objeto de la interface funcional Supplier, tambien
 * demuestra la forma correcta de crear objetos
 *
 * La interface funcional Supplier tiene un unico metodo abstracto get()
 *
 *
 */
public class MyProcessor {

    int value;

    public MyProcessor() {
        value = 10;
    }

    public MyProcessor(int value) {
        this.value = value;
    }

    public void process() {
        System.out.println("Processing " + value);
    }

    public static void main(String[] args) {
        //Supplier<MyProcessor> supp = MyProcessor::new; MyProcessor mp = supp.get(); mp.process();
        //Supplier<MyProcessor> supp = MyProcessor(10)::new; MyProcessor mp = supp.get(); mp.process();
        // MyProcessor mp = MyProcessor::new(10); mp.process();      
    }

    public void UnaryOperatorDemo() {
        String val1 = "hello";
        StringBuilder val2 = new StringBuilder("world");
        
        UnaryOperator<String> uo1 = s1 -> s1.concat(val1); //1         
        UnaryOperator<String> uo2 = s->s.toUpperCase(); //2         
        System.out.println(uo1.apply(uo2.apply(val1))); //3
    }
    
    public void listaConMap(){
        List<Integer> ls = Arrays.asList(10, 47, 33, 23);
        int max = ls.stream().max(Comparator.comparing(a->a)).get();        
        //int max = ls.stream().reduce((a, b)->a>b?a:b);
    }
}
