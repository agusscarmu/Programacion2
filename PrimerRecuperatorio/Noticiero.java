package PrimerRecuperatorio;

import java.util.ArrayList;

public class Noticiero {
    ArrayList<Suscriptor>suscriptores;
    
    public Noticiero(){
        this.suscriptores=new ArrayList<>();
    }
    public void agregarSuscriptor(Suscriptor suscriptor){
        suscriptores.add(suscriptor);
    }
    public void agregarNoticiaSuscriptores(Noticia noticia){
        for(Suscriptor suscriptor: suscriptores){
            suscriptor.agregarNoticia(noticia);
        }
    }

    public void verSuscriptores(){
        System.out.println(suscriptores);
    }
}
