/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author consultor006
 * 
 * Dentro de las clases internas no hay atributos staticos 
 * esta regla tampoco aplica para los métodos 
 *
 */
public class Outer {

    private int x = 5;

    protected class Inner {

        private int x = Outer.this.x;
        
        public void m(){
            System.out.println("x"+x);
        }
    }
    
    public static void main(String[] args) {
        Outer out = new Outer();
        Outer.Inner c  = out.new Inner();
        c.m();
        
    }

}
