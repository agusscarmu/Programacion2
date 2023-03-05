package ParcialLadrillos;

import java.util.Comparator;

public class OrdenCosto implements Comparator<ElementosLadrillos>{

    @Override
    public int compare(ElementosLadrillos o1, ElementosLadrillos o2) {
       return o1.getCosto()-o2.getCosto();
    }
    
}
