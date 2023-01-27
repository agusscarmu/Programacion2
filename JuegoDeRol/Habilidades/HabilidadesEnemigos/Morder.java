package JuegoDeRol.Habilidades.HabilidadesEnemigos;

import JuegoDeRol.Grupos.Grupo;
import JuegoDeRol.Grupos.Aliados.Jugador;
import JuegoDeRol.Habilidades.HabilidadOfensiva;

public class Morder extends HabilidadOfensiva{

    public Morder(String nombre, int poder, int coste) {
        super(nombre, poder, coste);
        //TODO Auto-generated constructor stub
    }




    //HABILIDAD A DESARROLLAR (CUANDO PONGA DEFUBFFS)





    @Override
    public Grupo ejecutar(Grupo personaje, boolean critico, int fuerza) {
        if(critico){
            ((Jugador)personaje).impacto(getPoder()*2+fuerza);
            System.out.println("Fuiste mordido, vida: -"+getPoder()*2+fuerza);
        }else{
            ((Jugador)personaje).impacto(getPoder()+fuerza);
            System.out.println("Fuiste mordido, vida: -"+getPoder()+fuerza);
        }
            return personaje;
    }

    @Override
    public Grupo ejecutar(Grupo personaje, boolean critico, int fuerza, Grupo jugador) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
