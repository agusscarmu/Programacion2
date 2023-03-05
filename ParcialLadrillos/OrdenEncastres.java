package ParcialLadrillos;

import java.util.Comparator;

public class OrdenEncastres implements Comparator<ElementosLadrillos>{

    @Override
    public int compare(ElementosLadrillos o1, ElementosLadrillos o2) {
        return o1.getEncastres()-o2.getEncastres();
    }
    
}
