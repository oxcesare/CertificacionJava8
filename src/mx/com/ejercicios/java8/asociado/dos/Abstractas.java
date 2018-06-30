/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.ejercicios.java8.asociado.dos;

/**
 *
 * @author consultor006
 */
public abstract class Abstractas {
    
    
    public abstract void a();
    public abstract void b();
    public abstract void c();
    public abstract void d();
}

abstract class A extends Abstractas{
    
}

interface E {
    public void d();
}

class C {
    
    public void c(){
        
    }
    
}

class D extends C implements E{
    
}