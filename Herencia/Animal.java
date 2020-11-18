public class Animal{

    private String nombre, raza, tipo_alimento;
    private int edad;

    public Animal(){

    }

    public Animal(String nombre, String raza, String tipo_alimento, int edad){

        this.nombre = nombre;
        this.raza = raza;
        this.tipo_alimento = tipo_alimento;
        this.edad = edad;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getRaza(){
        return raza;
    }

    public void setRaza(String nombre){
        this.raza = raza;
    }
    
    public String getTipoAlimento(){
        return tipo_alimento;
    }

    public void setTipoAlimento(String nombre){
        this.tipo_alimento = tipo_alimento;
    }
    
    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }
}