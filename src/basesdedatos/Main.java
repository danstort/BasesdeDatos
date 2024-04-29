/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basesdedatos;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;

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
        Statement st=null;
        ResultSet rs = null;
        try {
            cn = DriverManager.getConnection(url, user, password);
            st = cn.createStatement();
            rs = st.executeQuery("SELECT * FROM usuarios");

            while (rs.next()) {
                System.out.println("NIF: " + rs.getString
        (1) + " Nombre: " + rs.getString("nombre") + " Apellidos: " + rs.getString("apellidos"));
            }
            }catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Error de conexión " + ex);
        } finally{
        
            try{
            rs.close();
            st.close();
            cn.close();
            } catch(SQLException ex){
                System.out.println("Error al cerrar servicios");
            }
            
            
        }

        }

    }
