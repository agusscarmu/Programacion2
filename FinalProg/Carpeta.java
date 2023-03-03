package FinalProg;

import java.util.ArrayList;
import java.util.Date;

import FinalProg.Condiciones.Cond;

public abstract class Carpeta {
    
    private String titulo;
    private Date fecha;

    public Carpeta(String titulo, Date fecha){
        this.titulo=titulo;
        this.fecha=fecha;
    }

    public abstract int getCantidadElementos();
    public abstract int getPeso();
    public abstract ArrayList<String> getListaPersonas();
    public abstract ArrayList<Carpeta> getCopiaConCondicion(Cond c);

    public String getTitulo(){
        return titulo;
    }
    public Date getDate(){
        return fecha;
    }
    public void setTitulo(String tituloNuevo){
        titulo=tituloNuevo;
    }
    
}
