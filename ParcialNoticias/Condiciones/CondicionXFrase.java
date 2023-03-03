package ParcialNoticias.Condiciones;

import ParcialNoticias.Noticia;

public class CondicionXFrase extends Condicion {

    private String frase;

    public CondicionXFrase(String frase){
        this.frase=frase;
    }
    @Override
    public boolean cumple(Noticia elemento) {
        return ((Noticia)elemento).getTexto().contains(frase);
    }
    
}
