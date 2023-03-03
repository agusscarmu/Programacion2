package FinalProg.Condiciones;

import FinalProg.Carpeta;

public class CondPesoMenor extends Cond{
    private int peso;
    public CondPesoMenor(int peso){
        this.peso=peso;
    }

    @Override
    public boolean cumple(Carpeta e){
        return e.getPeso()<peso;
    }
}
