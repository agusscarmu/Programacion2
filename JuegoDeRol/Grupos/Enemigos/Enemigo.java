package JuegoDeRol.Grupos.Enemigos;

import JuegoDeRol.Grupos.Grupo;

public abstract class Enemigo extends Mazmorra{
    protected String debilidad;
    private int vida;
    private int fuerza;
    private int estamina;
    private int critico;
    private int defensa;
    private int ininciativa;
    private int vidaMaxima;

    public Enemigo(String nombre, int vida, int defensa,int fuerza, int estamina, int critico) {
        super(nombre);
        this.vida=vida;
        this.defensa=defensa;
        this.fuerza=fuerza;
        this.estamina=estamina;
        this.critico=critico;
        this.vidaMaxima=vida;
        this.debilidad="";

    }
    @Override
    public abstract int verPoderDeAtaque();

    @Override
    public abstract void agregarIntegrante(Grupo enemigo);

    public String getDebilidad(){
        return debilidad;
    }
    public int getCritico(){
        return critico;
    }
    public int getVida(){
        return vida;
    }
    public int getIninciativa(){
        return ininciativa;
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
    public void buffFuerza(int buff){
        fuerza+=buff;
    }
    public abstract Grupo atacar(Grupo personaje, boolean critico);

}
