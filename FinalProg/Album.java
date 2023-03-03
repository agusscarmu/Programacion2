package FinalProg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

import FinalProg.Condiciones.Cond;

public class Album extends Carpeta{

    protected ArrayList<Carpeta>elementos;
    private Ordenanza ordenanza;
    public Album(String titulo, Date fecha) {
        super(titulo, fecha);
        elementos=new ArrayList<>();
        ordenanza=new Ordenanza();
    }

    public void addElemento(Carpeta elemento){
        elementos.add(elemento);
        ordenar();
    }

    public int getPeso(){
        int p=0;
        for(Carpeta e:elementos){
            p+=e.getPeso();
        }
        return p;
    }    
    @Override
    public ArrayList<String> getListaPersonas(){
        ArrayList<String>listado=new ArrayList<>();
        for(Carpeta e:elementos){
            ArrayList<String>list=new ArrayList<>(e.getListaPersonas());
            for(String l:list){
                if(!listado.contains(l)){
                    listado.add(l);
                }
            }
        }
        return listado;
    }

    @Override
    public ArrayList<Carpeta> getCopiaConCondicion(Cond c){
        ArrayList<Carpeta>copia=new ArrayList<>();
        if(elementos.size()>0){
                copia.add(this);
            
            for(Carpeta e:elementos){
                copia.addAll(e.getCopiaConCondicion(c));
            }
        }
        return copia;
    }

    @Override
    public int getCantidadElementos(){
        int cantidad=0;
        for(Carpeta e:elementos){
            cantidad+=e.getCantidadElementos();
        }
        return cantidad;
    }
    public void ordenar(){
        Collections.sort(elementos, ordenanza);
    }

    

}
