package JuegoDeRol;

import java.util.ArrayList;

public abstract class Personaje{
    
    private String nombre;
    private ArrayList<String>debuffs=new ArrayList<>();
    private ArrayList<String>buffs=new ArrayList<>();
    
    public Personaje(String nombre){
        this.nombre=nombre;
    }
    public void debuff(String debuff){
        debuffs.add(debuff);
    }
    public void buff(String buff){
        buffs.add(buff);
    }
    public ArrayList<String> getbuffs(){
        return buffs;
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
    public String getNombre(){
        return nombre;
    }

    public abstract int getVida();
    public abstract int getFuerza();
    public abstract int getCritico();

}
