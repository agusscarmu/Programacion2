package EjercicioBioinformatica;

public class Proteina extends ADN{
    private int numeroDeAminoacidos;
    private String funcionBiologica;

    public Proteina(String nombre, int numeroDeAminoacidos, String funcionBiologica) {
        super(nombre);
        this.numeroDeAminoacidos = numeroDeAminoacidos;
        this.funcionBiologica = funcionBiologica;
    }
    public String getFuncion(){
        return funcionBiologica;
    }
    @Override
    public String toString() {
        return "\nNombre de proteina: "+getNombre()+" Numero de aminoacidos: "+numeroDeAminoacidos+" Funcion biologica: "+funcionBiologica;
    }
}
