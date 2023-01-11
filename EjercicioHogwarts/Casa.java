package EjercicioHogwarts;
import java.util.ArrayList;

public class Casa {
    private String nombre;
    private ArrayList<String> cualidad=new ArrayList<>();
    private ArrayList<String> alumnos;
    private int cantidadMaxima;
    private Casa casa;

    public Casa(){}
    public Casa(String nombre, String cualidad1, String cualidad2, int cantidadMaxima){
        this.alumnos=new ArrayList<>();
        this.nombre=nombre;
        this.cualidad.add(cualidad1);
        this.cualidad.add(cualidad2);
        this.cantidadMaxima=cantidadMaxima;
    }
    public Casa(String nombre, String cualidad1, String cualidad2, int cantidadMaxima, Casa casa){
        this.alumnos=new ArrayList<>();
        this.nombre=nombre;
        this.cualidad.add(cualidad1);
        this.cualidad.add(cualidad2);
        this.cantidadMaxima=cantidadMaxima;
        this.casa=casa;
    }
    public String getNombre(){
        return nombre;
    }
    public int cantMax(){
        return cantidadMaxima;
    }
    public ArrayList<String> getAlumnos(){
        return alumnos;
    }
    public ArrayList<String> getCualidades(){
        ArrayList<String> cualidadcopia=new ArrayList<>(cualidad);
        return cualidadcopia;
    }

    public void addAlumno(String nombre){
        alumnos.add(nombre);
    }

    public Casa getCasaEnemiga(){
        return casa;
    }
}
