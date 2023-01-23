package JuegoDeRol.Grupos;

import java.util.ArrayList;

import JuegoDeRol.Personaje;

public abstract class Grupo extends Personaje{

    public Grupo(){}
    public Grupo(String nombre, int vida, int defensa,int fuerza, int estamina,int critico){
        super(nombre, vida, defensa,fuerza, estamina, critico);
    }
    public abstract void agregarIntegrante(Grupo enemigo);
    public abstract int verPoderDeAtaque();
    public abstract int verVida();
    public abstract ArrayList<Grupo> getGrupo();
    public abstract void setRecuperacion(int recuperacion);
}
