package JuegoDeRol.Habilidades.HabilidadesAliados;

import JuegoDeRol.Grupos.Grupo;
import JuegoDeRol.Habilidades.HabilidadDefensiva;

public class HechizoCurativo extends HabilidadDefensiva {

    public HechizoCurativo(String nombre, int poder, int coste) {
        super(nombre, poder, coste);
        
    }

    @Override
    public Grupo ejecutar(Grupo personaje, boolean critico, int vida) {
        if(critico)
            personaje.curacion(getPoder()*2+vida);
        else
            personaje.curacion(getPoder()+vida);

        return personaje;
    }
    
}
