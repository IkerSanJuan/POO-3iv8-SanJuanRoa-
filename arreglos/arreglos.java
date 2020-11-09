import java.util.*;
public class arreglos{
    int num[] = new int[10];
    float prom=0;
    public static void main(String[] args){
        char letra;
        Scanner entrada = new Scanner(System.in);
        arreglos programas = new arreglos(); 
        do{
            programas.elegir();
            System.out.println("¿Desea volver al menu? Si es asi, presiona s.Si no presiona n");
            letra = entrada.next().charAt(0);
        }while (letra == 's');
    }
    public  void elegir(){
        Scanner entrada = new Scanner(System.in);
        int opcion;
        System.out.println("3IV8_SANJUAN_ROA_IKERDEJESHUA");
        
        System.out.println("Elija el programa que desea utilizar: ");
        System.out.println("1.- Promedio de negativos y positivos");
        System.out.println("2.- Promedio de pares");
        System.out.println("3.- Calificaciones");
        System.out.println("4.- Matriz");
        System.out.println("5.- Salir");
        opcion=entrada.nextInt();
        switch (opcion){
            case 1:
                posneg();
                break;
            case 2:
                pares();
                break;
            case 3:
                calf();
                break;
            case 4:
                sumarm();
                break;
            default:
                System.out.println("Intentalo de nuevo");
        }
    }
    public void posneg(){
        Scanner entrada = new Scanner(System.in);
        int pos[]=new int[10];
        int neg[]=new int[10];
        int numpos=0, numneg=0, sumpos=0, sumneg=0;
        float prompos=0, promneg=0;
        System.out.println("Ingrese 10 numeros enteros enteros: ");
            for(int i=0;i<10;i++){
            num [i]=entrada.nextInt();
        }
        for(int i=0;i<num.length;i++){
            if(num[i]>0){
                sumpos += num[i];
                numpos++;
            }
            else{
                if(num[i]<0){
                    sumneg += num[i];
                    numneg++;
                }
            }

        }
        prompos=sumpos/numpos;
        promneg=sumneg/numneg;
        System.out.println("El promedio de los valores positivos es: "+prompos);
        System.out.println("El promedio de los valores negativos es: "+promneg);
    }
    public void pares(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese 10 numeros enteros enteros: ");
            for(int i=0;i<10;i++){
            num [i]=entrada.nextInt();
        }
        for(int i=0;i<num.length;i++){
            if(i%2==0){
                prom += num[i];
            }
        }
        prom /=5;
        System.out.println("El promedio de los valores pares es: "+prom);
    }
    public void calf(){
        Scanner entrada = new Scanner(System.in);
        int mayor=0, menor=10, superior=0, aprobados=0, reprobados=0, promedio;
        System.out.println("Ingrese 10 calificaciones de una asignatura: ");
            for(int i=0;i<10;i++){
            num [i]=entrada.nextInt();
        }
        for(int i=0;i<num.length;i++){
            if(num[1]>mayor){
                mayor=num[i];
            }
            if(num[1]<menor){
                menor=num[i];
            }
            if(num[1]>=6){
                aprobados=num[i];
            }
        }
        reprobados=10-aprobados;
        prom/=10;
        for(int i=0;i<10;i++){
            System.out.println(String.format("La calificacion numero %d es: %d",i+1,num[i]));
            System.out.println("La calificacion numero "+(i+1)+" es: "+num[i]);
            if(num[i]>prom){
                superior++;
            }
        }
        System.out.println("El promedio del grupo es: "+prom);
        System.out.println("La  calificacion mas alta del grupo es: "+mayor);
        System.out.println("La  calificacion mas baja del grupo es: "+menor);
        System.out.println("El numero de calificaciones superiores al promedio es: "+superior);
        System.out.println("El numero de aprobados de el grupo es: "+aprobados);
        System.out.println("El numero de reprobados de el grupo es: "+reprobados);
    }
    public void sumarm(){
        Scanner entrada = new Scanner(System.in);
        int ma[][]=new int[3][3];
        int mb[][]=new int[3][3];
        int ms[][]=new int[3][3];
        for(int i = 0;i < 3;i++){
            for(int j = 0;j < 3;j++){
                System.out.println("Introduce el valor numero "+(i+j+1)+" de la 1er matriz:");
                ma[i][j] = entrada.nextInt();
            }
        }
        for(int i = 0;i < 3;i++){
            for(int j = 0;j < 3;j++){
                System.out.println("Introduce el valor numero "+(i+j+1)+" de la 2da matriz:");
                mb[i][j] = entrada.nextInt();
            }
        }
        for(int i = 0;i < 3;i++){
            for(int j = 0;j < 3;j++){
                ms[i][j] = ma[i][j] + mb[i][j];
            }
        }
        System.out.println("El resultado de la suma de matrices es: ");
        for(int i = 0;i < 3;i++){
            for(int j = 0;j < 3;j++){
                System.out.print(" "+ms[i][j]+" ");
            }
            System.out.println("");
        }
    }   
}   