package EjercicioBioinformatica;

import java.util.ArrayList;

public class EstudioProteico implements Estudio{
    private ArrayList<Proteina>proteinas;

    public EstudioProteico(){
        this.proteinas=new ArrayList<>();
    }

    public void agregarProteinas(Proteina proteina){
        proteinas.add(proteina);
    }
    @Override
    public ArrayList<ADN> buscar(String funcion) {
        ArrayList<ADN> resultado = new ArrayList<>();
        for(Proteina protein:proteinas){
            if(protein.getFuncion().equals(funcion)){
                resultado.add(protein);
            }
        }
        return resultado;
    }
    
    @Override
    public String toString() {
        return proteinas.toString();
    }
}
