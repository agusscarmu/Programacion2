package EjercicioProgramadores;

import java.util.ArrayList;

public class Poster extends Trabajo{

    public Poster(String tituloDeTrabajo) {
        super(tituloDeTrabajo);
    }
    
    public void addEvaluadorPosible(ArrayList<Evaluador> evaluadores){
        for(int i=0;i<evaluadores.size();i++){
            for(int j=0;j<getPlabrasClaves().size();j++){
            if(evaluadores.get(i).getConocimientos().contains(getPlabrasClaves().get(j))){
                getEvaluadoresPosibles().add(evaluadores.get(i));
                break;
            }
            }
        }
    }

    public boolean esPoster(){
        return true;
    }
}
