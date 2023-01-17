package EjercicioAlquileres;

import java.util.ArrayList;

import javax.xml.crypto.KeySelector.Purpose;

/* 
Para evitar convertirse en un nuevo Blockbuster, un videoclub de barrio ha decidido diversificarse e 
incorporar a su cartera de negocios el alquiler de autos. Para modernizarse, abandonará los registros en papel 
e implementará un sistema unificado de alquiler. El sistema debe permitir alquilar un determinado ítem a un 
cliente hasta una fecha determinada y llevar control de los ítems alquilados a cada cliente. Las películas poseen 
información filmográfica y la cantidad de copias que se dispone de la misma. De los vehículos, se registra marca, 
kms y patente. Los vehículos pueden ser eléctricos, nafteros o diesel. Una película puede ser alquilada si hay copias 
aún disponibles, mientras que los vehículos sólo pueden ser alquilados a un cliente por vez.
Se debe proveer además la funcionalidad necesaria para permitir conocer quiénes son los clientes que poseen 
alquileres vencidos.
*/ 
public class VideoClub {
    public static void main(String[]args){
        ArrayList<Producto> producto=new ArrayList<>();
        ArrayList<Cliente> cliente=new ArrayList<>();
        agregarElementos(producto, cliente);
        alquilar(producto,cliente);
        verClientes(cliente);
        
    }

    public static void agregarElementos(ArrayList<Producto> producto, ArrayList<Cliente> cliente){
        producto.add(new Auto("Audi", 36000, "AB452CD", true));
        producto.add(new Auto("Ford", 4999, "AC582JF", true));
        producto.add(new Auto("Honda", 16000, "AC717PP", true));

        producto.add(new Pelicula("Titanic",4));
        producto.add(new Pelicula("Avatar",3));
        producto.add(new Pelicula("Interestelar",8));

        cliente.add(new Cliente("Agustin"));
        cliente.add(new Cliente("Leonel"));
        cliente.add(new Cliente("Lucas"));
        cliente.add(new Cliente("Agustina"));
    }

    public static void alquilar(ArrayList<Producto> producto,ArrayList<Cliente> cliente){
        cliente.get(0).alquilar(producto.get(0),30,15,00,2023);
        producto.get(0).alquilado();

        cliente.get(1).alquilar(producto.get(3),5,10,01,2021);
        producto.get(4).alquilado();

        cliente.get(2).alquilar(producto.get(4),30,28,10,2022);
        producto.get(3).alquilado();

        cliente.get(3).alquilar(producto.get(0),20,3,00,2023);
        producto.get(2).alquilado();

        
    }

    public static void verClientes(ArrayList<Cliente>clientes){
        for(int i=0;i<clientes.size();i++){
            System.out.println("Nombre del cliente: "+clientes.get(i).getNombre());
            System.out.println("Alquileres en disposicion: ");
            clientes.get(i).mostrarAlquileres();
            System.out.println("\n");
        }
    }
}
