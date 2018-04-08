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
 * Esta clase crea un hilo que implementa de Runnable,
 * se sobreEscribe el metodo run y se inicializa el hilo
 * 
 * Recordar que un Thread puede recibir como parametro una instancia
 * de la clase que extienda de Thread o implemente Runnable
 */
public class PrintData  implements Runnable{
    public void run(){
        for(int i=0; i<3; i++){
            System.out.println("Printing record:"+i);
        }
    }
    
    public static void main (String [] args){
        (new Thread(new PrintData())).start();
    }    
}

/**
 * Otra Forma de Crear Hilos
 */
 class ReadInventoryThread extends Thread{
    public void run(){
        System.out.println("Printing zoo inventory");
    }
    
    public static void main (String []args){
        (new ReadInventoryThread()).start();
    }
}



