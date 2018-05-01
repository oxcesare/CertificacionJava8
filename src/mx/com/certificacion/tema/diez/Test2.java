/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.diez;

/**
 *
 * @author consultor006
 */
public class Test2 {

    Connection con = DriverManager.getConnection(dbURL);

    con.setAutoCommit (
    false);   String updateString = "update SALES " + "set T_AMOUNT = 100 where T_NAME = 'BOB'";
    Statement stmt = con.createStatement();

    stmt.executeUpdate (updateString);   //INSERT CODE HERE  What statement should be added to the above code so that the update is committed to the database?
    
    
    //Respuesta 
    
    con.commit();
    
    

}
