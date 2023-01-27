package JuegoDeRol.Pociones;

import JuegoDeRol.Personaje;
import JuegoDeRol.Grupos.Aliados.Jugador;

public class PocionDeMana extends Pocion{

    public PocionDeMana(String nombre, int poder, int coste, int usos) {
        super(nombre, poder, coste, usos);
    }

    @Override
    public void usar(Personaje personaje) {
        ((Jugador)personaje).recuperarMana(getPoder());
        uso();
    }
    
    @Override
    public String toString() {
        return "Pocion: "+getNombre()+", recupera "+getPoder()+" de mana, Usos: "+getUsos()+"/"+getUsosMaximos();
    }
}
