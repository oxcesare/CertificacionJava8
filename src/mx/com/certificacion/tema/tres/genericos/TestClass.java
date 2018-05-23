/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.tres.genericos;

import java.util.*;

/**
 *
 * @author consultor006
 * 
 * Si dejamos Map m manda un error 
 */
public class TestClass {

    public static void main(String[] args) {       
     // put declaration here      
     Map<Object, ? super ArrayList> m = new LinkedHashMap<Object, ArrayList>(); 
    //Map m = new HashMap();
     m.put("1", new ArrayList());    //1      
     //m.put(1, new Object());    //2       
     //m.put(1.0, "Hello");     //3      
     System.out.println(m);    
    }
    
    
    
    }
