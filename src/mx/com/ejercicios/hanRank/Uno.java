/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.ejercicios.hanRank;

/**
 *
 * @author consultor006
 */
public class Uno {

    public static void main(String[] args) {
        int[][] arr = new int[6][6];
        String[] arrRowItems = {"1", "2", "3", "4", "5", "6"};
        int sumaX = 0;
        int contador = 0;

        for (int i = 0; i < 2; i++) {
            for(int j =0; j<6; j++){
                 int arrItem = Integer.parseInt(arrRowItems[j]);
                    //System.out.println("arrItem"+" "+ arrItem);
                    arr[i][j] = arrItem;
                 //System.out.println("arr[i][j]"+" " +arr[i][j]);
                if (contador == 3) {
                    contador = 0;
                    //System.out.println("Sumax Fila" + " " + sumaX);
                    sumaX = 0;                    
                } else {
                    //System.out.println("arr[i][j]" + " " + arr[i][j]);
                    System.out.println("contador"+" "+arrItem);
                    sumaX = sumaX + arr[i][j];
                    recibeDatos(arrItem);
                    contador++;
                }
            }            
        }
        //System.out.println("arr[i][i]" + "  " + arr.length);        
    }
    static void recibeDatos(int n){
        System.out.println("Datos"+" " +n);
    }
}
