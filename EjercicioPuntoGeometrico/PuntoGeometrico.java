package EjercicioPuntoGeometrico;

public class PuntoGeometrico{
    private int X;
    private int Y;

    public PuntoGeometrico(int X, int Y){
        this.X=X;
        this.Y=Y;
    }

    public int getX(){
        return X;
    }

    public int getY(){
        return Y;
    }

    public void setX(int X){
        this.X=X;
    }

    public void setY(int Y){
        this.Y=Y;
    }

    public double distanciaEuclidea(int newX, int newY){
        double distanciaEuclidea=0;
        distanciaEuclidea=Math.sqrt(((getX()-newX)*(getX()-newX))+((getY()-newY)*(getY()-newY)));
        return distanciaEuclidea;
    }
}