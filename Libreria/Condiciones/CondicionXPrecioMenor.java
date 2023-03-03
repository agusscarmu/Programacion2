package Libreria.Condiciones;

import Libreria.ElementosLibreria;

public class CondicionXPrecioMenor extends Condicion{
    
    private float precio;

    public CondicionXPrecioMenor(float precio){
        this.precio=precio;
    }

    public boolean cumple(ElementosLibreria e){
        return e.getPrecio()<precio;
    }

}
