package EjercicioAlquileres;

import java.util.ArrayList;

public class Auto extends Producto{
    private int kms;
    private String patente;
    private boolean disponible;

    
    public Auto(String marca, int kms, String patente, boolean disponible) {
        super(marca);
        this.kms = kms;
        this.patente = patente;
        this.disponible=disponible;
    }
    public boolean Disponible(){
       if(disponible){
        return true;
       }
       return false;
    }
    public void alquilado(){
        disponible=false;
    }
}
