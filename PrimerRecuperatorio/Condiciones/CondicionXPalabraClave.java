package PrimerRecuperatorio.Condiciones;

import PrimerRecuperatorio.Noticia;
import PrimerRecuperatorio.PortalNoticia;

public class CondicionXPalabraClave  extends Condicion{
    private String condicion;

    public CondicionXPalabraClave(String condicion){
        this.condicion=condicion;
    }

    public boolean cumple(PortalNoticia elemento){
        return elemento.getPalabrasClave().contains(condicion);
    }
}
