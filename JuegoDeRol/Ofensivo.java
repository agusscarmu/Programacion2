package JuegoDeRol;

public abstract class Ofensivo {
    private String nombre;
    private int danio;

    public Ofensivo(String nombre, int danio){
        this.nombre=nombre;
        this.danio=danio;
    }

    public String getNombre(){
        return nombre;
    }

    public int getDanio(){
        return danio;
    }
}
