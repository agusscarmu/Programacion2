package ParcialLadrillos.Condiciones;

import ParcialLadrillos.ElementosLadrillos;

public class Cnot extends C{
    C c;

    public Cnot(C c){
        this.c=c;
    }

    @Override
    public boolean cumple(ElementosLadrillos e){
        return !c.cumple(e);
    }
}
