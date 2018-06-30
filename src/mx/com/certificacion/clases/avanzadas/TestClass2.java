/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.clases.avanzadas;

/**
 *
 * @author consultor006
 * 
 * Clase que demuestra el correcto 
 * funcionamiento para invocar clases internas y su respectivo método
 */
public class TestClass2 {

    public static void main(String args[]) {
        Outer out = new Outer();
        System.out.println(out.getInner().getOi());
    }
}

class Outer {

    private int oi = 20;

    class Inner {

        int getOi() {
            return oi;
        }
    }

    Inner getInner() {
        return new Inner(); //Retonar un objeto Inner de la clase Interna 
    }
}
