package Libreria.Condiciones;

import Libreria.ElementosLibreria;

public class CondicionXNombre extends Condicion{
    private String nombre;
    public CondicionXNombre(String nombre){
        this.nombre=nombre;
    }
    @Override
    public boolean cumple(ElementosLibreria elemento) {
        return elemento.getNombre().equals(nombre);
    }
    
}
