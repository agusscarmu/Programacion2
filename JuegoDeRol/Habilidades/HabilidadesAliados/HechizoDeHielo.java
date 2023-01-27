package JuegoDeRol.Habilidades.HabilidadesAliados;

import JuegoDeRol.Grupos.Grupo;
import JuegoDeRol.Grupos.Enemigos.Enemigo;

public class HechizoDeHielo extends HechizoElemental {

    public HechizoDeHielo(String nombre, int poder, int coste) {
        super(nombre, poder, coste);
        naturaleza="Hielo";
    }

    @Override
    public Grupo ejecutar(Grupo personaje, boolean critico, int mana) {
        int impacto;
        if(critico){
            impacto=getPoder()+(mana/2)+mana;
        }else{
            impacto=getPoder()+mana; 
        }
        if(((Enemigo)personaje).getDebilidad().equals(naturaleza)){
            ((Enemigo)personaje).impacto(impacto,danioElemental);
        }else{
            ((Enemigo)personaje).impacto(impacto);
        }
        if(!(personaje.getbuffs().contains("Descongelado"))){
        personaje.debuff("Congelado");
        }else{
            System.out.println("No se pudo congelar en este turno");
        }
        return personaje;
    }

    @Override
    public Grupo ejecutar(Grupo personaje, boolean critico, int fuerza, Grupo jugador) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
