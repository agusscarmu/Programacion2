package PrefinalNoticias;

import java.util.ArrayList;
import java.util.Date;

public class NoticiaVentana extends Noticia{

    private Date fechaLimite;

    public NoticiaVentana(String titulo, String texto, String autor, String tema, Date fechaLimite) {
        super(titulo, texto, autor, tema);
        this.fechaLimite=fechaLimite;
    }

    public void setFechaLimite(Date fecha){
        fechaLimite=fecha;
    }

    @Override
    public void addComentario(Comentario c){
        Date fechaActual = new Date();
        if(fechaActual.before(fechaLimite)){
            super.addComentario(c);
        }
    }

    @Override
    public Noticia newInstancia(){
        return new NoticiaVentana(getTitulo(), getTexto(), getAutor(), getTema(), this.fechaLimite);
    }
    
}
