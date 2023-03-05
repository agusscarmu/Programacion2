package PrefinalNoticias.Condicion;

import PrefinalNoticias.Noticia;
import PrefinalNoticias.Portal;

public class CondicionXAutor extends Condicion{
    

    private String autor;


    public CondicionXAutor(String autor){
        this.autor=autor;
    }
    @Override
    public boolean cumple(Portal e) {
        return ((Noticia)e).getAutor().equals(autor);
    }
}
