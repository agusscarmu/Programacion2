package JuegoDeRol.Habilidades;

import JuegoDeRol.ElementosUtilizables;
import JuegoDeRol.Grupos.Grupo;

public abstract class Habilidad extends ElementosUtilizables{
    protected boolean ofensivo;

    public Habilidad(String nombre, int poder, int coste){
        super(nombre, poder, coste);
    }
    public abstract Grupo ejecutar(Grupo personaje, boolean critico, int fuerza);
    
    public boolean esOfensivo(){
        return ofensivo;
    }

    @Override
    public String toString() {
        return "Nombre del hechizo: "+getNombre()+", Poder: "+getPoder()+", Coste: "+getNombre();
    }
}
