package EjercicioCooperativaAgricultores;

import java.util.ArrayList;

public class Lote {
    private int superficie;
    private String nombre;
    private ArrayList<String> minerales;
    private ArrayList<Cereal> cerealesPosibles;
    private boolean especial;
    private LoteEspecial loteEspecial;

    public Lote(String nombre, int superficie){
        this.nombre=nombre;
        this.superficie=superficie;
        this.minerales=new ArrayList<>();
        this.cerealesPosibles=new ArrayList<>();
    }
    public Lote(String nombre, int superficie, ArrayList<String> minerales){
        this.nombre=nombre;
        this.superficie=superficie;
        this.minerales=minerales;
        this.cerealesPosibles=new ArrayList<>();
    }

    public String getNombre(){
        return nombre;
    }
    public int getSuperficie(){
        return superficie;
    }
    public boolean getEspecial(){
        return especial;
    }
    public ArrayList<Cereal> getCerealesPosibles(){
        return cerealesPosibles;
    }
    public LoteEspecial getLoteEspecial(){
        return loteEspecial;
    }
    public ArrayList<String> getMinerales(){
        return minerales;
    }
    public void setMinerales(ArrayList<String>minerales){
        this.minerales=minerales;
    }
    public void addMinerales(String mineral){
        minerales.add(mineral);
    }

    public void esEspecial(ArrayList<String>mineralesEspeciales){
        for(int i=0;i<minerales.size();i++){
            if(minerales.containsAll(mineralesEspeciales)){
                this.especial=true;
                loteEspecial = new LoteEspecial(getNombre(),getSuperficie(), getMinerales(), mineralesEspeciales,cerealesPosibles);
            }
        }
    }

    public void verCerealesPosibles(ArrayList<CerealCosechaGruesa> cerealCosechaGruesa, ArrayList<CerealCosechaFina>cerealCosechaFina, ArrayList<Pastura>pastura){
        for(int i=0;i<cerealCosechaGruesa.size();i++){
            if(minerales.containsAll(cerealCosechaGruesa.get(i).getMineralesNecesarios())){   
                cerealesPosibles.add(new Cereal(cerealCosechaGruesa.get(i).getNombre()));
                cerealesPosibles.get(cerealesPosibles.size()-1).setMineralesNecesarios(cerealCosechaGruesa.get(i).getMineralesNecesarios());
            }
        }
        for(int i=0;i<cerealCosechaFina.size();i++){
            if(minerales.containsAll(cerealCosechaFina.get(i).getMineralesNecesarios())){   
                cerealesPosibles.add(new Cereal(cerealCosechaFina.get(i).getNombre()));
                cerealesPosibles.get(cerealesPosibles.size()-1).setMineralesNecesarios(cerealCosechaFina.get(i).getMineralesNecesarios());
            }
        }
        for(int i=0;i<pastura.size();i++){
            if(minerales.containsAll(pastura.get(i).getMineralesNecesarios())){   
                cerealesPosibles.add(new Cereal(cerealCosechaFina.get(i).getNombre()));
                cerealesPosibles.get(cerealesPosibles.size()-1).setMineralesNecesarios(pastura.get(i).getMineralesNecesarios());
            }
        }
    }

}
