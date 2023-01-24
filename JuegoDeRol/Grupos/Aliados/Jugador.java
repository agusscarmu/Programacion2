package JuegoDeRol.Grupos.Aliados;

import java.util.ArrayList;

import JuegoDeRol.Armas.Arma;
import JuegoDeRol.Grupos.Grupo;
import JuegoDeRol.Habilidades.Habilidad;

public class Jugador extends Grupo{

    private int mana;
    private Arma arma;
    private Habilidad hechizo;
    private int critico;

    public Jugador(String nombre, int vida, int defensa, int mana, int estamina, int fuerza, Arma arma, Habilidad hechizo, int critico) {
        super(nombre, vida, defensa,fuerza, estamina,critico);
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
    public Grupo atacar(Grupo personaje, boolean critico) {
        if(getEstamina()>arma.getCoste()){
            System.out.println("Ataco con: "+arma.getNombre());
            arma.atacar(personaje, critico, (getFuerza()/2));
            cansancio(arma.getCoste());
            return personaje;
        }else
        System.out.println("Estamina baja!");
        return personaje;
    }
    public Grupo utilizarMagia(Grupo personaje, boolean critico, int boost){
        if(mana>hechizo.getCoste()){
        System.out.println("Lanzo: "+hechizo.getNombre());
        hechizo.ejecutar(personaje,critico, boost);
        mana-=hechizo.getCoste();
        return personaje;
        }else
        System.out.println("Mana insuficiente!");
        return personaje;
    }
    @Override
    public void agregarIntegrante(Grupo enemigo) {
    }
    @Override
    public int verPoderDeAtaque() {
        return getFuerza();
    }
    @Override
    public int verVida() {
        return getVida();
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
