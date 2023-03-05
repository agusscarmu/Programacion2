package PrefinalNoticias;

import java.util.ArrayList;

import PrefinalNoticias.Condicion.Condicion;

public class Seccion extends Portal{

    
    private int valBusqueda;
    private ArrayList<Portal>elementos;
    public Seccion(int valBusqueda){
        this.elementos=new ArrayList<>();
        this.valBusqueda=valBusqueda;
    }


    public void setValBusqueda(int valBusquedaNuevo){
        valBusqueda=valBusquedaNuevo;
    }

    public void addElemento(Portal e){
        elementos.add(e);
    }

    @Override
    public String getTema() {
        if(valBusqueda>0 && valBusqueda<=elementos.size()){
            return elementos.get(valBusqueda).getTema();
        }else if(elementos.size()>0){
            return elementos.get(0).getTema();
        }else{
            return null;
        }
    }

// Esto esta mal!! porque estoy devolviendo una lista plana de los elementos, no respeto estructura.
    // @Override
    // public ArrayList<Portal> getCopia(Condicion c) {
    //     ArrayList<Portal>copia=new ArrayList<>();
    //     if(elementos.size()>0){
    //             copia.add(this);
            
    //         for(Portal e:elementos){
    //             copia.addAll(e.getCopia(c));
    //         }
    //     }
    //     return copia;
    // }
// ASI ESTA BIEN:
    @Override
    public Portal getCopia(Condicion c){
        ArrayList<Portal>hijosCumplen=new ArrayList<>();
        for(Portal e:elementos){
            hijosCumplen.add(e.getCopia(c));
        }
        if(hijosCumplen.isEmpty()){
            return null;
        }
        Seccion seccionCopia = new Seccion(this.valBusqueda);
        for(Portal h:hijosCumplen){
            seccionCopia.addElemento(h);
        }
        return seccionCopia;
    }

    @Override
    public int getCantidadNoticias(Condicion c) {
        int cantidad=0;
        for(Portal e:elementos){
            cantidad+=e.getCantidadNoticias(c);
        }
        return cantidad;
    }
    

    
}
