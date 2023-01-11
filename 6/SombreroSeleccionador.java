import java.util.ArrayList;

public class SombreroSeleccionador {
    private Casa gryffindor = new Casa();
    private Casa hufflepuff = new Casa();
    private CasaDeSangre slytherin = new CasaDeSangre();
    private CasaDeSangre ravenclaw = new CasaDeSangre();
    private String anuncio;

    public SombreroSeleccionador(){
        this.gryffindor = new Casa("Gryffindor", "Fuerza", "Valentia", 5, slytherin);
        this.slytherin = new CasaDeSangre("Slytherin", "Artes oscuras", "Inteligencia", 4, "Malfoy");
        this.ravenclaw = new CasaDeSangre("Ravenclaw", "Astucia", "Inteligencia", 4, "Raven", hufflepuff);
        this.hufflepuff = new Casa("Hufflepuff", "Descubrimiento", "Buen Corazon", 4);

    }
    
    public void seleccionarCasa(int alumno, ArrayList<Alumno>alumnos){
        boolean casaSeleccionada=false;
        boolean Gryffindor=false;
        boolean Slytherin=false;
        boolean Ravenclaw=false;
        boolean Hufflepuff=false;
        
        while(casaSeleccionada==false){
        
        Gryffindor=requisitosCasa(gryffindor, alumno, alumnos);
        Slytherin=requisitosCasa(slytherin, alumno, alumnos);
        Ravenclaw=requisitosCasa(ravenclaw, alumno, alumnos);
        Hufflepuff=requisitosCasa(hufflepuff, alumno, alumnos);
        
        if(Gryffindor){
            agregarAlumno(gryffindor, alumno, alumnos);
            this.anuncio="Gryffindor!";
            break;
        }
        if(Slytherin){
            agregarAlumno(slytherin, alumno, alumnos);
            this.anuncio="Slytherin!";
            break;
        }
        if(Ravenclaw){
            agregarAlumno(ravenclaw, alumno, alumnos);
            this.anuncio="Ravenclaw!";
            break;
        }
        if(Hufflepuff){
            agregarAlumno(hufflepuff, alumno, alumnos);
            this.anuncio="Hufflepuff!";
            break;
        }
        }
    }
    public void agregarAlumno(Casa casa, int alumno, ArrayList<Alumno>alumnos){
        if(casa.getAlumnos().size()<casa.cantMax()){
            agregarACasa(casa, alumno, alumnos);
        }else{
            this.anuncio="La casa no acepta mas estudiantes.";
        }
    }
    public boolean requisitosCasa(Casa casa, int alumno, ArrayList<Alumno>alumnos){
        if(alumnos.get(alumno).getCualidades().containsAll(casa.getCualidades())){
            switch(casa.getNombre()){
                case "Slytherin":
                    if(alumnos.get(alumno).getFamiliares().containsAll(slytherin.getFamiliar())){
                        return true;
                    }else{
                        return false;
                    }
                case "Gryffindor":
                    if(alumnos.get(alumno).getCualidades().containsAll(gryffindor.getCasaEnemiga().getCualidades())){
                        agregarACasa(gryffindor, alumno, alumnos);
                        this.anuncio="Gryffindor!";
                        return true;
                    }else{
                        return true;
                    }
                case "Hufflepuff":
                    return true;
                case "Ravenclaw":
                    if(alumnos.get(alumno).getFamiliares().containsAll(ravenclaw.getFamiliar())){
                        if(alumnos.get(alumno).getCualidades().containsAll(ravenclaw.getCasaEnemiga().getCualidades())){
                            agregarACasa(gryffindor, alumno, alumnos);
                            this.anuncio="Ravenclaw!";
                            return true;
                        }else{
                            return true;
                        }
                    }
            }
        }
        return false;
    }
    public void agregarACasa(Casa casa,int alumno, ArrayList<Alumno>alumnos){
        casa.addAlumno(alumnos.get(alumno).getNombre());
    }

    public String anuncio(){
        return anuncio;
    }
}
