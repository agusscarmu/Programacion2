package EjercicioCooperativaAgricultores;
import java.util.ArrayList;

public class CerealCosechaFina extends Cereal{
    private ArrayList<String> tiposCosechaFina;

    public CerealCosechaFina(String nombre) {
        super(nombre);
    }
    public ArrayList<String> getTipoCereal(){
        tiposCosechaFina.add("Avena");
        tiposCosechaFina.add("Trigo");

        return tiposCosechaFina;
    }
    
}
