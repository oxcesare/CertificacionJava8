/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.ocho;

/**
 *
 * @author consultor006
 */
public class TestClass {

    public int radiusA, radiusB;
    public int sum = 100;

    public static void main(String[] args) {
        //new TestClass().sayHello();
        //new TestClass().setRadius(50);
        printSum(1, 2);
    }   //1

    public static void sayHello() {
        System.out.println("Static Hello World");
    }  //2

    public void setRadius(int r) {
        if (r > 99) {
            throw new IllegalArgumentException();
        }
        radiusA = r;
        radiusB = sum - radiusA;

    }

    public static void printSum(int a, int b) {
        System.out.println("In int " + (a + b));
    }

    public static void printSum(Integer a, Integer b) {
        System.out.println("In Integer " + (a + b));
    }
}
