public class Principal{

    public static void main(String[]args){
        EmpleadoContratado empleadoContratado = new EmpleadoContratado(1000);
        EmpleadoXHorasExtras empleadoXHorasExtras = new EmpleadoXHorasExtras(1000, 8, 10);
        EmpleadoXComision empleadoXComision = new EmpleadoXComision(1050, 500, 15);

        empleadoContratado.mostrarSalarioFinal();
        empleadoXHorasExtras.mostrarSalarioFinal();
        empleadoXComision.mostrarSalarioFinal();
    }
}