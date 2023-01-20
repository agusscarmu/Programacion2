package EjercicioPuerto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Principal {

    public static void main(String[]args){
        ArrayList<Camion> camiones=new ArrayList<>();
        ArrayList<Barco> barcos = new ArrayList<>();
        Barco b1 = new Barco("Titanic", 400);
        Barco b2 = new Barco("Kraken", 1000);
        Barco b3 = new Barco("Carrier", 55400);
        Barco b4 = new Barco("Leviathan", 400000);
        Camion c1 = new Camion("Camion1", LocalDate.of(2022, 1, 8));
        Camion c2 = new Camion("Camion2", LocalDate.of(2022, 1, 9));
        Camion c3 = new Camion("Camion3", LocalDate.of(2022, 1, 7));
        Camion c4 = new Camion("Camion4", LocalDate.of(2021, 12, 20));
        camiones.add(c1);
        camiones.add(c2);
        camiones.add(c3);
        camiones.add(c4); 
        barcos.add(b1);
        barcos.add(b2);
        barcos.add(b3);
        barcos.add(b4);

        Puerto puerto = new Puerto(barcos,camiones);
        puerto.acomodarListaDeEspera();
        puerto.cargarBarco();
        puerto.cargarBarco();

        System.out.println(puerto);
        
        
        }
        
}
