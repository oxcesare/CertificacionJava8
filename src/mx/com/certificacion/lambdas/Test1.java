/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.lambdas;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;

/**
 *
 * @author consultor006
 */
public class Test1 {

    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(3, 4, 6, 9, 2, 5, 7);
        System.out.println(ls.stream().reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b)); //1 
        System.out.println(ls.stream().max(Integer::max).get()); //2 
        System.out.println(ls.stream().max(Integer::compare).get()); //3 
        System.out.println(ls.stream().max((a, b) -> a > b ? a : b)); //4

        System.out.println("*************************************************");
        a();
        System.out.println("*************************************************");
        IntFunction<IntUnaryOperator> fo = a -> b -> a - b;  //1                  
        int x = operate(fo.apply(20)); //2         
        System.out.println(x);
    }

    public static void recorre() {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "a");
        hm.put(2, "b");
        hm.put(3, "c");

        hm.forEach((key, value) -> System.out.printf("%d %s ", key, value));
    }

    public static void a() {
        List<StringBuilder> messages = Arrays.asList(new StringBuilder(), new StringBuilder());
        messages.stream().forEach(s -> s.append("helloworld"));
        messages.forEach(s -> {
            s.insert(5, ",");
            System.out.println(s);

        });
    }

    public static int operate(IntUnaryOperator iuo) {
        return iuo.applyAsInt(5);
    }
    
    public static void creaInstancia(Book book){
        Consumer<Book> c = b->System.out.println(b.getId()+":"+b.getTitle()); c.accept(book);
    }

}
