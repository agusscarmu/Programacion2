package EjercicioPuerto;

import java.util.Comparator;

public class ListaBarcosOrdenada implements Comparator<Barco>{

    @Override
    public int compare(Barco o1, Barco o2) {
        return o2.getCapacidad()-o1.getCapacidad();
    }
    
}
