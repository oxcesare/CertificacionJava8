/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.uno;

/**
 *
 * @author consultor006
 */
public class Contador {
    public static void main(String[] args) {
        rellenaCeros(2444);
    }
    
    public static String rellenaCeros(int total){
		int n=total;
                String g= String.valueOf(n);
                System.out.println("g"+g.length());
                int t=5;
		int d = t-g.length();
		String contador="0";
		if(g.length()<t){
			for(int i=0; i<d; i++){
		        contador +="0"; 		
		  	}
		}		     
                System.out.println(""+contador+String.valueOf(total));
		return contador+String.valueOf(total);		
    }    
}
