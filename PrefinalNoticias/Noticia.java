package PrefinalNoticias;

import java.util.ArrayList;

import PrefinalNoticias.Condicion.Condicion;

public class Noticia extends Portal{
    

    private String titulo;
    private String texto;
    private String autor;
    private String tema;
    private ArrayList<Comentario> comentarios;


    public Noticia(String titulo, String texto, String autor, String tema) {
        this.titulo = titulo;
        this.texto = texto;
        this.autor = autor;
        this.tema = tema;
        this.comentarios=new ArrayList<>();
    }


    public void setTitulo(String t){
        titulo=t;
    }

    public void setTexto(String t){
        texto=t;
    }

    public void setAutor(String a){
        autor=a;
    }

    public void setTema(String t){
        tema=t;
    }

    
    public String getTitulo(){
        return titulo;
    }


    public String getTexto(){
        return texto;
    }


    public String getAutor(){
        return autor;
    }


    public ArrayList<String> getAutoresComentarios(){
        ArrayList<String> autores = new ArrayList<>();
        for(Comentario c:comentarios){
            if(!autores.contains(c.getAutor())){
                autores.add(c.getAutor());
            }
        }
        return autores;
    }

    public ArrayList<Comentario> getComentarios(){
        ArrayList<Comentario>comentariosCopia=new ArrayList<>(comentarios);
        return comentariosCopia;
    }


    public void addComentario(Comentario c){
        comentarios.add(c);
    }


    @Override
    public String getTema() {
        return tema;
    }

// Esta mal!!
    // @Override
    // public ArrayList<Portal> getCopia(Condicion c) {
    //     ArrayList<Portal>copia=new ArrayList<>();
    //     if(c.cumple(this)){
    //         copia.add(this);
    //     }
    //     return copia;
    // }
// ASI ESTA BIEN:
    @Override
    public Portal getCopia(Condicion c){
        if(c.cumple(this)){
            Noticia copia = newInstancia();
            for(Comentario com:comentarios){
                newInstancia().addComentario(com);
            }
            return copia;
        }else{
            return null;
        }
    }

    @Override
    public int getCantidadNoticias(Condicion c) {
        if(c.cumple(this)){
            return 1;
        }
        return 0;
    }
    
    public Noticia newInstancia(){
        return new Noticia(this.titulo, this.texto, this.autor, this.tema);
    }
}
