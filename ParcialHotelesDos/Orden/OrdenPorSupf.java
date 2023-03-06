package ParcialHotelesDos.Orden;

import java.util.Comparator;

import ParcialHotelesDos.CadenaHotelera;

public class OrdenPorSupf implements Comparator<CadenaHotelera>{

    @Override
    public int compare(CadenaHotelera o1, CadenaHotelera o2) {
        return o1.getSupf()-o2.getSupf();
    }
    
}
