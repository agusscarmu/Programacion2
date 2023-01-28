package PrimerRecuperatorio.Condiciones;

import PrimerRecuperatorio.Noticia;
import PrimerRecuperatorio.PortalNoticia;

public class CondicionXContenido  extends Condicion{
    private String condicion;

    public CondicionXContenido(String condicion){
        this.condicion=condicion;
    }

    public boolean cumple(PortalNoticia elemento){
        return ((Noticia)elemento).getContenido().contains(condicion);
    }
}
