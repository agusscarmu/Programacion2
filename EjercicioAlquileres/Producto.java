package EjercicioAlquileres;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public abstract class Producto {
    private String etiqueta;
    private Date fechaActual;
    private Calendar fechaEnGregoriano;
    
    public Producto(String etiqueta){
        this.etiqueta=etiqueta;
        this.fechaEnGregoriano = new GregorianCalendar();
    }
    
    public String getEtiqueta(){
        return etiqueta;
    }
    public abstract boolean Disponible();
    public abstract void alquilado();

    public void alquilar(int tiempoDeAlquiler, int dia, int mes, int anio){
        this.fechaEnGregoriano.set(anio, mes, dia);
        this.fechaActual=new Date(); 
        fechaEnGregoriano.add(fechaEnGregoriano.DAY_OF_YEAR,tiempoDeAlquiler);
    }
    public Date getFechaFinAlquiler(){
        return fechaEnGregoriano.getTime();
    }
    public Date getFechaActual(){
        return fechaActual;
    }

}
