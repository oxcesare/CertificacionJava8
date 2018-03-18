/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.avanzado;

import static java.util.Collections.list;
import java.util.List;

/**
 *
 * @author consultor006
 */
public class TestTwo {

    public static void main(String[] args) {
        int i=0;
        
        m1(list);
    }

    public static void m1(List<? extends Number> list) {
        Number n = list.get(0);
    }

}
