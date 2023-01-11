import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class EscuelaHogwarts {
    
    public static void main(String[]args){
        ArrayList<Alumno> alumnos = new ArrayList<>();
        SombreroSeleccionador sombreroSeleccionador = new SombreroSeleccionador();
        agregarAlumno(alumnos);
        ponerSombrero(alumnos, sombreroSeleccionador);
    }

    public static void agregarAlumno(ArrayList<Alumno> alumnos){
        alumnos.add(new Alumno("Agustin"));
        alumnos.get(0).setCualidad("Artes oscuras");
        alumnos.get(0).setCualidad("Inteligencia");
        alumnos.get(0).setCualidad("Valentia");
        // alumnos.get(0).setCualidad("Fuerza");
        alumnos.get(0).addFamiliar("Malfoy");

        alumnos.add(new Alumno("Lucas"));
        alumnos.get(1).setCualidad("Fuerza");
        alumnos.get(1).setCualidad("Inteligencia");
        alumnos.get(1).setCualidad("Valentia");
        
        alumnos.add(new Alumno("Agustina"));
        alumnos.get(2).setCualidad("Inteligencia");
        alumnos.get(2).setCualidad("Astucia");
        alumnos.get(2).setCualidad("Buen corazon");
        alumnos.get(2).addFamiliar("Raven");

        alumnos.add(new Alumno("Leonel"));
        alumnos.get(3).setCualidad("Buen corazon");
        alumnos.get(3).setCualidad("Inteligencia");
        alumnos.get(3).setCualidad("Artes oscuras");
        alumnos.get(3).addFamiliar("Agustin");

    }

    public static void ponerSombrero(ArrayList<Alumno> alumnos, SombreroSeleccionador sombreroSeleccionador){
        boolean finalizado=false;
        while(finalizado==false){
            try{
                BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("A que alumno desea ponerle el sombrero?: ");
                int alumno = new Integer(entrada.readLine());
                sombreroSeleccionador.seleccionarCasa(alumno, alumnos);
                System.out.println(sombreroSeleccionador.anuncio());
                System.out.print("Presione 'Enter' si desea colocar el Sombrero Seleccionador a otro alumno. 'X' para salir.");
                char comando = (char)entrada.read();
                if(comando=='X'){
                    finalizado=true;
                }
            }catch(Exception exc){
                System.out.println(exc);
            }
        }
    }
}
