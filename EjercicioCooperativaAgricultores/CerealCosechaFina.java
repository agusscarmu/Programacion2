package EjercicioCooperativaAgricultores;
import java.util.ArrayList;

public class CerealCosechaFina extends Cereal{
    private ArrayList<String> tiposCosechaFina;
    private ArrayList<String> cerealesNecesarios;

    public CerealCosechaFina(String nombre, ArrayList<String> cerealesNecesarios) {
        super(nombre);
    }
    public ArrayList<String> getTipoCereal(){
        tiposCosechaFina.add("Avena");
        tiposCosechaFina.add("Trigo");

        return tiposCosechaFina;
    }
    
}
