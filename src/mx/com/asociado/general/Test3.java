/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.asociado.general;

/**
 *
 * 
 * @author cesaralducinruiz
 * 
 * Cuando se lanza una exception y  se tiene el bloque finally
 * entones se ejecuta el bloque finally y se lanza la exception
 */
public class Test3 {

    static int x = 1;

    public static void main(String[] args) throws Throwable {

        try {
          if (x == 1) throw new Throwable(); 
          System.out.println("try");
        } catch (Exception ex) {
            System.out.println("exe");
        } finally {
            System.out.println("fin");
        }

    }

}
