package JuegoDeRol.Habilidades.HabilidadesAliados;

import JuegoDeRol.Grupos.Grupo;
import JuegoDeRol.Grupos.Aliados.Jugador;
import JuegoDeRol.Grupos.Enemigos.Enemigo;

public class HechizoDeSangre extends HechizoElemental{

    public HechizoDeSangre(String nombre, int poder, int coste) {
        super(nombre, poder, coste);
        naturaleza="Sangre";
        autoCurativo=true;
    }

    @Override
    public Grupo ejecutar(Grupo personaje, boolean critico, int fuerza, Grupo jugador) {
        int impacto;
        if(critico){
            impacto=getPoder()+(((Jugador)jugador).getVidaMaxima()/5);
            ((Jugador)jugador).curacion(impacto*30/100);
            System.out.println("Autocuracion por sangre de "+impacto*30/100);
        }else{
            impacto=getPoder()+(((Jugador)jugador).getVidaMaxima()/6);
            ((Jugador)jugador).curacion(impacto*15/100);
            System.out.println("Autocuracion por sangre de "+impacto*30/100);
        }
        if(((Enemigo)personaje).getDebilidad().equals(naturaleza)){
            ((Enemigo)personaje).impacto(impacto, danioElemental);
        }else{
            ((Enemigo)personaje).impacto(impacto);}
        return personaje;
    }

    @Override
    public Grupo ejecutar(Grupo personaje, boolean critico, int fuerza) {
        // TODO Auto-generated method stub
        return null;
    }

    
}
