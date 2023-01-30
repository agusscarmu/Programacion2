package PrimerRecuperatorio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import javax.sound.sampled.Port;

import PrimerRecuperatorio.Condiciones.Condicion;

public class Seccion extends PortalNoticia{
    protected ArrayList<PortalNoticia> elementos;
    private static Comparator<PortalNoticia> Ordenanza;

    
    public void setOrdenanza(Comparator<PortalNoticia> c){
        this.Ordenanza = c;
    }
    public Seccion(String categoria, Comparator<PortalNoticia> Ordenanza) {
        super(categoria);
        this.elementos=new ArrayList<>();
        this.Ordenanza= Ordenanza;
    }
    public void agregarElemento(PortalNoticia elemento){
        elementos.add(elemento);
        this.ordenar();
    }
    public ArrayList<PortalNoticia> getElementos(){
        ArrayList<PortalNoticia>elementosCopia = new ArrayList<>(elementos);
        return elementosCopia;
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

    protected void ordenar() {
        Collections.sort(elementos, Ordenanza);
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

