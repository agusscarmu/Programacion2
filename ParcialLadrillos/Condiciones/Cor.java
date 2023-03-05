package ParcialLadrillos.Condiciones;

import ParcialLadrillos.ElementosLadrillos;

public class Cor extends C{
    C c1,c2;
    
    public Cor(C c1, C c2){
        this.c1=c1;
        this.c2=c2;
    }

    @Override
    public boolean cumple(ElementosLadrillos e) {
        return c1.cumple(e) || c2.cumple(e);
    }
    
}
