package JuegoDeRol.Grupos.Aliados;

import JuegoDeRol.Armas.Arma;
import JuegoDeRol.Habilidades.Habilidad;

public class AliadoNoJugable extends Jugador{

    public AliadoNoJugable(String nombre, int vida, int defensa,int mana, int estamina, int fuerza, Arma arma, Habilidad hechizo,
            int critico) {
        super(nombre, vida, defensa, mana, estamina, fuerza, arma, hechizo, critico);
    }
    

}
