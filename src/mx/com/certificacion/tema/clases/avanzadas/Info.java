/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.clases.avanzadas;

import java.util.*;

/**
 *
 * @author consultor006
 * 
 * Esta clase denota una mala implementación del método 
 * HashCode.
 */

public class Info {

    String s1, s2, s3;

    public Info(String a, String b, String c) {
        s1 = a;
        s2 = b;
        s3 = c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Info)) {
            return false;
        }
        Info i = (Info) obj;
        return (s1 + s2 + s3).equals(i.s1 + i.s2 + i.s3);
    }

    public int hashCode() {
        return s1.hashCode();
    }

    public static void main(String[] args) {
        HashMap map = new HashMap();
        Info i1 = new Info("aaa", "aaa", "aaa");
        Info i2 = new Info("aaa", "bbb", "ccc");
        map.put(i1, "hello"); //1      
        map.put(i2, "world"); //2    
      }
  }
