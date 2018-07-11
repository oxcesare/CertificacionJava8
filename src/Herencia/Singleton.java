/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;

/**
 *
 * @author consultor006
 */
public class Singleton {

    public String str="Hello World";

    public static String getSingleInstance(String str) {
        if (str == null) {
            str = new String();
        } else {
            System.out.println("Hello I am a singleton! Let me say "+  str + " to you");
        }
        
        return str;
    } 
    
    public static void main(String[] args) {
        Singleton singleton = new Singleton();
        getSingleInstance("Hello World");
    }
}
