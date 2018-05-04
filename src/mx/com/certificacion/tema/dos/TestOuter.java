/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.dos;

/**
 *
 * @author consultor006
 * Forma correcta de instanciar el Objeto TestInner
 * 
 *  Which of the following options correctly instantiates a TestInner object?
 * 
 * Al hacer una instancia dentro del Metodo  myOuterMethod ya no es necesario
 * hacer una instancia en el metodo main 
 * 
 * TestInner tiene un metodo que se llama mensajeInterno
 * y cuando se invoca esta clase se imprime la funcionalidad del metodo.
 * 
 */

public class TestOuter {
    public void myOuterMethod()    
    {       // 1    
        new TestInner().mensajeInterno();
        new TestOuter().new TestInner().mensajeInterno();
    }    
    public class TestInner {
        public void mensajeInterno(){
            System.out.println("Mensaje Interno Clase TestInner");
        }
    }    
    
    public static void main(String[] args)    
    {       
        TestOuter to = new TestOuter();
         to.myOuterMethod();;
    }
}
