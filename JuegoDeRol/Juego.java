package JuegoDeRol;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

import JuegoDeRol.Grupos.Grupo;
import JuegoDeRol.Grupos.Aliados.Jugador;
import JuegoDeRol.Grupos.Enemigos.Enemigo;
import JuegoDeRol.Pociones.Pocion;


public class Juego {
    Grupo aliados;
    Grupo enemigos;
    BufferedReader entrada;
    Dado dado;
    Random r;
    ArrayList<ElementosUtilizables> arsenal;
    ArrayList<ElementosUtilizables> conjuros;
    ArrayList<ElementosUtilizables> pociones;
    final static int NroDeAcciones=6;
    final static int NroDeAccionesInteractivas=3;

    public Juego(Grupo enemigos, Grupo aliados, ArrayList<ElementosUtilizables> arsenal, ArrayList<ElementosUtilizables> conjuros, ArrayList<ElementosUtilizables> pociones){
        this.entrada = new BufferedReader(new InputStreamReader(System.in));
        this.enemigos=enemigos;
        this.aliados=aliados;
        this.arsenal=arsenal;
        this.conjuros=conjuros;
        this.pociones=pociones;
        this.dado=new Dado();
        this.r = new Random();
    }

    public void jugar(){
        int sala=1;
        for(Grupo enemigo: enemigos.getGrupo()){
            System.out.println("\nSala: "+sala);
        while(!estadoPartida(aliados.getGrupo()) && !estadoPartida(enemigo.getGrupo())){ 
            System.out.println("\n");       
            for(int i=0;i<enemigo.getGrupo().size();i++){
                System.out.println("Enemigo: "+(i+1)+"-"+enemigo.getGrupo().get(i).getNombre()+", Vida: "+((Grupo)enemigo).getGrupo().get(i).getVida());
            }
            System.out.println("\n");       
            for(int i=0;i<aliados.getGrupo().size();i++){
                System.out.println("Aliado: "+aliados.getGrupo().get(i).getNombre()+", Vida: "+aliados.getGrupo().get(i).getVida()+", Estamina: "+aliados.getGrupo().get(i).getEstamina()+", Mana: "+((Jugador)aliados.getGrupo().get(i)).getMana());
            }
        turnoAliado(enemigo.getGrupo());
        turnoEnemigo(enemigo);
        aliados.setRecuperacion(5);
        enemigos.setRecuperacion(4);  
        }
        if(estadoPartida(enemigo.getGrupo())){
        System.out.println("\nSala "+sala+" completada");
        }
        if(estadoPartida(aliados.getGrupo())){
        System.out.println("\nPerdiste en la sala "+sala);
        break;
        }
        for(ElementosUtilizables pocion:pociones){
            ((Pocion)pocion).cargarUsos();
        }
        sala++;
        }
        
    }

    public void turnoAliado(ArrayList<Grupo> enemigo){
        for(Grupo aliado: aliados.getGrupo()){
            if(estadoPartida(enemigo)){
                System.out.println("BATALLA GANADA!");
                break;
            }
            if(estadoPartida(aliados.getGrupo())){
                System.out.println("BATALLA PERDIDA");
                break;
            }    
            try{
                boolean turnoJugador = true;
                boolean pocionUsada=false;
                boolean critico = false;
                int objetivo = 0;
                while(turnoJugador){
                    int esCritico=critico(aliado);
                    int accion = 0;
                    if(((Jugador)aliado).getVida()<0){
                        break;
                    }
                    System.out.println("\nTurno de: "+((Jugador)aliado).getNombre());
                    while(accion<1){
                        System.out.println("1 Para atacar con: "+((Jugador)aliado).getArma().getNombre()+"\n2 Para tirar hechizo: "+((Jugador)aliado).getHechizo().getNombre()
                            +"\n3 Para usar: "+((Jugador)aliado).getPocion().getNombre()+"\n4 Para cambiar de arma\n5 Para cambiar de hechizo\n6 Para cambiar de pocion");
                        accion = new Integer(entrada.readLine());
                        if(accion>NroDeAcciones){
                            accion=0;
                            System.out.println("Ingresa un valor entre las opciones disponibles.");
                        }
                            switch (accion) {
                                case 1:
                                    while(turnoJugador){
                                        atacar(enemigo, esCritico, aliado, accion);
                                        turnoJugador=false;
                                        break;
                                        }
                                        break;
                                case 2:
                                    if(((Jugador)aliado).getHechizo().esOfensivo()){
                                        while(turnoJugador){
                                            atacar(enemigo, esCritico, aliado, accion);
                                            turnoJugador=false;
                                            break;
                                            }
                                            break;
                                    }else{
                                        while(turnoJugador){
                                            curacion(aliado,objetivo);
                                            turnoJugador=false;
                                            break;
                                        }
                                        break;
                                    }
                                case 3:
                                    if(!pocionUsada){
                                    if(usarPocion(aliado)){
                                        pocionUsada=true;
                                        break;
                                    }
                                    else
                                    break;
                                    }else
                                        System.out.println("Ya usaste una pocion en este turno");                                       
                                        break;
                                    
                                case 4:
                                    equipar(aliado,arsenal,accion);
                                    accion=0;
                                    break;
                                case 5:
                                    equipar(aliado,conjuros,accion);
                                    accion=0;
                                    break;
                                case 6:
                                    equipar(aliado,pociones,accion);
                                    accion=0;
                                    break;
                            }
                        }
                    }
                }
                             
            catch(Exception e){
                System.out.println(e);
            }              
        }                           
    }
    public boolean usarPocion(Grupo aliado){
        if(((Jugador)aliado).getPocion().getUsos()<1){
            System.out.println("No tenes mas usos disponibles");
            return false;
        }else{
            ((Jugador)aliado).usarPocion();
            return true;
        }
    }
    public void atacar(ArrayList<Grupo>enemigo, int esCritico, Grupo aliado, int accion){
        int objetivo;
        boolean ataque=false;
        boolean critico=false;
        while(!ataque){
            try{
                System.out.println("A enemigo desea atacar?");
                objetivo=new Integer(entrada.readLine())-1;
            if(objetivo>enemigo.size()-1){
                System.out.println("Elija un enemigo presente");
            }else{
                if(critico(aliado)>0){
                    System.out.println("CRITICO!");
                    critico=true;
                }
                if(critico(aliado)<0){
                    System.out.println("Fallo Critico!");
                    break;
                }
                if(accion==1){
                    ((Jugador)aliado).atacar(enemigo.get(objetivo),critico);
                    ataque=true;
                }else{
                    ((Jugador)aliado).utilizarMagia(enemigo.get(objetivo),critico,((Jugador)aliado).getManaMaximo());
                    ataque=true;
                }
            }
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
    public void turnoEnemigo(Grupo enemigo){
        int objetivo = 0;
        for(Grupo e:enemigo.getGrupo()){
        boolean critico=false;
        boolean atacado=false;
        int esCritico=critico(e);
            if(e.getVida()>0){
                while(!atacado){
                    if(esCritico>0){
                        System.out.println("CRITICO DE "+((Enemigo)e).getNombre()+"!");
                        critico=true;
                    }
                    if(esCritico<0){
                        System.out.println("Fallo critico de "+((Enemigo)e).getNombre()+"!");
                        break;
                    }
                    objetivo=r.nextInt(aliados.getGrupo().size());
                    if(aliados.getGrupo().get(objetivo).getVida()>0){
                    ((Enemigo)e).atacar((aliados.getGrupo().get(objetivo)), critico);
                    atacado=true;
                    } 
                }
                if(aliados.getGrupo().get(objetivo).getVida()<0){
                    System.out.println(aliados.getGrupo().get(objetivo).getNombre()+" ha muerto!");
                }

            }   
        }
    }
    public void curacion(Grupo aliado,int objetivo){
        boolean curado=false;
        boolean critico=true;
        while(!curado){
            try{
                System.out.println("A que aliado desea curar?");
                objetivo=new Integer(entrada.readLine())-1;
            if(objetivo>aliados.getGrupo().size()-1){
                System.out.println("Elija un aliado presente");
            }else if(aliados.getGrupo().get(objetivo).getVida()<0){
                System.out.println("El aliado esta muerto, elija a otro aliado para curar");
            }else{
                if(critico(aliado)>0){
                    System.out.println("CRITICO!");
                    critico=true;
                }
                if(critico(aliado)<0){
                    System.out.println("Fallo Critico!");
                    break;
                }
                ((Jugador)aliado).utilizarMagia(aliados.getGrupo().get(objetivo),critico,((Jugador)aliado).getVidaMaxima());
                curado=true;
            }
            }catch(Exception exc){
            System.out.println(exc);
            }
        }
    }
    public int critico(Grupo personaje){
        int tirarDado=dado.tirarDado(((Personaje)personaje).getCritico());
        if(tirarDado==0){
            return -1;
        }else if(tirarDado>9){
            return 1;
        }else 
            return 0;
    }
    public boolean estadoPartida(ArrayList<Grupo>grupo){
        int conteo=0;
            for(Grupo e:grupo){
                if(e.getVida()<0){
                    conteo++;
                    if(conteo==grupo.size()){
                        return true;
                    }
                }
            }           
        return false;
    }
    public void equipar(Grupo aliado, ArrayList<ElementosUtilizables> elemento, int accion){
        int eleccion;
        boolean decision=false;
        try{
            while(!decision){
                System.out.println("Elija cual desea equipar para "+aliado.getNombre());
                for(int i=0;i<elemento.size();i++){
                System.out.println((i+1)+"-"+(elemento.get(i)));
                }
                eleccion=new Integer(entrada.readLine())-1;
                if(eleccion<elemento.size()){
                    if(accion==4){
                        ((Jugador)aliado).setArma(elemento.get(eleccion));
                        decision=true;
                    }
                    if(accion==5){
                        ((Jugador)aliado).setHechizo(elemento.get(eleccion));
                        decision=true;
                    }
                    if(accion==6){
                        ((Jugador)aliado).setPocion(elemento.get(eleccion));
                        decision=true;
                    }
                }else{
                    System.out.println("Elija entre las opciones indicadas");
                }
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
                                                            