/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.escuela.capitulo.uno.clasesAvanzadas;

/**
 *
 * @author consultor006
 */
public class Book {

    private int ISBN;
    private String title, author;
    private int pageCount;

    public int hashCode() {
        return ISBN;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Book)) {
            return false;
        }
        Book other = (Book) obj;
        return this.ISBN == other.ISBN;        
    }
    
    public static void main(String[] args) {
        
    }
}
