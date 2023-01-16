package EjercicioProgramadores;

import java.util.ArrayList;

public class Congreso {
    private ArrayList<Evaluador> evaluadores;
    private ArrayList<Trabajo> trabajos;

    public Congreso(){
        this.evaluadores=new ArrayList<>();
        this.trabajos=new ArrayList<>();
    }
    
    public void agregarEvaluadores(){
        evaluadores.add(new EvaluadorGeneral("Agustin"));
        evaluadores.get(0).setConocimientos("Lenguajes");
        evaluadores.get(0).setConocimientos("Algoritmos");

        evaluadores.add(new EvaluadorExperto("Lucas"));
        evaluadores.get(1).setConocimientos("Redes");
        evaluadores.get(1).setConocimientos("Visualizacion");

    }

    public void agregarTrabajos(){
        trabajos.add(new ArticuloResumen("Diario Virtual"));
        trabajos.get(0).setPalabraClave("Redes");
        trabajos.get(0).setPalabraClave("Visualizacion");

        trabajos.add(new Poster("Mundial"));
        trabajos.get(1).setPalabraClave("Lenguajes");
        trabajos.get(1).setPalabraClave("Visualizacion");
        
        trabajos.add(new ArticuloResumen("Trabajo de investigacion"));
        trabajos.get(2).setPalabraClave("Algoritmos");
        trabajos.get(2).setPalabraClave("Lenguajes");
    }

    public void addTrabajosPosibles(){
        for(int i=0;i<evaluadores.size();i++){
            evaluadores.get(i).addTrabajoPosible(trabajos);
        }
    }

    public void addEvaluadoresPosibles(){
        for(int i=0;i<trabajos.size();i++){
            trabajos.get(i).addEvaluadorPosible(evaluadores);
        }
    }

    public void verTrabajosDeEvaluadores(Evaluador evaluador){
        for(int i=0;i<evaluador.getTrabajosPosibles().size();i++){
            System.out.println(evaluador.getTrabajosPosibles().get(i).getTituloDeTrabajo()); 
        }   
    }

    public void verEvaluadoresDeTrabajos(Trabajo trabajos){
        for(int i=0;i<trabajos.getEvaluadoresPosibles().size();i++){
            System.out.println(trabajos.getEvaluadoresPosibles().get(i).getNombre()); 
        }
    }

    public void verEmpresa(){
        for(int i=0;i<evaluadores.size();i++){
            System.out.println("Evaluador: "+ evaluadores.get(i).getNombre());
            if(evaluadores.get(i).esExperto()){
                System.out.println("Es experto");
            }else{
                System.out.println("Es general");
            }
            System.out.println("Cantidad de trabajos: " + evaluadores.get(i).getTrabajosPosibles().size());
            System.out.println("Trabajos posibles: ");
            verTrabajosDeEvaluadores(evaluadores.get(i));
            System.out.println("\n");
        }
        System.out.println("\n");
        for(int i=0;i<trabajos.size();i++){
            System.out.println("Trabajo: "+ trabajos.get(i).getTituloDeTrabajo());
            System.out.println("Evaluadores posibles: ");
            verEvaluadoresDeTrabajos(trabajos.get(i));
            System.out.println("\n");

        }
    }
}
