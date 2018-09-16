/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.examen.global;

import java.util.stream.Stream;

/**
 *
 * @author consultor006
 */
public class Pregunta15 {

    public static void main(String[] args) {
        Stream<Integer> strm1 = Stream.of(2, 3, 5, 7, 11, 13, 17, 19); //1 
        //Stream<Integer> strm2 = strm1.filter(i->{ return i>5 && i<15; });  //2 
        //Se invoca al metodo parallel para que haga los dos filter al mimos tiempo y 
        //regrese un resultado de manera secuencial.
        Stream<Integer> strm2 = strm1.parallel().filter(i->i>5).filter(i->i<15).sequential();
        
        Stream<Integer> strm3 = strm1.parallel(). filter(i->i>5).filter(i->i<15).sequential();
                
        strm2.forEach(System.out::print); //3
        
        strm3.forEach(System.out::print); //4
    }
}
