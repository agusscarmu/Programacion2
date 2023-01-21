package EjercicioBioinformatica;

import java.util.ArrayList;


public class EstudioGenomico implements Estudio{
    private ArrayList<Gen>genes;

    public EstudioGenomico(){
        this.genes=new ArrayList<>();
    }

    public void agregarGenes(Gen gen){
        genes.add(gen);
    }
    @Override
    public ArrayList<ADN> buscar(String nombre) {
        ArrayList<ADN> resultado = new ArrayList<>();
        for(Gen gen:genes){
            if(gen.getNombre().equals(nombre)){
                resultado.add(gen);
            }
        }
        return resultado;
    }

    @Override
    public String toString() {
        return genes.toString()+"\n";
    }
    
}
