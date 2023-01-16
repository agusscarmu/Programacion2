package EjercicioProgramadores;

import java.util.ArrayList;

public abstract class Trabajo {
    private String tituloDeTrabajo;
    private ArrayList<String> palabrasClave;
    private ArrayList<Evaluador> evaluadoresPosibles;

    public Trabajo(String tituloDeTrabajo){
        this.tituloDeTrabajo=tituloDeTrabajo;
        this.palabrasClave=new ArrayList<>();
        this.evaluadoresPosibles=new ArrayList<>();
    }
    public String getTituloDeTrabajo(){
        return tituloDeTrabajo;
    }
    public ArrayList<Evaluador> getEvaluadoresPosibles(){
        return evaluadoresPosibles;
    }
    public ArrayList<String> getPlabrasClaves(){
        ArrayList<String> copiaPalabrasClaves = new ArrayList<>(palabrasClave);
        return copiaPalabrasClaves;
    }
    public void setPalabraClave(String palabraClave){
        palabrasClave.add(palabraClave);
    }

    public void addEvaluadorPosible(ArrayList<Evaluador> evaluadores){
        for(int i=0;i<evaluadores.size();i++){
            if(evaluadores.get(i).getConocimientos().containsAll(palabrasClave)){
                evaluadoresPosibles.add(evaluadores.get(i));
            }
        }
    }
    public boolean esPoster(){
        return false;
    }
}
