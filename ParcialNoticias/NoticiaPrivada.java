package ParcialNoticias;

import java.util.ArrayList;

import ParcialNoticias.Condiciones.Condicion;

public class NoticiaPrivada extends Noticia{

    public NoticiaPrivada(String titulo, String texto, String autor, String categoria) {
        super(titulo, texto, autor, categoria);
    }
    
    @Override
    public ArrayList<PortalNoticias> getElementosFiltrados(Condicion c) {
        ArrayList<PortalNoticias>e=new ArrayList<>();
        return e;
    }
}
