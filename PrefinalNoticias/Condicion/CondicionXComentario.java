package PrefinalNoticias.Condicion;

import PrefinalNoticias.Noticia;
import PrefinalNoticias.Portal;

public class CondicionXComentario extends Condicion{

    private String autorComentario;

    public CondicionXComentario(String autorComentario){
        this.autorComentario=autorComentario;
    }
    @Override
    public boolean cumple(Portal e){
        return ((Noticia)e).getAutoresComentarios().contains(autorComentario);
    }

    // SIN HACER FUNCION "getAutoresComentarios":
    // 
    // public boolean cumple(Portal e) {
    //     int i=0;
    //     while(i<((Noticia)e).getComentarios().size()){
    //         if(((Noticia)e).getComentarios().get(i).getAutor().equals(autorComentario)){
    //             return true;
    //         }
    //     }
    //     return false;
    // }
    
}
