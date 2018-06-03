/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certification.basicos;

/**
 *
 * @author consultor006
 */
public class Ex6 {

    public static void main(String args[]) {
        int x = 0, y = 10;
        System.out.println(""+x instanceof Object);
        try {
            y /= x;
            System.out.print("/ by 0");            
        }        
        catch(Exception e){
        System.out.print("error");
      }
    }
}
