package PrimerRecuperatorio;

import java.util.ArrayList;
import java.util.Collections;

import PrimerRecuperatorio.Condiciones.Condicion;

public class Seccion extends PortalNoticia{
    protected ArrayList<PortalNoticia> elementos;
    XCategoria porCategoria;

    public Seccion(String categoria) {
        super(categoria);
        elementos=new ArrayList<>();
        porCategoria=new XCategoria();
    }
    public void agregarElemento(PortalNoticia elemento){
        elementos.add(elemento);
    }
    public ArrayList<PortalNoticia> getElementos(){
        return elementos;
    }

    @Override
    public String getPalabrasClave() {
        String palabrasClave="";
        for(PortalNoticia e:elementos){
            if(!(palabrasClave.contains(e.getPalabrasClave())))
            palabrasClave+=e.getPalabrasClave();
        }
       return palabrasClave;
    }

    public void ordenarPorCategoria() {
        for(PortalNoticia e:elementos){
            e.ordenarPorCategoria();
        }
        Collections.sort(elementos, porCategoria);
    }

    @Override
    public String toString() {
        return "\nCategoria: "+getCategoria()+", Palabras claves: "+getPalabrasClave()+", Elementos: "+getElementos().toString();
    }
    @Override
    public ArrayList<PortalNoticia> filtrarPorCondicion(Condicion condicion) {
        ArrayList<PortalNoticia>e=new ArrayList<>();
        for(PortalNoticia elements:elementos){
            e.addAll(elements.filtrarPorCondicion(condicion));
        }       
        return e;
    }
    
}

