package JuegoDeRol.Habilidades.HabilidadesEnemigos;

import JuegoDeRol.Personaje;
import JuegoDeRol.Grupos.Grupo;
import JuegoDeRol.Habilidades.Habilidad;
import JuegoDeRol.Habilidades.HabilidadOfensiva;

public class Grito extends HabilidadOfensiva{

    public Grito(String nombre, int danio, int coste){
        super(nombre, danio, coste);
    }
    
    public Grupo ejecutar(Grupo personaje, boolean critico){
        personaje.cansancio(getPoder());
        System.out.println("Aturdido por grito, estamina: -"+getPoder());
        if(critico)
        personaje.impacto(getPoder());
        else
        personaje.impacto(getPoder()/2);
        System.out.println("Te sangran los oidos, vida: -"+getPoder()/2);
        return personaje;
    }
}
