package Libreria;

import java.util.ArrayList;

import Libreria.Condiciones.Condicion;

public class Producto extends ElementosLibreria{
    private String marca;
    private float precio;
    private int volumen;

    public Producto(String nombre, String marca, float precio, int volumen){
        super(nombre);
        this.marca=marca;
        this.precio=precio;
        this.volumen=volumen;
    }
    @Override
    public int getCantProductos(){
        return 1;
    }
    @Override
    public String getMarca(){
        return marca;
    }
    @Override
    public float getPrecio(){
        return precio;
    }
    @Override
    public int getVolumen(){
        return volumen;
    }
    public void setMarca(String marcaNueva){
        marca=marcaNueva;
    }
    public void setPrecio(float precioNuevo){
        precio=precioNuevo;
    }
    public void setVolumen(int volumenNuevo){
        volumen=volumenNuevo;
    }

    @Override
    public ArrayList<ElementosLibreria> publicarDiario(Condicion c) {
        ArrayList<ElementosLibreria>e=new ArrayList<>();
        if(c.cumple(this)){
            e.add(this);
        }
        return e;
    }

    @Override
    public ArrayList<ElementosLibreria> getElementos() {
        ArrayList<ElementosLibreria>e=new ArrayList<>();
        e.add(this);
        return e;
    }
}
