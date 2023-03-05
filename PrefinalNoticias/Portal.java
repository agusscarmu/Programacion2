package PrefinalNoticias;

import java.util.ArrayList;

import PrefinalNoticias.Condicion.Condicion;

public abstract class Portal {
    private String tema;


    public abstract String getTema();
    // public abstract ArrayList<Portal> getCopia(Condicion c);
    public abstract Portal getCopia(Condicion c);
    public abstract int getCantidadNoticias(Condicion c);

}
