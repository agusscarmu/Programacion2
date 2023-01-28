package PrimerRecuperatorio;

import java.util.ArrayList;

import PrimerRecuperatorio.Condiciones.Condicion;

public class Suscriptor {
    private String nombre;
    private String mail;
    private ArrayList<Noticia> noticias;
    private Condicion condicion;

    public Suscriptor(String nombre, String mail, Condicion condicion){
        this.nombre=nombre;
        this.mail=mail;
        this.condicion=condicion;
        this.noticias=new ArrayList<>();
    }

    public String getNombre(){
        return nombre;
    }
    public String getMail(){
        return mail;
    }
    public void agregarNoticia(Noticia noticia){
        if(condicion.cumple(noticia)){
            noticias.add(noticia);
        }
    }

    public void cambiarInteresSuscriptor(Condicion condicionNueva){
        condicion=condicionNueva;
    }

    @Override
    public String toString() {
        return "\n\nNombre: "+nombre+"\nMail: "+mail+"\nNoticias de interes: "+noticias.toString();
    }
    
}
