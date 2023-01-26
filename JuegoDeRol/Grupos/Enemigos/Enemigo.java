package JuegoDeRol.Grupos.Enemigos;

import JuegoDeRol.Grupos.Grupo;

public abstract class Enemigo extends Grupo{
    protected String debilidad;

    public Enemigo(String nombre, int vida, int defensa,int fuerza, int estamina, int critico) {
        super(nombre, vida, defensa,fuerza, estamina,critico);
        this.debilidad="";

    }
    @Override
    public abstract int verPoderDeAtaque();

    @Override
    public abstract void agregarIntegrante(Grupo enemigo);

    public String getDebilidad(){
        return debilidad;
    }

}
