package PrefinalNoticias.Condicion;

import PrefinalNoticias.Noticia;
import PrefinalNoticias.Portal;

public class CondicionXTitulo extends Condicion{

    
    private String titulo;

    public CondicionXTitulo(String titulo){
        this.titulo=titulo;
    }


    @Override
    public boolean cumple(Portal e) {
        return ((Noticia)e).getTitulo().equals(titulo);
    }
    
}
