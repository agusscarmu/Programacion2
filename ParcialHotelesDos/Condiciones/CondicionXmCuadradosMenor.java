package ParcialHotelesDos.Condiciones;

import ParcialHotelesDos.CadenaHotelera;

public class CondicionXmCuadradosMenor extends Condicion{
    private int m;

    public CondicionXmCuadradosMenor(int m){
        this.m=m;
    }

    public boolean cumple(CadenaHotelera e){
        return e.getSupf()<m;
    }
}
