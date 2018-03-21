/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.clases.avanzadas;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.ResourceBundle;


/**
 *
 * @author consultor006
 */
public class Dias {
    
    public static void main(String[] args) {
        System.out.println(""+getFechaCorta(new Date()));
    }
    
    public static String getFechaCorta(Date fecha) {
		final SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yy");
		if (fecha != null){
			return formatter.format(fecha);
		}
		else{
			return "";
		}
	}
    
    
    
}
