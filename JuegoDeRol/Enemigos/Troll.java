package JuegoDeRol.Enemigos;

import JuegoDeRol.Dado;
import JuegoDeRol.Personaje;
import JuegoDeRol.Habilidades.Habilidad;
import JuegoDeRol.Habilidades.HabilidadesEnemigos.Grito;
import JuegoDeRol.Habilidades.HabilidadesEnemigos.Pisada;

public class Troll extends Enemigo{
    protected Habilidad habilidad1;
    protected Habilidad habilidad2;

    public Troll(String nombre, int vida, int fuerza, int estamina, String debilidad, int critico) {
        super(nombre, vida, fuerza, estamina, debilidad,critico);
        habilidad1=new Grito("Grito de furia", 10, 10);
        habilidad2=new Pisada("Pisoton", 15, 20);

    }

    @Override
    public Personaje atacar(Personaje personaje, boolean critico) {
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
    public Personaje habilidad(Habilidad habilidad,Personaje personaje, boolean critico){
        if(getEstamina()>habilidad.getCoste()){
            System.out.println(getNombre()+" lanza: "+habilidad.getNombre());
            habilidad.ejecutar(personaje, critico);
            cansancio(habilidad.getCoste());
            return personaje;
        }else
            System.out.println("El troll esta cansado!");
            return personaje;
    }

    @Override
    public void agregarEnemigos(ElementoHostil enemigo) {
    }


    
}
