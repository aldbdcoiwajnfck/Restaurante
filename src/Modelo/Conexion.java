package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    Connection con;

    public Connection getConnection(){
        try {
            String myBD = "jdbc:mysql://localhost:3306/restaurante?serverTimezone=UTC";
            con = DriverManager.getConnection(myBD, "root", "1234");
            System.out.println("Conexion a base de datos");
            return con;
        } catch (SQLException e) {
            System.out.println("Error al conectar"+e.toString());
        }
        return null;
    }
}