package EjercicioPersona;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[]args){
    int edad=0;
    int dni=0;
    String nombre="";
    String fechaNacimiento="";
    String sexo="";
    float peso=0;
    float altura=0;
    ArrayList<Persona> personas=new ArrayList<Persona>();
    ingresarDatos(personas,nombre,edad,dni,fechaNacimiento,sexo,peso,altura);
    imprimirDatos(personas);

    }

    public static void ingresarDatos(ArrayList<Persona> personas,String nombre,int edad,int dni,String fechaNacimiento,String sexo, float peso, float altura){
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        char x;
        boolean finalizado=false;
        try{
            while(finalizado == false){
            System.out.print("Ingrese nombre: ");
            nombre= new String(entrada.readLine());
            System.out.print("Ingrese edad: ");
            edad=new Integer(entrada.readLine());
            System.out.print("Ingrese dni: ");
            dni=new Integer(entrada.readLine());
            System.out.print("Ingrese fecha de nacimiento: ");
            fechaNacimiento=new String(entrada.readLine());
            System.out.print("Ingrese sexo: ");
            sexo=new String(entrada.readLine());
            System.out.print("Ingrese peso: ");
            peso=new Float(entrada.readLine());
            System.out.print("Ingrese altura: ");
            altura=new Float(entrada.readLine());
            personas.add(new Persona(dni, nombre, fechaNacimiento, edad, sexo, peso, altura));
            System.out.println("Presione Enter para agregar otra persona, o 'X' para salir");
            x=(char)entrada.read();
            if(x=='X'){
                finalizado=true;
            }
            }
        }catch(Exception exc){
            System.out.println(exc);
        }

    }

    public static void imprimirDatos(ArrayList<Persona> personas){
        for(int i=0; i<personas.size();i++){
            personas.get(i).getDatos();
            System.out.println("El indice de masa corporal es: "+personas.get(i).getImc());
            personas.get(i).verificarIMC(personas.get(i).getImc());
            personas.get(i).verifEdad();
            System.out.println("\n");
        }
    }
}
