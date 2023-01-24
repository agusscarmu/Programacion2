package JuegoDeRol.Habilidades;

import JuegoDeRol.Grupos.Grupo;

public abstract class Habilidad {
    private String nombre;
    private int poder;
    private int coste;
    protected boolean ofensivo;

    public Habilidad(String nombre, int poder, int coste){
        this.nombre=nombre;
        this.poder=poder;
        this.coste=coste;
    }
    public abstract Grupo ejecutar(Grupo personaje, boolean critico, int fuerza);
    
    public int getPoder(){
        return poder;
    }
    public String getNombre(){
        return nombre;
    }
    public int getCoste(){
        return coste;
    }
    
    public boolean esOfensivo(){
        return ofensivo;
    }
}
