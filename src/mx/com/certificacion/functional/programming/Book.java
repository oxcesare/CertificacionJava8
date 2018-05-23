/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.functional.programming;

import java.util.function.Supplier;

/**
 *
 * @author consultor006
 * 
 * La interface funcional de Java 8 Supplier no contiene el método getAsDouble 
 */
public class Book {

    private String title;
    private Double price;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Book(String title, Double price) {
        this.title = title;
        this.price = price;
    }

    public static void main(String[] args) {
        Book b1 = new Book("Java in 24 hrs", 30.0);
        Book b2 = new Book("Thinking in Java", null);
        Supplier s1 = b1::getPrice;
        System.out.println(b1.getTitle() + " " + s1.get());
        Supplier s2 = b2::getPrice;
        //System.out.println(b2.getTitle() + " " + s2.getAsDouble);
    }

}


