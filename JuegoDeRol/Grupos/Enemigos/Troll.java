package JuegoDeRol.Grupos.Enemigos;

import java.util.ArrayList;

import JuegoDeRol.Dado;
import JuegoDeRol.Grupos.Grupo;
import JuegoDeRol.Habilidades.Habilidad;
import JuegoDeRol.Habilidades.HabilidadesEnemigos.Grito;
import JuegoDeRol.Habilidades.HabilidadesEnemigos.Pisada;

public class Troll extends Enemigo{
    protected Habilidad habilidad1;
    protected Habilidad habilidad2;

    public Troll(String nombre, int vida, int defensa, int fuerza, int estamina, String debilidad, int critico) {
        super(nombre, vida, defensa, fuerza, estamina, debilidad,critico);
        habilidad1=new Grito("Grito de furia", 10, 10);
        habilidad2=new Pisada("Pisoton", 15, 20);

    }

    @Override
    public Grupo atacar(Grupo personaje, boolean critico) {
        Dado dado = new Dado();
        if(dado.tirarDado(0)>4){
            return habilidad(habilidad1, personaje, critico);
        }else{
            return habilidad(habilidad2,personaje,critico);
        }
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
