/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.instaceof;

/**
 *
 * @author consultor006
 * 
 * Esta clase representa el uso del operador instanceOf
 * 
 * Recordar algunos puntos:
 * 
 * Las interfaces no se pueden instancear
 * Cuando hacemos un mal uso del operador instaceOf este manda un error en tiempo de compilacion 
 * 
 * Este caso es incorrento porque b  no es un objeto de Bird 
 * if(b instanceof Bird) System.out.println("b is a Bird");
 * 
 */

interface Flyer{ 
   public abstract void mensajeUno();
}
class Bird implements Flyer {

    @Override
    public void mensajeUno() {
        System.out.println("Implementacion");
    }
 }

class Otra implements Flyer {
    @Override
    public void mensajeUno() {
        System.out.println("Implementacion Otra");
    }
}
class Eagle extends Bird { 
  public void mensaje(){
      System.out.println("Metodo Mensaje() clase Eagle");
  }
  
}
class Bat { }

public class TestClass {
      public static void main(String[] args) {
        Flyer f = new Eagle();  //Esto si es permitido e indica que el objeto f accede a los metodos de la clase Eagle
        f.mensajeUno();
        Eagle e = new Eagle();
        Bat b = new Bat();
        
        if(f instanceof Flyer) System.out.println("f is a Flyer");
        if(e instanceof Bird) System.out.println("e is a Bird");
//        if(b instanceof Bird) System.out.println("b is a Bird"); //Manda error en tiempo de compilacion 
    }
}
