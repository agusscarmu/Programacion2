package JuegoDeRol.Habilidades;

import JuegoDeRol.Personaje;

public class Grito extends Habilidad{

    public Grito(String nombre, int danio, int coste){
        super(nombre, danio, coste);
    }
    
    public Personaje ejecutar(Personaje personaje, boolean critico){
        personaje.cansancio(getPoder());
        System.out.println("Aturdido por grito, estamina: -"+getPoder());
        if(critico)
        personaje.impacto(getPoder());
        else
        personaje.impacto(getPoder()/2);
        System.out.println("Te sangran los oidos, vida: -"+getPoder()/2);
        return personaje;
    }
}
