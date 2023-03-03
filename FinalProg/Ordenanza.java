package FinalProg;

import java.util.Comparator;

public abstract class Ordenanza implements Comparator<Carpeta>{
    
    public abstract int compare(Carpeta o1, Carpeta o2);
}
