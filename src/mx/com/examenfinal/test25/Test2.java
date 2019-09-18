/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.examenfinal.test25;

/**
 *
 * @author cesaralducinruiz
 */
public class Test2 {

    public static void main(String[] args) {

        int index = 2;
        int[] num = {1, 3, 5, 7};
        update(num, index);
        for (int i : num) {
            System.out.println("" + i);
        }
        System.out.println(index);

    }

    /**
     * Paso de referencia por valor
     *
     * @param num
     * @param index
     */
    public static void update(int[] num, int index) {
        //index++;
        num[index] = 14;

    }

}
