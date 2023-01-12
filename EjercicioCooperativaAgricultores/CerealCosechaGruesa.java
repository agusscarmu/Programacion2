package EjercicioCooperativaAgricultores;
import java.util.ArrayList;

public class CerealCosechaGruesa extends Cereal{
    private ArrayList<String> tiposCosechaGruesa;
    public CerealCosechaGruesa(String nombre) {
        super(nombre);
    }
    public ArrayList<String> getTipoCereal(){
        tiposCosechaGruesa.add("Girasol");
        tiposCosechaGruesa.add("Maiz");

        return tiposCosechaGruesa;
    }
}
