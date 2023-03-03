package ParcialNoticias;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import ParcialNoticias.Condiciones.Condicion;

public class Seccion extends PortalNoticias{

    protected ArrayList<PortalNoticias> elementos;
    private Comparator<PortalNoticias> ordenanza;
    public Seccion(String categoria, Comparator<PortalNoticias>ordenanza) {
        super(categoria);
        this.elementos=new ArrayList<>();
        this.ordenanza=ordenanza;
    }

    public void agregarElemento(PortalNoticias elem){
        elementos.add(elem);
        ordenar();
    }
    public void setOrdenanza(Comparator<PortalNoticias> o){
        ordenanza=o;
    }
    @Override
    public ArrayList<String> getPalabrasClave() {
        ArrayList<String>palabrasClave = new ArrayList<>();
        for(PortalNoticias e:elementos){
            ArrayList<String> palabras= e.getPalabrasClave();
            for(String palabra:palabras){
                if(!(palabrasClave.contains(palabra))){
                    palabrasClave.add(palabra);
                }
            }
        }
        return palabrasClave;
       
    }

    public void ordenar(){
        Collections.sort(elementos, ordenanza);
    }
    @Override
    public ArrayList<PortalNoticias> getElementos() {
        ArrayList<PortalNoticias> elemsCopia = new ArrayList<>(elementos);
        return elemsCopia;
    }

    @Override
    public ArrayList<PortalNoticias> getElementosFiltrados(Condicion c) {
        ArrayList<PortalNoticias> elems = new ArrayList<>();
        for(PortalNoticias e:elementos){
            elems.addAll(e.getElementosFiltrados(c));
        }
        return elems;
    }
    
    @Override
    public String toString() {
        return elementos.toString();
    }
}
