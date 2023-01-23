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
            daniorealizado=getDanio()+(getDanio()/2)+peso+fuerza;
            enemigo.impacto(daniorealizado);
        }else{
            daniorealizado=getDanio()+peso+fuerza;
            enemigo.impacto(daniorealizado);
        }
        System.out.println("Danio realizado: "+daniorealizado);

        return enemigo;
    }

    @Override
    public int getCoste(){
        return super.getCoste()+(peso/2);
    }
    
}
