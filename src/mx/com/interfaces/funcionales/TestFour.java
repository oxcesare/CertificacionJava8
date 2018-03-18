/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.interfaces.funcionales;

import java.util.Arrays;
import java.util.function.IntFunction;

/**
 *
 * @author consultor006
 */
public class TestFour {

    public static void main(String[] argv) {
        IntFunction<int[][]> TwoDimArrayCreator = int[][]::new;
        int[][] intArray = TwoDimArrayCreator.apply(5);
        // Creates an  int[5][]  array
        intArray[0] = new int[5];
        intArray[1] = new int[5];
        intArray[2] = new int[5];
        intArray[3] = new int[5];
        intArray[4] = new int[5];

        System.out.println(Arrays.deepToString(intArray));
      }
}
