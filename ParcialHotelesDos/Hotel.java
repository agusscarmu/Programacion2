package ParcialHotelesDos;

import java.util.ArrayList;

import ParcialHotelesDos.Condiciones.Condicion;

public class Hotel extends CadenaHotelera{

    private ArrayList<CadenaHotelera>elementos;

    public Hotel(){
        this.elementos=new ArrayList<>();
    }

    public void addElemento(CadenaHotelera e){
        elementos.add(e);
    }

    @Override
    public int getSupf() {
        int sup=0;
        for(CadenaHotelera e:elementos){
            sup+=e.getSupf();
        }
        return sup;
    }

    @Override
    public ArrayList<CadenaHotelera> getListaHabitaciones(Condicion c) {
        ArrayList<CadenaHotelera>elemsCumplen = new ArrayList<>();
        for(CadenaHotelera e:elementos){
            elemsCumplen.addAll(e.getListaHabitaciones(c));
        }
        return elemsCumplen;
    }

    @Override
    public int getCantidadHabitaciones(Condicion c) {
        int cantidad=0;
        for(CadenaHotelera e:elementos){
            cantidad+=e.getCantidadHabitaciones(c);
        }
        return cantidad;
    }
    
}
