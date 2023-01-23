package JuegoDeRol;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import JuegoDeRol.Armas.Arma;
import JuegoDeRol.Enemigos.Troll;
import JuegoDeRol.Hechizos.Hechizo;
import JuegoDeRol.Hechizos.HechizoDeFuego;

public class Menu {
    
    public static void main (String[]args){
        Arma espada = new Arma("Espada", 15, 10, 2);
        Arma martillo = new Arma("Martillo", 40, 30, 0);
        Arma lanza = new Arma("Lanza", 20, 15, 1);
        Arma daga = new Arma("Daga", 10, 5, 3);

        Hechizo bolaDeFuego = new HechizoDeFuego("Bola de fuego", 30, 15);

        Personaje jugador = new Jugador("iSpectroh", 100, 544440, 7000, 40000000, espada, bolaDeFuego,10);

        Personaje troll = new Troll("Gadunta", 300, 40, 80, "Fuego",0); 

        Dado dado = new Dado();
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        while(jugador.getVida()>0 && troll.getVida()>0){
            try{
            boolean turnoJugador = true;
            boolean critico = false;
            int accion = 0;
            System.out.println("Turno de: "+jugador.getNombre());
            while(turnoJugador){
                System.out.println("1 para atacar con: "+((Jugador)jugador).getArma().getNombre()+" o 2 si desea tirar hechizo: "+((Jugador)jugador).getHechizo());
                accion = new Integer(entrada.readLine());
                if(dado.tirarDado(jugador.getCritico())==0){
                    System.out.println("Fallo critico!");
                    turnoJugador=false;
                    break;
                }else if(dado.tirarDado(jugador.getCritico())>9){
                    System.out.println("CRITICO!");
                    critico=true;
                }
                if(accion==1){
                    jugador.atacar(troll,critico);
                    turnoJugador=false;
                }else if(accion==2){
                    ((Jugador)jugador).atacarConMagia(troll,critico);
                    turnoJugador=false;
                }else{
                    System.out.println("Introduzca un valor entre los solicitados o vas a morir");
                }
                
            }
                critico=false;
            if(dado.tirarDado(troll.getCritico())==0){
                System.out.println("Fallo critico de "+troll.getNombre()+"!");
            }else if(dado.tirarDado(troll.getCritico())>9){
                System.out.println("CRITICO DE "+troll.getNombre()+"!");
                critico=true;
            }
            troll.atacar(jugador, critico);

            troll.recuperacion(2);
            jugador.recuperacion(3);

            System.out.println("\nDATOS DE JUGADOR: \nVIDA: "+jugador.getVida()+"\nESTAMINA: "+jugador.getEstamina()+"\nMANA: "+((Jugador)jugador).getMana()+"\n\nDATOS DE ENEMIGO: \nVIDA: "+troll.getVida()+"\nESTAMINA: "+troll.getEstamina());

            }catch(Exception exc){
                System.out.println(exc);
            }
            if(jugador.getVida()<0){
                System.out.println("\n"+jugador.getNombre()+" ha muerto!");
            }
            if(troll.getVida()<0){
                System.out.println("\n"+troll.getNombre()+" ha muerto!");
            }
        }
        
    }
}
