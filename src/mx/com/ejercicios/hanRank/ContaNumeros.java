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
public class ContaNumeros {
    public static void main(String[] args) {
        int negativo=0;
        int positivo=0;
        int cero=0;
        double fraPositivos;
        double fraNegativos;
        double fraCeros;
        
        
        
        int arr[] = new int[9];
        int log = arr.length;
        arr[0]=-1;
        arr[1]=1;
        arr[2]=3;
        arr[3]=4;
        arr[4]=5;
        arr[5]=0;
        arr[6]=1;
        arr[7]=7;
        arr[8]=0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){
                cero++;
            }else if(arr[i]<0){
                negativo++;
            }else{
                positivo++;
            }
        }
        System.out.println("Cero"+" "+cero);
        System.out.println("Longitud"+" "+log);
        
        fraCeros = cero/log;
        fraNegativos = negativo/arr.length;
        fraPositivos = positivo/arr.length;
        
        
        System.out.println("Fracciones Positivos" + " " + fraPositivos );
        System.out.println("Fracciones Negativos" + " " + fraNegativos );
        System.out.println("Fracciones Ceros" + " " + fraCeros );
        
        
    }
}
