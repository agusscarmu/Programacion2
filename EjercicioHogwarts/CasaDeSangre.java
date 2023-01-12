package EjercicioHogwarts;
import java.util.ArrayList;

public class CasaDeSangre extends Casa{

    private ArrayList<String> familiar = new ArrayList<>();
    public CasaDeSangre(){}
    public CasaDeSangre(String nombre, String cualidad1, String cualidad2, int cantidadMaxima, String familiar) {
        super(nombre, cualidad1, cualidad2, cantidadMaxima);
        this.familiar.add(familiar);
    }
    public CasaDeSangre(String nombre, String cualidad1, String cualidad2, int cantidadMaxima, String familiar, Casa casa) {
        super(nombre, cualidad1, cualidad2, cantidadMaxima, casa);
        this.familiar.add(familiar);
    }

    public ArrayList<String> getFamiliar(){
        ArrayList<String> familia = new ArrayList<>(familiar);
        return familia;
    }

    public void addAlumno(String nombre){
        getAlumnos().add(nombre);
        familiar.add(nombre);
    }

    
    
   
}
