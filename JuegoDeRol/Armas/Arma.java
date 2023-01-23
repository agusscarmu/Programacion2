package JuegoDeRol.Armas;

import JuegoDeRol.Grupos.Grupo;

public abstract class Arma{
    private String nombre;
    private int danio;
    private int coste;
    protected int critico; 
    protected int daniorealizado;

    public Arma(String nombre, int danio, int coste) {
        this.nombre=nombre;
        this.danio=danio;
        this.coste = coste;
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
    public abstract Grupo atacar(Grupo grupo, boolean critico, int fuerza);
}
