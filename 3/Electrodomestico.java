public class Electrodomestico{
    private String nombre;
    private float precioBase=100;
    private String color="gris plata";
    private int consumoElectrico=10;
    private float peso=2;

    public Electrodomestico(String nombre, float precioBase, String color, int consumoElectrico, float peso){
        this.nombre=nombre;
        this.precioBase=precioBase;
        this.color=color;
        this.consumoElectrico=consumoElectrico;
        this.peso=peso;
    }
        public Electrodomestico(String nombre, float precioBase, String color, int consumoElectrico){
        this.nombre=nombre;
        this.precioBase=precioBase;
        this.color=color;
        this.consumoElectrico=consumoElectrico;
    }
    public Electrodomestico(String nombre, float precioBase, String color){
        this.nombre=nombre;
        this.precioBase=precioBase;
        this.color=color;
    }
    public Electrodomestico(String nombre, float precioBase){
        this.nombre=nombre;
        this.precioBase=precioBase;
    }
    public Electrodomestico(String nombre){
        this.nombre=nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    public float getPrecioBase(){
        return precioBase;
    }
    public String getColor(){
        return color;
    }
    public int getConsumoElectrico(){
        return consumoElectrico;
    }
    public float getPeso(){
        return peso;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setPrecioBase(float precioBase){
        this.precioBase=precioBase;
    }
    public void setColor(String color){
        this.color=color;
    }
    public void setConsumoElectrico(int consumoElectrico){
        this.consumoElectrico=consumoElectrico;
    }
    public void setPeso(float peso){
        this.peso=peso;
    }

    public String getConsumo(int x, int consumoElectrico){
        String valor="";
        if(consumoElectrico<x){
            valor="Si";
        }else{
            valor="No";
        }
        return valor;
    }

    public float getBalance(float precioBase, float peso){
        return precioBase/peso;
    }
    
    public String Gama(int min, float balance){
        String valor="";
        if(balance<min){
            valor="No";
        }else{
            valor="Si";
        }
        
        return valor;
    }

    public void getDatos(){
        System.out.println("Producto: "+getNombre()+"\nPrecio: $"+getPrecioBase()+"\ncolor: "+getColor()+"\nConsumo electrico: "+getConsumoElectrico()+"Kw \npeso: "+getPeso()+"kg \nEs de bajo consumo?: "+getConsumo(45, getConsumoElectrico())+"\nBalance: "+getBalance(getPrecioBase(), getPeso())+"\nEs de alta gama?: "+Gama(3, (getBalance(getPrecioBase(), getPeso()))));
    }
    
}