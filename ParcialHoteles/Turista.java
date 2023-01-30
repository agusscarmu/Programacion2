package ParcialHoteles;

public class Turista {
    private String nombre;
    private int edad;
    private String ciudad;
    
    public Turista(String nombre, int edad, String ciudad){
        this.nombre=nombre;
        this.edad=edad;
        this.ciudad=ciudad;
    }

    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    public String getCiudad(){
        return ciudad;
    }

}
