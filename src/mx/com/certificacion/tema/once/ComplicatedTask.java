/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.once;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

/**
 *
 * @author consultor006
 * 
 * Clase: ComplicatedTask 
 * 
 * El método compute debe de tener un valor de retorno.
 * 
 * The values returned by the newtask1 and newtask2 should be added and returned.
 */
class ComplicatedTask extends RecursiveTask<Integer> {

    int[] ia;
    int from;
    int to;
    static final int THRESHOLD = 3;

    public ComplicatedTask(int[] ia, int from, int to) {
        this.ia = ia;
        this.from = from;
        this.to = to;
    }

    public int transform(int t) {
        //this can be a CPU intensive operation that       
        //transforms t and returns the value       
        //For now, just return t         
        return t;
    }

    protected Integer compute() {
        int sum = 0;
        if (from + THRESHOLD > to) {

            for (int i = from; i <= to; i++) {
                sum = sum + transform(ia[i]);
            }

        } else {

            int mid = (from + to) / 2;
            ComplicatedTask newtask1 = new ComplicatedTask(ia, from, mid);
            ComplicatedTask newtask2 = new ComplicatedTask(ia, mid + 1, to);
            newtask2.fork();
            sum = newtask1.compute() + newtask2.join();

        }
        return sum;
    }

    public static void main(String[] args) {
        int ia[] = new int[]{1, 2, 3, 4, 5, 6, 7};
        ForkJoinPool fjp = new ForkJoinPool();

        ComplicatedTask st = new ComplicatedTask(ia, 0, 6);
        int sum = fjp.invoke(st);
        System.out.println("sum = " + sum);
    }
}
