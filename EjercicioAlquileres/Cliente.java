package EjercicioAlquileres;

import java.util.ArrayList;

public class Cliente{
    private String nombre;
    private ArrayList<Producto>alquiler;

    public Cliente(String nombre){
        this.nombre=nombre;
        this.alquiler=new ArrayList<>();
    }

    public String getNombre(){
        return nombre;
    }

    public void alquilar(Producto alquilar, int tiempoDeAlquiler, int dia, int mes, int anio){
        if(alquilar.Disponible()){
            alquiler.add(alquilar);
            alquilar.alquilar(tiempoDeAlquiler, dia, mes, anio);
        }
    }
    public void mostrarAlquileres(){
        for(int i=0;i<alquiler.size();i++){
            System.out.println(alquiler.get(i).getEtiqueta());
            System.out.println("Estado: ");
            if(alquilerVencido(i)){
                System.out.println("Vencido");
            }else{
                System.out.println("En vigencia");
            }
        }
    }
    public boolean alquilerVencido(int i){
        if(alquiler.get(i).getFechaFinAlquiler().before(alquiler.get(i).getFechaActual())){
            return true;
        }
        
        return false;
    }
}
