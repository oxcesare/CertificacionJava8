/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.asociado.general;

/**
 *
 * @author consultor006
 */
public class TestClass {

    public static Integer wiggler(Integer x) {
        Integer y = x + 10;
        //x++;
        System.out.println(x);
        ++x;        
        System.out.println(x);
        return y;
    }

    public static void main(String[] args) {
        Integer dataWrapper = new Integer(5);
        Integer value = wiggler(dataWrapper);
        System.out.println(dataWrapper + value);
    }
}
