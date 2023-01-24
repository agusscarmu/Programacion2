package JuegoDeRol.Grupos.Enemigos;

import JuegoDeRol.Grupos.Grupo;

public abstract class Enemigo extends Grupo{
    private String debilidad;

    public Enemigo(String nombre, int vida, int defensa,int fuerza, int estamina, String debilidad, int critico) {
        super(nombre, vida, defensa,fuerza, estamina,critico);
        this.debilidad=debilidad;

    }
    @Override
    public abstract int verPoderDeAtaque();

    @Override
    public abstract void agregarIntegrante(Grupo enemigo);

    public String getDebilidad(){
        return debilidad;
    }

}
