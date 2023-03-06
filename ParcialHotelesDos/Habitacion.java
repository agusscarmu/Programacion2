package ParcialHotelesDos;

import java.util.ArrayList;
import java.util.Date;

import ParcialHotelesDos.Condiciones.Condicion;

public class Habitacion extends CadenaHotelera{

    private ArrayList<String> comodidades;
    private int cantCamas, supf;
    private Date fechaLimite;
    private boolean mascotas;
    private Turista ocupante;

    public Habitacion(int supf, int cantCamas, boolean mascotas){
        this.supf=supf;
        this.cantCamas=cantCamas;
        this.mascotas=mascotas;
    }

    public void alquilar(Date fLimit){
        this.fechaLimite=fLimit;
    }

    public void setMascota(boolean m){
        mascotas=m;
    }

    public void setCantCamas(int cC){
        cantCamas=cC;
    }

    public void setSupf(int s){
        supf=s;
    }

    public void addComodidades(String comodidad){
        comodidades.add(comodidad);
    }

    public boolean aceptaMascotas(){
        return mascotas;
    }

    public int getCantCamas(){
        return cantCamas;
    }

    @Override
    public int getSupf() {
        return supf;
    }

    public ArrayList<String> getComodidades(){
        ArrayList<String> comodidadesCopia = new ArrayList<>(comodidades);
        return comodidadesCopia;
    }

    public Date getFechaOcupacion(){
        return fechaLimite;
    }

    public void ocuparHabitacion(Turista turista, Date fecha){
        alquilar(fecha);
        ocupante=turista;
    }

    public void liberarHabitacion(){
        Date fechaHoy=new Date();
        if(fechaLimite.before(fechaHoy));
            ocupante=null;
    }

    public boolean disponible(){
        return ocupante==null;
    }

    @Override
    public ArrayList<CadenaHotelera> getListaHabitaciones(Condicion c) {
        ArrayList<CadenaHotelera>e=new ArrayList<>();
        if(c.cumple(this) && disponible()){
            e.add(this);
        }
        return e;
    }

    @Override
    public int getCantidadHabitaciones(Condicion c) {
        if(c.cumple(this))
            return 1;
        else
            return 0;
    }
    
}
