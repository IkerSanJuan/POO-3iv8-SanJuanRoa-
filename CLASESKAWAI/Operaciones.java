import java.util.Scanner;
public class Operaciones{
    Scanner entrada = new Scanner(System.in);
    public void menu(){
        char op;
        System.out.println("Ejemplo de un menu que se encarga de: ");
        System.out.println("A.- Calculadora");
        System.out.println("B.- Conversor de unidades");
        System.out.println("C.- Creacion de cuadros");
        System.out.println("D.- Movimiento en cuadro");
        op=entrada.next().charAt(0);
        switch (op) {
            case 'A':
                Calculadora();
                break;
        
            case 'B':
                ConversorUnidades();
                break;
            case 'C':
                CrearCuadro();
                break;
            case 'D':
                MoviCuadro();
                break;
        

        }
    } 
    public void Calculadora(){
        double numero=0.00, suma=0.00, multi=1.00;
        char operacion, p;
        System.out.println("Seleccione la opcion deseada");
        System.out.println("a. Suma y Resta");
        System.out.println("b. Multiplicacion");
        System.out.println("c. Division");
        operacion=entrada.next().charAt(0);
        switch (operacion) {
            case 'a':
                do{
                    System.out.println("Para dejar de sumar ingresa 0");
                    System.out.println("Ingresa el valor a sumar: ");
                    numero=entrada.nextDouble();
                    suma+=numero;
                }while(numero!=0);
                System.out.println("La suma es de: "+suma);
                break;
            case 'b':
                do{
                    System.out.println("Para dejar de multiplicar ingresa 0");
                    System.out.println("Ingresa el valor a sumar: ");
                    numero=entrada.nextDouble();
                    if(numero>0){
                        multi*=numero;
                    }else{
                        System.out.println("Ingresa solo positivos");
                    }
                }while(numero!=0);
                System.out.println("La suma es de: "+suma);
                break;
            case 'c':
                do{
                    System.out.println("Para dejar de sumar ingresa 0");
                    System.out.println("Ingresa el valor a sumar: ");
                    numero=entrada.nextDouble();
                    suma+=numero;
                }while(numero!=0);
                System.out.println("La suma es de: "+suma);
                break;
            default:
                break;
        }
    }
    public void ConversorUnidades(){

    }
    public void CrearCuadro(){
        int n,m=0;
        do{
            System.out.println("Ingrese el numero de * que tenga el cuadro magico");
            n=entrada.nextInt();
            if((n<0)||(n>1000)){
                System.out.println("No se aceptan negativos, ni valores superiores a 1000");
            }else{
                for(int i=0; i<=n; i++){
                    System.out.print("*");
                }
                System.out.println("\n");
                for(int i=-2; i<n-3; i++){
                    System.out.print("*");
                    for(int j=0; j<n-1; j++){
                        System.out.print(" ");
                    }
                    System.out.println("*");
                }
                for(int k=0; k<=n; k++){
                    System.out.print("*");
                }
                System.out.println("\n");
            }
        }while(m!=1);
    }
    public void MoviCuadro(){
        
    }
}