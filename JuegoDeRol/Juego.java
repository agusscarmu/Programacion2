package JuegoDeRol;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

import javax.sound.midi.Soundbank;

import JuegoDeRol.Grupos.Grupo;
import JuegoDeRol.Grupos.Aliados.Jugador;
import JuegoDeRol.Grupos.Enemigos.Enemigo;


public class Juego {
    Grupo aliados;
    Grupo enemigos;
    BufferedReader entrada;
    Dado dado;
    Random r;

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
        while(aliados.verVida()>0 && enemigo.verVida()>0){ 
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
        if(enemigo.verVida()<0)
        System.out.println("\nSala "+sala+" completada");
        else
        System.out.println("\nPerdiste en la sala "+sala);

        sala++;
        }
        
    }

    public void turnoAliado(ArrayList<Grupo> enemigo){
        boolean finalizado=false;
        for(Grupo aliado: aliados.getGrupo()){
            if(finalizado){
                System.out.println("\nBatalla ganada\n");
                break;
            }
            try{
                boolean turnoJugador = true;
                boolean critico = false;
                int accion = 0;
                int objetivo = 0;
                System.out.println("\nTurno de: "+((Jugador)aliado).getNombre());
                while(turnoJugador){
                    while(accion<1){
                System.out.println("1 para atacar con: "+((Jugador)aliado).getArma().getNombre()+" o 2 si desea tirar hechizo: "+((Jugador)aliado).getHechizo().getNombre());
                accion = new Integer(entrada.readLine());
                if(accion>2){
                    accion=0;
                    System.out.println("Ingresa un valor entre las opciones disponibles.");
                }
                }
                System.out.println("A que objetivo desea fijar?");
                objetivo = (new Integer(entrada.readLine()))-1;
                if(accion==2 && (!((Jugador)aliado).getHechizo().esOfensivo()) && (objetivo>(aliados.getGrupo().size()-1))){
                    System.out.println("Elija entre los objetivos presentes.");
                }else if((((Jugador)aliado).getHechizo().esOfensivo()) && objetivo>(enemigo.size()-1)){
                    System.out.println("Elija entre los objetivos presentes.");
                    if(enemigo.get(objetivo).getVida()<0)
                        System.out.println("\nEl objetivo esta muerto, intenta otro objetivo");
                }else{
                    if(dado.tirarDado(((Jugador)aliado).getCritico())==0){
                        System.out.println("Fallo critico!");
                        break;
                    }else if(dado.tirarDado(((Jugador)aliado).getCritico())>9){
                        System.out.println("CRITICO!");
                        critico=true;
                    }
                    if(accion==1){
                            ((Jugador)aliado).atacar(enemigo.get(objetivo),critico);
                            turnoJugador=false;
                    }else{
                        if(((Jugador)aliado).getHechizo().esOfensivo()){
                            ((Jugador)aliado).utilizarMagia(enemigo.get(objetivo),critico);
                            turnoJugador=false;
                            if(enemigo.get(objetivo).getVida()<0){
                                System.out.println(enemigo.get(objetivo).getNombre()+" ha muerto");
                            }
                        }else{
                            ((Jugador)aliado).utilizarMagia(aliados.getGrupo().get(objetivo),critico);
                            turnoJugador=false;
                        }
                    } 
                }
                }
                }             
            catch(Exception e){
                System.out.println(e);
            }
            int conteo=0;
            for(Grupo e:enemigo){
                if(e.getVida()<0){
                    conteo++;
                    if(conteo==enemigo.size()){
                        finalizado=true;
                    }
                }
            }                      
        }                           
    }
    public void turnoEnemigo(Grupo enemigo){
        int objetivo = 0;
        for(Grupo e:enemigo.getGrupo()){
        boolean critico=false;
            if(e.getVida()>0){
                if(dado.tirarDado(((Enemigo)e).getCritico())==0){
                    System.out.println("Fallo critico de "+((Enemigo)e).getNombre()+"!");
                }else if(dado.tirarDado(((Enemigo)e).getCritico())>9){
                        System.out.println("CRITICO DE "+((Enemigo)e).getNombre()+"!");
                        critico=true;
                }
                objetivo=r.nextInt(aliados.getGrupo().size());
                ((Enemigo)e).atacar(((Jugador)aliados.getGrupo().get(objetivo)), critico); 
            }   
        }
    }
    
}
                                                            