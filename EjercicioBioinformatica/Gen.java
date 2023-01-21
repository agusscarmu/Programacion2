package EjercicioBioinformatica;

import java.util.ArrayList;

public class Gen extends ADN{
    private String secuenciaADN;
    private ArrayList<Proteina> proteinasCodificadas;

    public Gen(String nombre, String secuenciaADN) {
        super(nombre);
        this.secuenciaADN = secuenciaADN;
        this.proteinasCodificadas=new ArrayList<>();
    }
    public void agregarProteinasCodificadas(Proteina proteina){
        proteinasCodificadas.add(proteina);
    }
    @Override
    public String toString() {
        return "Nombre del gen: "+getNombre()+" Secuencia ADN: "+secuenciaADN+" Proteinas codificadas: "+proteinasCodificadas.toString();
    }
}
