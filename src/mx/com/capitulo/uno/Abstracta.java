/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.capitulo.uno;

/**
 *
 * @author consultor006
 */

interface B {
    public void a();
}
public class Abstracta  extends  C implements B{

    @Override
    public void a() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}

class C {
    public void n(){
        System.out.println("C");
    }
}
abstract class  A {

    public void mensaje(){
        System.out.println("Clase Padre Abstracta");
    }
}
