package JuegoDeRol.Armas;

import JuegoDeRol.Grupos.Grupo;

public class ArmaDual extends Arma{

    public ArmaDual(String nombre, int danio, int coste, int critico) {
        super(nombre, danio, coste);
        this.critico=critico;
    }

    @Override
    public Grupo atacar(Grupo enemigo, boolean critico, int fuerza) {
        if(critico){
        daniorealizado=getDanio()*2+fuerza;
        enemigo.impacto(daniorealizado);
        }else{
        daniorealizado=getDanio()+(getDanio()/2)+fuerza;
        enemigo.impacto(daniorealizado);
        }
        System.out.println("Danio realizado: "+daniorealizado);
        return enemigo;
    }
    
}
