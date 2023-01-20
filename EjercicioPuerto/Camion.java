package EjercicioPuerto;

import java.time.LocalDate;
import java.util.ArrayList;

public class Camion extends Puerto{
    private LocalDate fechaDeCarga;

    public Camion(String nombre, LocalDate fechaDeCarga) {
        super(nombre);
        this.fechaDeCarga = fechaDeCarga;
        setCargado(true);
    }
    public LocalDate getFechaDeCarga(){
        return fechaDeCarga;
    }
    public void descarga(){
        setCargado(false);
    }

    @Override
    public String toString() {
        return "Nombre: "+getNombre()+" Fecha de carga: "+getFechaDeCarga();
    }

}
