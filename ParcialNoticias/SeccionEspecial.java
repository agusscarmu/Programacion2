package ParcialNoticias;

import java.util.ArrayList;
import java.util.Comparator;

public class SeccionEspecial extends Seccion{

    ArrayList<String> categoriasAdmisibles;
    public SeccionEspecial(String categoria, Comparator<PortalNoticias> ordenanza) {
        super(categoria, ordenanza);
        this.categoriasAdmisibles=new ArrayList<>();
    }
    
    public void agregarCategoriaAdmisible(String categoria){
        categoriasAdmisibles.add(categoria);
    }
    @Override
    public void agregarElemento(PortalNoticias elemento){
        if(categoriasAdmisibles.contains(elemento.getCategoria())){
            elementos.add(elemento);
        }
    }
}
