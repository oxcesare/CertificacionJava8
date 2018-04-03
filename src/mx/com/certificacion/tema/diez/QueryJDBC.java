/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.diez;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author consultor006
 */
public class QueryJDBC {

    public static void main(String[] args) {

    }

    public static void consulta() throws SQLException {
        Connection c = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
        try (Statement stmt = c.createStatement();) {
            ResultSet rs = stmt.executeQuery("select * from STUDENT");
            while (rs.next()) {
                System.out.println(rs.getString(1));
            }
        } catch (SQLException e) {
            System.out.println("Exception ");
        }
    }
}
