/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.IO;

/**
 *
 * @author consultor006
 */

abstract class B{
    
    public abstract void c();
    public abstract void d();
    public void e(){
        System.out.println("Método no abstracto");
    }
    
}
public class A extends B{

    @Override
    public void c() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void d() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
