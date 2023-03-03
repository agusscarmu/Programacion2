package FinalProg.Condiciones;

import FinalProg.Carpeta;

public class CondAnd extends Cond{
    private Cond c1;
    private Cond c2;

    public CondAnd(Cond c1, Cond c2){
        this.c1=c1;
        this.c2=c2;
    }

    public boolean cumple(Carpeta e){
        return c1.cumple(e) && c2.cumple(e);
    }
}
