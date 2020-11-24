import java.util.*;

public class Funciones{

    Scanner entrada = new Scanner(System.in);

    public void cadenas(){

        String s1 = "wiiiii la generacion de cristal templato";

        System.out.println("El tamano de la cadena es: "+s1.length());

        System.out.println("La cadena inicia V o F con hola?: "+s1.startsWith("hola"));

        System.out.println("La cadena termina V o F con hola?: "+s1.endsWith("plato"));

        System.out.println("Ingrese una palabra: ");
        String s2 = entrada.next();
        System.out.println("La palabra es: "+s2);

        System.out.println("Parte de una sub cadena "+s1.indexOf("ra"));
        
        System.out.println("Primera parte: "+s1.substring(12));
        System.out.println("Segunda parte: "+s1.substring(3, 13));

        int valor=24;
        System.out.println("El valor de es :" + num + "ahora es un numero");

        //converdena cadena a un decimal

        String s4 = "20.89";
        Double num1 = Double.parseDouble(s4);
        System.out.println("El valor de es :" + num1 + "ahora es un numero");

        //metodo toString convierte un entero a cadena

        Integer x = 5;

        System.out.println("El valor de " + x.toString() + "ahora es cadena");

        System.out.println("El valor de " + Integer.toString(12) + "ahora es cadena");
    }
}