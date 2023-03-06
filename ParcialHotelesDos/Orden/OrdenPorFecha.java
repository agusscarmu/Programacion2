package ParcialHotelesDos.Orden;

import java.util.Comparator;

import ParcialHotelesDos.CadenaHotelera;
import ParcialHotelesDos.Habitacion;

public class OrdenPorFecha implements Comparator<CadenaHotelera>{

    public int compare(CadenaHotelera o1, CadenaHotelera o2){
        return ((Habitacion)o1).getFechaOcupacion().compareTo(((Habitacion)o2).getFechaOcupacion());
    }
}
