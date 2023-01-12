package EjercicioCooperativaAgricultores;

import java.util.ArrayList;

public class Cooperativa{
    
    public static void main(String[]args){
        ArrayList<CerealCosechaGruesa> cerealCosechaGruesa = new ArrayList<>();
        ArrayList<CerealCosechaFina> cerealFino = new ArrayList<>();
        ArrayList<Pastura> pastura = new ArrayList<>();
        ArrayList<Lote> lote = new ArrayList<>();
        ArrayList<String> mineralesPrimarios = new ArrayList<>();
        minearalesPrimarios(mineralesPrimarios);
        agregarLote(lote);
        agregarCereal(cerealCosechaGruesa, cerealFino, pastura, lote);
        calificarLote(lote,cerealCosechaGruesa, cerealFino, pastura,mineralesPrimarios);
        verLotes(lote);
        verCereales(cerealCosechaGruesa, cerealFino, pastura);
    }

    public static void calificarLote(ArrayList<Lote>lote, ArrayList<CerealCosechaGruesa> cerealCosechaGruesa, ArrayList<CerealCosechaFina>cerealCosechaFina, ArrayList<Pastura>pastura,ArrayList<String> mineralesPrimarios){
        for(int i=0;i<lote.size();i++){
            lote.get(i).verCerealesPosibles(cerealCosechaGruesa,cerealCosechaFina,pastura);
            lote.get(i).esEspecial(mineralesPrimarios);
        }
    }
    public static void minearalesPrimarios(ArrayList<String>mineralesPrimarios){
        mineralesPrimarios.add("Bicarbonato");
        mineralesPrimarios.add("Agua mineralizada");
    }
    public static void agregarCereal(ArrayList<CerealCosechaGruesa> cerealCosechaGruesa, ArrayList<CerealCosechaFina>cerealCosechaFina, ArrayList<Pastura>pastura, ArrayList<Lote>lotes){

        cerealCosechaGruesa.add(new CerealCosechaGruesa("Maiz"));
        cerealCosechaGruesa.get(0).addMineralNecesario("Carbon");
        cerealCosechaGruesa.get(0).addMineralNecesario("Agua");
        cerealCosechaGruesa.get(0).addLotesPosibles(lotes);



        cerealCosechaFina.add(new CerealCosechaFina("Trigo"));
        cerealCosechaFina.get(0).addMineralNecesario("Sal");
        cerealCosechaFina.get(0).addMineralNecesario("Agua");
        cerealCosechaFina.get(0).addLotesPosibles(lotes);


        cerealCosechaFina.add(new CerealCosechaFina("Avena"));
        cerealCosechaFina.get(1).addMineralNecesario("Sal");
        cerealCosechaFina.get(1).addMineralNecesario("Carbon");
        cerealCosechaFina.get(1).addMineralNecesario("Cloro");
        cerealCosechaFina.get(1).addLotesPosibles(lotes);


        pastura.add(new Pastura("Alfalfa"));
        pastura.get(0).addMineralNecesario("Piedras");
        pastura.get(0).addMineralNecesario("Agua");
        pastura.get(0).addLotesPosibles(lotes);

    }

    public static void agregarLote(ArrayList<Lote>lote){
        lote.add(new Lote("Lote 1",30));
        lote.get(0).addMinerales("Sal");
        lote.get(0).addMinerales("Cloro");
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

    public static void verCereales(ArrayList<CerealCosechaGruesa> cerealCosechaGruesa, ArrayList<CerealCosechaFina>cerealCosechaFina, ArrayList<Pastura>pastura){
        for(int i=0;i<cerealCosechaGruesa.size();i++){
            System.out.println("Cereal: "+cerealCosechaGruesa.get(i).getNombre());
            System.out.println("El cereal requiere de los siguientes minerales: ");
            for(int m=0;m<cerealCosechaGruesa.get(i).getMineralesNecesarios().size();m++){
                System.out.println(cerealCosechaGruesa.get(i).getMineralesNecesarios().get(m));
            }
            System.out.println("El cereal puede sembrarse en los siguientes lotes: ");
            for(int l=0;l<cerealCosechaGruesa.get(i).getLotesPosibles().size();l++){
                System.out.println(cerealCosechaGruesa.get(i).getLotesPosibles().get(l).getNombre());
            }
            System.out.println("\n");
        }
        for(int i=0;i<cerealCosechaFina.size();i++){
            System.out.println("Cereal: "+cerealCosechaFina.get(i).getNombre());
            System.out.println("El cereal requiere de los siguientes minerales: ");
            for(int m=0;m<cerealCosechaFina.get(i).getMineralesNecesarios().size();m++){
                System.out.println(cerealCosechaFina.get(i).getMineralesNecesarios().get(m));
            }
            System.out.println("El cereal puede sembrarse en los siguientes lotes: ");
            for(int l=0;l<cerealCosechaFina.get(i).getLotesPosibles().size();l++){
                System.out.println(cerealCosechaFina.get(i).getLotesPosibles().get(l).getNombre());
            }
            System.out.println("\n");
        }
        for(int i=0;i<pastura.size();i++){
            System.out.println("Cereal: "+pastura.get(i).getNombre());
            System.out.println("El cereal requiere de los siguientes minerales: ");
            for(int m=0;m<pastura.get(i).getMineralesNecesarios().size();m++){
                System.out.println(pastura.get(i).getMineralesNecesarios().get(m));
            }
            System.out.println("El cereal puede sembrarse en los siguientes lotes: ");
            for(int l=0;l<pastura.get(i).getLotesPosibles().size();l++){
                System.out.println(pastura.get(i).getLotesPosibles().get(l).getNombre());
            }
            System.out.println("\n");
        }
    }
}