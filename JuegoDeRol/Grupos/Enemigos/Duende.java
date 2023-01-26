package JuegoDeRol.Grupos.Enemigos;

import java.util.ArrayList;

import JuegoDeRol.Grupos.Grupo;
import JuegoDeRol.Habilidades.Habilidad;
import JuegoDeRol.Habilidades.HabilidadesEnemigos.impactoSimple;

public class Duende extends Enemigo{
    protected Habilidad habilidad1;
    protected Habilidad habilidad;

    public Duende(String nombre, int vida, int defensa, int fuerza, int estamina, int critico) {
        super(nombre, vida, defensa, fuerza, estamina,critico);
        habilidad1=new impactoSimple("Mordida", 15, 20);
        debilidad="Hielo";
    }

    @Override
    public Grupo atacar(Grupo personaje, boolean critico) {
        return habilidad(habilidad1, personaje, critico);
    }
    public int verPoderDeAtaque(){
        return getFuerza();
    }
    public int verVida(){
        return getVida();
    }
    public Grupo habilidad(Habilidad habilidad,Grupo personaje, boolean critico){
        if(getEstamina()>habilidad.getCoste()){
            System.out.println("\n"+getNombre()+" lanza: "+habilidad.getNombre()+" a "+personaje.getNombre());
            habilidad.ejecutar(personaje, critico, (getFuerza()/2));
            cansancio(habilidad.getCoste());
            return personaje;
        }else
            System.out.println("\nEl troll esta cansado!");
            return personaje;
    }

    @Override
    public void agregarIntegrante(Grupo enemigo) {
    }

    @Override
    public ArrayList<Grupo> getGrupo() {
        return null;
    }

    @Override
    public void setRecuperacion(int recuperacion) {
        recuperacion(recuperacion);
    }



    
}
