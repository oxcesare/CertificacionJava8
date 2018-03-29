/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.doce;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

/**
 *
 * @author consultor006
 */
public class Cache {

    static ConcurrentHashMap<String, Object> chm = new ConcurrentHashMap<String, Object>();

    public static void main(String[] args) {
        chm.put("a", "aaa");
        chm.put("b", "bbb");
        chm.put("c", "ccc");
        new Thread() {
            public void run() {
                Iterator<Entry<String, Object>> it = Cache.chm.entrySet().iterator();
                while (it.hasNext()) {
                    Entry<String, Object> en = it.next();
                    if (en.getKey().equals("a") || en.getKey().equals("b")) {
                        it.remove();
                    }
                }
            }
        }.start();
        new Thread() {
            public void run() {
                Iterator<Entry<String, Object>> it = Cache.chm.entrySet().iterator();
                while (it.hasNext()) {
                    Entry<String, Object> en = it.next();
                    System.out.print(en.getKey() + ", ");
                }
            }
        }.start();
    }

}
