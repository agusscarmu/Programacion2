package JuegoDeRol.Habilidades.HabilidadesEnemigos;

import JuegoDeRol.Grupos.Grupo;
import JuegoDeRol.Grupos.Aliados.Jugador;
import JuegoDeRol.Habilidades.HabilidadOfensiva;

public class Grito extends HabilidadOfensiva{

    public Grito(String nombre, int danio, int coste){
        super(nombre, danio, coste);
    }
    
    public Grupo ejecutar(Grupo personaje, boolean critico, int fuerza){
        ((Jugador)personaje).cansancio(getPoder()+fuerza);
        System.out.println("Aturdido por grito, estamina: -"+getPoder()+fuerza);
        if(critico)
        ((Jugador)personaje).impacto(getPoder()+fuerza);
        else
        ((Jugador)personaje).impacto(getPoder()/2+fuerza);
        System.out.println("Te sangran los oidos");
        return personaje;
    }

    @Override
    public Grupo ejecutar(Grupo personaje, boolean critico, int fuerza, Grupo jugador) {
        // TODO Auto-generated method stub
        return null;
    }
}
