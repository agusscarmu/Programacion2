package JuegoDeRol.Enemigos;

import java.util.ArrayList;

public class Mazmorra implements ElementoHostil{
    private ArrayList<ElementoHostil> grupoDeEnemigos;

    public Mazmorra(){
        this.grupoDeEnemigos=new ArrayList<>();
    }
    @Override
    public int verPoderDeAtaque(){
        int poder=0;
        for(ElementoHostil enemigos:grupoDeEnemigos){
            poder+=enemigos.verPoderDeAtaque();
        }
        return poder;
    }

    @Override
    public void agregarEnemigos(ElementoHostil enemigo) {
        grupoDeEnemigos.add(enemigo);
    }
    
}
