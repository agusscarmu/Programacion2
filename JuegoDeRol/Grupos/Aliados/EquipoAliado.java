package JuegoDeRol.Grupos.Aliados;

import java.util.ArrayList;
import java.util.Collections;

import JuegoDeRol.Grupos.Grupo;

public class EquipoAliado extends Grupo{

    ArrayList<Grupo> grupo;
    String nombre;
    AliadosOrdenados aliadosOrdenados = new AliadosOrdenados();
   
    public EquipoAliado(String nombre){
        super(nombre);
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
    public void ordenar() { 
        for(Grupo aliado:grupo){
            aliado.ordenar();
        }     
        Collections.sort(grupo, aliadosOrdenados);  
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
    public int getVida() {
        int vidaTotal=0;
        for(Grupo e:grupo){
            vidaTotal+=e.getVida();
        }
        return vidaTotal;
    }
    @Override
    public int getFuerza() {
        int fuerzaTotal=0;
        for(Grupo e:grupo){
            fuerzaTotal+=e.getFuerza();
        }
        return fuerzaTotal;
    }
    @Override
    public int getCritico() {
        int criticoTotal=0;
        for(Grupo e:grupo){
            criticoTotal+=e.getCritico();
        }
        return criticoTotal;
    }
}
