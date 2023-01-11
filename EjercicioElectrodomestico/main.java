package EjercicioElectrodomestico;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;

public class main {
    public static void main(String[]args){
        String nombre="";
        float precioBase=0;
        String color="";
        int consumoElectrico=0;
        float peso=0;
        ArrayList<Electrodomestico>electrodomesticos=new ArrayList<Electrodomestico>();
        cargarDatos(electrodomesticos,nombre,precioBase,color,consumoElectrico,peso);
        electrodomesticos.get(0).getDatos();
    }

    public static void cargarDatos(ArrayList<Electrodomestico> electrodomesticos, String nombre, float precioBase, String color, int consumoElectrico, float peso){
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.print("Ingrese el nombre del producto: ");
            nombre=new String(entrada.readLine());
            System.out.print("Ingrese el precio del producto: ");
            precioBase = new Float(entrada.readLine());
            System.out.print("Ingrese el color del producto: ");
            color= new String(entrada.readLine());
            System.out.print("Ingrese el consumo electrico del producto: ");
            consumoElectrico = new Integer(entrada.readLine());
            System.out.print("Ingrese el peso del producto: ");
            peso= new Float(entrada.readLine());
        }catch(Exception exc){
            System.out.println(exc);
        }
        electrodomesticos.add(new Electrodomestico(nombre,precioBase,color,consumoElectrico,peso));

    }
}
