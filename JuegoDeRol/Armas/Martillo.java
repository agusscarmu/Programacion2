package JuegoDeRol.Armas;

import JuegoDeRol.Grupos.Grupo;

public class Martillo extends Arma {

    private int peso;
    public Martillo(String nombre, int danio, int coste, int peso) {
        super(nombre, danio, coste);
        this.peso=peso;
        critico=0;
    }

    @Override
    public Grupo atacar(Grupo enemigo, boolean critico, int fuerza) {
        if(critico){
            enemigo.impacto(getDanio()+(getDanio()/2)+peso+fuerza);
        }else{
            enemigo.impacto(getDanio()+peso+fuerza);
        }
        return enemigo;
    }

    @Override
    public int getCoste(){
        return super.getCoste()+(peso/2);
    }
    
}
