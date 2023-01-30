package ParcialHoteles.Condiciones;

import ParcialHoteles.CadenaHotelera;

public class CondicionXSup extends Condicion {

    private int condicion;
    public CondicionXSup(int superficieMinima){
        this.condicion=superficieMinima;
    }
    @Override
    public boolean cumple(CadenaHotelera elem) {
        return elem.getSupf()>condicion;
    }
    

}
