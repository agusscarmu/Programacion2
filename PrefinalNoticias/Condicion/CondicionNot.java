package PrefinalNoticias.Condicion;

import PrefinalNoticias.Portal;

public class CondicionNot extends Condicion{
    

    private Condicion c;

    public CondicionNot(Condicion c){
        this.c=c;
    }

    @Override
    public boolean cumple(Portal e) {
       return !c.cumple(e);
    }

}
