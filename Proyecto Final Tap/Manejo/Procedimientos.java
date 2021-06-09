
package Manejo;

import java.sql.CallableStatement;
import java.sql.SQLException;

public class Procedimientos {
    //Cliente
     public static void EntradaCliente(String a,String b)throws SQLException{
        
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call EntradaCliente(?,?)}");
        entrada.setString(1, a);
        entrada.setString(2, b);
        entrada.execute();
    }
    
    public static void EliminarCliente(String a)throws SQLException{
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call EliminarCliente(?)}");
        entrada.setString(1, a);
        entrada.execute();
    }
    
    public static void BuscarCliente(String a)throws SQLException{
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call BuscarCliente(?)}");
        entrada.setString(1, a);
        entrada.execute();
    }
    
    //VENTA
public static void EntradaVenta(String a,String b,String c,int d,Float f,Float g)throws SQLException{
        
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call EntradaVenta(?,?,?,?,?,?)}");
        entrada.setString(1, a);
        entrada.setString(2, b);
        entrada.setString(3, c);
        entrada.setInt(4, d);
        entrada.setFloat(5, f);
        entrada.setFloat(6, g);
        entrada.execute();
    }

public static void BuscarVenta(String a)throws SQLException{
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call BuscarVenta(?)}");
        entrada.setString(1, a);
        entrada.execute();
    }
public static void EliminarVenta(String a)throws SQLException{
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call EliminarVenta(?)}");
        entrada.setString(1, a);
        entrada.execute();
    }

    //PRODUCTO
    public static void EntradaProducto(String a,String b,String c,int d,float e,float f)throws SQLException{
        
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call EntradaProducto(?,?,?,?,?,?)}");
        entrada.setString(1, a);
        entrada.setString(2, b);
        entrada.setString(3, c);
        entrada.setInt(4, d);
        entrada.setFloat(5, e);
        entrada.setFloat(6, f);
        entrada.execute();
    }
    public static void BuscarProducto(String a)throws SQLException{
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call BuscarProducto(?)}");
        entrada.setString(1, a);
        entrada.execute();
    }
    public static void EliminarProducto(String a)throws SQLException{
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call EliminarProducto(?)}");
        entrada.setString(1, a);
        entrada.execute();
    }
//VENDEDOR
    public static void EntradaVendedor(String a,String b,int c)throws SQLException{
        
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call EntradaVendedor(?,?,?)}");
        entrada.setString(1, a);
        entrada.setString(2, b);
        entrada.setInt(3,c);
        entrada.execute();
    }
    public static void BuscarVendedor(String a)throws SQLException{
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call BuscarVendedor(?)}");
        entrada.setString(1, a);
        entrada.execute();
    }
    public static void EliminarVendedor(String a)throws SQLException{
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call EliminarVendedor(?)}");
        entrada.setString(1, a);
        entrada.execute();
    }
    //COMPRA
    public static void EntradaCompra(String a,String b,String c,int d,float e,float f)throws SQLException{
        
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call EntradaCompra(?,?,?,?,?,?)}");
        entrada.setString(1, a);
        entrada.setString(2, b);
        entrada.setString(3, c);
        entrada.setInt(4, d);
        entrada.setFloat(5, e);
        entrada.setFloat(6, f);

        entrada.execute();
    }
    public static void BuscarCompra(String a)throws SQLException{
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call BuscarCompra(?)}");
        entrada.setString(1, a);
        entrada.execute();
    }
    public static void EliminarCompra(String a)throws SQLException{
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call EliminarCompra(?)}");
        entrada.setString(1, a);
        entrada.execute();
    }
    //Proveedor
    public static void EntradaProveedor(String a,String b,String c,float d)throws SQLException{
        
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call EntradaProveedor(?,?,?,?)}");
        entrada.setString(1, a);
        entrada.setString(2, b);
        entrada.setString(3, c);
        entrada.setFloat(4, d);
        entrada.execute();
    }
    public static void BuscarProveedor(String a)throws SQLException{
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call BuscarProveedor(?)}");
        entrada.setString(1, a);
        entrada.execute();
    }
    public static void EliminarProveedor(String a)throws SQLException{
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call EliminarProveedor(?)}");
        entrada.setString(1, a);
        entrada.execute();
    }

    
}
