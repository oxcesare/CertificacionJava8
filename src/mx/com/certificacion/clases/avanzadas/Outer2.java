/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.clases.avanzadas;

/**
 *
 * @author consultor006
 */
public class Outer2 {

    int i = 10;

    class Inner2 {

        public void methodA() {
            System.out.println(""+Outer2.this.i);
            System.out.println(""+i);
            //System.out.println(""+this.i);//Error ya que no alcanza el valor
        }
    }
}
