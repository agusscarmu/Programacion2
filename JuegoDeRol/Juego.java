package JuegoDeRol;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

import JuegoDeRol.Grupos.Grupo;
import JuegoDeRol.Grupos.Aliados.Jugador;
import JuegoDeRol.Grupos.Enemigos.Enemigo;


public class Juego {
    Grupo aliados;
    Grupo enemigos;
    BufferedReader entrada;
    Dado dado;
    Random r;
    final static int NroDeAcciones=2;

    public Juego(Grupo enemigos, Grupo aliados){
        this.entrada = new BufferedReader(new InputStreamReader(System.in));
        this.enemigos=enemigos;
        this.aliados=aliados;
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
                boolean critico = false;
                int accion = 0;
                int objetivo = 0;
                while(turnoJugador){
                    if(((Jugador)aliado).getVida()<0){
                        break;
                    }
                    System.out.println("\nTurno de: "+((Jugador)aliado).getNombre());
                    while(accion<1){
                System.out.println("1 para atacar con: "+((Jugador)aliado).getArma().getNombre()+" o 2 si desea tirar hechizo: "+((Jugador)aliado).getHechizo().getNombre());
                accion = new Integer(entrada.readLine());
                if(accion==2 && (!((Jugador)aliado).getHechizo().esOfensivo())){
                    curacion(aliado,objetivo);
                    turnoJugador=false;
                    break;
                }
                if(accion>NroDeAcciones){
                    accion=0;
                    System.out.println("Ingresa un valor entre las opciones disponibles.");
                }
                }
                if(!turnoJugador){break;}
                System.out.println("A que objetivo desea atacar?");
                objetivo = (new Integer(entrada.readLine()))-1;
                if(objetivo>(enemigo.size()-1)){
                    System.out.println("Elija entre los objetivos presentes.");
                }else if(enemigo.get(objetivo).getVida()<0){
                System.out.println("\nEl objetivo esta muerto, intenta otro objetivo");
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
                            turnoJugador=false;
                        }else{
                            ((Jugador)aliado).utilizarMagia(enemigo.get(objetivo),critico,((Jugador)aliado).getMana());
                            turnoJugador=false;
                        } 
                        if(enemigo.get(objetivo).getVida()<0){
                            System.out.println("\n"+enemigo.get(objetivo).getNombre()+" ha muerto");
                        }}
                    }
                }
                             
            catch(Exception e){
                System.out.println(e);
            }              
        }                           
    }
    public void turnoEnemigo(Grupo enemigo){
        int objetivo = 0;
        for(Grupo e:enemigo.getGrupo()){
        boolean critico=false;
            if(e.getVida()>0){
                if(critico(enemigo)>0){
                    System.out.println("CRITICO DE "+((Enemigo)e).getNombre()+"!");
                    critico=true;
                }
                if(critico(enemigo)<0){
                    System.out.println("Fallo critico de "+((Enemigo)e).getNombre()+"!");
                    break;
                }
                objetivo=r.nextInt(aliados.getGrupo().size());
                ((Enemigo)e).atacar(((Jugador)aliados.getGrupo().get(objetivo)), critico); 
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
            }else{
                if(critico(aliado)>0){
                    System.out.println("CRITICO!");
                    critico=true;
                }
                if(critico(aliado)<0){
                    System.out.println("Fallo Critico!");
                    break;
                }
                ((Jugador)aliado).utilizarMagia(aliados.getGrupo().get(objetivo),critico,((Jugador)aliado).getVida());
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
}
                                                            