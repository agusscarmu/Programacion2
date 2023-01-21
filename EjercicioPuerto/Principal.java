package EjercicioPuerto;

import java.time.LocalDate;
public class Principal {

    public static void main(String[]args){

        Puerto puerto = new Puerto();
        Barco b1 = new Barco("Titanic", 400);
        Barco b2 = new Barco("Kraken", 1000);
        Barco b3 = new Barco("Carrier", 55400);
        Barco b4 = new Barco("Leviathan", 400000);
        Camion c1 = new Camion("Camion1", LocalDate.of(2022, 1, 8));
        Camion c2 = new Camion("Camion2", LocalDate.of(2022, 1, 9));
        Camion c3 = new Camion("Camion3", LocalDate.of(2022, 1, 7));
        Camion c4 = new Camion("Camion4", LocalDate.of(2021, 12, 20));
        puerto.agregarCamion(c1);
        puerto.agregarCamion(c2);
        puerto.agregarCamion(c3);
        puerto.agregarCamion(c4); 
        puerto.agregarBarco(b1);
        puerto.agregarBarco(b2);
        puerto.agregarBarco(b3);
        puerto.agregarBarco(b4);

        puerto.acomodarListaDeEspera();
        puerto.cargarBarco();
        puerto.cargarBarco();
        puerto.cargarBarco();


        System.out.println(puerto);
        
        
        }
        
}
