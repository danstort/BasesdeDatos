/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basesdedatos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author danie
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Connection cn = null;

        String url = "jdbc:oracle:thin:@localhost:1521:XE";
        String user = "programacion";
        String password = "programacion";
        //1. conexión
        try {
            cn = DriverManager.getConnection(url, user, password);
            System.out.println("Conectado");
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Error de conexión " + ex);
        }

    }

}
