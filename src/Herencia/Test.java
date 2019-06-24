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
public class Test {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        b.setC("cc");
        b.setB("bb");
        a.setA("a");
        a.setB("b");
        a.setObjeto(b);
        
        Test test = new Test();
        System.out.println("test.getC(a)" +  " " + test.getC(a));
        
    }
    
    public C getC (A a){
        
        C c = new C();
        c.setObjeto(a.getObjeto());
        System.out.println(""+c.getObjeto().getB());
        System.out.println(""+c.getObjeto().getC());
        
        return c;
        
    }
    
}
