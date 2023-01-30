package ParcialHoteles;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import ParcialHoteles.Condiciones.Condicion;

public class Hotel extends CadenaHotelera{
    private ArrayList<CadenaHotelera>elems;
    private static Comparator<CadenaHotelera>ordenar;
    public Hotel(){
        this.elems=new ArrayList<>();
        Hotel.ordenar = new OrdenarXSupf();
    }

    public void setOrdenamiento(Comparator<CadenaHotelera> ordenarNuevo){
        ordenar=ordenarNuevo;
    }
    
    public void agregarElemento(CadenaHotelera e){
        elems.add(e);
    }
    public void ordenar(ArrayList<CadenaHotelera>lista) {
        Collections.sort(lista, ordenar);;        
    }

    public ArrayList<CadenaHotelera> getElementos(){
        ArrayList<CadenaHotelera> elementosCopia = new ArrayList<>(elems);
        return elementosCopia; 
    }
    
    @Override
    public int getSupf() {
        int supfTotal=0;
        for(CadenaHotelera e:elems){
            supfTotal+=e.getSupf();
        }
        return supfTotal;
    }
    @Override
    public ArrayList<CadenaHotelera> filtrarLista(Condicion c) {
        ArrayList<CadenaHotelera> listaCopia = new ArrayList<>();
        for(CadenaHotelera e:elems){
            listaCopia.addAll(e.filtrarLista(c));
        }
        ordenar(listaCopia);
        return listaCopia;
    }

    @Override
    public ArrayList<CadenaHotelera> getDisponibles() {
        ArrayList<CadenaHotelera> listaDisponibles=new ArrayList<>();
        for(CadenaHotelera e:elems){
            listaDisponibles.addAll(e.getDisponibles());
        }
        return listaDisponibles;
    }

    @Override
    public int cantHabitacionesXcategoria(Condicion c) {
        int total=0;
        for(CadenaHotelera e:elems){
            total+=e.cantHabitacionesXcategoria(c);
        }
        return total;
    }

    @Override
    public String toString() {
        return "Metros cuadrados totales: "+getSupf()+", Habitaciones: "+elems.toString();
    }
}
