public class EmpleadoXComision extends EmpleadoContratado{
    
    private int ventas;
    private int porcentajeVentas;

    public EmpleadoXComision(int salario, int ventas, int porcentajeVentas){
        super(salario);
        this.ventas=ventas;
        this.porcentajeVentas=porcentajeVentas;
    }

    public int getVentas(){
        return ventas;
    }

    public int sumaSalario(){
        int salariofinal=getSalario();
        salariofinal+=(ventas*porcentajeVentas)/100;
        return salariofinal;
    }

    public void mostrarSalarioFinal(){
        super.mostrarSalarioFinal();
        System.out.println("Cantidad de ventas: "+ventas+"\nSalario total: "+sumaSalario());
    }
}
