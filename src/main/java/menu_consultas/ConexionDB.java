package menu_consultas;
import  java.sql.SQLException;
import  java.sql.PreparedStatement;
import  java.sql.*;
import  java.sql.Connection;
public class ConexionDB {
    public static Connection getConexion(){
        final String url="jdbc:mysql://127.0.0.1:3306/EMPRESA2";
        final String user="root";
        final String password="ProyectoSistemas2026!";

        try{
            Connection connection=DriverManager.getConnection(url,user,password);
            if(connection !=null){
                System.out.println("carga exitosa............");
            }
            return  connection;
        }catch (SQLException fail){
            fail.printStackTrace();
        }
        return  null;
    }
}
