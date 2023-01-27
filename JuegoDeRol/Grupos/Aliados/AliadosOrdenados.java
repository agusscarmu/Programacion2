package JuegoDeRol.Grupos.Aliados;

import java.util.Comparator;

import JuegoDeRol.Grupos.Grupo;

public class AliadosOrdenados implements Comparator<Grupo>{

    @Override
    public int compare(Grupo o1, Grupo o2) {
        return ((Jugador)o2).getIninciativa()-((Jugador)o1).getIninciativa();
    }
    
}
