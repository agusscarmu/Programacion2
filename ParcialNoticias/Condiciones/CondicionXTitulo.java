package ParcialNoticias.Condiciones;

import ParcialNoticias.Noticia;

public class CondicionXTitulo extends Condicion{

    private String condicion;
    public CondicionXTitulo(String condicion){
        this.condicion=condicion;
    }
    @Override
    public boolean cumple(Noticia elemento) {
       return ((Noticia)elemento).getTitulo().equals(condicion);
    }
    
}
