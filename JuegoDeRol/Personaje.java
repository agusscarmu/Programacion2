package JuegoDeRol;

public abstract class Personaje extends Juego{
    
    private String nombre;
    private int vida;
    private int fuerza;
    private int estamina;
    private int critico;

    public Personaje(){}
    public Personaje(String nombre, int vida, int fuerza, int estamina,int critico){
        this.nombre=nombre;
        this.vida=vida;
        this.fuerza=fuerza;
        this.estamina=estamina;
        this.critico=critico;
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
        vida-=golpe;
    }
    public void curacion(int cura){
        vida+=cura;
    }
    public void buff(int buff){
        fuerza+=buff;
    }
    public abstract Personaje atacar(Personaje personaje, boolean critico);
}
