package menu_consultas;

public class Empleado {
    private int empid,jefeid;
    private double salario;
    private String nombre;
    private  int departamento;
    //creamos el constructor
    public Empleado(int empid,int jefeid, double salario,String nombre,int departamento){
        this.empid=empid;
        this.jefeid=jefeid;
        this.salario=salario;
        this.nombre=nombre;
        this.departamento=departamento;
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
    public int getDepartamento(){
        return departamento;
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
    public void setDepartamento(){
        this.departamento=departamento;
    }
}
