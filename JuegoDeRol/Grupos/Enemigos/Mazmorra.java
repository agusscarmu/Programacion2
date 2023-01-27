package JuegoDeRol.Grupos.Enemigos;

import java.util.ArrayList;
import java.util.Collections;

import JuegoDeRol.Grupos.Grupo;

public class Mazmorra extends Grupo{
    private ArrayList<Grupo> grupoDeEnemigos;
    private SalasOrdenadas salaOrdenada;

    public Mazmorra(String nombre){
        super(nombre);
        this.grupoDeEnemigos=new ArrayList<>();
        this.salaOrdenada=new SalasOrdenadas();
    }
    @Override
    public int verPoderDeAtaque(){
        int poder=0;
        for(Grupo enemigos:grupoDeEnemigos){
            poder+=enemigos.verPoderDeAtaque();
        }
        return poder;
    }
    public ArrayList<Grupo> getGrupo(){
        return grupoDeEnemigos;
    }
    public int verVida(){
        int vida=0;
        for(Grupo enemigos:grupoDeEnemigos){
            vida+=enemigos.verVida();
        }
        return vida;
    }
    public void ordenar(){
        for(Grupo e:grupoDeEnemigos){
            e.ordenar();
        }     
        Collections.sort(grupoDeEnemigos, salaOrdenada);
    }
    @Override
    public void agregarIntegrante(Grupo enemigo) {
        grupoDeEnemigos.add(enemigo);
    }
    @Override
    public void setRecuperacion(int recuperacion) {
       for(Grupo enemigo:grupoDeEnemigos){
        enemigo.setRecuperacion(recuperacion);
       } 
    }
    @Override
    public int getVida() {
        int vidaTotal=0;
        for(Grupo e:grupoDeEnemigos){
            vidaTotal+=e.getVida();
        }
        return vidaTotal;
    }
    @Override
    public int getFuerza() {
        int fuerzaTotal=0;
        for(Grupo e:grupoDeEnemigos){
            fuerzaTotal+=e.getFuerza();
        }
        return fuerzaTotal;
    }
    @Override
    public int getCritico() {
        int criticoTotal=0;
        for(Grupo e:grupoDeEnemigos){
            criticoTotal+=e.getCritico();
        }
        return criticoTotal;
    }

}
