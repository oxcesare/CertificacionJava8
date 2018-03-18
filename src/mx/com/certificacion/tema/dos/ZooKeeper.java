/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.dos;

/**
 *
 * @author consultor006
 * 
 * El polimorfismo solo aplica para metodos de instancia.
 */
public class ZooKeeper {

    public static void main(String[] args) {
        new ZooKeeper().go();
    }
    
    void go() {
        Mammal m = new zebra();
        System.out.println(m.name+ m.makeNoise());
    }
}
