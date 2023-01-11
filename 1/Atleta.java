public class Atleta{
    private int numeroAtleta;
    private String nombreAtleta;
    private float tiempoCarrera;

    public Atleta(int numeroAtleta, String nombreAtleta, float tiempoCarrera){
        this.numeroAtleta = numeroAtleta;
        this.nombreAtleta = nombreAtleta;
        this.tiempoCarrera = tiempoCarrera;
    }

    public float getTiempo(){
        return tiempoCarrera;
    }

    public void mostrarDatos(){
        System.out.print("numero de atleta: "+numeroAtleta+"\nnombre de atleta: "+nombreAtleta+"\ntiempo de carrera: "+tiempoCarrera);
    }
}