/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.lambdas;

import java.util.function.DoubleSupplier;

/**
 *
 * @author consultor006
 */
public class TestBook {

    
    public static void main(String[] args) {
         Book b1 = new Book("Java in 24 hrs", null);
         DoubleSupplier ds1 = b1::getPrice;
         System.out.println (b1.getTitle()+" "+ds1.getAsDouble());
    }    
}
