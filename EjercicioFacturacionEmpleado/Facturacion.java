package EjercicioFacturacionEmpleado;

import java.util.ArrayList;

public class Facturacion {
    
    public int getSueldos(Empleado empleado){
        return empleado.getSueldo();
    }

    public int getSumaTotalSueldos(ArrayList<Empleado> empleado){
        int sumaSueldos=0;
        for(int i=0;i<empleado.size();i++){
            sumaSueldos+=empleado.get(i).getSueldo();
        }
        return sumaSueldos;
    }
}
