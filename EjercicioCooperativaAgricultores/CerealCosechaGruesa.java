package EjercicioCooperativaAgricultores;
import java.util.ArrayList;

public class CerealCosechaGruesa extends Cereal{
    private ArrayList<String> tiposCosechaGruesa;
    private ArrayList<String> cerealesNecesarios;
    public CerealCosechaGruesa(String nombre, ArrayList<String> cerealesNecesarios) {
        super(nombre);
        this.cerealesNecesarios=cerealesNecesarios;
    }
    public ArrayList<String> getTipoCereal(){
        tiposCosechaGruesa.add("Girasol");
        tiposCosechaGruesa.add("Maiz");

        return tiposCosechaGruesa;
    }
}
