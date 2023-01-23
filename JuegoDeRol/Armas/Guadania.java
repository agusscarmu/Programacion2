package JuegoDeRol.Armas;

import JuegoDeRol.Grupos.Grupo;

public class Guadania extends Arma {

    private final int porcentajeDeArmaduraRobada=50;
    public Guadania(String nombre, int danio, int coste) {
        super(nombre, danio, coste);
        critico=0;
    }

    @Override
    public Grupo atacar(Grupo enemigo, boolean critico, int fuerza) {
        if(critico){
        daniorealizado=getDanio()+fuerza;
        enemigo.impacto(daniorealizado,(porcentajeDeArmaduraRobada*2));
        }
        else{
        daniorealizado=getDanio()+fuerza;
        enemigo.impacto(daniorealizado,porcentajeDeArmaduraRobada);
        }
        System.out.println("Danio realizado: "+daniorealizado);

        return enemigo;
    }
    
}
