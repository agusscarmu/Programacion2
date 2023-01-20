package EjercicioPuerto;

import java.util.ArrayList;

public class Barco extends Puerto{
    private int capacidadCarga;
    public Barco(String nombre, int capacidadCarga) {
        super(nombre);
        this.capacidadCarga = capacidadCarga;

    }
    public int getCapacidad(){
        return capacidadCarga;
    }

    public void cargar(){
        setCargado(true);
    }
    @Override
    public String toString() {
        return "Nombre: "+getNombre()+" Capacidad de carga: "+getCapacidad();
    }
}
