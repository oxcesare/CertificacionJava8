/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema;

/**
 *
 * @author consultor006
 * 
 * Los constructores no se pueden sobreescribir
 */
public class A extends B {

    public A() {
        //super();        
        System.out.println("Constructor Hijo");
    }    
    
    public static void main(String[] args) {
        A a = new A(); //Padre puede crear objetos de la clase hijo
        new C3();        
    }
}

class B{

    public B (String x){
        x="Mensaje de otro constructor padre";
        System.out.println("x"+""+x);
    }
    
    public B() {
        System.out.println("Constructor de la clase Padre");
    }
    
    public void mensaje(){
        System.out.println("Mensaje");
    }    
}

abstract class C1 {
  public C1(){
    System.out.println(1);
  }  
}

class C2 extends C1 {
  
 public C2(){
   System.out.println(2);   
 }
}

class C3 extends C2 {
  
 public C3(){
   System.out.println(3);   
 }
}

