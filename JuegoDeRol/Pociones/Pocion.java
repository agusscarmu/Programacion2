package JuegoDeRol.Pociones;

import JuegoDeRol.ElementosUtilizables;
import JuegoDeRol.Personaje;

public abstract class Pocion extends ElementosUtilizables {

    private int usos;
    private int capacidadMaxima;
    public Pocion(String nombre, int poder, int coste, int usos) {
        super(nombre, poder, coste);
        this.usos=usos;
        this.capacidadMaxima=usos;
    }
    public int getUsos(){
        return usos;
    }
    public int getUsosMaximos(){
        return capacidadMaxima;
    }
    public void uso(){
        usos--;
    }

    public void cargarUsos(){
        usos=capacidadMaxima;
    }

    public abstract void usar(Personaje personaje);

    @Override
    public abstract String toString();
}
