package JuegoDeRol.Grupos.Aliados;

import JuegoDeRol.ElementosUtilizables;
import JuegoDeRol.Armas.Arma;
import JuegoDeRol.Grupos.Grupo;
import JuegoDeRol.Grupos.Enemigos.Enemigo;
import JuegoDeRol.Habilidades.Habilidad;
import JuegoDeRol.Pociones.Pocion;

public class Jugador extends EquipoAliado{

    private Arma arma;
    private Habilidad hechizo;
    private int critico;
    private Pocion pocion;
    private int vida;
    private int fuerza;
    private int estamina;
    private int defensa;
    private int mana;
    private int ininciativa;
    private int vidaMaxima;
    private int manaMaximo;

    public Jugador(String nombre, int vida, int defensa, int mana, int estamina, int fuerza, Arma arma, Habilidad hechizo, Pocion pocion,int critico, int ininciativa) {
        super(nombre);
        this.vida=vida;
        this.defensa=defensa;
        this.mana=mana;
        this.fuerza=fuerza;
        this.estamina=estamina;
        this.critico=critico;
        this.ininciativa=ininciativa;
        this.vidaMaxima=vida;
        this.manaMaximo=mana;
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
    public Grupo atacar(Grupo personaje, boolean critico) {
        if(getEstamina()>arma.getCoste()){
            System.out.println("Ataco con: "+arma.getNombre());
            arma.atacar((Enemigo)personaje, critico, (getFuerza()/2));
            cansancio(arma.getCoste());
            return personaje;
        }else
        System.out.println("Estamina baja!");
        return personaje;
    }
    public Grupo utilizarMagia(Grupo personaje, boolean critico){
        if(getMana()>hechizo.getCoste()){
        System.out.println("Lanzo: "+hechizo.getNombre());
        if(hechizo.autoCurativo()){
        hechizo.ejecutar(personaje,critico, (getVidaMaxima()/2), this);
        }else{   
        hechizo.ejecutar(personaje,critico, (getManaMaximo()/3));
        }
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
    public void setRecuperacion(int recuperacion) {
        recuperacion(recuperacion);
    }
    public int getVida(){
        return vida;
    }
    public int getIninciativa(){
        return ininciativa;
    }
    public int getMana(){
        return mana;
    }
    public int getManaMaximo(){
        return manaMaximo;
    }
    public void gastoMana(int gasto){
        mana= mana - gasto;
    }
    public int getVidaMaxima(){
        return vidaMaxima;
    }
    public int getEstamina(){
        return estamina;
    }
    public int getFuerza(){
        return fuerza;
    }
    public void recuperarMana(int manaRecuperado){
        mana+=manaRecuperado;
    }
    public void recuperacion(int recuperacion){
        estamina+=recuperacion;
    }
    public void cansancio(int debuff){
        estamina-=debuff;
    }
    public void impacto(int golpe){
        vida = vida - (golpe-(golpe*defensa/100));
        System.out.println("Danio realizado: "+ (golpe-(golpe*defensa/100)));
    }
    public void impacto(int golpe, int defensaRota){
        int defensaRobada = 100-defensaRota;
        vida = vida - (golpe+(golpe*(defensa*defensaRobada/100)/100));
        System.out.println("Danio realizado: "+ (golpe+(golpe*(defensa*defensaRobada/100)/100)));
    }
    public void curacion(int cura){
        vida+=cura;
        if(vida>vidaMaxima){
            vida=vidaMaxima;
        }
    }
    public void buffFuerza(int buff){
        fuerza+=buff;
    }

}
