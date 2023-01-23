package JuegoDeRol.Grupos.Enemigos;

import java.util.Comparator;

import JuegoDeRol.Grupos.Grupo;

public class SalasOrdenadas implements Comparator<Grupo> {

    @Override
    public int compare(Grupo o1, Grupo o2) {
        return o1.verPoderDeAtaque()-o2.verPoderDeAtaque();
    }
    
}
