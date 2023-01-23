package JuegoDeRol.Armas;

import JuegoDeRol.Ofensivo;

public class Arma{
    private String nombre;
    private int danio;
    private int coste;
    protected int critico; 

    public Arma(String nombre, int danio, int coste, int critico) {
        this.nombre=nombre;
        this.danio=danio;
        this.coste = coste;
        this.critico=critico;
    }
    public String getNombre(){
        return nombre;
    }
    public int getDanio(){
        return danio;
    }
    public int getCoste(){
        return coste;
    }
    public int getCritico(){
        return critico;
    }
}
