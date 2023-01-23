package JuegoDeRol.Habilidades.HabilidadesAliados;

import JuegoDeRol.Personaje;
import JuegoDeRol.Grupos.Grupo;
import JuegoDeRol.Grupos.Enemigos.Enemigo;
import JuegoDeRol.Habilidades.Habilidad;
import JuegoDeRol.Habilidades.HabilidadOfensiva;

public class HechizoDeFuego extends HabilidadOfensiva{

    final static String naturaleza="Fuego";
  

    public HechizoDeFuego(String nombre, int danio, int coste) {
        super(nombre, danio, coste);
    }
    
    public Grupo ejecutar(Grupo personaje, boolean critico){
        int impacto;
        if(((Enemigo)personaje).getDebilidad().equals(naturaleza)){
            if(critico){
                impacto=getPoder()+(getPoder()*50/100);
            }else 
                impacto=getPoder()+(getPoder()*40/100);
                personaje.impacto(impacto);
                System.out.println("Impacto de fuego: "+impacto+"!");
        }else{
            if(critico){
                impacto=getPoder()+(getPoder()*30/100);
            }else{
                impacto=getPoder()+(getPoder()*20/100); 
            }
            personaje.impacto(impacto);
            System.out.println("Impacto de fuego: "+impacto+"!");
        }
        return personaje;
    }
}
