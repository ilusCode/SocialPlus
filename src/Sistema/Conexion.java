/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Perdomo
 */
public class Conexion {
    Connection conexion;
    public static void main(String[] args) {
        Connection conexion;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas?zeroDateTimeBehavior=convertToNull", "root", "123456");
            Statement s = (Statement) conexion.createStatement();
//            String nombre = "perros";
//            String estante = "A";
//            String fechaCad = "2018-05-01";
//            int clave = 9; 
//            int descu = 0;
//            float precio= 20.5f;
//            String cadena = "INSERT INTO PRODUCTO (nombre,precio,estante,fechaCad,descu) "
//                    + "VALUES('"+nombre+"',"+precio+",'"+estante+"','"+fechaCad+"',"+descu+");";
 //           System.out.println(cadena);
            
   //         int resultado = s.executeUpdate(cadena);
    //        System.out.println("Inserte: "+resultado+" elementos");
        } catch (ClassNotFoundException ex)
        {
            System.out.println("Error con el driver");
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex)
        {
            System.out.println("Error al conectar a la BD");
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static String cadena(String nombre)
    {   
        nombre= "chaleco";
        return nombre;
    }
        
}
