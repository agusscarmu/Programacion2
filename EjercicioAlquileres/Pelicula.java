package EjercicioAlquileres;

public class Pelicula extends Producto{
    private int copias;

    public Pelicula(String nombre, int copias) {
        super(nombre);
        this.copias = copias;
    }
    public void alquilado(){
        copias--;
    }
    public boolean Disponible(){
        if(copias>0){
            return true;
        }
        return false;
    }
}
