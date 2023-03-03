package ParcialNoticias.Condiciones;

import ParcialNoticias.Noticia;

public class CondicionXAutor extends Condicion{
    
    private String autor;

    public CondicionXAutor(String autor){
        this.autor=autor;
    }

    public boolean cumple(Noticia elemento){
        return ((Noticia)elemento).getAutor().equals(autor);
    }
}
