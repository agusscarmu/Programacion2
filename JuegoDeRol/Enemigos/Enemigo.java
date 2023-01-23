package JuegoDeRol.Enemigos;

import java.util.ArrayList;

import JuegoDeRol.Personaje;

public abstract class Enemigo extends Personaje implements ElementoHostil{
    private String debilidad;

    public Enemigo(String nombre, int vida, int fuerza, int estamina, String debilidad, int critico) {
        super(nombre, vida, fuerza, estamina,critico);
        this.debilidad=debilidad;

    }
    @Override
    public abstract int verPoderDeAtaque();

    @Override
    public abstract Personaje atacar(Personaje personaje, boolean critico);

    @Override
    public abstract void agregarEnemigos(ElementoHostil enemigo);

    public String getDebilidad(){
        return debilidad;
    }

}
