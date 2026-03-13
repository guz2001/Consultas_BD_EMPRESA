package menu_consultas;
import javax.management.Query;
import javax.xml.transform.Result;
import java.sql.PreparedStatement;
import java.sql.*;
import java.sql.Connection;
import  java.sql.ResultSet;
public class EmpleadoMetodos {
    public void buscarPorNombre(String nombreBuscar) throws SQLException {
        //creamos la consulta
        String sql = "SELECT * FROM Empleado WHERE nombre LIKE ?";
        try (Connection conexion = ConexionDB.getConexion();// usamos clase Connection para la bd
             //la clase Prepared realiza
             PreparedStatement statement = conexion.prepareStatement(sql)) {
            statement.setString(1, nombreBuscar + "%");
            ResultSet mensajeGuardado = statement.executeQuery();
            while (mensajeGuardado.next()) {
                //creamos una variable que almacena la consulta buscando en la columna especificada
                String consultaFinal = mensajeGuardado.getString("nombre");//
                System.out.println("Nombre consultado es " + consultaFinal);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void rangoSalarial(double minimo, double maximo) {
        //creamos la consulta
        String sql2 = "SELECT * from Empleado WHERE salario  BETWEEN ? AND ?";
        try (Connection conexion2 = ConexionDB.getConexion();
             PreparedStatement estado = conexion2.prepareStatement(sql2)) {
            estado.setDouble(1, minimo);
            estado.setDouble(2, maximo);
            ResultSet rangoResultado = estado.executeQuery();
            while (rangoResultado.next()) {
                Double consultaRango = rangoResultado.getDouble("salario");
                System.out.println("salario rango es de : " + consultaRango);
            }

        } catch (SQLException error) {
            error.printStackTrace();

        }
    }

    public void OrdenarSalarioMayorMenor() {
        String sql = "SELECT * FROM Empleado Order by salario DESC";
        try (Connection conexion = ConexionDB.getConexion();
             PreparedStatement statement = conexion.prepareStatement(sql)) {
            ResultSet orden = statement.executeQuery();
            while (orden.next()) {
                String nombre = orden.getString("nombre");
                Double ordenado = orden.getDouble("salario");
                System.out.println("salario: " + ordenado + "nombre " + nombre);
            }
        } catch (SQLException fail) {
            fail.printStackTrace();
        }

    }

    public void MenorOrdenamientoSalario() throws SQLException {
        String sql = "select * from Empleado ORDER BY salario";
        try (Connection conect = ConexionDB.getConexion();
             PreparedStatement stat = conect.prepareStatement(sql)) {

            ResultSet ordernMenor = stat.executeQuery();
            while (ordernMenor.next()){
                String nombreMen= ordernMenor.getString("nombre");
                Double salarioMen= ordernMenor.getDouble("salario");
                System.out.println("###################################################");
                System.out.println("salario menor a mayor: "+salarioMen +"-------" +nombreMen);
                System.out.println("###################################################");

            }
        }
    }
    public  void buscarDepartamento(){

    }
}
