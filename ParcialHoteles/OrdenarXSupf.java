package ParcialHoteles;

import java.util.Comparator;

public class OrdenarXSupf implements Comparator<CadenaHotelera>{

    @Override
    public int compare(CadenaHotelera o1, CadenaHotelera o2) {
        return o1.getSupf()-o2.getSupf();
    }
    
}
