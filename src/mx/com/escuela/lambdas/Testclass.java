/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.escuela.lambdas;

import java.util.*;
/**
 *
 * @author consultor006
 */
public class Testclass {

    public static void main(String[] args) {
        NavigableMap<String, String> mymap = new TreeMap<String, String>();
        mymap.put("a", "apple");
        mymap.put("b", "boy");
        mymap.put("c", "cat");
        mymap.put("aa", "apple1");
        mymap.put("bb", "boy1");
        mymap.put("cc", "cat1");
        
        mymap.pollLastEntry(); //LINE 1         
        mymap.pollFirstEntry(); //LINE 2                  
        
        NavigableMap<String, String> tailmap = mymap.tailMap("bb", false); //LINE 3          
        
        System.out.println(tailmap.pollFirstEntry()); //LINE 4         
        System.out.println(mymap.size()); //LINE 5 
        
        System.out.println("***************************************************");
        
        List<String> list1 = new ArrayList<>(10);
        List<String> list2 = new ArrayList<>();
        //List<String> list = new List<>();// List es abtracto y no se puede instanciar. 
        
    }
}
