package PrimerRecuperatorio;

import java.util.Collection;
import java.util.Comparator;

import javax.sound.sampled.Port;

public class XCategoria implements Comparator<PortalNoticia> {

    @Override
    public int compare(PortalNoticia o1, PortalNoticia o2) {
        return o1.getCategoria().compareTo(o2.getCategoria());
    }
    
}
