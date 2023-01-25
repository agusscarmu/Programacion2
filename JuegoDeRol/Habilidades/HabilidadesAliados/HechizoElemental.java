package JuegoDeRol.Habilidades.HabilidadesAliados;

import JuegoDeRol.Habilidades.HabilidadOfensiva;

public abstract class HechizoElemental extends HabilidadOfensiva{

    protected String naturaleza;
    public HechizoElemental(String nombre, int poder, int coste) {
        super(nombre, poder, coste);
    }
    public String getNaturaleza(){
        return this.naturaleza;
    }
    @Override
    public String toString() {
        return "Nombre del hechizo: "+getNombre()+", Poder: "+getPoder()+", Coste: "+getCoste()+", Naturaleza: "+getNaturaleza();
    }
}
