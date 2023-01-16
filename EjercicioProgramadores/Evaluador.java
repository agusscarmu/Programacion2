package EjercicioProgramadores;

import java.util.ArrayList;

public abstract class Evaluador {
    private String nombre;
    private ArrayList<String> conocimientos;
    private ArrayList<Trabajo> trabajoPosible;
    
    public Evaluador(String nombre) {
        this.nombre=nombre;
        this.conocimientos=new ArrayList<>();
        this.trabajoPosible = new ArrayList<>();
    }

    public abstract boolean esExperto();

    public String getNombre(){
        return nombre;
    }
    public void setConocimientos(String conocimiento){
        conocimientos.add(conocimiento);
    }
    public ArrayList<String> getConocimientos(){
        ArrayList<String> copiaConocimienos = new ArrayList<>(conocimientos);
        return copiaConocimienos;
    }
    public void addTrabajoPosible(ArrayList<Trabajo> trabajos){
        for(int i=0;i<trabajos.size();i++){
            if(!trabajos.get(i).esPoster()){
                if(trabajos.get(i).getPlabrasClaves().containsAll(conocimientos)){
                    trabajoPosible.add(trabajos.get(i));
                }
            }else{
                for(int j=0;j<conocimientos.size();j++){
                    if(trabajos.get(i).getPlabrasClaves().contains(conocimientos.get(j))){
                        trabajoPosible.add(trabajos.get(i));
                        break;
                    }
                }
            }
        }
    }
    public ArrayList<Trabajo> getTrabajosPosibles(){
        ArrayList<Trabajo> copiaTrabajosPosibles = new ArrayList<>(trabajoPosible);
        return copiaTrabajosPosibles;
    }
}
