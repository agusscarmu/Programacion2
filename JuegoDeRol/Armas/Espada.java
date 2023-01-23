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
                daniorealizado=getDanio()*2+fuerza;
                enemigo.impacto(daniorealizado);
                System.out.println("Estocada!");
            }else
                daniorealizado=getDanio()+(getDanio()/3)+fuerza;
                enemigo.impacto(daniorealizado);
        }else{
            if(estocada){
                daniorealizado=getDanio()+(getDanio()/3)+fuerza;
                enemigo.impacto(daniorealizado);
                System.out.println("Estocada!");
            }else
                daniorealizado=getDanio()+fuerza;
                enemigo.impacto(daniorealizado); 
        }
        System.out.println("Danio realizado: "+daniorealizado);

        return enemigo;
    }
    
}
