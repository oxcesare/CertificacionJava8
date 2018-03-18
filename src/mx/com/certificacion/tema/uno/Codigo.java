/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.uno;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author consultor006
 */
public class Codigo {

    public static void main(String[] args) {

        Codigo c = new Codigo();
        String obtener = obtenerDVB97(1, "12345678");
        System.out.println("obtener"+ " " + obtener);
        String rellena = rellenaCeros(Long.parseLong(obtener), 20);
        System.out.println("Rellena" + " " +  rellena);

    }

    public static String obtenerDVB97(int region, String cuenta) {
        Integer[] factoresBaseArray = {11, 13, 17, 19, 23};
        StringBuilder regionCuentaSB = new StringBuilder("0" + region);
        regionCuentaSB.append("0" + cuenta);

        Integer[] factoresArray = new Integer[regionCuentaSB.length()];
        for (int j = 0, i = 0; i < factoresArray.length; i++) {
            if (j >= factoresBaseArray.length) {
                j = 0;
            }
            factoresArray[i] = factoresBaseArray[j++];
        }
        List<Integer> factoresList = Arrays.asList(factoresArray);
        Collections.reverse(factoresList);
        factoresList.toArray(factoresArray);

        char[] regionCuentaCharArray = new char[regionCuentaSB.length()];
        regionCuentaSB.getChars(0, regionCuentaSB.length(), regionCuentaCharArray, 0);

        long sumaPorPosicion = 0;
        for (int i = 0; i < regionCuentaCharArray.length - 1; i++) {
            sumaPorPosicion += factoresArray[i] * Character.getNumericValue(regionCuentaCharArray[i]);
        }

        sumaPorPosicion += 330;
        long residuo = sumaPorPosicion % 97;
        residuo += 1;
        if (residuo >= 0 && residuo <= 9) {
            regionCuentaSB.append("0" + residuo);
        } else {
            regionCuentaSB.append(residuo);
        }
        return regionCuentaSB.toString();
    }
    
    public static String rellenaCeros(long total,int longitud){
                long n=total;
	        String g= String.valueOf(n);	        
	        int t=longitud;
			int d = t-g.length();
			String contador="0";
			if(g.length()<t){
				for(int i=0; i<d; i++){
			        contador +="0"; 		
			  	}
			}		     
			return contador+String.valueOf(total);		
    } 

}
