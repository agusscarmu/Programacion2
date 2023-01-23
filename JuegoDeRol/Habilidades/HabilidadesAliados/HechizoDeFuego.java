package JuegoDeRol.Habilidades.HabilidadesAliados;

import JuegoDeRol.Personaje;
import JuegoDeRol.Enemigos.Enemigo;
import JuegoDeRol.Habilidades.Habilidad;

public class HechizoDeFuego extends Habilidad{

    final static String naturaleza="Fuego";
  

    public HechizoDeFuego(String nombre, int danio, int coste) {
        super(nombre, danio, coste);
    }
    
    public Personaje ejecutar(Personaje personaje, boolean critico){
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
