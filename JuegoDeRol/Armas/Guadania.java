package JuegoDeRol.Armas;

import JuegoDeRol.Grupos.Grupo;
import JuegoDeRol.Grupos.Enemigos.Enemigo;

public class Guadania extends Arma {

    private final int porcentajeDeArmaduraRobada=50;
    public Guadania(String nombre, int danio, int coste) {
        super(nombre, danio, coste);
        critico=0;
        pasiva="Ignora la armadura enemiga";
    }

    @Override
    public Grupo atacar(Enemigo enemigo, boolean critico, int fuerza) {
        if(critico)
        enemigo.impacto((getPoder()+fuerza),(porcentajeDeArmaduraRobada*2));
        else
        enemigo.impacto((getPoder()+fuerza),porcentajeDeArmaduraRobada);
        return enemigo;
    }
    
}
