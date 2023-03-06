package ParcialHotelesDos.Condiciones;

import ParcialHotelesDos.CadenaHotelera;
import ParcialHotelesDos.Habitacion;

public class CondicionXDisponibilidad extends Condicion{

    @Override
    public boolean cumple(CadenaHotelera e) {
        return ((Habitacion)e).disponible();
    }
    
}
