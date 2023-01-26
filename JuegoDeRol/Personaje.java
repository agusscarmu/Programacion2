package JuegoDeRol;

import java.util.ArrayList;

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
    private ArrayList<String>debuffs;
    private ArrayList<String>buffs;



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
        this.debuffs=new ArrayList<>();
        this.buffs=new ArrayList<>();

    }
    public Personaje(String nombre, int vida, int defensa,int fuerza, int estamina,int critico){
        this.nombre=nombre;
        this.vida=vida;
        this.defensa=defensa;
        this.fuerza=fuerza;
        this.estamina=estamina;
        this.critico=critico;
        this.vidaMaxima=vida;
        this.debuffs=new ArrayList<>();
    }
    public void debuff(String debuff){
        debuffs.add(debuff);
    }
    public void buff(String debuff){
        debuffs.add(debuff);
    }
    public ArrayList<String> getbuffs(){
        return debuffs;
    }
    public ArrayList<String> getDebuffs(){
        return debuffs;
    }
    public void quitarBuff(String debuff){
        if(debuffs.contains(debuff)){
            debuffs.remove(debuff);
        }
    }
    public void quitarDebuff(String debuff){
        if(debuffs.contains(debuff)){
            debuffs.remove(debuff);
        }
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
    }
    public void buffFuerza(int buff){
        fuerza+=buff;
    }
    public abstract Grupo atacar(Grupo personaje, boolean critico);
}
