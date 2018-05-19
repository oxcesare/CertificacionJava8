/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.ejercicios.java8.asociado.cinco;

/**
 *
 * @author consultor006
 * 
 * Clase Test19 que demuestra el uso de la herencia.
 * 
 * El método returnThis() esta sobreescrito correctamente
 * ya que se puede retonar objetos que son subclases de los objetos
 * que se declaran en el metodo de la clase padre. 
 * 
 */
public class Test19  extends SuperTest19{
    public static void main(String[] args) {
        Test19 q = new Test19();
        q.returnThis();
    }
    
    public Integer returnThis(){
        Integer integ=10;
        System.out.println(integ);
        return integ;
    }
}

class SuperTest19 {
    public Number returnThis(){
        Number num=5;
        return num;
    }
}
