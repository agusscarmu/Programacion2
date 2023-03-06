package ParcialHotelesDos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import ParcialHotelesDos.Condiciones.Condicion;

public abstract class CadenaHotelera {

    public abstract int getSupf();
    
    public ArrayList<CadenaHotelera> getListaHabitaciones(Condicion c, Comparator<CadenaHotelera> orden){
        ArrayList<CadenaHotelera>listaOrdenada=getListaHabitaciones(c);
        Collections.sort(listaOrdenada, orden);
        return listaOrdenada;
    }
    public abstract ArrayList<CadenaHotelera> getListaHabitaciones(Condicion c);

    public abstract int getCantidadHabitaciones(Condicion c);
}
