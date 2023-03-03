package FinalProg.Condiciones;

import FinalProg.Carpeta;

public class CondNot extends Cond{
    private Cond c;
    public CondNot(Cond c){
        this.c=c;
    }
    @Override
    public boolean cumple(Carpeta elemento) {
        return !c.cumple(elemento);
    }
    
}
