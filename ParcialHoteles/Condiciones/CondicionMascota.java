package ParcialHoteles.Condiciones;

import ParcialHoteles.CadenaHotelera;
import ParcialHoteles.Habitacion;

public class CondicionMascota extends Condicion {


    @Override
    public boolean cumple(CadenaHotelera elem) {
        return ((Habitacion)elem).aceptaMascotas();
    }
}