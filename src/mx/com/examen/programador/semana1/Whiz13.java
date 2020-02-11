/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.examen.programador.semana1;

import java.util.function.Function;

/**
 *
 * @author cesaralducinruiz
 */
public class Whiz13 {
    public static void main(String[] args) {
        Function<String,Double> f = Double::parseDouble;
        System.out.println(f.andThen(s->s*2).apply("1"));
    }
}
