package ParcialLadrillos;

import java.util.ArrayList;

import ParcialLadrillos.Condiciones.C;

public class Piezas extends ElementosLadrillos{


    private String color;
    private int peso,costo,cantidadEnc;


    public Piezas(String marca, String color, int peso, int costo, int cantidadEnc){
        super(marca);
        this.color=color;
        this.peso=peso;
        this.costo=costo;
        this.cantidadEnc=cantidadEnc;
    }


    @Override
    public int getPeso() {
       return peso;
    }

    @Override
    public String getColor() {
       return color;
    }

    @Override
    public int getEncastres() {
        return cantidadEnc;
    }

    @Override
    public int getCosto() {
       return costo;
    }


    @Override
    public ArrayList<ElementosLadrillos> getLista(C c) {
        ArrayList<ElementosLadrillos> lista = new ArrayList<>();
        if(c.cumple(this)){
            lista.add(this);
        }
        return lista;
    }
    
}
