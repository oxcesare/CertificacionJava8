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
public class Noobs {

    public void m(int a) {
        System.out.println("In int ");
    }

    public void m(char c) {
        System.out.println("In char ");
    }

    public static void main(String[] args) {
        Noobs n = new Noobs();
        int a = 'a';
        char c = 6;
        n.m(a);
        n.m(c);
    }
}
