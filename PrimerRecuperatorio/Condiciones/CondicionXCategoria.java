package PrimerRecuperatorio.Condiciones;

import PrimerRecuperatorio.Noticia;
import PrimerRecuperatorio.PortalNoticia;

public class CondicionXCategoria  extends Condicion{
    private String condicion;

    public CondicionXCategoria(String condicion){
        this.condicion=condicion;
    }

    public boolean cumple(PortalNoticia elemento){
        return elemento.getCategoria().equals(condicion);   
    }
}
