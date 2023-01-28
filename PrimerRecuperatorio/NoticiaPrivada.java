package PrimerRecuperatorio;

import java.util.ArrayList;

import PrimerRecuperatorio.Condiciones.Condicion;

public class NoticiaPrivada extends Noticia {

    public NoticiaPrivada(String contenido, String titulo, String autor, String categoria, String palabrasClave) {
        super(contenido, titulo, autor, categoria, palabrasClave);
    }
    @Override
    public ArrayList<PortalNoticia> filtrarPorCondicion(Condicion condicion) {
        ArrayList<PortalNoticia>e=new ArrayList<>();
        return e;
    }
}
