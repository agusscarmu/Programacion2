package JuegoDeRol.Habilidades.HabilidadesEnemigos;

import JuegoDeRol.Grupos.Grupo;
import JuegoDeRol.Habilidades.HabilidadOfensiva;

public class Pisada extends HabilidadOfensiva{

    public Pisada(String nombre, int poder, int coste) {
        super(nombre, poder, coste);
    }

    @Override
    public Grupo ejecutar(Grupo personaje, boolean critico, int fuerza) {
        if(critico){
        personaje.impacto(getPoder()*2+fuerza);
        System.out.println("Fuiste pisado, vida: -"+getPoder()*2);
        }else{
        personaje.impacto(getPoder()+fuerza);
        System.out.println("Fuiste pisado, vida: -"+getPoder());
        }
        return personaje;
    }

    @Override
    public Grupo ejecutar(Grupo personaje, boolean critico, int fuerza, Grupo jugador) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
