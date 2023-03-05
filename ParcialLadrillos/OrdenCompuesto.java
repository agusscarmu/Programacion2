package ParcialLadrillos;

import java.util.Comparator;

public class OrdenCompuesto implements Comparator<ElementosLadrillos>{
    Comparator<ElementosLadrillos> orden1,orden2;

    public OrdenCompuesto(Comparator<ElementosLadrillos> orden1, Comparator<ElementosLadrillos> orden2){
        this.orden1=orden1;
        this.orden2=orden2;
    }

    @Override
    public int compare(ElementosLadrillos o1, ElementosLadrillos o2) {
        int c=orden1.compare(o1, o2);

        if(c!=0){
            return c;
        }else{
            return orden2.compare(o1, o2);
        }
    }
    
}
