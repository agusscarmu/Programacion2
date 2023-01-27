package JuegoDeRol.Habilidades.HabilidadesEnemigos;

import JuegoDeRol.Grupos.Grupo;
import JuegoDeRol.Grupos.Aliados.Jugador;
import JuegoDeRol.Habilidades.HabilidadOfensiva;

public class impactoSimple extends HabilidadOfensiva{

    public impactoSimple(String nombre, int poder, int coste) {
        super(nombre, poder, coste);
    }

    @Override
    public Grupo ejecutar(Grupo personaje, boolean critico, int fuerza) {
        if(critico){
            ((Jugador)personaje).impacto(getPoder()*2+fuerza);
        System.out.println("Vida: -"+getPoder()*2);
        }else{
            ((Jugador)personaje).impacto(getPoder()+fuerza);
        System.out.println("Vida: -"+getPoder());
        }
        return personaje;
    }

    @Override
    public Grupo ejecutar(Grupo personaje, boolean critico, int fuerza, Grupo jugador) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
