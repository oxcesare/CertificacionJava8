/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.siete;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author consultor006
 * 
 * This code illustrates how deadlock might occur 
 * when multiple threads try to acquire locks on multiple objects in different sequence
 */

public class Transfer implements Runnable {

    Account from, to;
    double amount;

    public Transfer(Account from, Account to, double amount) {
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    public void run() {
        synchronized (from) {
            from.setBalance(from.getBalance() - amount);
            synchronized (to) {
                to.setBalance(to.getBalance() + amount);
            }
        }
    }

    public static void main(String[] args) {
        ExecutorService es = Executors.newCachedThreadPool();
        Account a1 = new Account("A1", 1000);
        Account a2 = new Account("A1", 1000);
        es.submit(new Transfer(a1, a2, 200));
        es.submit(new Transfer(a2, a1, 300));
    }
}

class Account {

    private String id;
    private double balance;     //constructor and accessor methods not shown, } 

    Account(String a1, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}
