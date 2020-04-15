/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.polymorphis;

import java.util.*;

/**
 *
 * @author cesaralducinruiz
 */
public class Test1 {
    
    
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,3,4,6,2,7);
        
        int sum = numbers.stream().filter(number -> (number%2!=0)).reduce(0, Integer::sum);
        
        System.out.println(" "+sum);
        
    }
}
