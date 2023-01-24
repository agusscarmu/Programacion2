package JuegoDeRol.Habilidades;


public abstract class HabilidadOfensiva extends Habilidad{

    public HabilidadOfensiva(String nombre, int poder, int coste) {
        super(nombre, poder, coste);
        ofensivo=true;
    }
    

    
}
