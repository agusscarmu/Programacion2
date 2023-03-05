package ParcialLadrillos;

import java.util.ArrayList;

import ParcialLadrillos.Condiciones.C;

public abstract class ElementosLadrillos {
    
    private String marca;

    public ElementosLadrillos(String marca){
        this.marca=marca;
    }

    public String getMarca(){
        return marca;
    }

    public abstract int getPeso();

    public abstract String getColor();

    public abstract int getEncastres();

    public abstract int getCosto();

    public abstract ArrayList<ElementosLadrillos> getLista(C c);
}
