package Libreria.Condiciones;

import Libreria.ElementosLibreria;

public class CondicionOr {
    private Condicion c1;
    private Condicion c2;

    public CondicionOr(Condicion c1, Condicion c2){
        this.c1=c1;
        this.c2=c2;
    }

    public boolean cumple(ElementosLibreria e){
        return c1.cumple(e) || c2.cumple(e);
    }
}
