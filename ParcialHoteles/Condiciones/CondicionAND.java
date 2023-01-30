package ParcialHoteles.Condiciones;

import ParcialHoteles.CadenaHotelera;

public class CondicionAND extends Condicion {
    Condicion c1,c2;

    public CondicionAND(Condicion c1, Condicion c2){
        this.c1=c1;
        this.c2=c2;
    }
    @Override
    public boolean cumple(CadenaHotelera elem) {
        return c1.cumple(elem) && c2.cumple(elem);
    }
    
}
