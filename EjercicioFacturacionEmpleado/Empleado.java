package EjercicioFacturacionEmpleado;

public class Empleado {
    private String nombre;
    private String apellido;
    private int dni;
    private int sueldo;
    private int ventas;

    public Empleado(String nombre, String apellido, int dni, int sueldo){
        this.nombre=nombre;
        this.apellido=apellido;
        this.dni=dni;
        this.sueldo=sueldo;
    }
    public Empleado(String nombre, String apellido, int dni, int sueldo, int ventas){
        this.nombre=nombre;
        this.apellido=apellido;
        this.dni=dni;
        this.sueldo=sueldo;
        this.ventas=ventas;
    }
    public String getNombre(){
        return nombre;
    }
    public int getVentas(){
        return ventas;
    }
    public int getSueldo(){
        return sueldo;
    }
}
