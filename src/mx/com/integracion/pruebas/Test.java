/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.integracion.pruebas;

/**
 *
 * @author cesaralducinruiz
 */
public class Test {

    public static void main(String[] args) {
        Capturador capturador = new Capturador();
        Cliente c = new Cliente();
        c.setNombre("CESAR");
        c.setAp_paterno("RUIZ");

        capturador.setCliente(c);
        System.out.println("Objecto Creado" + " " + createObject(capturador));

    }

    public static NewSubscriber createObject(Capturador capturador) {
        NewSubscriber n = new NewSubscriber();
        n.setCliente(capturador.getCliente());

        System.out.println("Nombre del Cliente" + " " + n.getCliente().getNombre());

        return n;
    }

}
