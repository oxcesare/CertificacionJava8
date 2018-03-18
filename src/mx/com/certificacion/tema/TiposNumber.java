package mx.com.certificacion.tema;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author consultor006
 */
public class TiposNumber<T> {
    
    public static void main(String[] args) {
        
        	//List outcome = new ArrayList();
                //System.out.println(""+outcome.get(0));
                
//           String srcs=null;
//                
//           String c =null;     
//                
//           if(c==null){			
//	         c = "";
//                 System.out.println("Validas el Objeto");
//	   }
//           int i = Integer.parseInt(c);
//           
//           System.out.println("i"+i);
//           
//                
                
//        Set<Number> number =  new HashSet<>();
//        number.add(null);
//        number.add(301L);
//        
//        Iterator iter = number.iterator();
//        while(iter.hasNext()){
//            System.out.println(iter.next());
//        }    
//        
//        System.out.println("**********************************");
//        
//        arboles();

           listas();
           
           System.out.println("*************** Mapas ***********************");
           
           mapas();
    }
    
    public static void arboles(){
        
        /**
         * El metodo ceilin retorna el valor que le estamos seteando
         * y con el cual hace coincidencia
         */
        TreeSet<String> tree = new TreeSet<>();
        tree.add("one");
        tree.add("one");
        tree.add("ONE");
        System.out.println("TreeSet"+" " + tree.ceiling("On"));
    }    
    
    /**
     * 
     * @param <T>
     * @param t
     * @return 
     * 
     * Si dejaramos public static y solamente T 
     * no se puede invocar a tipos genericos en ambientes estaticos
     * para ellos es necesario crear un metodo con objeto 
     * es decir de la siguiente manera: <T> T 
     */
    public static <T> T identifica (T t ){
        return t;
    }
    
    
    public static void listas (){
        List<String> listaString = Arrays.asList("10","11","12");
        
        List<Object> listaObject = Arrays.asList(1,2,3,4);
        
        List<Number> listaInt = Arrays.asList(1,2,3,4);
        
        Iterator ite = listaString.iterator();
        
        while(ite.hasNext()){
            System.out.println("Itera"+ite.next());
        }
    }
    
    
    /**
     * El metodo ContainsKey 
     */
    public static void mapas(){
        Map m  = new HashMap();
        m.put(123,"123");
        m.put("abc", "abc");
        System.out.println("Contiene"+" " + m.containsKey(123));
    }
    
}
