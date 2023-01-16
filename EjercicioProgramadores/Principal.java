package EjercicioProgramadores;

public class Principal {
    
    public static void main (String[]args){
        Congreso congreso = new Congreso();
        congreso.agregarEvaluadores();
        congreso.agregarTrabajos();
        congreso.addTrabajosPosibles();
        congreso.addEvaluadoresPosibles();
        congreso.verEmpresa();
    }

}
