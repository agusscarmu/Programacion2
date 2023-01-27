package JuegoDeRol.Armas;

import JuegoDeRol.Grupos.Grupo;
import JuegoDeRol.Grupos.Enemigos.Enemigo;

public class Daga extends Arma{

    private int afilado;
    public Daga(String nombre, int danio, int coste, int afilado) {
        super(nombre, danio, coste);
        critico=4;
        pasiva="Potencia enormemente los criticos";
    }

    @Override
    public Grupo atacar(Enemigo enemigo, boolean critico, int fuerza) {
        if(critico)
        enemigo.impacto(getPoder()*5+fuerza/2);
        else
        enemigo.impacto(getPoder()+fuerza/2);
        return null;
    }

    @Override
    public int getCritico(){
        return super.getCritico()+(afilado/2);
    }
}
