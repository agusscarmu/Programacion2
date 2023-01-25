package JuegoDeRol.Armas;

import java.util.Random;

import JuegoDeRol.Grupos.Grupo;

public class Lanza extends Espada{

    public Lanza(String nombre, int danio, int coste, int critico) {
        super(nombre, danio, coste, critico);
        this.estocada=false;
        pasiva="Probabilidad de estoque potenciado, pero menos danio si no es estoque";
    }

    @Override
    public Grupo atacar(Grupo enemigo, boolean critico, int fuerza) {
        Random r = new Random();
        estocada=r.nextBoolean();
        if(critico){
            if(estocada){
                enemigo.impacto(getPoder()*3+fuerza);
                System.out.println("Estocada!");
            }else
                enemigo.impacto(getPoder()+(getPoder()/4)+fuerza);
        }else{
            if(estocada){
                enemigo.impacto(getPoder()+(getPoder()/2)+fuerza);
                System.out.println("Estocada!");
            }else
                enemigo.impacto(getPoder()+fuerza); 
        }
        return enemigo;
    }
    
}
