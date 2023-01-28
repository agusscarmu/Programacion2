package PrimerRecuperatorio;

import java.util.ArrayList;

import PrimerRecuperatorio.Condiciones.Condicion;

public abstract class PortalNoticia {
    private String categoria;

    public PortalNoticia(String categoria){
        this.categoria=categoria;
    }
    public String getCategoria(){
        return categoria;
    }
    public abstract String getPalabrasClave();
    public abstract ArrayList<PortalNoticia> filtrarPorCondicion(Condicion condicion);
}
