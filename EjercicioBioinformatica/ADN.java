package EjercicioBioinformatica;

public abstract class ADN {
    
    private String nombre;

    public ADN(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }
}
