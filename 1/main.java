import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class main {
    
    public static void main(String[]args){
        int numeroAtleta=0;
        String nombreAtleta="";
        float tiempoCarrera=0;
        Scanner sc = new Scanner(System.in);
        Atleta atleta[]=new Atleta[cantidadParticipantes(sc)];
        cargarDatos(atleta, numeroAtleta, nombreAtleta, tiempoCarrera);
        buscarGanador(atleta);
    }
    
    public static int cantidadParticipantes(Scanner sc){
        int cantidad=0;
        System.out.println("Introduzca la cantidad de participantes: ");
        cantidad= sc.nextInt();
        return cantidad;
    }

    public static void cargarDatos(Atleta []atleta,int numeroAtleta, String nombreAtleta, float tiempoCarrera){
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0; i<atleta.length;i++){
            try{
            System.out.print("introduzca el numero de Atleta: ");
            numeroAtleta= new Integer(entrada.readLine());
            System.out.print("introduzca el nombre de Atleta: ");
            nombreAtleta= new String(entrada.readLine());
            System.out.print("introduzca el tiempo de carrera: ");
            tiempoCarrera= new Float(entrada.readLine());
            }catch(Exception exc){
                System.out.println(exc);
            }
            
            atleta[i]=new Atleta(numeroAtleta, nombreAtleta, tiempoCarrera);
        }
    }

    public static void buscarGanador(Atleta[]atleta){
        int num=0;
        float menorTiempo = atleta[0].getTiempo();

        for(int i=1;i<atleta.length;i++){
            if(atleta[i].getTiempo()<menorTiempo){
                menorTiempo=atleta[i].getTiempo();
                num=i;
            }
        }
        mostrarGanador(num, atleta);
    }

    public static void mostrarGanador(int num, Atleta[]atleta){
        System.out.println("El ganador de la carrera es: ");
        atleta[num].mostrarDatos();
    }
}
