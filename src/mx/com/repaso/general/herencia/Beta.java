/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.repaso.general.herencia;

/**
 *
 * @author consultor006
 *
 * Ejemplo y uso de la herencia
 *
 * Recordar que en la herancia podemos hacer lo siguiente
 *
 * Objeto de la clase hija = new objeto de la clase padfre.
 *
 * Una interface puede tener metodos que no sean abstractos
 * 
 * En una interface no se pueden declrar metodos staticos
 * 
 * protected es un modificador que no es permitido aqui 
 */
interface Account {

    public abstract void c();

    public default String getId() {
        return "0000";
    }
}

interface C {
    
    
}

interface PremiumAccount extends Account {

    public String getId();
}

class Baap {

    public int h = 4;

    public int getH() {
        System.out.println("Baap " + h);
        return h;
    }
}

public class Beta extends Baap {

    public int h = 44;

    public int getH() {
        System.out.println("Beta " + h);
        return h;
    }

    public static void main(String[] args) {
        Baap b = new Beta();
        System.out.println(b.h + " " + b.getH());
        Beta bb = (Beta) b;
        System.out.println(bb.h + " " + bb.getH());
    }
}
