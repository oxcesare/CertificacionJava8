/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.lambdas.uno;

import java.util.function.DoubleSupplier;

/**
 *
 * @author consultor006
 * 
 * En las interfaces funcionales el valor  de lo que va a devolver se los das tu
 * en este caso el metodo getAsDouble() regresa un valor double no Double de objeto
 * entonces al mandar null el cual es un valor de objeto manda un error en tiempo de 
 * ejecuccion 
 */
public class Book {

    private String title;
    private Double price;

    public Book(String title, Double price) {
        this.title = title;
        this.price = price;
    }

    public static void main(String[] args) {
        Book b1 = new Book("Java in 24 hrs", 14.77);
        DoubleSupplier ds1 = b1::getPrice;
        System.out.println(b1.getTitle() + " " + ds1.getAsDouble());
    }

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
}
