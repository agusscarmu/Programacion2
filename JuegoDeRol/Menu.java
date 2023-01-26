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
import JuegoDeRol.Grupos.Enemigos.Duende;
import JuegoDeRol.Grupos.Enemigos.Enemigo;
import JuegoDeRol.Grupos.Enemigos.Mazmorra;
import JuegoDeRol.Grupos.Enemigos.Troll;
import JuegoDeRol.Habilidades.Habilidad;
import JuegoDeRol.Habilidades.HabilidadesAliados.HechizoCurativo;
import JuegoDeRol.Habilidades.HabilidadesAliados.HechizoDeFuego;
import JuegoDeRol.Habilidades.HabilidadesAliados.HechizoDeHielo;
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

        Grupo mazmorras = new Mazmorra();

        Grupo mazmorraTroll = new Mazmorra("Cueva de Trolls");
        Grupo trollSala1 = new Mazmorra();
        Grupo trollSala2 = new Mazmorra();
        Grupo trollSala3 = new Mazmorra();

        Grupo mazmorraDuende = new Mazmorra("Bosque de duendes");
        Grupo duendeSala1 = new Mazmorra();
        Grupo duendeSala2 = new Mazmorra();
        Grupo duendeSala3 = new Mazmorra();

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
        Habilidad hechizoDeHielo = new HechizoDeHielo("Aliento gelido", 35, 40);

        ArrayList<ElementosUtilizables> conjuros = new ArrayList<>();
        conjuros.add(bolaDeFuego);
        conjuros.add(hechizoDeSangre);
        conjuros.add(auraCurativa);
        conjuros.add(hechizoDeHielo);

        Personaje jugador = new Jugador("iSpectroh", 100, 20,100,7000, 10, arco, hechizoDeHielo, pocionDeVida,10);
        Personaje aliado1 = new Jugador("Tina", 100, 10,100, 300, 80, guadania, bolaDeFuego, pocionDeVida, 20);
        Personaje aliado2 = new Jugador("Terah", 100, 40,100, 300, 20, martillo, auraCurativa, pocionDeMana, 0);
        Personaje aliado3 = new Jugador("Escaldaron", 100, 5,100, 300, 80, daga, bolaDeFuego, pocionDeMana,10);

        Personaje trollJoven = new Troll("Troll joven", 200, 10, 45, 80,0); 
        Personaje trollAdulto = new Troll("Troll adulto", 340, 15, 60, 82,0); 
        Personaje trollAnciano = new Troll("Troll anciano", 400, 10, 80, 30,0); 
        Personaje trollJefe = new Troll("Jefe troll", 1000, 15, 85, 100,1); 

        Personaje duendeSalvaje = new Duende("Duende salvaje", 130, 8, 30, 80,2); 
        Personaje duendeChaman = new Duende("Duende chaman", 150, 6, 40, 82,1); 
        Personaje duendeJefe = new Duende("Jefe duende", 200, 10, 60, 30,2); 
        Personaje duendeJoven = new Duende("Duende joven", 80, 5, 25, 100,0); 


        grupoAliado.agregarIntegrante(((Grupo)jugador));
        grupoAliado.agregarIntegrante(((Grupo)aliado1));
        grupoAliado.agregarIntegrante(((Grupo)aliado2));
        grupoAliado.agregarIntegrante(((Grupo)aliado3));

        mazmorras.agregarIntegrante(mazmorraTroll);
        mazmorras.agregarIntegrante(mazmorraDuende);

        mazmorraDuende.agregarIntegrante((Grupo)duendeSala1);
        mazmorraDuende.agregarIntegrante((Grupo)duendeSala2);
        mazmorraDuende.agregarIntegrante((Grupo)duendeSala3);

        duendeSala1.agregarIntegrante((Enemigo)duendeChaman);
        duendeSala1.agregarIntegrante((Enemigo)duendeSalvaje);
        duendeSala2.agregarIntegrante((Enemigo)duendeJefe);
        duendeSala2.agregarIntegrante((Enemigo)trollJoven);
        duendeSala3.agregarIntegrante((Enemigo)duendeJoven);
        duendeSala3.agregarIntegrante((Enemigo)duendeSalvaje);

        mazmorraTroll.agregarIntegrante((Grupo)trollSala1);
        mazmorraTroll.agregarIntegrante((Grupo)trollSala2);
        mazmorraTroll.agregarIntegrante((Grupo)trollSala3);

        trollSala1.agregarIntegrante((Enemigo)trollJoven);
        trollSala1.agregarIntegrante((Enemigo)trollJoven);
        trollSala2.agregarIntegrante((Enemigo)trollAnciano);
        trollSala2.agregarIntegrante((Enemigo)trollJefe);
        trollSala2.agregarIntegrante((Enemigo)trollAnciano);
        trollSala3.agregarIntegrante((Enemigo)trollJoven);
        trollSala3.agregarIntegrante((Enemigo)trollAnciano);
        trollSala3.agregarIntegrante((Enemigo)trollAdulto);

        Juego juego = new Juego(mazmorras, grupoAliado, arsenal, conjuros, pociones);
        
        ((Mazmorra)mazmorras).ordenarSalas();
        // ((Mazmorra)mazmorraDuende).ordenarSalas();
        // ((Mazmorra)mazmorraTroll).ordenarSalas();

        juego.jugar();
        
        
    }
}
