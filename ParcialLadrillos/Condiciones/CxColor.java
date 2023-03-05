package ParcialLadrillos.Condiciones;

import ParcialLadrillos.ElementosLadrillos;

public class CxColor extends C{

    private String color;

    public CxColor(String color){
        this.color=color;
    }

    @Override
    public boolean cumple(ElementosLadrillos e) {
        return e.getColor().equals(color);
    }
    
}
