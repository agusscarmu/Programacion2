package EjercicioPuerto;

import java.util.ArrayList;
import java.util.Collections;

public class Puerto {
    private String nombre;
    private boolean cargado;
    private ArrayList<Barco> listaEsperaB;
    private ArrayList<Camion> listaEsperaC;

    public Puerto(ArrayList<Barco> barcos, ArrayList<Camion> camiones){
        this.listaEsperaB=barcos;
        this.listaEsperaC=camiones;
    }
    public Puerto(String nombre){
        this.nombre=nombre;
        this.cargado=false;
        
    }

    public String getNombre(){
        return nombre;
    }
    public boolean getCargado(){
        return cargado;
    }
    public void setCargado(boolean carga){
        cargado=carga;
    }
    
    public void acomodarListaDeEspera(){
        ListaBarcosOrdenada listabarcos = new ListaBarcosOrdenada();
        ListaCamionesOrdenada listacamiones = new ListaCamionesOrdenada();
        Collections.sort(listaEsperaC, listacamiones);
        Collections.sort(listaEsperaB, listabarcos);
    }
    public void cargarBarco(){
        listaEsperaC.remove(listaEsperaC.get(0));
        listaEsperaB.remove(listaEsperaB.get(0));
        
    }
    @Override
    public String toString() {
        return "Barco en espera: "+listaEsperaB.toString()+" Camiones en espera: "+listaEsperaC.toString();
    }
}
