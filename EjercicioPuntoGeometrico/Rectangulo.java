package EjercicioPuntoGeometrico;

public class Rectangulo{
    private int verticeX1;
    private int verticeX2;
    private int verticeY1;
    private int verticeY2;
    PuntoGeometrico punto;

    public Rectangulo(int newX, int newY){
        this.verticeX1= 0;
        this.verticeX2= newX;
        this.verticeY1= 0;
        this.verticeY2= newY;
    }


    public int getVerticeX1(){
        return verticeX1;
    }
    public int getVerticeX2(){
        return verticeX2;
    }
    public int getVerticeY1(){
        return verticeY1;
    }
    public int getVerticeY2(){
        return verticeY2;
    }


    public void setVerticeX1(int x){
        this.verticeX2=x;
    }
    public void setVerticeX2(int x){
        this.verticeX2=x;
    }
    public void setVerticeY1(int y){
        this.verticeY2=y;
    }
    public void setVerticeY2(int y){
        this.verticeY2=y;
    }

    public void setDesplazamiento(int desplazamientoX, int desplazamientoY){
        this.verticeX1= getVerticeX1()+desplazamientoX;
        this.verticeX2= getVerticeX2()+desplazamientoX;
        this.verticeY1= getVerticeY1()+desplazamientoY;
        this.verticeY2= getVerticeY2()+desplazamientoY;
    }

    public int medirAltura(){
        int altura=0;
        if(getVerticeY2()>getVerticeY1()){
            altura=getVerticeY2()-getVerticeY1();
        }else{
            altura=getVerticeY1()-getVerticeY2();
        }
        return altura;
    }
    public int medirBase(){
        int base=0;
        if(getVerticeX2()>getVerticeX1()){
            base=getVerticeX2()-getVerticeX1();
        }else{
            base=getVerticeX1()-getVerticeX2();
        }
        return base;
    }

    public double calcularArea(int base, int altura){
        double area=0;
        area= base*altura;
        return area;
    }

    public int comparar(double area1, double area2){
        int valor=0;
        if(area1>area2){
            valor=-1;
        }else if(area1<area2){
            valor=1;
        }else{
            valor=0;
        }
        return valor;
    }

    public boolean esCuadrado(int base, int altura){
        boolean cuadrado=false;
        if(base==altura){
            cuadrado=true;
        }
        return cuadrado;
    }

    public int largoSuperior(int base){
        return base;
    }

    public String presentacion(int base, int altura){
        String presentacion="";
        if(base>altura){
            presentacion="acostado";
        }else{
            presentacion="parado";
        }
        return presentacion;
    }

    public void getDatos(){
        System.out.print("");
    }
}