package FinalProg;

import java.util.Date;

public class AlbumRestringido extends Album{

    private int limite;
    public AlbumRestringido(String titulo, Date fecha, int limite) {
        super(titulo, fecha);
        this.limite=limite;
    }
    
    public void setLimite(int l){
        limite=l;
    }

    @Override
    public void addElemento(Carpeta elemento){
        if(hayEspacio(elemento))
        elementos.add(elemento);
    }

    public boolean hayEspacio(Carpeta e){
        int size = getCantidadElementos()+e.getCantidadElementos();
        return size<=limite;
    }
    
}
