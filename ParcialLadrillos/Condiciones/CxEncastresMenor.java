package ParcialLadrillos.Condiciones;

import ParcialLadrillos.ElementosLadrillos;

public class CxEncastresMenor extends C {
    private int encastres;

    public CxEncastresMenor(int encastres){
        this.encastres=encastres;
    }

    @Override
    public boolean cumple(ElementosLadrillos e) {
        return e.getEncastres()<encastres;
    }
    
}
