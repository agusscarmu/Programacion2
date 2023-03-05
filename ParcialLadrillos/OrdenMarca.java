package ParcialLadrillos;

import java.util.Comparator;

public class OrdenMarca implements Comparator<ElementosLadrillos>{

    @Override
    public int compare(ElementosLadrillos o1, ElementosLadrillos o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
    
}
