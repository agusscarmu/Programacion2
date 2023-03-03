package ParcialNoticias.Condiciones;

import ParcialNoticias.Noticia;

public class CondicionNot extends Condicion{
    private Condicion condicion;

    public CondicionNot(Condicion condicion){
        this.condicion=condicion;
    }

    @Override
    public boolean cumple(Noticia elemento) {
        return !condicion.cumple(elemento);
    }
}
