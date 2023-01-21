package EjercicioPuerto;

import java.time.LocalDate;

public class Camion implements Comparable<Camion>{ 
    private LocalDate fechaDeCarga;
    private String nombre;

    public Camion(String nombre, LocalDate fechaDeCarga) {
        this.nombre = nombre;
        this.fechaDeCarga = fechaDeCarga;
    }
    public LocalDate getFechaDeCarga(){
        return fechaDeCarga;
    }
    @Override
    public String toString() {
        return "Nombre: "+nombre+" Fecha de carga: "+getFechaDeCarga();
    }
    @Override
    public int compareTo(Camion otro) {
        return this.getFechaDeCarga().compareTo(otro.getFechaDeCarga());
    }

}
