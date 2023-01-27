package JuegoDeRol.Armas;

import JuegoDeRol.Grupos.Grupo;
import JuegoDeRol.Grupos.Enemigos.Enemigo;

public class Martillo extends Arma {

    private int peso;
    public Martillo(String nombre, int danio, int coste, int peso) {
        super(nombre, danio, coste);
        this.peso=peso;
        critico=0;
        pasiva="Aumenta enormemente el danio en base al peso, pero tambien su coste";
    }

    @Override
    public Grupo atacar(Enemigo enemigo, boolean critico, int fuerza) {
        if(critico){
            enemigo.impacto(getPoder()+(getPoder()/2)+peso+fuerza);
        }else{
            enemigo.impacto(getPoder()+peso+fuerza);
        }
        return enemigo;
    }

    @Override
    public int getCoste(){
        return super.getCoste()+(peso/2);
    }
    
}
