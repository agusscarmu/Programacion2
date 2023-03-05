package ParcialLadrillos;

import java.util.Comparator;

public class OrdenColor implements Comparator<ElementosLadrillos> {

    @Override
    public int compare(ElementosLadrillos o1, ElementosLadrillos o2) {
        return o1.getColor().compareTo(o2.getColor());
    }
    
}
