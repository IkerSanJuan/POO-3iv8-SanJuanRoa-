import java.util.*;
//import javax.swing.JOptionPane;

public class Principal{
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        jugar mj = new jugar();
        char letra;
        do{
            mj.jugarGato();
            System.out.println("Si desea repetir el programa presione r\nDe lo contrario presione cualquier tecla");
        }while(letra=='r')
        

    }
}
