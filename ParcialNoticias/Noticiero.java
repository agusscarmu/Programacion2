package ParcialNoticias;

import java.util.ArrayList;

import ParcialNoticias.Condiciones.Condicion;
import ParcialNoticias.Condiciones.CondicionAnd;
import ParcialNoticias.Condiciones.CondicionXAutor;
import ParcialNoticias.Condiciones.CondicionXTitulo;

public class Noticiero {

    public Noticiero(){

    }

    public void ejecutar(){

        Condicion cXa = new CondicionXAutor("George");
        Condicion cXt = new CondicionXTitulo("Harry Potter");
        Condicion cXAnd = new CondicionAnd(cXa,cXt);


        Suscriptores suscriptor1=new Suscriptores("Agustin", "agustincarmu99@gmail.com", cXa);
        Suscriptores suscriptor2=new Suscriptores("Tina", "agustina@gmail.com", cXAnd);

        ArrayList<Suscriptores>subs=new ArrayList<>();
        subs.add(suscriptor1);
        subs.add(suscriptor2);

        CompararxCategoria porCategoria = new CompararxCategoria();

        Noticia noticia1=new Noticia("Harry Potter", "Harryaaaa", "llala", "Fantasia");
        Noticia noticia2=new Noticia("Harry Potter", "Harryabbbbbbb", "George", "Fantasia");
        Noticia noticia3=new Noticia("Perros", "aaaaaa", "George", "Animales");
        Seccion Principal=new Seccion("Principal", porCategoria);
        Seccion SeccionGeneral=new Seccion("Seccion1", porCategoria);
        SeccionEspecial SeccionFantasia=new SeccionEspecial("Fantasia", porCategoria);

        Principal.agregarElemento(SeccionFantasia);
        Principal.agregarElemento(SeccionGeneral);
        SeccionFantasia.agregarCategoriaAdmisible("Fantasia");
        SeccionFantasia.agregarElemento(noticia1);
        SeccionFantasia.agregarElemento(noticia2);
        SeccionFantasia.agregarElemento(noticia3);
        SeccionGeneral.agregarElemento(noticia3);

        for(Suscriptores s:subs){
            s.setNoticias(Principal.getElementosFiltrados(s.getCondicion()));
        }
        System.out.println(SeccionFantasia);
        // System.out.println(subs);

    }
    
}
