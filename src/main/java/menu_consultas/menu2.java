package menu_consultas;

import java.sql.SQLException;
import java.util.Scanner;

public class menu2 {
    public static void main (String[] args) throws SQLException {
        System.out.println("MENU DE CONSULTA");
        Scanner es= new Scanner(System.in);
        EmpleadoMetodos empleado= new EmpleadoMetodos();
        int opcion=1;
        while (opcion!=0){
            System.out.println("1-buscar empleado por nombre \n"+"2-buscar salario \n"+ " 3-ordenar rango a mayor a menor \n"+
                    "4- ordenar salario de menor a  mayor "+"0-salir del menu");
            opcion=es.nextInt();
            es.nextLine();
            switch (opcion){

                case 1->{
                    System.out.println("ingrese el nombre a buscar:");
                    String nombre=es.nextLine();
                    empleado.buscarPorNombre(nombre);



                }
                case 2->{
                    System.out.println("rango minimo: ");
                    double rango= es.nextDouble();
                    System.out.println("rango maximo");
                    double rangoMaximo= es.nextDouble();
                    empleado.rangoSalarial(rango,rangoMaximo);
                }
                case 3->{
                    System.out.println("ordenamos los salarios de mayor a menor");
                    empleado.OrdenarSalarioMayorMenor();
                }
                case 4->{
                    System.out.println("ordenamos de menor a mayor");
                    empleado.MenorOrdenamientoSalario();
                }
                case 5->{
                    System.out.println("nombre");
                    String nombre= es.next();
                    System.out.println("dept: ");
                    int dept= es.nextInt();;
                    System.out.println("salario:");
                    double salario= es.nextInt();
                    System.out.println("jefe:");
                    int jefe= es.nextInt();
                    empleado.buscarDepartamento(nombre,dept,salario,jefe);

                }
                case 0->{
                    System.out.println("salir del Menu");

                }

            }
        }

    }
}
