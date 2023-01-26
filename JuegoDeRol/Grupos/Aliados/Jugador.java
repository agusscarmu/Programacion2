package JuegoDeRol.Grupos.Aliados;

import java.util.ArrayList;

import JuegoDeRol.ElementosUtilizables;
import JuegoDeRol.Armas.Arma;
import JuegoDeRol.Grupos.Grupo;
import JuegoDeRol.Habilidades.Habilidad;
import JuegoDeRol.Pociones.Pocion;

public class Jugador extends Grupo{

    private Arma arma;
    private Habilidad hechizo;
    private int critico;
    private Pocion pocion;

    public Jugador(String nombre, int vida, int defensa, int mana, int estamina, int fuerza, Arma arma, Habilidad hechizo, Pocion pocion,int critico) {
        super(nombre, vida, defensa, mana,fuerza, estamina,critico);
        this.arma=arma;
        this.pocion=pocion;
        this.hechizo=hechizo;
    }

    public int getCritico(){
        return critico+arma.getCritico();
    }
    public Arma getArma(){
        return arma;
    }
    public Habilidad getHechizo(){
        return hechizo;
    }
    public Pocion getPocion(){
        return pocion;
    }
    public void usarPocion(){
        pocion.usar(this);
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
    public Grupo utilizarMagia(Grupo personaje, boolean critico){
        if(getMana()>hechizo.getCoste()){
        System.out.println("Lanzo: "+hechizo.getNombre());
        if(hechizo.autoCurativo())
        hechizo.ejecutar(personaje,critico, (getVidaMaxima()/2), this);

        hechizo.ejecutar(personaje,critico, (getManaMaximo()/3));
        gastoMana(hechizo.getCoste());
        return personaje;
        }else
        System.out.println("Mana insuficiente!");
        return personaje;
    }
    public void setArma(ElementosUtilizables newArma){
        arma=(Arma)newArma;
    }
    public void setHechizo(ElementosUtilizables newHechizo){
        hechizo=(Habilidad)newHechizo;
    }
    public void setPocion(ElementosUtilizables newPocion){
        pocion=(Pocion)newPocion;
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
    @Override
    public void agregarIntegrante(Grupo enemigo) {
        // TODO Auto-generated method stub
        
    }

}
