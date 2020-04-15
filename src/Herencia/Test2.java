/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author cesaralducinruiz
 */
public class Test2 {

    public static void main(String[] args) {
        ReentrantLock rlock = new ReentrantLock();
        boolean f1 = rlock.tryLock();
        System.out.println(f1);
        boolean f2 = rlock.tryLock();
        rlock.lock();
        System.out.println(f2);
    }

}
