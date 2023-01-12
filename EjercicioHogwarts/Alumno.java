package EjercicioHogwarts;
import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private ArrayList<String> cualidades;
    private ArrayList<String> familiares;

    public Alumno(String nombre){
        this.nombre = nombre;
        this.cualidades = new ArrayList<>();
        this.familiares = new ArrayList<>();
    }

    public String getNombre(){
        return nombre;
    }

    public ArrayList<String> getCualidades(){
        ArrayList cualidadescopia= new ArrayList<>(cualidades);
        return cualidadescopia;
    }
    public ArrayList<String> getFamiliares(){
        ArrayList familiarescopia = new ArrayList<>(familiares);
        return familiarescopia;
    }

    public void setCualidad(String cualidad){
        cualidades.add(cualidad);
    }

    public void addFamiliar(String familiar){
        familiares.add(familiar);
    }
}
