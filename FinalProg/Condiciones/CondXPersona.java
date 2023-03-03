package FinalProg.Condiciones;

import FinalProg.Carpeta;

public class CondXPersona extends Cond{

    private String persona;
    public CondXPersona(String persona){
        this.persona=persona;
    }
    @Override
    public boolean cumple(Carpeta elemento) {
        return elemento.getListaPersonas().contains(persona);
    }
    
}
