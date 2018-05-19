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
public class Test17 {
    public static void main(String[] args) {
          float f =5.0f;
          Test17 q = new Test17();
          q.runInt(f);
          
    }
    
    public void runInt(float f){
        Integer i = new Integer(new Float(f).intValue());
        System.out.println(""+i);
    }
}