/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.nueve;

/**
 *
 * @author consultor006
 *
 * Si la clase implementa AutoCloseable entonces tiene que primero sobrescribir
 * el metodo close después tiene que lanzar en el metodo main una exception
 *
 * Esta regla no aplica para clases esaticas.
 *
 *
 * Si la exception es cachada en un bloque catch entonces no se tendria que
 * definir en el método Main
 *
 */
public class StuckTurkeyCage implements AutoCloseable {

    public void close() throws Exception {
        throw new Exception("Cage door does not close");
    }

    public static void main(String[] args) throws Exception {
        try (StuckTurkeyCage t = new StuckTurkeyCage()) {
        } catch (Exception e) {

        }
    }

}
