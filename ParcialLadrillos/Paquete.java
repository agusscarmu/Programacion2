package ParcialLadrillos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import ParcialLadrillos.Condiciones.C;

public class Paquete extends ElementosLadrillos{

    private ArrayList<ElementosLadrillos>elementos;
    private int descuentoCosto;
    private Comparator<ElementosLadrillos> orden;
    public Paquete(String marca, int descuentoCosto) {
        super(marca);
        this.descuentoCosto=descuentoCosto;
        this.elementos=new ArrayList<>();
    }

    public void setOrden(Comparator<ElementosLadrillos> o){
        orden=o;
    }

    public void addElemento(ElementosLadrillos e){
        elementos.add(e);
    }
    
    @Override
    public int getPeso() {
        int peso=0;
        for(ElementosLadrillos e:elementos){
            peso+=e.getPeso();
        }
        return peso;
    }

    @Override
    public String getColor() {
        return elementos.get(elementos.size()-1).getColor();
    }

    @Override
    public int getEncastres() {
        int encastres=0;
        for(ElementosLadrillos e:elementos){
            encastres+=e.getEncastres();
        }
        encastres/=elementos.size();
        return encastres;
    }

    @Override
    public int getCosto() {
        int precioFinal=0;
        for(ElementosLadrillos e:elementos){
            precioFinal+=e.getCosto();
        }
        precioFinal-=(precioFinal*descuentoCosto)/100;
        return precioFinal;
    }

    @Override
    public ArrayList<ElementosLadrillos> getLista(C c) {
        ArrayList<ElementosLadrillos>lista=new ArrayList<>();
        for(ElementosLadrillos e:elementos){
            lista.addAll(e.getLista(c));
        }
        ordenar(lista);
        return lista;
    }

    public void ordenar(ArrayList<ElementosLadrillos>l){
        Collections.sort(l, orden);
    }
    
}
