package JuegoDeRol;

import java.util.Random;

public class Dado {
    
    public int tirarDado(int boost){
        int dado=0;
        Random r = new Random();
        dado=r.nextInt(10);
        if(dado==0)
        return dado;
        else
        return dado+boost;
    }
}
