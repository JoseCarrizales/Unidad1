
package Manejo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Statement;


public class Conexion {
    
    static Connection contacto = null;

    public static Connection getConexion() {
    
        String connectionUrl = "jdbc:sqlserver://CESAR-PC\\SQLEXPRESS:1433;database=SistemaInventarios;user=sa; password = cece230501;";
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        }catch (ClassNotFoundException e){
            JOptionPane.showInputDialog(null,"No se pudo establecer la conexion... revisar Drivers"+e.getMessage(),"Error de conexion",JOptionPane.ERROR_MESSAGE);
        }
        try{
            contacto = DriverManager.getConnection(connectionUrl);
        }catch (SQLException e){
            JOptionPane.showInputDialog(null,"Error"+e.getMessage(),"Error de conexion",JOptionPane.ERROR_MESSAGE);
        }
        return contacto;
  }

  public static ResultSet Consulta(String consulta){
     Connection con = getConexion();
     Statement declara;
     try{
        declara = con.createStatement();
        ResultSet respuesta = declara.executeQuery(consulta);
        return respuesta;
     } catch(SQLException e){
        System.out.println("Error." + e); 
     }
     return null;
  } 
}
