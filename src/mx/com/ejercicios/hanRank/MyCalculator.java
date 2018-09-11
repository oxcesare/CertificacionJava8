/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.ejercicios.hanRank;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author consultor006
 */
public class MyCalculator extends TipoException {

    public static void main(String[] args) throws TipoException {
        power(5, -5);
    }

    /*
    * Create the method long power(int, int) here.
     */
    public static void power(int n, int p) throws TipoException {
        try {
            if (n < 0 | p < 0) {                
                 throw new TipoException("n and p should be non-negative");
            } else if(n==0 | p==0) {
                throw new TipoException("n and p should not be zero");
            }else{                
                double v = Math.pow(n, p);
                System.out.println("valores"+" " + v);
            }
        } catch (TipoException e) {
            System.out.println(""+e.getMessage());
        }
    }

}

class TipoException extends Exception {

    public TipoException() {
    }

    /**
     * @param message
     */
    public TipoException(String message) {
        super(message);
    }

}
