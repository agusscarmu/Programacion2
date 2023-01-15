package EjercicioFacturacionEmpleado;

import java.util.ArrayList;

public class Principal {
    public static void main(String[]args){
        Facturacion facturacion = new Facturacion();
        ArrayList<Empleado> empleado = new ArrayList<>(); 

        empleado.add(new Empleado("Agustin", "Carmu", 41724302, 40000));
        empleado.add(new Empleado("Agustina", "Pereyra", 44378662, 1000000));
        empleado.add(new EmpleadoXVenta("Lucas", "Carmu", 44999888, 40000, 40, 10));
        empleado.add(new EmpleadoXVenta("Leonel", "Carmu", 44999888, 800000, 40, 10));
        empleado.add(new EmpleadoXBono("Claudio", "Carmu", 23128286, 50000, 41, 1000,40));


        System.out.println("La suma total de gastos en sueldos es de: "+(facturacion.getSumaTotalSueldos(empleado)));
        
    }
}
