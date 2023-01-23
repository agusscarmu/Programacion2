package JuegoDeRol.Habilidades;

import JuegoDeRol.Personaje;

public class Pisada extends Habilidad{

    public Pisada(String nombre, int poder, int coste) {
        super(nombre, poder, coste);
    }

    @Override
    public Personaje ejecutar(Personaje personaje, boolean critico) {
        if(critico){
        personaje.impacto(getPoder()*2);
        System.out.println("Fuiste pisado, vida: -"+getPoder()*2);
        }else{
        personaje.impacto(getPoder());
        System.out.println("Fuiste pisado, vida: -"+getPoder());
        }
        return personaje;
    }
    
}
