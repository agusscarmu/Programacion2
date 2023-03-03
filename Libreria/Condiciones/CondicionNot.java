package Libreria.Condiciones;

import Libreria.ElementosLibreria;

public class CondicionNot extends Condicion{

    private Condicion c;

    public CondicionNot(Condicion c){
        this.c=c;
    }
    @Override
    public boolean cumple(ElementosLibreria elemento) {
        return !c.cumple(elemento);
    }
    
}
