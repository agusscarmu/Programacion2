package ParcialLadrillos;

import ParcialLadrillos.Condiciones.C;

public class PaqueteConCondicion extends Paquete{
    private C condicion;

    public PaqueteConCondicion(String marca, int descuentoCosto, C condicion) {
        super(marca, descuentoCosto);
        this.condicion=condicion;
    }

    public void setCondicion(C c){
        condicion=c;
    }

    @Override
    public void addElemento(ElementosLadrillos e){
        if(condicion.cumple(e)){
            super.addElemento(e);
        }
    }
}  
