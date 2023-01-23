package JuegoDeRol.Hechizos;

import JuegoDeRol.Personaje;

public abstract class Hechizo {
    private int coste;
    private String nombre;
    private int poder;

    public Hechizo(String nombre, int coste, int poder){
        this.nombre=nombre;
        this.poder=poder;
        this.coste=coste;
   
    }
    public abstract Personaje ejecutar(Personaje personaje, boolean critico);

    public String getNombre(){
        return nombre;
    }
    public int getPoder(){
        return poder;
    }
    public int getCoste(){
        return coste;
    }
}
