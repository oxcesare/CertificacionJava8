/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.ejercicios.java8.asociado.cinco;

/**
 *
 * @author consultor006
 */
public class Test22 extends SuperTest22 {

    static {
        System.out.println("Sub static block");
    }

    {
        System.out.println("Sub block");
    }

    public static void main(String[] args) {
        Test22 q = new Test22();
    }

}

class SuperTest22 {

    {
        System.out.println("Super block");
    }

    static {
        System.out.println("Super static block");
    }

    public SuperTest22() {
        
    }
    
    public void run1(){
        System.out.println("run1");
    }
    
    public static void run2(){
        System.out.println("Run2");
    }
    

}
