package EjercicioCooperativaAgricultores;
import java.util.ArrayList;

public class Cereal {
    private String nombre;
    private ArrayList<String> mineralesNecesarios;
    private ArrayList<Lote> lotesPosibles; 


    
    public Cereal(String nombre) {
        this.nombre = nombre;
        this.mineralesNecesarios = new ArrayList<>();
        this.lotesPosibles=new ArrayList<>();
    }
    public String getNombre(){
        return nombre;
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
    
    public void addLotesPosibles(ArrayList<Lote>lotes){
        for(int i=0;i<lotes.size();i++){
            if(lotes.get(i).getMinerales().containsAll(getMineralesNecesarios())){
                lotesPosibles.add(new Lote(lotes.get(i).getNombre(),lotes.get(i).getSuperficie(),lotes.get(i).getMinerales()));   
            }
        }
    }

}
