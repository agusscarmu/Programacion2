package PrimerRecuperatorio;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import PrimerRecuperatorio.Condiciones.Condicion;

public class Noticia extends PortalNoticia{
    private String contenido;
    private String titulo;
    private String autor;
    private String palabrasClave;

    public Noticia(String contenido, String titulo, String autor, String categoria, String palabrasClave){
        super(categoria);
        this.contenido=contenido;
        this.titulo=titulo;
        this.autor=autor;
        this.palabrasClave=palabrasClave;
    }
    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public String getContenido(){
        return contenido;
    }
    @Override
    public String getPalabrasClave() {
        return palabrasClave;
    }
    @Override
    public String toString() {
        return "\nTitulo: "+titulo+", Autor: "+autor+", Contenido: "+contenido+", Categoria: "+getCategoria();
    }

    @Override
    public ArrayList<PortalNoticia> filtrarPorCondicion(Condicion condicion) {
        ArrayList<PortalNoticia>e=new ArrayList<>();
        if(condicion.cumple(this)){
            e.add(this);
        }
        return e;
    }
}
