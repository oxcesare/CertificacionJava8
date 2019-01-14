/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.examenfinal.test13;

import java.util.*;
/**
 *
 * @author cesaralducinruiz
 * 
 * En esta clase el error se encuentra en la invocacion
 * al metodo removeIf ya que se puede invocar esta funcion
 * que tenga como parametro un predicate y no se le este invocando de
 * esta manera y por ello manda un error en tiempo de compilacion  
 */
class Boss {

    private String name;

    public Boss(String name) {
        this.name = name;
    }

    public String getName() {
        return name.toUpperCase();
    }

    public String toString() {
        return getName();
    }
}

public class Initech {

    public static void main(String[] reports) {
        final List<Boss> bosses = new ArrayList(8);
        bosses.add(new Boss("Jenny"));
        bosses.add(new Boss("Ted"));
        bosses.add(new Boss("Grace"));
        //bosses.removeIf(s -> s.equalsIgnoreCase("ted"));
        System.out.print(bosses);
    }

}
