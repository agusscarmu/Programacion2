package PrefinalNoticias;

import java.util.ArrayList;

import PrefinalNoticias.Condicion.Condicion;

public class NoticiaParalela extends Noticia{

    private Noticia nParalela;

    public NoticiaParalela(String titulo, String texto, String autor, String tema, Noticia nParalela) {
        super(titulo, texto, autor, tema);
        this.nParalela=nParalela;
    }

    @Override
    public void addComentario(Comentario c){
        nParalela.addComentario(c);
        super.addComentario(c);
    }


    // @Override
    // public ArrayList<Portal> getCopia(Condicion c){
    //     ArrayList<Portal>copia=new ArrayList<>();
    //     return copia;
    // }
    
    public Portal getCopia(Condicion c){
        return null;
    }
}
