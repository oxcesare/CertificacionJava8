/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.asociado.general;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.RecursiveTask;

/**
 *
 * @author consultor006
 */
public class ComplicatedTask extends RecursiveTask<Integer> {

   private CopyOnWriteArrayList<String> cal = new CopyOnWriteArrayList<>();
    
    @Override
    protected Integer compute() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
