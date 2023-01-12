package EjercicioPuntoGeometrico;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class main {
    public static void main(String[]args){
        int X=0;
        int Y=0;
        PuntoGeometrico punto = new PuntoGeometrico(X, Y);
        Rectangulo rectangulo= new Rectangulo(X,Y);
        Rectangulo rectangulo2= new Rectangulo(X,Y);
        double distanciaEuclidea= cargarDatos(X,Y,punto,rectangulo);
        desplazarRectangulo(rectangulo);
        agregarRectangulo(punto, rectangulo2);
        int base=rectangulo.medirBase();
        int altura=rectangulo.medirAltura();
        int comparar=rectangulo.comparar(rectangulo.calcularArea(base,altura),rectangulo2.calcularArea(rectangulo2.medirBase(),rectangulo2.medirAltura()));
        int largoSuperior=rectangulo.largoSuperior(base);
        boolean esCuadrado=rectangulo.esCuadrado(base, altura);
        String presentacion=rectangulo.presentacion(base, altura);
        imprimirDatos(punto, rectangulo, distanciaEuclidea,comparar,largoSuperior,esCuadrado,presentacion);

    }

    public static double cargarDatos(int X, int Y, PuntoGeometrico punto, Rectangulo rectangulo){
        double distanciaEuclidea=0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.print("Ingrese el valor de X: ");
            X= new Integer(entrada.readLine());
            System.out.print("Ingrese el valor de Y: ");
            Y= new Integer(entrada.readLine());
        }catch(Exception exc){
            System.out.println(exc);
        }
        rectangulo.setVerticeX2(X);
        rectangulo.setVerticeY2(Y);
        distanciaEuclidea=punto.distanciaEuclidea(X, Y);
        punto.setX(X);
        punto.setY(Y);
        return distanciaEuclidea;
    }

    public static void desplazarRectangulo(Rectangulo rectangulo){
        int desplazamientoY=0;
        int desplazamientoX=0;

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.print("Posiciones a desplazar sobre X: ");
            desplazamientoX = new Integer(entrada.readLine());
            System.out.print("Posiciones a desplazar sobre Y: ");
            desplazamientoY = new Integer(entrada.readLine());
        }catch(Exception exc){
            System.out.println(exc);
        }
        rectangulo.setDesplazamiento(desplazamientoX, desplazamientoY);
    }

    public static void agregarRectangulo(PuntoGeometrico punto, Rectangulo rectangulo2){
        int x=0;
        int y=0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("Agregar rectangulo para comparar");
            System.out.print("Ingrese el valor del vertice X2: ");
            x=new Integer(entrada.readLine());
            System.out.print("Ingrese el valor del vertice Y2: ");
            y=new Integer(entrada.readLine());
        }catch(Exception exc){
            System.out.println(exc);
        }
        rectangulo2.setVerticeX1(punto.getX());
        rectangulo2.setVerticeX2(x);
        rectangulo2.setVerticeY1(punto.getY());
        rectangulo2.setVerticeY2(y);
    }

    public static void imprimirDatos(PuntoGeometrico punto, Rectangulo rectangulo,double distanciaEuclidea,int comparar,int largoSuperior,boolean esCuadrado,String presentacion){
        System.out.print("El valor de X del punto geometrico es: "+punto.getX()+"\nEl valor de Y del punto geometrico es: "+punto.getY()+
        "\nLa distancia euclidea es: "+distanciaEuclidea+"\nEl vertice inicial del rectangulo esta en la posicion: "+rectangulo.getVerticeX1()+","+rectangulo.getVerticeY1()+
        "\nSE AGREGA NUEVO RECTANGULO \nComparacion de areas con el nuevo rectangulo (1 es menor, 0 es igual y -1 es mayor): "+comparar+
        "\nEl largo del lado superior del rectangulo original: "+largoSuperior+"\nEs cuadrado?: "+esCuadrado);
        if(esCuadrado==false){
            System.out.println("La presentacion del rectangulo es: "+presentacion);
        }
    }
}
