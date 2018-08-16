/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.examen.global;

/**
 *
 * @author consultor006
 */
interface T1 {

    int VALUE = 1;

    void m1();
}

interface T2 {

    int VALUE = 2;

    void m1();
}

public class TestClass implements T1, T2{

    @Override
    public void m1() {
        System.out.println("Funcionalidad");
        //System.out.println("VALUE"+""+VALUE);
               
    }
     
    public static void main(String[] args) {
        TestClass test = new TestClass();
        test.m1();
    }

}
