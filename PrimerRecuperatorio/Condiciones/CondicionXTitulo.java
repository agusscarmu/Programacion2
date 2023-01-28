package PrimerRecuperatorio.Condiciones;

import PrimerRecuperatorio.Noticia;
import PrimerRecuperatorio.PortalNoticia;

public class CondicionXTitulo  extends Condicion{
    private String condicion;

    public CondicionXTitulo(String condicion){
        this.condicion=condicion;
    }

    @Override
    public boolean cumple(PortalNoticia elem) {
        return ((Noticia)elem).getTitulo().contains(condicion);
    }



}
