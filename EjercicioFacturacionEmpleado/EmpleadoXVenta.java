package EjercicioFacturacionEmpleado;


public class EmpleadoXVenta extends Empleado {

    final int venta = 1500;
    int porcentaje;
    
    public EmpleadoXVenta(String nombre, String apellido, int dni, int sueldo, int ventas,int porcentaje) {
        super(nombre, apellido, dni, sueldo, ventas);
        this.porcentaje=porcentaje;
    }
    public int getSueldo(){
        int sueldoFinal= super.getSueldo()+(super.getVentas()*(venta*porcentaje)/100);
        return sueldoFinal;
    }
}
