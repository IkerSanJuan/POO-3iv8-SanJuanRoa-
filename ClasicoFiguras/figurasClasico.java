import java.util.Scanner;

class figurasClasico{

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int base, base2, base3, altura, opcion, apotema;
        char letra;
        double resultado, perimetro;
    do{
        System.out.println("Elija la opción deseada: ");
        System.out.println("1.- Calcular el area y perimetro de un cuadrado : ");
        System.out.println("2.- Calcular el area y perimetro de un triangulo: ");
        System.out.println("3.- Calcular el area y perimetro de un círculo: ");
        System.out.println("4.- Calcular el area y perimetro de un pentagono: ");
        System.out.println("5.- Calcular el area y perimetro de un rectangulo: ");
        System.out.println("6.- Salir ");

        opcion = entrada.nextInt();
        //segun sea el caso
        switch (opcion){
            case 1:
                //aqui es donde se realikzan las operaciones
                System.out.println("Ingresa el valor del lado");
                base = entrada.nextInt();

                resultado = base*base;

                perimetro = base+base+base+base;

                System.out.println("El area del cuadrado es de: "+resultado);

                System.out.println("El perimetro del cuadrado es de: "+perimetro);

                break;

            case 2:
                System.out.println("Ingresa el valor del lado 1");
                base = entrada.nextInt();

                System.out.println("Ingresa el valor del lado 2");
                base2 = entrada.nextInt();

                System.out.println("Ingresa el valor del lado 3");
                base3 = entrada.nextInt();


                System.out.println("Ingresa el valor de la altura");
                altura = entrada.nextInt();
                
                resultado = (base*altura)/2;

                perimetro = base+base2+base3;

                System.out.println("El area del tríangulo es de: "+resultado);

                System.out.println("El perimetro del tríangulo es de: "+perimetro);

                break;

            case 3:
                System.out.println("Ingresa el valor del radio");
                base = entrada.nextInt();

                resultado = 3.1416*base*base;

                perimetro = 2*3.1416*base;

                System.out.println("El area del círculo es de: "+resultado);
                
                System.out.println("El perimetro del círculo es de: "+perimetro);

                break;

            case 4:
                System.out.println("Ingresa el valor del lado");
                base = entrada.nextInt();

                System.out.println("Ingresa el valor del apotema");
                apotema = entrada.nextInt();

                perimetro = 5*base;

                resultado = (perimetro*apotema)/2;

                System.out.println("El area del pentágono es de: "+resultado);

                System.out.println("El perimetro del pentágono es de: "+perimetro);

                break;

            case 5:
                System.out.println("Ingresa el valor del lado");
                base = entrada.nextInt();

                System.out.println("Ingresa el valor de la altura");
                altura = entrada.nextInt();

                resultado = base*altura;

                perimetro = 2*(base*altura);

                System.out.println("El area del rectángulo es de: "+resultado);

                System.out.println("El perimetro del cuadrado es de: "+perimetro);

                break;

            default:
                System.out.println("Gracias por participar unu nwn/ ");

        }

        System.out.println("¿Deseas repetir el programa?, si lo desea escriba s");
        letra = entrada.next().charAt(0);

        //si se utiliza char se usa ''
        //si usamos string se usa ""

    }while(letra == 's');
    }
}