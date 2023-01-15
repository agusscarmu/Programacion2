package EjercicioFacturacionEmpleado;

public class EmpleadoXBono extends Empleado {

    private int minimoVentas;
    private int bono;

    public EmpleadoXBono(String nombre, String apellido, int dni, int sueldo, int ventas, int bono, int minimoVentas) {
        super(nombre, apellido, dni, sueldo, ventas);
        this.bono=bono;
        this.minimoVentas=minimoVentas;
    }

    public int getSueldo(){
        int sueldoFinal=super.getSueldo();
        if(super.getVentas()>minimoVentas){
        sueldoFinal+= bono;
        }
        return sueldoFinal;
    }
    
}
