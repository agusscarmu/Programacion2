package JuegoDeRol.Habilidades;

import JuegoDeRol.Personaje;

public abstract class Habilidad {
    private String nombre;
    private int poder;
    private int coste;

    public Habilidad(String nombre, int poder, int coste){
        this.nombre=nombre;
        this.poder=poder;
        this.coste=coste;
    }
    public abstract Personaje ejecutar(Personaje personaje, boolean critico);
    
    public int getPoder(){
        return poder;
    }
    public String getNombre(){
        return nombre;
    }
    public int getCoste(){
        return coste;
    }
}
