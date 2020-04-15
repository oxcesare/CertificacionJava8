/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana.uno.finaltest;

/**
 *
 * @author cesaralducinruiz
 */
public class TestMinimum {

    public static void main(String[] args) {
        int[] input = {2, 3, 7, 6};
        System.out.println(min(input));
        
        int[] inputMax = {2, 3, 1, 6};
        System.out.println(max(inputMax));
        
    }

    public static int min(int[] arr) {
        int min = arr[0];
        int secondMin=arr[1];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                secondMin=min;
                min = arr[i];
            }
            if(arr[i]<secondMin){
                secondMin=arr[i];
            }
        }
        return secondMin;
    }

    public static int max(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]> max) {
                max = arr[i];
            }
        }
        return max;
    }

}
