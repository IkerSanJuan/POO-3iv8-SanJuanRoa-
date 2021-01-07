/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Pizzeria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opc;
        Scanner entrada = new Scanner(System.in);
        Pizza piz = null;
        
        System.out.println("Bienvenidos a la Pizzeria los Tacos");
        System.out.println("");
        System.out.println("¿Que desea ordenar?");
        System.out.println("1.- Pizza de Peperoni");
        System.out.println("2.- Pizza de Queso");
        System.out.println("3.- Pizza vegetariana");
        opc = entrada.nextInt();
        
        switch (opc) {
            case 1:
                piz = new Peperoni();
                break;
            case 2:
                piz = new Queso();
                break;
            case 3:
                Vegetariana vege = new Vegetariana();
                vege.preparar();
                vege.hornear();
                vege.cortar();
                break;
            default:
                System.out.println("Gracias adios uwu");
        }
    }
    
}
