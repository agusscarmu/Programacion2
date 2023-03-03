package Libreria.Condiciones;

import Libreria.ElementosLibreria;

public class CondicionXVolumenMenor extends Condicion{
    private int volumen;
    public CondicionXVolumenMenor(int volumen){
        this.volumen=volumen;
    }
    @Override
    public boolean cumple(ElementosLibreria elemento) {
        return elemento.getVolumen()<volumen;
    }
}
