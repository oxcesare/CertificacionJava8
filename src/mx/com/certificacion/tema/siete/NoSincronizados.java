/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.siete;

/**
 *
 * @author consultor006
 * 
 * Esta clase demuestra que es valido crear
 * dos objetos de hilos y pasarles la misma referencia.
 * 
 * La cuestion aquí es que al no estar sincronizados los métodos
 * no es posible determinar cual es el hilo que se atendera primero. 
 */
public class NoSincronizados implements Runnable{
    int x = 0, y = 0;   
    
    public void run(){
        while(true){
            x++;y++;
            System.out.println("x = "+x+"y="+y);  
        }     
    }
    
    public static void main(String[] args) {
        NoSincronizados c = new NoSincronizados();
        new Thread(c).start();
        new Thread(c).start();
    }
}
