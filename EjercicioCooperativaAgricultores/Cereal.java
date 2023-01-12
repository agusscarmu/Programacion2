package EjercicioCooperativaAgricultores;
import java.util.ArrayList;

public class Cereal {
    private String nombre;
    private ArrayList<String> mineralesNecesarios;
    private ArrayList<Lote> lotesPosibles;
    private ArrayList<CerealCosechaGruesa> cerealGrueso = new ArrayList<>();
    private ArrayList<CerealCosechaFina> cerealFino = new ArrayList<>();
    private ArrayList<Pastura> pastura = new ArrayList<>();
    private ArrayList<String> tiposCosechaFina;
    private ArrayList<String> tiposCosechaGruesa;
    private ArrayList<String> tiposPastura;


    
    public Cereal(String nombre) {
        this.nombre = nombre;
        this.mineralesNecesarios = new ArrayList<>();
        this.lotesPosibles=new ArrayList<>();
        this.cerealGrueso = new ArrayList<>();
        this.cerealFino = new ArrayList<>();
        this.pastura = new ArrayList<>();
        this.tiposCosechaFina = new ArrayList<>();
        this.tiposCosechaGruesa = new ArrayList<>();
        this.tiposPastura = new ArrayList<>();
    }
    public Cereal(String nombre, ArrayList<String>mineralesNecesarios) {
        this.nombre = nombre;
        this.mineralesNecesarios = mineralesNecesarios;
        this.lotesPosibles=new ArrayList<>();
        this.cerealGrueso = new ArrayList<>();
        this.cerealFino = new ArrayList<>();
        this.pastura = new ArrayList<>();
        this.tiposCosechaFina = new ArrayList<>();
        this.tiposCosechaGruesa = new ArrayList<>();
        this.tiposPastura = new ArrayList<>();
    }
    public String getNombre(){
        return nombre;
    }
    public ArrayList<CerealCosechaGruesa> getCerealesGruesos(){
        return cerealGrueso;
    }
    public ArrayList<CerealCosechaFina> getCerealesFinos(){
        return cerealFino;
    }
    public ArrayList<Pastura> getPasturas(){
        return pastura;
    }
    public ArrayList<String> getTiposCosechaFina(){
        tiposCosechaFina.add("Avena");
        tiposCosechaFina.add("Trigo");

        return tiposCosechaFina;
    }
    public ArrayList<String> getTiposCosechaGruesa(){
        tiposCosechaFina.add("Girasol");
        tiposCosechaFina.add("Maiz");

        return tiposCosechaGruesa;
    }
    public ArrayList<String> getTiposPastura(){
        tiposCosechaFina.add("Alfalfa");
        tiposCosechaFina.add("Trebol subterraneo");

        return tiposPastura;
    }
    public ArrayList<String> getMineralesNecesarios(){
        return mineralesNecesarios;
    }
    public ArrayList<Lote> getLotesPosibles(){
        return lotesPosibles;
    }
    public void setMineralesNecesarios(ArrayList<String>mineralesNecesarios){
        this.mineralesNecesarios=mineralesNecesarios;
    }

    public void addMineralNecesario(String mineral){
        mineralesNecesarios.add(mineral);
    }
    
    public void asignarTipoDeCereal(ArrayList<Lote>lotes){
        if(getTiposCosechaGruesa().contains(nombre)){
            cerealGrueso.add(new CerealCosechaGruesa(nombre, mineralesNecesarios));
            cerealGrueso.get(cerealGrueso.size()-1).addLotesPosibles(lotes);
        }else if(getTiposCosechaFina().contains(nombre)){
            cerealFino.add(new CerealCosechaFina(nombre, mineralesNecesarios));
            cerealFino.get(cerealFino.size()-1).addLotesPosibles(lotes);
        }else if(getTiposPastura().contains(nombre)){
            pastura.add(new Pastura(nombre, mineralesNecesarios));
            pastura.get(pastura.size()-1).addLotesPosibles(lotes);
        }
    }
    public void addLotesPosibles(ArrayList<Lote>lotes){
        for(int i=0;i<lotes.size();i++){
            if(lotes.get(i).getMinerales().containsAll(getMineralesNecesarios())){
                lotesPosibles.add(new Lote(lotes.get(i).getNombre(),lotes.get(i).getSuperficie(),lotes.get(i).getMinerales()));   
            }
        }
    }

}
