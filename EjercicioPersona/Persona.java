package EjercicioPersona;
public class Persona{
    private String nombre = "N N";
    private int edad;
    private String fechaNacimiento = "1 de enero de 2000";
    private int dni;
    private String sexo = "Femenino";
    private float peso = 1;
    private float altura = 1;

    public Persona(int dni){
        this.dni=dni;
    }
    public Persona(int dni, String nombre){
        this.dni=dni;
        this.nombre=nombre;
    }
    public Persona(int dni, String nombre, String fechaNacimiento){
        this.dni=dni;
        this.nombre=nombre;
        this.fechaNacimiento=fechaNacimiento;
    }
    public Persona(int dni, String nombre, String fechaNacimiento, int edad, String sexo, float peso, float altura){
        this.dni=dni;
        this.nombre=nombre;
        this.fechaNacimiento=fechaNacimiento;
        this.edad=edad;
        this.sexo=sexo;
        this.peso=peso;
        this.altura=altura;
    }

    public void getDatos(){
        System.out.println("Nombre: "+nombre+"\nDNI: "+dni+"\nEdad: "+edad+"\nFecha de nacimiento: "+fechaNacimiento+"\nSexo: "+sexo+"\npeso: "+peso+"\naltura: "+altura);
    }

    public float getImc(){
        float imc;
        imc= peso/(altura*altura);
        return imc;
    }

    public void verificarIMC(float imc){
        if(imc<18.5){
            System.out.println("Se encuentra en bajo peso");
        }
        if(imc>18.5 && imc<25){
            System.out.println("Se encuentra en un peso sano");
        }
        if(imc>25){
            System.out.println("Se encuentra en sobrepeso");
        }
    }

    public void verifEdad(){
        if(edad<18){
            System.out.println("Es menor de edad");
        }else{
            System.out.println("es mayor de edad");
        }
        if(edad<16){
            System.out.println("No puede votar");
        }else{
            System.out.println("Puede votar");
        }
    }
}