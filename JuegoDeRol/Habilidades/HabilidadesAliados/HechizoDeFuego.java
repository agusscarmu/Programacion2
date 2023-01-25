package JuegoDeRol.Habilidades.HabilidadesAliados;

import JuegoDeRol.Grupos.Grupo;
import JuegoDeRol.Grupos.Enemigos.Enemigo;

public class HechizoDeFuego extends HechizoElemental{

  

    public HechizoDeFuego(String nombre, int danio, int coste) {
        super(nombre, danio, coste);
        naturaleza="Fuego";
    }
    
    public Grupo ejecutar(Grupo personaje, boolean critico, int mana){
        int impacto;
        if(((Enemigo)personaje).getDebilidad().equals(naturaleza)){
            if(critico){
                impacto=getPoder()+(getPoder()*50/100)+mana;
            }else 
                impacto=getPoder()+(getPoder()*40/100)+mana;
                personaje.impacto(impacto);
        }else{
            if(critico){
                impacto=getPoder()+(getPoder()*30/100)+mana;
            }else{
                impacto=getPoder()+(getPoder()*20/100)+mana; 
            }
            personaje.impacto(impacto);
        }
        return personaje;
    }


}
