package JuegoDeRol.Habilidades;

import JuegoDeRol.ElementosUtilizables;
import JuegoDeRol.Grupos.Grupo;
import JuegoDeRol.Grupos.Aliados.Jugador;

public abstract class Habilidad extends ElementosUtilizables{
    protected boolean ofensivo;
    protected boolean autoCurativo;

    public Habilidad(String nombre, int poder, int coste){
        super(nombre, poder, coste);
    }
    public abstract Grupo ejecutar(Grupo personaje, boolean critico, int fuerza);
    public abstract Grupo ejecutar(Grupo personaje, boolean critico, int fuerza, Grupo jugador);

    public boolean esOfensivo(){
        return ofensivo;
    }
    public boolean autoCurativo(){
        return autoCurativo;
    }

    @Override
    public String toString() {
        return "Nombre del hechizo: "+getNombre()+", Poder: "+getPoder()+", Coste: "+getNombre();
    }
}
