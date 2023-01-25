package JuegoDeRol;

import JuegoDeRol.Grupos.Grupo;

public abstract class Personaje{
    
    private String nombre;
    private int vida;
    private int fuerza;
    private int estamina;
    private int critico;
    private int defensa;
    private int mana;
    private int vidaMaxima;
    private int manaMaximo;

    public Personaje(){}
    public Personaje(String nombre, int vida, int defensa, int mana, int fuerza, int estamina,int critico){
        this.nombre=nombre;
        this.vida=vida;
        this.defensa=defensa;
        this.mana=mana;
        this.fuerza=fuerza;
        this.estamina=estamina;
        this.critico=critico;
        this.vidaMaxima=vida;
        this.manaMaximo=mana;
    }
    public Personaje(String nombre, int vida, int defensa,int fuerza, int estamina,int critico){
        this.nombre=nombre;
        this.vida=vida;
        this.defensa=defensa;
        this.fuerza=fuerza;
        this.estamina=estamina;
        this.critico=critico;
        this.vidaMaxima=vida;
    }
    public int getCritico(){
        return critico;
    }
    public String getNombre(){
        return nombre;
    }
    public int getVida(){
        return vida;
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
    }
    public void buff(int buff){
        fuerza+=buff;
    }
    public abstract Grupo atacar(Grupo personaje, boolean critico);
}
