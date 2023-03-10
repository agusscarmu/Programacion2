package JuegoDeRol.Habilidades.HabilidadesAliados;

import JuegoDeRol.Grupos.Grupo;
import JuegoDeRol.Grupos.Aliados.Jugador;
import JuegoDeRol.Habilidades.HabilidadDefensiva;

public class HechizoCurativo extends HabilidadDefensiva {

    public HechizoCurativo(String nombre, int poder, int coste) {
        super(nombre, poder, coste);
        
    }

    @Override
    public Grupo ejecutar(Grupo personaje, boolean critico, int vida) {
        if(critico)
            ((Jugador)personaje).curacion(getPoder()*2+vida);
        else
            ((Jugador)personaje).curacion(getPoder()+vida);

        return personaje;
    }

    @Override
    public Grupo ejecutar(Grupo personaje, boolean critico, int fuerza, Grupo jugador) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
