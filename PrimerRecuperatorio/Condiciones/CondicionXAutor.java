package PrimerRecuperatorio.Condiciones;

import PrimerRecuperatorio.Noticia;
import PrimerRecuperatorio.PortalNoticia;

public class CondicionXAutor extends Condicion{
    private String condicion;

    public CondicionXAutor(String condicion){
        this.condicion=condicion;
    }

    public boolean cumple(PortalNoticia elemento){
        return ((Noticia)elemento).getAutor().equals(condicion);
    }
}
