/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.expresiones.lambda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import java.util.function.Predicate;

/**
 *
 * @author consultor006
 *
 * Esta clase demuestra el uso de expresiones lambdas.
 * 
 * Con el uso de expresiones lambdas se puede reducir codigo.
 * 
 * When all your method does is return the value of an expression, you can omit the curly braces,
 * 
 * El código del método se puede sustituir por el siguiente codigo 
 * 
 * filterData(al, (Data x) -> x.value%2 == 0 );
 *
 */
//In Data.java 
public class Data {

    int value;

    Data(int value) {
        this.value = value;
    }

    public String toString() {
        return "" + value;
    }

    public static void main(String[] args) {
        Data d = new Data(1);
        ArrayList<Data> al = new ArrayList<Data>();                
        filterData(al, (Data x) -> x.value%2 == 0 );
         
    }

    public static void filterData(ArrayList<Data> dataList, Predicate<Data> p) {
        Iterator<Data> i = dataList.iterator();
        while (i.hasNext()) {
            if (p.test(i.next())) {
                i.remove();
            }
        }
    }
}
