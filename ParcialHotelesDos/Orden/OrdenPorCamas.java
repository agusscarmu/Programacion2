package ParcialHotelesDos.Orden;

import java.util.Comparator;

import ParcialHotelesDos.CadenaHotelera;
import ParcialHotelesDos.Habitacion;

public class OrdenPorCamas implements Comparator<CadenaHotelera>{

    @Override
    public int compare(CadenaHotelera o1, CadenaHotelera o2) {
       return ((Habitacion)o1).getCantCamas()-((Habitacion)o2).getCantCamas();
    }
    
}
