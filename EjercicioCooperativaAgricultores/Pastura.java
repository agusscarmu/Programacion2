package EjercicioCooperativaAgricultores;

import java.util.ArrayList;

public class Pastura extends Cereal{
    private final int superficieMinima=50;
    private ArrayList<String> tiposPastura;

    public Pastura(String nombre) {
        super(nombre);
    }
    public int getSuperficieMinima(){
        return superficieMinima;
    }
    public ArrayList<String> getTipoCereal(){
        tiposPastura.add("Alfalfa");
        tiposPastura.add("Trebol subterraneo");

        return tiposPastura;
    }
    public void addLotesPosibles(ArrayList<Lote>lotes){
        for(int i=0;i<lotes.size();i++){
            if(lotes.get(i).getSuperficie()>superficieMinima){
                if(lotes.get(i).getMinerales().containsAll(getMineralesNecesarios())){
                    getLotesPosibles().add(new Lote(lotes.get(i).getNombre(),lotes.get(i).getSuperficie(),lotes.get(i).getMinerales()));
                }
            }
        }
    }
}
