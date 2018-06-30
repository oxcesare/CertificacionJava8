/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.examen.global;

import java.awt.*; 
import java.awt.event.*;
/**
 *
 * @author consultor006
 */
public class TestFrame extends Frame {

    static String s = "Message";

    public static void main(String args[]) {
        TestFrame t = new TestFrame();
        Button b = new Button("press me");
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Message is " + s);
            }
        });
        t.add(b);
    }
}
