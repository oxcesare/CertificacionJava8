/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.ejercicio.clases.avanzadas;

import java.util.concurrent.RecursiveTask;

/**
 *
 * @author consultor006
 * 
 * El error en esta clase esta en la definición del método
 * protected void compute()
 * 
 * El método correcto que debe de implementar la clase ComplicatedTask
 * al extender de RecursiveTask debe ser  protected Integer compute().
 * 
 * 
 */
public class ComplicatedTask extends RecursiveTask<Integer> {

    int[] ia;
    int from;
    int to;
    static final int THRESHOLD = 3;

    public ComplicatedTask(int[] ia, int from, int to) {
        this.ia = ia;
        this.from = from;
        this.to = to;
    }

//    @Override
//    protected void compute() {
//        int sum = 0;
//        if (from + THRESHOLD > to) {
//            for (int i = from; i <= to; i++) {
//                sum = sum + ia[i];
//            }
//        } else {
//            int mid = (from + to) / 2;
//            ComplicatedTask newtask1 = new ComplicatedTask(ia, from, mid);
//            ComplicatedTask newtask2 = new ComplicatedTask(ia, mid + 1, to);
//            newtask2.fork();
//            newtask1.compute();
//            newtask2.join();
//        }
//    }

    @Override
    protected Integer compute() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
