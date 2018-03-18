/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.avanzado;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Vector;

/**
 *
 * @author consultor006
 */
public class Lista  implements  Comparable<Object>{
    
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("a");
        list.add("dos");
        list.add(7);
//        for (Object s : list) {
//            System.out.println(""+s);
//        }

          Lista lista = new Lista();
          lista.c();
    }
    
    public void a(){
      HashSet<Integer> has = new HashSet<Integer>();
      
      HashSet<? super ClassCastException> h = new HashSet<Exception>();
      
      List<String> list  = new Vector<String>();
      
      //List<Object> obj = new HashSet<Object>(); no aplica 
      
      //List<Object> o = new ArrayList< ? super Object>(); no aplica el uso de los wildcard ? en 
      //el segundo parametro
      
      Map<String, ? extends Number> p = new HashMap<String, Integer>();
                   
    }

    @Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public void c (){
        Queue<Integer> c = new LinkedList<>();
        c.add(10);
        c.add(20);
        c.remove(1);
        System.out.println("c"+c);
        
        
    }
    
}
