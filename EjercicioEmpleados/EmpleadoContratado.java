public class EmpleadoContratado{
    private int salario;

    public EmpleadoContratado(int salario){
        this.salario=salario;
    }

    public int getSalario(){
        return salario;
    }

    public void mostrarSalarioFinal(){
        System.out.println("El salario es de: "+salario);
    }
}