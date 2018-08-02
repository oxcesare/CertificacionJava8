/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.lambdas;

import java.util.stream.Stream;

/**
 *
 * @author consultor006
 * 
 * La clase ExamplesStreams indica que si utlizas un Filter y se requiere ocupar otro filter,
 * El segundo se aplica sobre el reusltado del primer filter
 */
public class ExamplesStreams {
    public static void main(String[] args) {
         //   Stream<Integer> strm1 = Stream.of(2, 3, 5, 7, 11, 13, 17, 19); //1 
            
            //Stream<Integer> strm2 = strm1.filter(i->{ return i>5 && i<15; });  //2 
            //strm2.forEach(System.out::print); //3   
            
            Stream<Integer> strm1 = Stream.of(2, 3, 5, 7, 11, 13, 17, 19,21,25).
                    filter(i->{ return i>19 && i<26; }).filter(i->{ return i>20 && i<26; });
            Stream<Integer> strm2 = strm1;
            strm2.forEach(System.out::print);            
    }
}
