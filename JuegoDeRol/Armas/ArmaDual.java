package JuegoDeRol.Armas;

import JuegoDeRol.Grupos.Grupo;

public class ArmaDual extends Arma{

    public ArmaDual(String nombre, int danio, int coste, int critico) {
        super(nombre, danio, coste);
        this.critico=critico;
        pasiva="Ataca dos veces";
    }

    @Override
    public Grupo atacar(Grupo enemigo, boolean critico, int fuerza) {
        if(critico)
        enemigo.impacto(getPoder()*2+fuerza);
        else
        enemigo.impacto(getPoder()+(getPoder()/2)+fuerza);
        return enemigo;
    }
    
}
