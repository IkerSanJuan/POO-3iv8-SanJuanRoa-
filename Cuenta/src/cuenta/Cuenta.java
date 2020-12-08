/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuenta;
import java.util.*;
/**
 *
 * @author user
 */
public class Cuenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        
        int opc;
        
        
        do{
            System.out.println("Bienvenido al Banquito Patito\n");
            System.out.println("¿Que operacion desea realizar:\n");
            System.out.println("1.- Cuenta de debito");
            System.out.println("2.- Cuenta credito");
            System.out.println("3.- Cuenta de cheques");
            System.out.println("4.- Salir");
            
            opc = entrada.nextInt();
            
            switch(opc){
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                default:
                    break;
            }
            
        }while(opc!=4);
    }
    
}
