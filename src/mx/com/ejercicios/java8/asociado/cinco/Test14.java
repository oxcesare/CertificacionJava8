/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.ejercicios.java8.asociado.cinco;

import java.io.FileNotFoundException;

/**
 *
 * @author consultor006
 *
 * En la clase Test14 tenemos una subclase que sobreescribe un metodo run que
 * lanza una exception, aunque nosotros creamos el bloque try-catch es necesario
 * capturar la exception ya que exception es la clase padre.
 *
 * Si en el bloque catch ponemos un Exception entonces ya no es necesario
 * lanzarlo en el metodo main pero al ser una Subclase de exception entonces es
 * necesario cacharla.
 * 
 * Esta subclase llama directamente al método run de la clase padre.
 * 
 */
public class Test14 extends SuperTest14 {
     
    //Se tiene que poner throws Exception 
    public static void main(String[] args) throws Exception {
        Test14 q = new Test14();
        try {
            q.run();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}

class SuperTest14 {

    void run() throws Exception {
        System.out.println("Overriden methods must throw more general Exceptions");
    }

    void run(int i) throws Exception {
        System.out.println("This method is overloaded, not overriden");
    }
}
