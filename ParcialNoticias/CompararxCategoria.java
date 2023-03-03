package ParcialNoticias;

import java.util.Comparator;

public class CompararxCategoria implements Comparator<PortalNoticias>{

    @Override
    public int compare(PortalNoticias o1, PortalNoticias o2) {
        return o1.getCategoria().compareTo(o2.getCategoria());
    }
    
}
