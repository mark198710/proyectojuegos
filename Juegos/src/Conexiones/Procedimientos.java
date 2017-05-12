package Conexiones;

import java.sql.CallableStatement;
import java.sql.SQLException;


public class Procedimientos {
    
    public static void EntradaJuegosxbox360(String a, String b, String c)throws SQLException{
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call EntradaJuegosxbox360(?,?,?)}");
        entrada.setString(1, a);
        entrada.setString(2, b);
        entrada.setString(3, c);
        entrada.execute();
    }
    
    public static void Entradajuegosgamecube(String a, String b, String c)throws SQLException{
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call EntradaJuegosgamecube(?,?,?)}");
        entrada.setString(1, a);
        entrada.setString(2, b);
        entrada.setString(3, c);
        entrada.execute();
    }
    
    public static void EntradaJuegosnintendo3ds(String a, String b, String c)throws SQLException{
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call EntradaJuegosnintendo3ds(?,?,?)}");
        entrada.setString(1, a);
        entrada.setString(2, b);
        entrada.setString(3, c);
        entrada.execute();
    }
    
    public static void EntradaJuegosnintendods(String a, String b, String c)throws SQLException{
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call EntradaJuegosnintendods(?,?,?)}");
        entrada.setString(1, a);
        entrada.setString(2, b);
        entrada.setString(3, c);
        entrada.execute();
    }
    
    public static void EntradaJuegospc(String a, String b, String c)throws SQLException{
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call EntradaJuegospc(?,?,?)}");
        entrada.setString(1, a);
        entrada.setString(2, b);
        entrada.setString(3, c);
        entrada.execute();
    }
    
    public static void EntradaJuegosplaystationvita(String a, String b, String c)throws SQLException{
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call EntradaJuegosplaystationvita(?,?,?)}");
        entrada.setString(1, a);
        entrada.setString(2, b);
        entrada.setString(3, c);
        entrada.execute();
    }
    
    public static void EntradaJuegoswii(String a, String b, String c)throws SQLException{
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call EntradaJuegoswii(?,?,?)}");
        entrada.setString(1, a);
        entrada.setString(2, b);
        entrada.setString(3, c);
        entrada.execute();
    }
    
    public static void EntradaJuegoswiiu(String a, String b, String c)throws SQLException{
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call EntradaJuegoswiiu(?,?,?)}");
        entrada.setString(1, a);
        entrada.setString(2, b);
        entrada.setString(3, c);
        entrada.execute();
    }
    
    public static void EliminarJuegosxbox360(int a)throws SQLException{
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call EliminarJuegosxbox360(?)}");
        entrada.setInt(1, a);
        entrada.execute();
    }
    
    public static void EliminarJuegosnintendo3ds(int a)throws SQLException{
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call EliminarJuegosnintendo3ds(?)}");
        entrada.setInt(1, a);
        entrada.execute();
    }
    
    public static void EliminarJuegosgamecube(int a)throws SQLException{
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call EliminarJuegosgamecube(?)}");
        entrada.setInt(1, a);
        entrada.execute();
    }
    
    public static void EliminarJuegosnintendods(int a)throws SQLException{
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call EliminarJuegosnintendods(?)}");
        entrada.setInt(1, a);
        entrada.execute();
    }
    
    public static void EliminarJuegospc(int a)throws SQLException{
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call EliminarJuegospc(?)}");
        entrada.setInt(1, a);
        entrada.execute();
    }
    
    public static void EliminarJuegosplaystationvita(int a)throws SQLException{
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call EliminarJuegosplaystationvita(?)}");
        entrada.setInt(1, a);
        entrada.execute();
    }
    
    public static void EliminarJuegoswii(int a)throws SQLException{
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call EliminarJuegoswii(?)}");
        entrada.setInt(1, a);
        entrada.execute();
    }
    
    public static void EliminarJuegoswiiu(int a)throws SQLException{
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call EliminarJuegoswiiu(?)}");
        entrada.setInt(1, a);
        entrada.execute();
    }
    
    public static void BuscarJuegosxbox360(int a)throws SQLException{
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call BuscarJuegosxbox360(?)}");
        entrada.setInt(1, a);
        entrada.execute();
    }
    
    public static void BuscarJuegosgamecube(int a)throws SQLException{
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call BuscarJuegosgamecube(?)}");
        entrada.setInt(1, a);
        entrada.execute();
    }
    
    public static void BuscarJuegosnintendo3ds(int a)throws SQLException{
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call BuscarJuegosnintendo3ds(?)}");
        entrada.setInt(1, a);
        entrada.execute();
    }
    
    public static void BuscarJuegosnintendods(int a)throws SQLException{
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call BuscarJuegosnintendods(?)}");
        entrada.setInt(1, a);
        entrada.execute();
    }
    
    public static void BuscarJuegospc(int a)throws SQLException{
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call BuscarJuegospc(?)}");
        entrada.setInt(1, a);
        entrada.execute();
    }
    
    public static void BuscarJuegosplaystationvita(int a)throws SQLException{
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call BuscarJuegosplaystationvita(?)}");
        entrada.setInt(1, a);
        entrada.execute();
    }
    
    public static void BuscarJuegoswii(int a)throws SQLException{
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call BuscarJuegoswii(?)}");
        entrada.setInt(1, a);
        entrada.execute();
    }
 
    public static void BuscarJuegoswiiu(int a)throws SQLException{
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call BuscarJuegoswiiu(?)}");
        entrada.setInt(1, a);
        entrada.execute();
    }
    
}
