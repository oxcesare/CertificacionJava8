/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.curso.certificacion.diseño.clases;

/**
 *
 * @author consultor006
 *
 * Esta clase forma parte del capitulo 1 (Diseño avanzado de clases) y da un
 * ejemplo de clases internas.
 *
 * En las clases internas no se pueden declarar campos staticos.
 * 
 * El codigo compila sin error cambiando la siguiente linea 
 * 
 * public static int x=10; 
 *
 */
public class Outer {

    private int x = 5;

    protected class Inner {

        //public static int x=10; //esta linea manda error
        int x = 10;

        public void go() {
            System.out.println(x);
        }
    }
    
    public static void main(String[] args) {
        Outer out = new Outer();
        Outer.Inner in = out.new Inner(); // Forma correcta de invocar una clase interna
        in.go();

    }

}
