package ParcialNoticias;

import java.util.ArrayList;
import ParcialNoticias.Condiciones.Condicion;

public abstract class PortalNoticias {

    private String categoria;

    public PortalNoticias(String categoria){
        this.categoria=categoria;
    }

    public String getCategoria(){
        return categoria;
    }

    public abstract ArrayList<String>getPalabrasClave();
    public abstract ArrayList<PortalNoticias>getElementos();
    public abstract ArrayList<PortalNoticias>getElementosFiltrados(Condicion c);

}
