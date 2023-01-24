package JuegoDeRol.Grupos.Aliados;

import java.util.ArrayList;

import JuegoDeRol.Grupos.Grupo;

public class EquipoAliado extends Grupo{

    ArrayList<Grupo> grupo;

    public EquipoAliado() {
        this.grupo=new ArrayList<>();
    }
    
    public void agregarIntegrante(Grupo integrante){
        grupo.add(integrante);
    }
    public ArrayList<Grupo> getGrupo(){
        return grupo;
    }
    @Override
    public int verPoderDeAtaque(){
        int poder=0;
        for(Grupo aliados:grupo){
            poder+=aliados.verPoderDeAtaque();
        }
        return poder;
    }

    @Override
    public int verVida(){
        int vida=0;
        for(Grupo aliados:grupo){
            vida+=aliados.verVida();
        }
        return vida;
    }
    @Override
    public void setRecuperacion(int recuperacion) {
        for(Grupo aliado:grupo){
            aliado.setRecuperacion(recuperacion);
        }
    }

    @Override
    public Grupo atacar(Grupo personaje, boolean critico) {
        // TODO Auto-generated method stub
        return null;
    }
}
