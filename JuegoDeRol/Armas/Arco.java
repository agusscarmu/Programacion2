package JuegoDeRol.Armas;

import java.util.Random;

import JuegoDeRol.Grupos.Grupo;

public class Arco extends Arma{
    private int headshot;
    private int precision;

    public Arco(String nombre, int danio, int coste, int precision, int critico) {
        super(nombre, danio, coste);
        this.precision=precision;
        this.headshot=0;
        this.critico=critico;
    }


    @Override
    public Grupo atacar(Grupo enemigo, boolean critico, int fuerza) {
        Random r = new Random();
        headshot=r.nextInt(100);
        if(critico){
            if(headshot<precision){
                enemigo.impacto(getDanio()*4+fuerza/2);
                System.out.println("Headshot!");
            }else
                enemigo.impacto(getDanio()*2+fuerza/2);
        }else{
            if(headshot<precision){
                enemigo.impacto(getDanio()*2+fuerza/2);
                System.out.println("Headshot!");
            }else
                enemigo.impacto(getDanio()+fuerza/2);
        }
        return enemigo;
    }
}
