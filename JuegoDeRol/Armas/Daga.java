package JuegoDeRol.Armas;

import JuegoDeRol.Grupos.Grupo;

public class Daga extends Arma{

    private int afilado;
    public Daga(String nombre, int danio, int coste, int afilado) {
        super(nombre, danio, coste);
        critico=4;
    }

    @Override
    public Grupo atacar(Grupo enemigo, boolean critico, int fuerza) {
        if(critico){
        daniorealizado=getDanio()*5+fuerza/2;
        enemigo.impacto(daniorealizado);
        }else{
        daniorealizado=getDanio()+fuerza/2;
        enemigo.impacto(daniorealizado);
        }
        System.out.println("Danio realizado: "+daniorealizado);

        return enemigo;
    }

    @Override
    public int getCritico(){
        return super.getCritico()+(afilado/2);
    }
    
}
