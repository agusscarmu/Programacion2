package JuegoDeRol.Grupos.Enemigos;

import java.util.ArrayList;
import java.util.Collections;

import JuegoDeRol.Personaje;
import JuegoDeRol.Grupos.Grupo;

public class Mazmorra extends Grupo{
    private ArrayList<Grupo> grupoDeEnemigos;
    private SalasOrdenadas salaOrdenada;

    public Mazmorra(){
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
    public void ordenarSalas(){
        Collections.sort(grupoDeEnemigos, salaOrdenada);;
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
    public Grupo atacar(Grupo objetivo, boolean critico) {
        // TODO Auto-generated method stub
        return null;
    }
}
