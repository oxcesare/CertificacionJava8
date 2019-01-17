/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.examenfinal.test15;

/**
 *
 * @author cesaralducinruiz
 * 
 * Uso de herencia 
 * 
 * Si extiendes de una clase abstracta entonces tienes que implementar los metodos que 
 * se declaran en la clas abstracta.
 */
 abstract class  B {
    
    public abstract void m();
    
}

public class A extends B{

    @Override
    public void m() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
