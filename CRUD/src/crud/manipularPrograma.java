/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;
import java.util.*;
/**
 *
 * @author user
 */
public class manipularPrograma {
    
    public void principal(){
        Scanner entrada = new Scanner(System.in);
        
        ControladorPersona control = new ControladorPersona();
        
        System.out.println("Bienvenido a la administracion del registro"
                +"del personal de aseo");
        System.out.println("Elija la opcion que desee:"
                + "\n 1.- Mostrar  Persona"
                + "\n 2.- Registrar nueva persona"
                + "\n 3.- Editar registro de persona"
                + "\n 4.- Borrar el registro de persona"
                + "\n 5.- Salir");
        
        int opcion = Integer.parseInt(entrada.nextLine());
        
        switch (opcion) {
            case 1:
                ArrayList<Persona> listaPersona = control.mostrarPersona();
                
                for(Persona objeto : listaPersona){
                    System.out.println("El id: "+ objeto.getId()
                                        + "\n El nombre: "+objeto.getNombre()
                                        + "\n La edad: "+objeto.getEdad());
                }
                break;
            case 2:
                System.out.println("Por favor ingresa el id de la persona");
                int idpersona = Integer.parseInt(entrada.nextLine());
                System.out.println("Por favor ingresa el nombre de la persona");
                String nompersona = entrada.nextLine();
                System.out.println("Por favor ingresa la edad de la persona");
                int edadpersona = Integer.parseInt(entrada.nextLine());
                
                Persona personaNueva = new Persona(idpersona, nompersona, edadpersona);
                
                control.agragarPersona(personaNueva);
                
                break;
            case 3:
                System.out.println("Digita el ID de la persona que ");
                
                
                break;
            case 4:
                
                
                break;
            case 5:
                System.out.println("uwu");
                System.exit(0);
                break;
            default:
                System.out.println("Por favor, digite una opcion correcta");
        }
    }
    
}
