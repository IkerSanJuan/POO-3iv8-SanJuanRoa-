/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heredarlaherencia;
import javax.swing.JOptionPane;
/**
 *
 * @author user
 */
public class Datos {
    
    Estudiante obj[] = new Estudiante[10];
    int x = 0;
    
    void menu(){
        String var = "si";
        while(var.equalsIgnoreCase("si")){
            int op = Integer.parseInt(
                    JOptionPane.showInputDialog("Ingrese la opcion deseada"
                    + "\n 1.- Agregar un estudiante:"
                    + "\n 2.- Mostrar estudiantes"));
            switch (op) {
                case 1:
                    pedirDatosEstudiante();
                    break;
                case 2:
                    mostrarEstudiantes();
                    break;
            }
            var = JOptionPane.showInputDialog("¿Deseas repetir?");
        }
    }
    
    public void pedirDatosEstudiante(){
        String nombre = JOptionPane.showInputDialog("Ingresar el nombre");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresar la edad"));
        char genero = JOptionPane.showInputDialog("Ingresar el genero").charAt(0);
        int numbol = Integer.parseInt(JOptionPane.showInputDialog("Ingresar la boleta"));
        
        obj[x]= new Estudiante(numbol, nombre, edad, genero);
        x++;
    }
    
    public void mostrarEstudiantes(){
        
        for(int i=0; i<x; i++){
            JOptionPane.showMessageDialog(null,
                    "El nombre es: " + obj[i].getNombre()
                    + "La edad es :" +obj[i].getEdad()
                    + "El genero es: " + obj[i].getGenero()
                    + "La boleta es: " + obj[i].getNumbol());
        }
    }
}
