package EjercicioPuerto;

import java.util.Comparator;

public class ListaCamionesOrdenada implements Comparator<Camion>{

    @Override
    public int compare(Camion o1, Camion o2) {
        return o1.getFechaDeCarga().compareTo(o2.getFechaDeCarga());
    }
    
}
