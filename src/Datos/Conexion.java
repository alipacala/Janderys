package Datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {
  
  static Connection conn = null;
  static Statement st = null;
  static ResultSet rs = null;

  static String bd = "biblioteca";
  static String login = "root";
  static String password = "";
  static String url = "jdbc:mysql://localhost/" + bd;

  public static Connection Conectar(Connection conn) throws SQLException {
    try {
      Class.forName("com.mysql.jdbc.Driver");
      conn = DriverManager.getConnection(url, login, password);
    } catch (ClassNotFoundException e) {
      System.out.println("Clase no encontrada");
    }
    return conn;
  }

  public static Statement CrearComando(Statement st) throws SQLException {
    conn = Conectar(conn);
    st = conn.createStatement();
    return st;
  }
}
