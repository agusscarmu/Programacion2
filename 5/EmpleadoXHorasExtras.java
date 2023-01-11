public class EmpleadoXHorasExtras extends EmpleadoContratado{
    private int horasExtras;
    private int valorHorasExtras; 

    public EmpleadoXHorasExtras(int salario, int horasExtras, int valorHorasExtras){
        super(salario);
        this.horasExtras=horasExtras;
        this.valorHorasExtras=valorHorasExtras;
    }

    public int getHorasExtras(){
        return horasExtras;
    }

    public int sumaSalario(){
        int salariofinal=super.getSalario();
        salariofinal+=(horasExtras*valorHorasExtras);
        return salariofinal;
    }

    public void mostrarSalarioFinal(){
        super.mostrarSalarioFinal();
        System.out.println("La cantidad de horas extras es de: "+horasExtras+"\nEl salario total es de: "+sumaSalario());
    }
}
