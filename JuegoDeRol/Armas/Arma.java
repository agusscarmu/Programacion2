package JuegoDeRol.Armas;

import JuegoDeRol.ElementosUtilizables;
import JuegoDeRol.Grupos.Grupo;
import JuegoDeRol.Grupos.Enemigos.Enemigo;

public abstract class Arma extends ElementosUtilizables{
    protected int critico; 
    protected int daniorealizado;
    protected String pasiva;

    public Arma(String nombre, int danio, int coste) {
        super(nombre, danio, coste);
    }
    public int getCritico(){
        return critico;
    }
    @Override
    public String toString() {
        return "Arma: "+getNombre()+", Danio: "+getPoder()+", Coste: "+getCoste()+", Pasiva: "+pasiva;
    }
    public abstract Grupo atacar(Enemigo grupo, boolean critico, int fuerza);
}
