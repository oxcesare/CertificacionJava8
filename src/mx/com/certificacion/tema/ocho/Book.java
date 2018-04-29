/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.ocho;

/**
 *
 * @author consultor006
 * 
 * Esta clase cumple con las características de modificadores
 * y acceso a metodos, el atributo pageNumber es privado y tiene su metodo de
 * acceso 
 * 
 * los .class se generan de manera diferente al ser una clase interna anonima 
 */
public class Book {

    private int pageNumber;
    private int title;
    private int price;

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getTitle() {
        return title;
    }

    public void setTitle(int title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    Book(String gone_with_the_wind, double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private class  BookReader {
        public int getPageNumber(){
            return pageNumber;
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Clase Principal");
    }
}
