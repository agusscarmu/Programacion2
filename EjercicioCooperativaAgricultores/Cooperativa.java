package EjercicioCooperativaAgricultores;

import java.util.ArrayList;

public class Cooperativa{
    
    public static void main(String[]args){
        ArrayList<Cereal>cereal=new ArrayList<>();
        ArrayList<Lote> lote = new ArrayList<>();
        ArrayList<String> mineralesPrimarios = new ArrayList<>();
        minearalesPrimarios(mineralesPrimarios);
        agregarLote(lote);
        agregarCereal(cereal);
        calificarCereales(cereal,lote);
        calificarLote(lote,cereal,mineralesPrimarios);
        verLotes(lote);
        verCereales(cereal);
    }

    public static void calificarCereales(ArrayList<Cereal>cereal,ArrayList<Lote>lote){
        for(int i=0;i<cereal.size();i++){
            // cereal.get(i).asignarTipoDeCereal(lote);
            // cereal.get(i).addLotesPosibles(lote);
        }
        
    }
    public static void calificarLote(ArrayList<Lote>lote,ArrayList<Cereal>cereal,ArrayList<String> mineralesPrimarios){
        for(int i=0;i<lote.size();i++){
            lote.get(i).verCerealesPosibles(cereal);
            lote.get(i).esEspecial(mineralesPrimarios);
        }
    }
    public static void minearalesPrimarios(ArrayList<String>mineralesPrimarios){
        mineralesPrimarios.add("Bicarbonato");
        mineralesPrimarios.add("Agua mineralizada");
    }
    public static void agregarCereal(ArrayList<Cereal> cereal){
        cereal.add(new Cereal("Maiz"));
        cereal.get(0).addMineralNecesario("Carbon");
        cereal.get(0).addMineralNecesario("Agua");


        cereal.add(new Cereal("Trigo"));
        cereal.get(1).addMineralNecesario("Sal");
        cereal.get(1).addMineralNecesario("Agua");


        cereal.add(new Cereal("Avena"));
        cereal.get(2).addMineralNecesario("Sal");
        cereal.get(2).addMineralNecesario("Carbon");
        cereal.get(2).addMineralNecesario("Cloro");


        cereal.add(new Cereal("Alfalfa"));
        cereal.get(3).addMineralNecesario("Piedras");
        cereal.get(3).addMineralNecesario("Agua");

    }

    public static void agregarLote(ArrayList<Lote>lote){
        lote.add(new Lote("Lote 1",30));
        lote.get(0).addMinerales("Sal");
        lote.get(0).addMinerales("Agua");
        lote.get(0).addMinerales("Carbon");
        lote.get(0).addMinerales("Piedras");

        lote.add(new Lote("Lote 2",20));
        lote.get(1).addMinerales("Cloro");
        lote.get(1).addMinerales("Agua");

        lote.add(new Lote("Lote 3",100));
        lote.get(2).addMinerales("Sal");
        lote.get(2).addMinerales("Agua");
        lote.get(2).addMinerales("Carbon");
        lote.get(2).addMinerales("Piedras");
        lote.get(2).addMinerales("Agua mineralizada");
        lote.get(2).addMinerales("Bicarbonato");

    }

    public static void verLotes(ArrayList<Lote> lote){
        for(int i=0;i<lote.size();i++){
            System.out.println("Lote numero: "+(i+1));
            System.out.println("Minerales necesarios: ");
            for(int m=0;m<lote.get(i).getMinerales().size();m++){
                System.out.println(lote.get(i).getMinerales().get(m)); 
            }
            System.out.println("Cereales posibles en este lote: ");
            for(int c=0;c<lote.get(i).getCerealesPosibles().size();c++){
                System.out.println(lote.get(i).getCerealesPosibles().get(c).getNombre());
            }
            if(lote.get(i).getEspecial()){
                System.out.println("El lote es 'especial' y contiene: ");
                for(int j=0;j<lote.get(i).getLoteEspecial().getMineralesEspeciales().size();j++){
                    System.out.println(lote.get(i).getLoteEspecial().getMineralesEspeciales().get(j)); 
                }
            }else{
                System.out.println("El lote es 'comun'");
            }
            System.out.println("\n");
        }
    }

    public static void verCereales(ArrayList<Cereal> cereal){
        for(int i=0;i<cereal.size();i++){
            System.out.println("Cereal: "+cereal.get(i).getNombre());
            System.out.println("El cereal requiere de los siguientes minerales: ");
            for(int m=0;m<cereal.get(i).getMineralesNecesarios().size();m++){
                System.out.println(cereal.get(i).getMineralesNecesarios().get(m));
            }
            System.out.println("El cereal puede sembrarse en los siguientes lotes: ");
            for(int l=0;l<cereal.get(i).getLotesPosibles().size();l++){
                System.out.println(cereal.get(i).getLotesPosibles().get(l).getNombre());
            }
            System.out.println("\n");
        }
    }
}