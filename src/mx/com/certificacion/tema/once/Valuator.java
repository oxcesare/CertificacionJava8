/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.once;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author consultor006
 *
 * Clase que determina como actualizar un valor antiguo a partir de detectar si
 * un dato a cambiado su valor previamente.
 *
 * Assuming that an instance of this class is shared among multiple threads, you
 * want to update the status to newstatus only if the oldstatus has not changed.
 * Which of the following lines of code will you use?
 */
public class Valuator {

    public static void main(String[] args) {
        Valuator v = new Valuator();
        v.valuate();
    }

    public AtomicInteger status = new AtomicInteger(0);

    public void valuate() {
        int oldstatus = status.get();
        System.out.println("oldstatus" + oldstatus);
        /* valid code here */
        int newstatus = status.get();

        status.compareAndSet(oldstatus, newstatus);

    }
}
