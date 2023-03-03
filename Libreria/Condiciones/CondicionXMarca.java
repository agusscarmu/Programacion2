package Libreria.Condiciones;

import Libreria.ElementosLibreria;

public class CondicionXMarca extends Condicion{

    private String marca;
    public CondicionXMarca(String marca){
        this.marca=marca;
    }
    @Override
    public boolean cumple(ElementosLibreria elemento) {
        return elemento.getMarca().equals(marca);
    }
    
}
