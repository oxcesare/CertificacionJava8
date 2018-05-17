/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.genericos;

/**
 *
 * @author consultor006
 * 
 * Con expresiones lambda podemos crear la funcionalidad de un método
 * solo con cear una instancia de la clase e invocar al metodo correspondiente
 * con sintaxis lambda.
 */
public class ThisReferenceExample {
    
    public void doProcess (int i, Process p ){
       p.process(i);
    }
    
    public static void main(String[] args) {
        ThisReferenceExample thisReferenceExample = new ThisReferenceExample();
        thisReferenceExample.doProcess(10, new Process(){
          
          public void process(int i){
                System.out.println("value i of is "+i);
                System.out.println(""+this); // manda a llamar a la referencia a una referencia de ThisReferenceExample
          }
            
        });
    }
}
