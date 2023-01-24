package JuegoDeRol.Armas;

import JuegoDeRol.Grupos.Grupo;

public class ArmaDual extends Arma{

    public ArmaDual(String nombre, int danio, int coste, int critico) {
        super(nombre, danio, coste);
        this.critico=critico;
    }

    @Override
    public Grupo atacar(Grupo enemigo, boolean critico, int fuerza) {
        if(critico)
        enemigo.impacto(getDanio()*2+fuerza);
        else
        enemigo.impacto(getDanio()+(getDanio()/2)+fuerza);
        return enemigo;
    }
    
}
