import java.util.*;

public class Principal{
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        menuGato mg = new menuGato();

        char letra;

        do{
            mg.jugarGato();

            System.out.println("Si desea repetir el programa presione r\nDe lo contrario presione cualquier tecla");
            letra = entrada.next().charAt(0);

        }while(letra=='r');
        

    }
}
