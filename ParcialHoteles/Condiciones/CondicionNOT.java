package ParcialHoteles.Condiciones;

import ParcialHoteles.CadenaHotelera;

public class CondicionNOT extends Condicion {
    Condicion c1;

    public CondicionNOT(Condicion c1){
        this.c1=c1;
    }
    @Override
    public boolean cumple(CadenaHotelera elem) {
        return !c1.cumple(elem);
    }
    
}
