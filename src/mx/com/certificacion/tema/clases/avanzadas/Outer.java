/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.clases.avanzadas;

/**
 *
 * @author consultor006
 * 
 * Formas de acceder a una varible de clase dentro de un metodo interno
 * de una clase interna.                                                              
 */

public class Outer
{
  int i = 10;
  class Inner
  {
    public void methodA()
    {
        System.out.println(""+i);
        System.out.println(""+Outer.this.i);
    }
  }
}

