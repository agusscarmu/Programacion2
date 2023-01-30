package ParcialHoteles;

import java.util.ArrayList;

import ParcialHoteles.Condiciones.Condicion;

public abstract class CadenaHotelera {
    
    public abstract ArrayList<CadenaHotelera> filtrarLista(Condicion c);
    public abstract ArrayList<CadenaHotelera> getDisponibles();
    public abstract int getSupf();
    public abstract int cantHabitacionesXcategoria(Condicion c);
}
