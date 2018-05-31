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
public class Test28 {
    
    public static void main(String[] args) {
        double r = Double.valueOf("6.7");
        System.out.println(""+Math.round(r));
        for(int x =0; x<r; x+=Math.round(r)-4){
            System.out.println(x+"");
        }
    }
    
}
