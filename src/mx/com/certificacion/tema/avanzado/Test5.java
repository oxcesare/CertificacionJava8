/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.avanzado;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 * @author consultor006
 *
 * Elimina los objetos conforme lo siguiente, ultimo entrar primero en salir.
 *
 */
public class Test5 {
                                                                                                                                                                                    
    public static void main(String[] args) {
        Deque<Integer> d = new ArrayDeque<>();
        d.push(1);
        d.push(2);
        d.push(3);
        System.out.println(d.remove());
        System.out.println(d.remove());
        System.out.println(d.remove());
    }
}
