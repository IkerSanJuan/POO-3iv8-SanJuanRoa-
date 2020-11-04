import java.util.*;

public class matrizArreglo{

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        /*int arreglin[] = new int[5];
        for(int i = 0; i<arreglin.length; i++){
            System.out.println("Los numeros son: "+i);
        }
        */
        int matriz[][] = new int [3][3];

        float sumarFilas=0;

        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz.length; j++){
                System.out.println("Ingresa el numero de la fila " + i + " column "+j+" : ");
                matriz[i][j] = entrada.nextInt();
                //System.out.println(String.format("Mira: %d", matriz[i][j]));
            }
        }
        for(int i=0; i<matriz.length; i++){
            sumarFilas = 0;
            for(int j=0; j<matriz.length; j++){
                sumarFilas += matriz[i][j];
                System.out.println(String.format(" %d ", matriz[i][j]));
            }
            System.out.println(String.format("Suma fila: %f, promedio final: %f  ", sumarFilas, sumarFilas/matriz.length));
            System.out.println();
        }
    }
}