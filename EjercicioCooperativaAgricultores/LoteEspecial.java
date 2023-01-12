package EjercicioCooperativaAgricultores;

import java.util.ArrayList;

public class LoteEspecial extends Lote{
    ArrayList<String>mineralesEspeciales;
    public LoteEspecial(String nombre, int superficie, ArrayList<String> minerales, ArrayList<String> mineralesEspeciales,ArrayList<Cereal> cerealesPosibles) {
        super(nombre,superficie);
        this.mineralesEspeciales=mineralesEspeciales;
    }
    
    public ArrayList<String> getMineralesEspeciales(){
        return mineralesEspeciales;
    }
    
}
