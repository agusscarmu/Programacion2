package EjercicioPuerto;

import java.util.Comparator;

public class ListaOrdenada implements Comparator<Comparable>{

    @Override
    public int compare(Comparable o1, Comparable o2) {
        return o2.compareTo(o2);
    }
    
}
