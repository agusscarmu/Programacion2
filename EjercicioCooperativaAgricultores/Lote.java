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

    public void verCerealesPosibles(ArrayList<Cereal>cereales){
        for(int i=0;i<cereales.size();i++){
            if(minerales.containsAll(cereales.get(i).getMineralesNecesarios())){
                if(cereales.get(i).getTiposPastura().contains(cereales.get(i).getNombre())){
                    for(int j=0;j<cereales.get(i).getPasturas().size();j++){
                        if(cereales.get(i).getNombre()==cereales.get(i).getPasturas().get(j).getNombre()){
                            if(getSuperficie()>cereales.get(i).getPasturas().get(j).getSuperficieMinima()){
                                cerealesPosibles.add(new Cereal(cereales.get(i).getNombre(),cereales.get(i).getMineralesNecesarios()));
                            }else{
                                break;
                            }
                            }
                    }
                }
                cerealesPosibles.add(new Cereal(cereales.get(i).getNombre()));
                cereales.get(i).setMineralesNecesarios(cereales.get(i).getMineralesNecesarios());
            }
        }
    }

}
