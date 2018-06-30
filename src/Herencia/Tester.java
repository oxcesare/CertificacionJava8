/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *
 * @author consultor006
 * 
 * En esta clase al momento de invocar al constructor con un valor de String,
 * imprime basura, esto debido a que no esta implementado el método ToString. 
 */
class StringWrapper {

    private String theVal;

    public StringWrapper(String str) {
        this.theVal = str;
    }
}

public class Tester {

    public static void main(String[] args) {
        StringWrapper sw = new StringWrapper("How are you?");
        StringBuilder sb = new StringBuilder("How are you?");
        System.out.println("Hello, " + sw.toString());
        System.out.println("Hello, " + sb);
    }
}
