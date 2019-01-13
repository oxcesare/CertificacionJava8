/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.examenfinal.test13;

/**
 *
 * @author cesaralducinruiz
 */
public class Clumsy {
    public static void main(String[] args) {
        int j=7;
        assert (++j> 7);
        assert (++j> 8):"hi";
        assert (++j> 7): j=12;
        //Manda error ya que la invocacion de metodos de tipo void no esta permitido 
        //assert (++j> 7): doStuf(); 
        assert (++j> 7): new Clumsy();
    }
    
    public static void doStuf(){
        
    }
}
