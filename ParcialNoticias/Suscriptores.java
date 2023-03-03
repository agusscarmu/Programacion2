package ParcialNoticias;

import java.util.ArrayList;

import ParcialNoticias.Condiciones.Condicion;

public class Suscriptores {
    private String nombre;
    private String mail;
    private Condicion condicion;
    private ArrayList<PortalNoticias> noticias;

    public Suscriptores(String nombre, String mail, Condicion condicion){
        this.nombre=nombre;
        this.mail=mail;
        this.condicion=condicion;
        this.noticias=new ArrayList<>();
    }

    public void setCondicion(Condicion c){
        condicion=c;
    }

    public void setNoticias(ArrayList<PortalNoticias> noticiasRecibidas){
        noticias=noticiasRecibidas;
    }
    public ArrayList<PortalNoticias> getNoticias(){
        ArrayList<PortalNoticias>noticiascopia=new ArrayList<>(noticias);
        return noticiascopia;
    }
    public Condicion getCondicion(){
        return condicion;
    }

    public String getNombre(){
        return nombre;
    }

    public String getMail(){
        return mail;
    }

    @Override
    public String toString() {
        return "\nNombre: "+getNombre()+"\nNoticias: "+getNoticias().toString();
    }
}
