package JuegoDeRol.Habilidades.HabilidadesEnemigos;

import JuegoDeRol.Personaje;
import JuegoDeRol.Grupos.Grupo;
import JuegoDeRol.Habilidades.Habilidad;
import JuegoDeRol.Habilidades.HabilidadOfensiva;

public class Pisada extends HabilidadOfensiva{

    public Pisada(String nombre, int poder, int coste) {
        super(nombre, poder, coste);
    }

    @Override
    public Grupo ejecutar(Grupo personaje, boolean critico) {
        if(critico){
        personaje.impacto(getPoder()*2);
        System.out.println("Fuiste pisado, vida: -"+getPoder()*2);
        }else{
        personaje.impacto(getPoder());
        System.out.println("Fuiste pisado, vida: -"+getPoder());
        }
        return personaje;
    }
    
}
