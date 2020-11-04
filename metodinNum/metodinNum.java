import java.util.Scanner;

public class metodinNum{

    int m;

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String letra;
        metodinNum maymen= new metodinNum();
        do{
        maymen.cargarValores();
        System.out.println("Desea repetir?");
        letra = entrada.nextLine();
        }while(letra!="s");
    }

    public void cargarValores(){
        Scanner entrada = new Scanner(System.in);

        int val1, val2, val3;
        int mayor, menor;

        System.out.println("Ingresa el primer numero a comparar");
        val1=entrada.nextInt();
        System.out.println("Ingresa el primer numero a comparar");
        val2=entrada.nextInt();
        System.out.println("Ingresa el primer numero a comparar");
        val3=entrada.nextInt();

        mayor=calcularMayor(val1, val2, val3);
        menor=calcularmenor(val1, val2, val3);

        System.out.println("El valor mayor es: "+mayor);
        System.out.println("El valor menor es: "+menor);
    }

    public int calcularMayor(int v1, int v2, int v3){

        //int m;
        if(v1>v2 && v1>3){
            m=v1;
        }else{
            if(v2>v3){
                m = v2;
            }else{
                m = v3;
            }
        }
        return m;

    }

    public int calcularmenor(int v1, int v2, int v3){

        //int m;
        if(v1<v2 && v1<v3){
            m=v1;
        }else{
            if(v2<3){
                m = v2;
            }else{
                m = v3;
            }
        }
        return m;

    }

}