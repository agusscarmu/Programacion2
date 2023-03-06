package ParcialHotelesDos;

public class Turista {
    private String nombre;
    private int edad;
    private String ciudadOrigen;

    public Turista(String nombre, int edad, String ciudadOrigen){
        this.nombre=nombre;
        this.edad=edad;
        this.ciudadOrigen=ciudadOrigen;
    }

    public void setNombre(String n){
        nombre=n;
    }
    public void setEdad(int e){
        edad=e;
    }
    public void setCiudad(String c){
        ciudadOrigen=c;
    }

    public int getEdad(){
        return edad;
    }
    public String getNombre(){
        return nombre;
    }
    public String getCiudad(){
        return ciudadOrigen;
    }
}
