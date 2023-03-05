package ParcialLadrillos.Condiciones;

import ParcialLadrillos.ElementosLadrillos;

public class CxMarca extends C{

    private String marca;

    public CxMarca(String marca){
        this.marca=marca;
    }
    @Override
    public boolean cumple(ElementosLadrillos e) {
        return e.getMarca().equals(marca);
    }
}
