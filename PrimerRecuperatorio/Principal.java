package PrimerRecuperatorio;

import java.util.Comparator;

import PrimerRecuperatorio.Condiciones.Condicion;
import PrimerRecuperatorio.Condiciones.CondicionAnd;
import PrimerRecuperatorio.Condiciones.CondicionXAutor;
import PrimerRecuperatorio.Condiciones.CondicionXCategoria;
import PrimerRecuperatorio.Condiciones.CondicionXContenido;
import PrimerRecuperatorio.Condiciones.CondicionXTitulo;

public class Principal {
    
    public static void main(String[]args){
        Noticiero noticiero=new Noticiero();

        Noticia noticia1 = new Noticia("Noticia policial de 1930", "Robo de banco en 1930", "Robert Bradley", "Policial", "Policia robo 1930");
        Noticia noticia2 = new Noticia("El nuevo libro de game of thrones", "Suenio de primavera", "George RR Martin", "Literatura", "Fantasia Medieval");
        Noticia noticia3 = new Noticia("Muertos en ucrania", "Robo de banco en 1930", "Robert Bradley", "Politica", "Ucrania Muertos Guerra");
        Noticia noticia4 = new Noticia("Se encuentra cura del covid", "Nuevas curas", "Charles F.", "Medicina", "Cura Covid Salud");
        Noticia noticia5 = new Noticia("Nuevo virus potencialmente peligroso", "Virus CPF290", "Charles F.", "Medicina", "Virus Salud");
        Noticia noticia6 = new Noticia("Nuevo libro de harry potter", "Harry Potter 9", "Literatura Noticias", "Literatura", "Libro HarryPotter Magia");
        Noticia noticia7 = new NoticiaPatrocinada("Primer noticia patrocinada", "Patrocinio de libro", "Patrocinado");
        Noticia noticia8 = new Noticia("Messi se quiebra", "Peligro del 10 loco!! AAAAA", "TyC Sport", "Futbol", "Futbol");
        Noticia noticia9 = new Noticia("Agustin quiere revancha con su padre", "El pibe es re porfiado", "Futbol", "Padel", "Padel");
        Noticia noticiaPrivada = new NoticiaPrivada("Peligro con cura del covid", "Nuevas curas fallan", "Charles F.", "Medicina", "Cura Covid Salud Peligro");

        Comparator<PortalNoticia> porCategoria = new XCategoria();
        Seccion seccion = new Seccion("PortalPrincipal", porCategoria);
        Seccion seccion1 = new Seccion("Policial", porCategoria);
        Seccion seccion2 = new Seccion("Literatura", porCategoria);
        Seccion seccion3 = new Seccion("Politica", porCategoria);
        Seccion seccion4 = new Seccion("Medicina", porCategoria);
        Seccion seccionPolicial = new SeccionEspecifica("Policial",porCategoria);
        Seccion seccionDeportes = new SeccionEspecifica("Deporte",porCategoria);
        
        Condicion cXt = new CondicionXTitulo("libro");
        Condicion cXc = new CondicionXCategoria("Medicina");
        Condicion cXa = new CondicionXAutor("Literatura Noticias");
        Condicion cXcont = new CondicionXContenido("libro");
        Condicion cAnd = new CondicionAnd(cXcont,cXa);
        
        Suscriptor suscriptor1 = new Suscriptor("Agustin", "agustincarmu99@gmail.com", cXc);
        Suscriptor suscriptor2 = new Suscriptor("Lucas", "lucascarmu@gmail.com", cXa);
        Suscriptor suscriptor3 = new Suscriptor("Tina", "tinape@gmail.com", cXcont);
        Suscriptor suscriptor4 = new Suscriptor("Leo", "leonciocarmu@gmail.com", cXt);
        
        noticiero.agregarSuscriptor(suscriptor1);
        noticiero.agregarSuscriptor(suscriptor2);
        noticiero.agregarSuscriptor(suscriptor3);
        noticiero.agregarSuscriptor(suscriptor4);

        noticiero.agregarNoticiaSuscriptores(noticia1);
        noticiero.agregarNoticiaSuscriptores(noticia2);
        noticiero.agregarNoticiaSuscriptores(noticia3);
        noticiero.agregarNoticiaSuscriptores(noticia4);
        noticiero.agregarNoticiaSuscriptores(noticia5);
        noticiero.agregarNoticiaSuscriptores(noticia6);
        noticiero.agregarNoticiaSuscriptores(noticia7);
        noticiero.agregarNoticiaSuscriptores(noticiaPrivada);


        seccion.agregarElemento(seccion1);
        seccion.agregarElemento(seccion2);
        seccion.agregarElemento(seccion3);
        seccion.agregarElemento(noticiaPrivada);
        seccion1.agregarElemento(noticia1);
        seccion1.agregarElemento(noticia2);
        seccion2.agregarElemento(noticia2);
        seccion2.agregarElemento(noticia6);
        seccion3.agregarElemento(noticia1);
        seccion3.agregarElemento(seccion4);
        seccion4.agregarElemento(noticia5);
        seccion4.agregarElemento(noticia4);
        seccion3.agregarElemento(noticia3);

        ((SeccionEspecifica)seccionDeportes).agregarCategoriaAdmisible("Futbol");
        ((SeccionEspecifica)seccionDeportes).agregarCategoriaAdmisible("Tenis");
        ((SeccionEspecifica)seccionDeportes).agregarCategoriaAdmisible("Padel");

        seccionDeportes.agregarElemento(noticia8);
        seccionDeportes.agregarElemento(noticia9);
        seccionPolicial.agregarElemento(noticia1);
        seccionPolicial.agregarElemento(noticia3);

        System.out.println(seccionDeportes);
        // noticiero.verSuscriptores();
        // System.out.println(seccion4);
        // System.out.println(seccion.filtrarPorCondicion(cXc)); 
        // System.out.println(seccion);
    }
}
