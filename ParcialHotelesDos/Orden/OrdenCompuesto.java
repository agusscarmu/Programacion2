package ParcialHotelesDos.Orden;

import java.util.Comparator;

import ParcialHotelesDos.CadenaHotelera;

public class OrdenCompuesto implements Comparator<CadenaHotelera>{
    Comparator<CadenaHotelera> c1,c2;

    public OrdenCompuesto(Comparator<CadenaHotelera>c1, Comparator<CadenaHotelera>c2){
        this.c1=c1;
        this.c2=c2;
    }
    public int compare(CadenaHotelera o1, CadenaHotelera o2){
        int c= c1.compare(o1, o2);
        if(c!=0){
            return c;
        }else{
            return c2.compare(o1, o2);
        }
    }
    
}
