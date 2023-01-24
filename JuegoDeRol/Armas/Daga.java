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
        if(critico)
        enemigo.impacto(getDanio()*5+fuerza/2);
        else
        enemigo.impacto(getDanio()+fuerza/2);
        return null;
    }

    @Override
    public int getCritico(){
        return super.getCritico()+(afilado/2);
    }
}
