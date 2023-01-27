package JuegoDeRol.Grupos;

import java.util.ArrayList;

import JuegoDeRol.Personaje;

public abstract class Grupo extends Personaje{

    public Grupo(String nombre) {
        super(nombre);
    }
    public abstract void agregarIntegrante(Grupo personaje);
    public abstract int verPoderDeAtaque();
    public abstract int verVida();
    public abstract ArrayList<Grupo> getGrupo();
    public abstract void setRecuperacion(int recuperacion);
    public abstract void ordenar();
}
