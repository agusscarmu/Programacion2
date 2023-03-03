package FinalProg;

public class OrdenanzaPorFechaYPeso extends Ordenanza{

    @Override
    public int compare(Carpeta o1, Carpeta o2) {
        int comparador = o1.getDate().compareTo(o2.getDate());
        if(comparador==0){
            comparador = o1.getPeso()-o2.getPeso();
        }
        return comparador;
    }
    
}
