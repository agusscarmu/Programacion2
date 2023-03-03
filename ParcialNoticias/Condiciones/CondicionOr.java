package ParcialNoticias.Condiciones;

import ParcialNoticias.Noticia;

public class CondicionOr extends Condicion{

    private Condicion c1;
    private Condicion c2;
    public CondicionOr(Condicion c1, Condicion c2){
        this.c1=c1;
        this.c2=c2;
    }
    @Override
    public boolean cumple(Noticia elemento) {
        return c1.cumple(elemento) || c2.cumple(elemento);
    }
    
}
