package JuegoDeRol.Habilidades;


public abstract class HabilidadDefensiva extends Habilidad {

    public HabilidadDefensiva(String nombre, int poder, int coste) {
        super(nombre, poder, coste);
        ofensivo=false;
    }
    
}
