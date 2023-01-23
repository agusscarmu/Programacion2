package JuegoDeRol;

import JuegoDeRol.Armas.Arma;
import JuegoDeRol.Habilidades.Habilidad;

public class Jugador extends Personaje {

    private int mana;
    private Arma arma;
    private Habilidad hechizo;
    private int critico;

    public Jugador(String nombre, int vida, int mana, int estamina, int fuerza, Arma arma, Habilidad hechizo, int critico) {
        super(nombre, vida, fuerza, estamina,critico);
        this.mana=mana;
        this.arma=arma;
        this.hechizo=hechizo;
    }
    public int getCritico(){
        return critico+arma.getCritico();
    }
    public Arma getArma(){
        return arma;
    }
    public int getMana(){
        return mana;
    }
    public Habilidad getHechizo(){
        return hechizo;
    }
    @Override
    public Personaje atacar(Personaje personaje, boolean critico) {
        if(getEstamina()>arma.getCoste()){
            int golpe=arma.getDanio()+(getFuerza()/2);
            if(critico)
            golpe=arma.getDanio()+(getFuerza());
            System.out.println("Ataco con: "+arma.getNombre());
            personaje.impacto(golpe);
            System.out.println("golpe realizado: "+golpe);
            cansancio(arma.getCoste());
            return personaje;
        }else
        System.out.println("Estamina baja!");
        return personaje;
    }

    public Personaje atacarConMagia(Personaje personaje, boolean critico){
        if(mana>hechizo.getCoste()){
        System.out.println("Lanzo: "+hechizo.getNombre());
        hechizo.ejecutar(personaje,critico);
        mana-=hechizo.getCoste();
        return personaje;
        }else
        System.out.println("Mana insuficiente!");
        return personaje;
    }
}
