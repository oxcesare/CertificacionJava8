/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.examen.programador.semana1;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.OptionalDouble;
import java.util.OptionalLong;
import java.util.function.Function;


/**
 *
 * @author cesaralducinruiz
 * 
 * clase ejemplo de Optional 
 * 
 * 
 */
public class Whiz6 {
    
    public static void main(String[] args) {
        Optional ops = Optional.of(("1"));
        
        //Error aqui ya que se debe definir un 
        //Function<? super T, ? extends U> mapper
        //OptionalInt op = ops.map(Integer::parseInt);
        System.out.println("op");
    }
    
}
