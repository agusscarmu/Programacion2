package ParcialHoteles;

import java.util.Date;

import ParcialHoteles.Condiciones.Condicion;

import java.util.ArrayList;

public class Habitacion extends CadenaHotelera{
    private ArrayList<String>comodidades;
    private int metrosCuadrados;
    private int cantCamas;
    private Date fechaOcupacion;
    private boolean aceptaMascotas;
    private boolean disponible;

    public Habitacion(int metrosCuadrados, int cantCamas, boolean disponible, boolean aceptaMascotas) {
        this.comodidades = new ArrayList<>();
        this.metrosCuadrados = metrosCuadrados;
        this.cantCamas = cantCamas;
        this.aceptaMascotas = aceptaMascotas;
        this.disponible = disponible;

    }
    public boolean disponible(){
        return disponible;
    }
    public boolean aceptaMascotas(){
        return aceptaMascotas;
    }
    public int getCantidadCamas(){
        return cantCamas;
    }
    public Date getFechaOcupacion(){
        return fechaOcupacion;
    }
    public ArrayList<String> getComodidades(){
        ArrayList<String> comodidadesCopia = new ArrayList<>(comodidades);
        return comodidadesCopia;
    }
    @Override
    public int getSupf(){
        return metrosCuadrados;
    }
    public void agregarComodidad(String comodidad){
        comodidades.add(comodidad);
    }

    public void alquilar(){
        this.fechaOcupacion=new Date();
        this.disponible=false;
    }

    @Override
    public ArrayList<CadenaHotelera> filtrarLista(Condicion c) {
        ArrayList<CadenaHotelera>elementoCopia=new ArrayList<>();
        if(c.cumple(this)){
        elementoCopia.add(this);
        }
        return elementoCopia;
    }
    @Override
    public ArrayList<CadenaHotelera> getDisponibles() {
        ArrayList<CadenaHotelera>lista=new ArrayList<>();
        if(disponible){
            lista.add(this);
        }
        return lista;
    }
    @Override
    public int cantHabitacionesXcategoria(Condicion c) {
        if(c.cumple(this)){
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Metros cuadrados: "+getSupf()+", cantidad de camas: "+cantCamas+", Disponible: "+disponible;
    }

}

