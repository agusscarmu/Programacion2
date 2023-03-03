package Libreria;

import java.util.ArrayList;

import Libreria.Condiciones.Condicion;

public class Paquete extends ElementosLibreria{

    ArrayList<ElementosLibreria>elementos;
    public Paquete(String nombre) {
        super(nombre);
        elementos=new ArrayList<>();
    }

    public void addElemento(ElementosLibreria elem){
        elementos.add(elem);
    }

    public ArrayList<ElementosLibreria> getElementos(){
        ArrayList<ElementosLibreria>elemsCopia=new ArrayList<>(elementos);
        return elemsCopia;
    }

    public int getCantProductos(){
        int cantidad=0;
        for(ElementosLibreria e:elementos){
            cantidad+=e.getCantProductos();
        }
        return cantidad;
    }

    @Override
    public int getVolumen() {
        int v=0;
        for(ElementosLibreria e:elementos){
            if(e.getVolumen()>v){
                v=e.getVolumen();
            }
        }
        return v;
    }

    @Override
    public String getMarca() {
        if(elementos.size()>0)
            return elementos.get(0).getMarca();
        else
            return null; //Esto lo tuve que corregir
    }

    @Override
    public float getPrecio() {
        int p=0;
        for(ElementosLibreria e:elementos){
            p+=e.getPrecio();
        }
        return p;
    }

    @Override
    public ArrayList<ElementosLibreria> publicarDiario(Condicion c) {
        ArrayList<ElementosLibreria>elems=new ArrayList<>();
        if(c.cumple(this)){
            elems.add(this);
        }
        for(ElementosLibreria e:elementos){
            elems.addAll(e.publicarDiario(c));
        }
        return elems;
    }
    
}
