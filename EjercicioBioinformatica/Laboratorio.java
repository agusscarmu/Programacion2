package EjercicioBioinformatica;

import java.util.ArrayList;

public class Laboratorio {
    
    public static void main (String[]args){
        EstudioGenomico estudioGenomico = new EstudioGenomico();
        EstudioProteico estudioProteico = new EstudioProteico();
        Gen gen1 = new Gen("BRCA2", "GTUCAUTG");
        Gen gen2 = new Gen("BRCA1", "GTAUUGUTG");
        Gen gen3 = new Gen("p53", "ATTGAUCA");
        Gen gen4 = new Gen("APOE", "ACTTTGA");
        Gen gen5 = new Gen("CFTR", "TTTGGAAU");

        
        Proteina p1 = new Proteina("BRCA1", 5994, "reparacion");
        Proteina p2 = new Proteina("BRCA2", 5793, "reparacion");
        Proteina p3 = new Proteina("p53", 49572, "regulacion");
        Proteina p4 = new Proteina("APOE", 482, "regulacion");
        Proteina p5 = new Proteina("CFTR", 4999, "regulacion");
        Proteina p6 = new Proteina("beta-globina", 5994, "produccion");
        
        gen1.agregarProteinasCodificadas(p1);
        gen1.agregarProteinasCodificadas(p2);
        gen2.agregarProteinasCodificadas(p1);
        gen2.agregarProteinasCodificadas(p2);
        gen3.agregarProteinasCodificadas(p3);
        gen4.agregarProteinasCodificadas(p4);
        gen5.agregarProteinasCodificadas(p5);
        gen5.agregarProteinasCodificadas(p6);


        estudioGenomico.agregarGenes(gen1);
        estudioGenomico.agregarGenes(gen2);
        estudioGenomico.agregarGenes(gen3);
        estudioGenomico.agregarGenes(gen4);
        estudioGenomico.agregarGenes(gen5);

        estudioProteico.agregarProteinas(p1);
        estudioProteico.agregarProteinas(p2);
        estudioProteico.agregarProteinas(p3);
        estudioProteico.agregarProteinas(p4);
        estudioProteico.agregarProteinas(p5);
        estudioProteico.agregarProteinas(p6);
 
        ArrayList<ADN>busqueda=estudioProteico.buscar("reparacion");
        System.out.println(busqueda);
    }
}
