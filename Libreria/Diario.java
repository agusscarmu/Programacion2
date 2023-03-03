package Libreria;

import java.util.ArrayList;

import Libreria.Condiciones.Condicion;

public class Diario {
    private Condicion condicion;
    private ElementosLibreria elementos;
    public Diario(Condicion condicion, ElementosLibreria elementos){
        this.condicion=condicion;
        this.elementos=elementos;
    }
    public void setCondicion(Condicion nuevaCondicion){
        condicion=nuevaCondicion;
    }
    public boolean sePuedePublicar(ElementosLibreria elemento){
        return condicion.cumple(elemento);
    }
    public ArrayList<ElementosLibreria>getPublicaciones(){
        return elementos.publicarDiario(condicion);
    }
    public ArrayList<ElementosLibreria>buscar(Condicion c){
        ArrayList<ElementosLibreria>busqueda=new ArrayList<>();
        for(ElementosLibreria e:elementos.publicarDiario(c)){
            busqueda.addAll(e.publicarDiario(c));
        }
        return busqueda;
    }

}
