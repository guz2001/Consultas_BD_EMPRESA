package menu_consultas;

public class Empleado {
    private int empid,jefeid;
    private double salario;
    private String nombre;
    //creamos el constructor
    public Empleado(int empid,int jefeid, double salario,String nombre){
        this.empid=empid;
        this.jefeid=jefeid;
        this.salario=salario;
        this.nombre=nombre;
    }

    public int getEmpid() {
        return empid;
    }

    public int getJefeid() {
        return jefeid;
    }

    public double getSalario() {
        return salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public void setJefeid(int jefeid) {
        this.jefeid = jefeid;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
