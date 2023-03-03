package ParcialNoticias;

import java.util.ArrayList;

import ParcialNoticias.Condiciones.Condicion;


public class Noticia extends PortalNoticias{
    private String titulo;
    private String texto;
    private String autor;
    private String categoria;
    private ArrayList<String> palabrasClave;

    public Noticia(String titulo, String texto, String autor, String categoria){
        super(categoria);
        this.titulo=titulo;
        this.texto=texto;
        this.autor=autor;
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

    public void agregarPalabraClave(String palabra){
        palabrasClave.add(palabra);
    }

    public ArrayList<String> getPalabrasClave(){
        ArrayList<String>palabrasCopia=new ArrayList<>(palabrasClave);
        return palabrasCopia;
    }

    @Override
    public ArrayList<PortalNoticias> getElementos() {
        ArrayList<PortalNoticias>elemento=new ArrayList<>();
        elemento.add(this);
        return elemento;
    }

    @Override
    public ArrayList<PortalNoticias> getElementosFiltrados(Condicion c) {
        ArrayList<PortalNoticias>e=new ArrayList<>();
        if(c.cumple(this)){
            e.add(this);
        }
        return e;
    }

    @Override
    public String toString() {
        return "Titulo: "+getTitulo()+"\nAutor: "+getAutor();
    }
}
