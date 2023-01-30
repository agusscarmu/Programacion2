package ParcialHoteles.Condiciones;

import ParcialHoteles.CadenaHotelera;
import ParcialHoteles.Habitacion;

public class CondicionXComodidad extends Condicion {

    private String condicion;
    public CondicionXComodidad(String condicion){
        this.condicion=condicion;
    }
    @Override
    public boolean cumple(CadenaHotelera elem) {
        return ((Habitacion)elem).getComodidades().contains(condicion);
    }
    
}
