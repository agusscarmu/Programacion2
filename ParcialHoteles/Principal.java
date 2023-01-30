package ParcialHoteles;

import ParcialHoteles.Condiciones.Condicion;
import ParcialHoteles.Condiciones.CondicionAND;
import ParcialHoteles.Condiciones.CondicionDisponible;
import ParcialHoteles.Condiciones.CondicionMascota;
import ParcialHoteles.Condiciones.CondicionNOT;
import ParcialHoteles.Condiciones.CondicionXComodidad;
import ParcialHoteles.Condiciones.CondicionXSup;

public class Principal {
    
    public static void main(String[]args){
        
        Hotel CadenaGeneral = new Hotel();
        Hotel Cadena1 = new Hotel();
        Hotel Cadena2 = new Hotel();
        Hotel pabellon1 = new Hotel();
        Hotel pabellon2 = new Hotel();
        Hotel pabellon3 = new Hotel();
        Habitacion habitacion1 = new Habitacion(40, 3, true, true);
        Habitacion habitacion2 = new Habitacion(30, 2, true, false);
        Habitacion habitacion3 = new Habitacion(20, 2, false, true);
        Habitacion habitacion4 = new Habitacion(10, 1, true, true);
        Habitacion habitacion5 = new Habitacion(50, 4, true, false);
        
        ((Habitacion)habitacion1).agregarComodidad("Vista playa");
        ((Habitacion)habitacion2).agregarComodidad("Vista jardin");
        ((Habitacion)habitacion3).agregarComodidad("Lavarropa");
        ((Habitacion)habitacion4).agregarComodidad("Vista playa");
        ((Habitacion)habitacion5).agregarComodidad("Vista playa");
        ((Habitacion)habitacion5).agregarComodidad("Aire acondicionado");
        
        Condicion cDisp = new CondicionDisponible();
        Condicion cMasc= new CondicionMascota();
        Condicion cXComodidad= new CondicionXComodidad("Vista playa");
        Condicion cXSupf=new CondicionXSup(20);
        Condicion cXSupf2=new CondicionXSup(40);
        Condicion cNot=new CondicionNOT(cXSupf);
        Condicion cAnd = new CondicionAND(null, null);
        
        OrdenarXSupf ordXsupf= new OrdenarXSupf();
        ((Hotel)CadenaGeneral).setOrdenamiento(ordXsupf);
        
        CadenaGeneral.agregarElemento(Cadena1);
        CadenaGeneral.agregarElemento(Cadena2);
        Cadena1.agregarElemento(pabellon1);
        Cadena1.agregarElemento(pabellon2);
        Cadena2.agregarElemento(pabellon3);
        pabellon1.agregarElemento(habitacion1);
        pabellon1.agregarElemento(habitacion2);
        pabellon2.agregarElemento(habitacion3);
        pabellon2.agregarElemento(habitacion4);
        pabellon3.agregarElemento(habitacion5);
        
        Recepcion recepcion = new Recepcion();
        System.out.println(Cadena2.getSupf());   
    }
}
