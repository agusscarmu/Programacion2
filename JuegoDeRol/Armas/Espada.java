package JuegoDeRol.Armas;

import java.util.Random;

import JuegoDeRol.Grupos.Grupo;
import JuegoDeRol.Grupos.Enemigos.Enemigo;

public class Espada extends Arma {

    protected boolean estocada;
    public Espada(String nombre, int danio, int coste, int critico) {
        super(nombre, danio, coste);
        this.critico=critico;
        this.estocada=false;
        pasiva="Probabilidad de estoque";
    }

    @Override
    public Grupo atacar(Enemigo enemigo, boolean critico, int fuerza) {
        Random r = new Random();
        estocada=r.nextBoolean();
        if(critico){
            if(estocada){
                enemigo.impacto(getPoder()*2+fuerza);
                System.out.println("Estocada!");
            }else
                enemigo.impacto(getPoder()+(getPoder()/3)+fuerza);
        }else{
            if(estocada){
                enemigo.impacto(getPoder()+(getPoder()/3)+fuerza);
                System.out.println("Estocada!");
            }else
                enemigo.impacto(getPoder()+fuerza); 
        }
        return enemigo;
    }
    
}
