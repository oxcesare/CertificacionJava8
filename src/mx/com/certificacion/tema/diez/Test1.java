/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.diez;


import java.util.stream.*;
/**
 *
 * @author consultor006
 * 
 * Clase Test1 que representa el uso de Stream, 
 * 
 * Recordar que un Stream  es un conjunto de datos y se pueden almancenar 
 * Colecciones 
 * 
 * Al no haber elementos que se tengan que iterar se imprime 
 * un objeto de la clase java.util.
 * 
 * 
 */
public class Test1 {
    
    
    public static void main(String[] args) {
        Stream<String> stream = Stream.iterate("", (s)->s+1);
        System.out.println(stream.limit(2).map(x->x+"2"));
    }
    
    public void otroEjemplo(){
        Stream<String> stream = Stream.generate(()->"Cadena");
        boolean match = stream.allMatch(String::isEmpty);
        boolean match1 = stream.anyMatch(String::isEmpty);
        //boolean match2 = stream.findAny(String::isEmpty); //no aplica  para devolver un valor booleano 
        //boolean match3 = stream.findFirst(String::isEmpty);//no aplica  para devolver un valor booleano 
        boolean match4 = stream.noneMatch(String::isEmpty);
        
        
    }
    
    public void a (){
        IntStream  is = IntStream.empty();
        is.s
    }
}
