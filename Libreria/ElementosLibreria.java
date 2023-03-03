package Libreria;

import java.util.ArrayList;

import Libreria.Condiciones.Condicion;

public abstract class ElementosLibreria {
    private String nombre;

    public ElementosLibreria(String nombre){
        this.nombre=nombre;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombreNuevo){
        nombre=nombreNuevo;
    }
    public abstract int getVolumen();
    public abstract String getMarca();
    public abstract float getPrecio();
    public abstract ArrayList<ElementosLibreria>publicarDiario(Condicion c);
    public abstract ArrayList<ElementosLibreria>getElementos();
    public abstract int getCantProductos();
}
