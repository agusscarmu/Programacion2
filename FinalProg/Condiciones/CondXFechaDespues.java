package FinalProg.Condiciones;

import java.util.Date;

import FinalProg.Carpeta;

public class CondXFechaDespues extends Cond{
    Date fecha;
    public CondXFechaDespues(Date fecha){
        this.fecha=fecha;
    }
    @Override
    public boolean cumple(Carpeta elemento) {
        return elemento.getDate().after(fecha);
    }
}
