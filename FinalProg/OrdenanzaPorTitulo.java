package FinalProg;

public class OrdenanzaPorTitulo extends Ordenanza{

    @Override
    public int compare(Carpeta o1, Carpeta o2) {
        return o1.getTitulo().compareTo(o2.getTitulo());
    }
    
}
