package JuegoDeRol.Armas;

import java.util.Random;

import JuegoDeRol.Grupos.Grupo;

public class Espada extends Arma {

    protected boolean estocada;
    public Espada(String nombre, int danio, int coste, int critico) {
        super(nombre, danio, coste);
        this.critico=critico;
        this.estocada=false;
    }

    @Override
    public Grupo atacar(Grupo enemigo, boolean critico, int fuerza) {
        Random r = new Random();
        estocada=r.nextBoolean();
        if(critico){
            if(estocada){
                enemigo.impacto(getDanio()*2+fuerza);
                System.out.println("Estocada!");
            }else
                enemigo.impacto(getDanio()+(getDanio()/3)+fuerza);
        }else{
            if(estocada){
                enemigo.impacto(getDanio()+(getDanio()/3)+fuerza);
                System.out.println("Estocada!");
            }else
                enemigo.impacto(getDanio()+fuerza); 
        }
        return enemigo;
    }
    
}
