/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.seis.Exceptions;

/**
 *
 * @author consultor006
 * 
 * AutoClosable es una interface que tiene el método
 * close para cerrar recursos unicamente utilizando 
 * el bloque try
 */

public class TurkeyCage implements AutoCloseable{
    
    public void close(){
        System.out.println("Cloose gate");
    }
    
    public static void main(String[] args) {
        try(TurkeyCage t = new TurkeyCage()){
            System.out.println("put turkeys in");
        }
    }
    
}
