package FinalProg;

import java.util.ArrayList;
import java.util.Date;

import FinalProg.Condiciones.Cond;

public class Foto extends Carpeta{
    private int peso;
    private ArrayList<String>listaPersonas;

    public Foto(String titulo, int peso, Date fechaCaptura){
        super(titulo, fechaCaptura);
        this.peso=peso;
    }

    public int getPeso(){
        return peso;
    }
    @Override
    public ArrayList<String>getListaPersonas(){
        ArrayList<String>listaCopia=new ArrayList<>(listaPersonas);
        return listaCopia;
    }

    @Override
    public int getCantidadElementos(){
        return 1;
    }

    @Override
    public ArrayList<Carpeta> getCopiaConCondicion(Cond c){
        ArrayList<Carpeta>copia=new ArrayList<>();
        if(c.cumple(this)){
            copia.add(this);
        }
        return copia;
    }

    public void addPersona(String persona){
        listaPersonas.add(persona);
    }
}
