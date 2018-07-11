/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.siete.Concurrency;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author consultor006
 */
class JerkyThread extends Thread {

    private int data = 0;
    private boolean done = false;

    public JerkyThread(int x) {
        super();
        this.data = x;
    }

    public synchronized int getData() {
        return data;
    }

    public synchronized boolean isDone() {
        return done;
    }

    public synchronized void run() {
        data += data;
        done = true;
    }

    public static void main(String[] args) throws Exception {
        JerkyThread[] jta = new JerkyThread[3];
       
        for (int i = 0; i < 3; i++) {
            jta[i] = new JerkyThread(i);
          //  jta[i].start();
        }
        for (JerkyThread jt : jta) {
            if (jt.isDone()) {
            //    System.out.println(jt.getData());
            }
        }
        
        
        //En List se comienza a contar desde 1 
        List<String> lista = new ArrayList<String>();
        lista.add("1");
        lista.add("2");
        lista.add("3");
        
        System.out.println("Size() tiene que ser 3 \t"+lista.size());
        
        //A la lista se accede al elemento 0 pero recordar que inicia en la posicion 1         
        System.out.println("Acceso a la lista"+lista.get(2));
        
        //Arreglo de 3 posiciones iniciando en 0 
        int[] arre = new int [3];
        arre[0]= 1;
        arre[1]= 1;
        arre[2]= 1;
        
        
    }
}
