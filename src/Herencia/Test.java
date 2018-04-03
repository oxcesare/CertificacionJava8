/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *
 * @author consultor006
 */

abstract class B {
    abstract void b();
}

interface  C {
    public void c();
}

class A {
    
    public void a (){
        System.out.println("Clase A");
    }
}
public class Test extends B  implements C{

    @Override
    public void c() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void b() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
