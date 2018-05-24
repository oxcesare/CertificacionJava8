/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.once;

import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 *
 * @author consultor006
 * 
 * Since the collection allows multiple simultaneous reads, 
 * it is ok for multiple threads to access the collection simultaneously 
 * if they are not modifying the collection. On the other hand, a writer 
 * thread must get sole custody of the collection before modifying. 
 * This can be easily achieved by using a ReadWriteLock. For example:
 */
public class MultipleReadersSingleWriter {

    private final ArrayList<String> theList = new ArrayList<String>();
    //Note that ReadWriteLock is an interface.
    private final ReadWriteLock rwl = new ReentrantReadWriteLock();
    private final Lock r = rwl.readLock();
    private final Lock w = rwl.writeLock();

    public String read() {
        r.lock();
        try {
            System.out.println("reading");
            if (theList.isEmpty()) {
                return null;
            } else {
                return theList.get(0);
            }
        } finally {
            r.unlock();
        }
    }

    public void write(String data) {
        w.lock();
        try {
            System.out.println("Written " + data);
            theList.add(data);
        } finally {
            w.unlock();
        }
    }
}
