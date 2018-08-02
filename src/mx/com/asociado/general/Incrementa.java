/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.asociado.general;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author consultor006
 */
public class Incrementa {

    public static void main(String[] args) {
        AtomicInteger ai = new AtomicInteger(5);         
        int x = ai.addAndGet(1);
        System.out.println(x);
    }

}
