package JuegoDeRol;

public abstract class ElementosUtilizables {
    private String nombre;
    private int coste;
    private int efecto;

    public ElementosUtilizables(String nombre, int efecto, int coste) {
        this.nombre = nombre;
        this.efecto = efecto;
        this.coste = coste;
    }
    public String getNombre(){
        return nombre;
    }
    public int getPoder(){
        return efecto;
    }
    public int getCoste(){
        return coste;
    }
}
