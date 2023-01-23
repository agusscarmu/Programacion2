package JuegoDeRol.Enemigos;

import JuegoDeRol.Personaje;

public abstract class Enemigo extends Personaje {
    private String debilidad;

    public Enemigo(String nombre, int vida, int fuerza, int estamina, String debilidad, int critico) {
        super(nombre, vida, fuerza, estamina,critico);
        this.debilidad=debilidad;

    }
    public String getDebilidad(){
        return debilidad;
    }
}
