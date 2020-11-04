/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosBaseDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author saipr
 */
public class ConexionBD
{

    private static final String url = "jdbc:mysql://localhost/estacionamiento";
    private static final String ussw = "root";
    private static final String pssw = "";

    public static Connection conectar()
    {
        Connection conexion = null;
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(url,ussw,pssw);
        } catch (ClassNotFoundException | SQLException e)
        {
            System.out.println("Error al conectar a BD!!! " + e);
        }
        return conexion;
    }
}
