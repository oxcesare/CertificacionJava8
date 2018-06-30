/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *
 * @author consultor006
 */
public class TestClass {

    static String str = "Hello World";

    public static String changeIt(String s) {
        s = s.concat("Good bye world");        
        return s;
    }

    public static void main(String[] args) {
        changeIt(str);
        System.out.println(str);
    }
}
