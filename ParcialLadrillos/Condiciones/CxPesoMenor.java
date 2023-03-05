package ParcialLadrillos.Condiciones;

import ParcialLadrillos.ElementosLadrillos;

public class CxPesoMenor extends C{

    private int peso;

    public CxPesoMenor(int peso){
        this.peso=peso;
    }

    @Override
    public boolean cumple(ElementosLadrillos e) {
        return e.getPeso()<peso;
    }
    
}
