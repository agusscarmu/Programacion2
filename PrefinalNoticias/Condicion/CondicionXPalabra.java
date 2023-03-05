package PrefinalNoticias.Condicion;

import PrefinalNoticias.Noticia;
import PrefinalNoticias.Portal;

public class CondicionXPalabra extends Condicion{


    private String palabra;


    public CondicionXPalabra(String palabra){
        this.palabra=palabra;
    }


    @Override
    public boolean cumple(Portal e) {
        return ((Noticia)e).getTexto().contains(palabra);
    }


}
