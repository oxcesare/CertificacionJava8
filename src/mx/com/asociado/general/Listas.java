/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.asociado.general;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
/**
 *
 * @author consultor006
 */
public class Listas {
    public static void main(String[] args) {
         List<String> description = new ArrayList<>();
         description.add("AAAAAAAA");
         description.add("BBBBBBBBBBB"); 
         description.add("CCCCCCCCCCCCCCC");
         description.add("D");
         description.add("E");
                          
        Stream<String> strm = description.stream().filter(s->s.length()>4);
        Stream<String> strm2 = strm;
        strm2.forEach(System.out::print);
         
    }
}
