package JuegoDeRol.Pociones;

import JuegoDeRol.Personaje;
import JuegoDeRol.Grupos.Aliados.Jugador;

public class PocionDeVida extends Pocion{

    public PocionDeVida(String nombre, int poder, int coste, int usos) {
        super(nombre, poder, coste, usos);
        
    }

    @Override
    public void usar(Personaje personaje) {
        ((Jugador)personaje).curacion(getPoder());
        uso();
    }
    @Override
    public String toString() {
        return "Pocion: "+getNombre()+", recupera "+getPoder()+" de vida, Usos: "+getUsos()+"/"+getUsosMaximos();
    }
}
