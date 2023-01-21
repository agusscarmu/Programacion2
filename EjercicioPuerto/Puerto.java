package EjercicioPuerto;

import java.util.ArrayList;
import java.util.Collections;

public class Puerto {
    private String nombre;
    private ArrayList<Comparable> barcos;
    private ArrayList<Comparable> camiones;
    private ArrayList<Barco> barcosCargados;
    
    public Puerto(){
        this.barcos=new ArrayList<>();
        this.camiones= new ArrayList<>();
        this.barcosCargados=new ArrayList<>();
    }

    public void agregarBarco(Barco barco){
        barcos.add(barco);
    }
    public void agregarCamion(Camion camion){
        camiones.add(camion);
    }
    public String getNombre(){
        return nombre;
    }
    public void acomodarListaDeEspera(){
        Collections.sort(barcos);
        Collections.sort(camiones);

    }
    public void cargarBarco(){
        camiones.remove(camiones.get(0));
        barcosCargados.add((Barco)barcos.get(0));
        barcos.remove(barcos.get(0));
        
    }
    @Override
    public String toString() {
        return "Barco en espera: "+barcos.toString()+" Camiones en espera: "+camiones.toString()+"\n Barcos cargados: "+barcosCargados.toString();
    }
}
