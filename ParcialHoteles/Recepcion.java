package ParcialHoteles;

import java.util.ArrayList;

public class Recepcion {
    ArrayList<Turista> turistas;

    public Recepcion(){
        this.turistas=new ArrayList<>();
    }
    public void agregarTurista(Turista turista){
        turistas.add(turista);
    }

    public ArrayList<CadenaHotelera> traerListaDisponible(CadenaHotelera hotel){
        return hotel.getDisponibles();
    }
}
