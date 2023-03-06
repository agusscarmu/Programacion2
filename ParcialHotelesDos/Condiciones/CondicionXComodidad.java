package ParcialHotelesDos.Condiciones;

import ParcialHotelesDos.CadenaHotelera;
import ParcialHotelesDos.Habitacion;

public class CondicionXComodidad extends Condicion{
    private String comodidad;

    public CondicionXComodidad(String comodidad){
        this.comodidad=comodidad;
    }
    @Override
    public boolean cumple(CadenaHotelera e) {
       return ((Habitacion)e).getComodidades().contains(comodidad);
    }
    
}
