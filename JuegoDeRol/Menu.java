package JuegoDeRol;


import java.util.ArrayList;

import JuegoDeRol.Armas.Arco;
import JuegoDeRol.Armas.Arma;
import JuegoDeRol.Armas.ArmaDual;
import JuegoDeRol.Armas.Daga;
import JuegoDeRol.Armas.Espada;
import JuegoDeRol.Armas.Guadania;
import JuegoDeRol.Armas.Lanza;
import JuegoDeRol.Armas.Martillo;
import JuegoDeRol.Grupos.Grupo;
import JuegoDeRol.Grupos.Aliados.EquipoAliado;
import JuegoDeRol.Grupos.Aliados.Jugador;
import JuegoDeRol.Grupos.Enemigos.Enemigo;
import JuegoDeRol.Grupos.Enemigos.Mazmorra;
import JuegoDeRol.Grupos.Enemigos.Troll;
import JuegoDeRol.Habilidades.Habilidad;
import JuegoDeRol.Habilidades.HabilidadesAliados.HechizoCurativo;
import JuegoDeRol.Habilidades.HabilidadesAliados.HechizoDeFuego;
import JuegoDeRol.Habilidades.HabilidadesAliados.HechizoDeSangre;
import JuegoDeRol.Pociones.Pocion;
import JuegoDeRol.Pociones.PocionDeMana;
import JuegoDeRol.Pociones.PocionDeVida;

public class Menu {
    
    public static void main (String[]args){
        Arma espada = new Espada("Espada", 15, 10, 2);
        Arma martillo = new Martillo("Martillo", 40, 30,40);
        Arma lanza = new Lanza("Lanza", 20, 15, 1);
        Arma daga = new Daga("Daga", 10, 5, 3);
        Arma arco = new Arco("Arco curvo", 15, 10, 90, 10);
        Arma guadania = new Guadania("Parca", 14, 10);
        Arma espadasDuales = new ArmaDual("Espadas gemelas", 15, 15, 1);

        Pocion pocionDeVida = new PocionDeVida("Pocion de vida", 50, 10, 3);
        Pocion pocionDeMana = new PocionDeMana("Pocion de mana", 70, 10, 3);
        ArrayList<ElementosUtilizables> pociones = new ArrayList<>();
        pociones.add(pocionDeVida);
        pociones.add(pocionDeMana);

        Grupo mazmorra = new Mazmorra();
        Grupo sala1 = new Mazmorra();
        Grupo sala2 = new Mazmorra();
        Grupo sala3 = new Mazmorra();

        Grupo grupoAliado = new EquipoAliado();

        ArrayList<ElementosUtilizables> arsenal = new ArrayList<>();
        arsenal.add(espada);
        arsenal.add(martillo);
        arsenal.add(lanza);
        arsenal.add(daga);
        arsenal.add(arco);
        arsenal.add(guadania);
        arsenal.add(espadasDuales);

        Habilidad bolaDeFuego = new HechizoDeFuego("Bola de fuego", 30, 15);
        Habilidad auraCurativa = new HechizoCurativo("Aura curativa", 70, 50);
        Habilidad hechizoDeSangre = new HechizoDeSangre("Ruptura sangrienta", 40, 40);

        ArrayList<ElementosUtilizables> conjuros = new ArrayList<>();
        conjuros.add(bolaDeFuego);
        conjuros.add(hechizoDeSangre);
        conjuros.add(auraCurativa);

        Personaje jugador = new Jugador("iSpectroh", 100, 20,54400440,7000, 10, arco, bolaDeFuego, pocionDeVida,10);
        Personaje aliado1 = new Jugador("Tina", 100, 10,400, 300, 80, guadania, bolaDeFuego, pocionDeVida, 20);
        Personaje aliado2 = new Jugador("Terah", 100, 40,200, 300, 20, martillo, auraCurativa, pocionDeMana, 0);
        Personaje aliado3 = new Jugador("Escaldaron", 100, 5,600, 300, 80, daga, bolaDeFuego, pocionDeMana,10);

        Personaje troll1 = new Troll("Gadunta", 300, 10, 40, 80, "Fuego",0); 
        Personaje troll2 = new Troll("Gorfo", 340, 10, 43, 82, "Hielo",0); 
        Personaje troll3 = new Troll("Fordo", 240, 10, 205, 50, "Rayo",0); 
        Personaje troll4 = new Troll("Menasko", 100, 10, 200, 40, "Fuego",0); 
        Personaje troll5 = new Troll("Gyono", 200, 10, 30, 80, "Agua",0); 
        Personaje troll6 = new Troll("Poro", 300, 10, 80, 90, "Fuego",0); 
        Personaje troll7 = new Troll("Fualta", 400, 10, 740, 100, "Oscuridad",2); 

        grupoAliado.agregarIntegrante(((Grupo)jugador));
        grupoAliado.agregarIntegrante(((Grupo)aliado1));
        grupoAliado.agregarIntegrante(((Grupo)aliado2));
        grupoAliado.agregarIntegrante(((Grupo)aliado3));

        mazmorra.agregarIntegrante((Grupo)sala1);
        mazmorra.agregarIntegrante((Grupo)sala2);
        mazmorra.agregarIntegrante((Grupo)sala3);

        sala1.agregarIntegrante((Enemigo)troll1);
        sala1.agregarIntegrante((Enemigo)troll2);
        sala2.agregarIntegrante((Enemigo)troll3);
        sala2.agregarIntegrante((Enemigo)troll4);
        sala3.agregarIntegrante((Enemigo)troll5);
        sala3.agregarIntegrante((Enemigo)troll6);
        sala3.agregarIntegrante((Enemigo)troll7);

        Juego juego = new Juego(mazmorra, grupoAliado, arsenal, conjuros, pociones);
        
        ((Mazmorra)mazmorra).ordenarSalas();
        juego.jugar();
        
        
    }
}
