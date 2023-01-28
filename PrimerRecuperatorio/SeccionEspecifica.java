package PrimerRecuperatorio;

import java.util.ArrayList;
import java.util.Comparator;

public class SeccionEspecifica extends Seccion {

    private ArrayList<String> categoriasAdmisibles;
    public SeccionEspecifica(String categoria,Comparator<PortalNoticia> Ordenanza) {
        super(categoria, Ordenanza);
        categoriasAdmisibles=new ArrayList<>();
    }
    
    public void agregarCategoriaAdmisible(String c){
        categoriasAdmisibles.add(c);
    }
    public void agregarElemento(PortalNoticia e){
        if(categoriasAdmisibles.contains(e.getCategoria())){
            elementos.add(e);
        }
    }

}
