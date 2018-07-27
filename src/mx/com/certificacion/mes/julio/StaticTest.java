/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.mes.julio;

/**
 *
 * @author cesaralducinruiz
 */
public class StaticTest {
    
    static {
        System.out.println("In static");
    }
    
    {
        System.out.println("In non - static");
    }
    
    public static void main(String[] args) {
        StaticTest st1;
        System.out.println("1");
        st1 = new StaticTest();
        System.out.println("2");
        StaticTest st2 = new StaticTest();
        
        int i = Math.round(3.5f);
        System.out.println("i"+i);
        
    }
    
}
