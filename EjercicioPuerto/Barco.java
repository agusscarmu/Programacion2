package EjercicioPuerto;


public class Barco implements Comparable<Barco>{
    private int capacidadCarga;
    private String nombre;
    public Barco(String nombre, int capacidadCarga) {
        this.nombre=nombre;
        this.capacidadCarga = capacidadCarga;

    }
    public int getCapacidad(){
        return capacidadCarga;
    }
    @Override
    public String toString() {
        return "Nombre: "+nombre+" Capacidad de carga: "+getCapacidad();
    }
    @Override
    public int compareTo(Barco otro) {
        return otro.getCapacidad()-this.getCapacidad();
    }
}
