import java.util.Scanner;
import java.util.*;
import java.io.*;

class EstructurasDatos{
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        int opcion, num, num3, num4, num6, num7, num8, num9, num10, num11, num12;
        int l, cont=0,cont2=0;
        char letra;
        double num2, num5, num13, num14, num15, num16;
    do{
        System.out.println("3IV8_SANJUAN_ROA_IKERDEJESHUA");
        System.out.println("Elija el programa que desea utilizar: ");
        System.out.println("1.- ABONOS");
        System.out.println("2.- CONVERSION DE DECIMAL A BINARIO");
        System.out.println("3.- CONVERSION DE GRADOS FAHRENHEIT");
        System.out.println("4.- CONTADOR POSITIVOS Y NEGATIVOS");
        System.out.println("5.- PAGO DE PRODUCTOS");
        System.out.println("6.- CALCULAR AREA Y PERIMETRO DE TRIANGULO O RECTANGULO, O, VOLUMEN DE ESFERA Y CILINDRO");
        System.out.println("7.- TABLA DE VALORES");
        System.out.println("8.- CALCULAR FACTORIAL");
        System.out.println("9.- CALCULADORA CONVENCIONAL");
        System.out.println("10.- SALIR");

        opcion=entrada.nextInt();

        switch (opcion){
            case 1:
                do{
                    System.out.println("Ingresa el precio de tu abono: ");
                    num2=entrada.nextDouble();
                    System.out.println("Ingresa tu edad: ");
                    num=entrada.nextInt();
                    if (num2<1){
                        System.out.println("Valor no valido por favor volver a introducir: ");
                        num2=entrada.nextDouble();
                    }
                    if (num<1){
                        System.out.println("Valor no valido por favor volver a introducir");
                        num=entrada.nextInt();
                    }
                    if (num>65){
                        num2=num2*0.60;
                        System.out.println("Su precio del abono es: "+num2);
                
                    }else if (num<21){
                        System.out.println("Sus padres son socios? si lo son presione 1, de lo contrario presione calquier otra tecla");
                        letra=entrada.next().charAt(0);
                        if(letra=='1'){
                            num2=num2*0.55;
                            System.out.println("Su precio del abono es: "+num2);
                        }else{
                        num2=num2*0.75;
                        System.out.println("Su precio del abono es: "+num2);
                        }
                    }   
                    else{
                    num2=num2*0.75;
                    System.out.println("Su precio del abono es: "+num2);
                    }System.out.println("Si desea repetir el programa presione 1, de lo contrario presione calquier tecla");
                    letra=entrada.next().charAt(0);
                }
                while(letra=='1');
            break;
            case 2:
                do{
                    System.out.println("Introdusca el numero (positivo,entero) que desea convertir a binario:");
                    num=entrada.nextInt();
                    int bin[]=new int[100];
                    if (num<0){
                        System.out.println("Valor no valido por favor vuelva a introducir el valor");
                        num=entrada.nextInt();
                    }
                    while(num>0){
                        bin[cont++]=num%2;
                        num=num/2;
                    }
                    System.out.println("El numero binario: ");
                    for(l=cont-1;l>=0;l--){
                    System.out.print(bin[l]);
                    }
                    System.out.println("");
                    cont=0;
                    System.out.println("Si desea repetir el programa presione 1, de lo contrario presione calquier tecla");
                    letra=entrada.next().charAt(0);
                }
                while(letra=='1');
            break;
            case 3:
                do{
                    System.out.println("Elija la conversion que desea utilizar: ");
                    System.out.println("1.- FAHRENHEIT A CELSIUS");
                    System.out.println("2.- FAHRENHEIT A KELVINE");
                    System.out.println("3.- FAHRENHEIT A RANKINE");
                    System.out.println("4.- SALIR");
                    opcion=entrada.nextInt();
                    switch (opcion){
                        case 1:
                            System.out.println("Introdusca los grados en Fahrenheit: ");
                            num2=entrada.nextDouble();
                            num5=(num2-32)/1.8000;
                            System.out.println(+num2+" F es igual "+num5+" C");
                        break;
                        case 2:
                            System.out.println("Introdusca los grados en Fahrenheit:");
                            num2=entrada.nextDouble();
                            num5=((num2-32)/1.8000)+273.15;
                            System.out.println(+num2+" F es igual "+num5+" K");
                        break;
                        case 3:
                            System.out.println("Introdusca los grados en Fahrenheit:");
                            num2=entrada.nextDouble();
                            num5=(num2-32)+491.67;
                            System.out.println(+num2+" F es igual "+num5+" R");
                        break;
                    }System.out.println("Si desea repetir el programa presione 1, de lo contrario presione calquier tecla");
                    letra=entrada.next().charAt(0);
                }while(letra=='1');
            break;
            case 4:
                do{
                    System.out.println("Ingrese la cantidad de valores que desea ingresar: ");
                    num=entrada.nextInt();
                    if (num<=0){
                        System.out.println("Valor no valido por favor volver a introducir");
                        num=entrada.nextInt();
                    }
                    while(num>0){
                        System.out.println("A continuacion introdusca el numero");
                        num3=entrada.nextInt();
                        if(num3>0){
                            cont++;
                        }else if(num3<0){
                            cont2++;
                        }num=num-1;
                    }
                    System.out.println("La cantidad de positivos es: "+cont);
                    System.out.println("La cantidada de negativos es: "+cont2);
                    cont=0;
                    cont2=0;
                    System.out.println("Si desea repetir el programa presione 1, de lo contrario presione calquier tecla");
                    letra=entrada.next().charAt(0);
                }while(letra=='1');
            break;
            case 5:
                int p1=0;
                int p2=0;
                int p3=0;
                int p4=0;
                do{
                    System.out.println("TIENDITA OTAKO");
                    System.out.println("Productos: ");
                    System.out.println("GALLETAS TIA COLIFLOR");
                    System.out.println("PAPAS DESABRIDAS");
                    System.out.println("AGUITA DE JAMAICA UWU(1.5L)");
                    System.out.println("CACAHUATES ENCHILADOS");
                    int g=18; int p=13; int a=25; int c=10;
                    System.out.println("Ingrese la cantidad de Galletas: ");
                    p1=entrada.nextInt();
                    while(p1 < 0){
                        System.out.println("Introduzca un valor positivo o 0");
                        p1 = entrada.nextInt();
                    }
                    num7=p1*g;
                    System.out.println("Ingrese la cantidad de Papas: ");
                    p2=entrada.nextInt();
                    while(p2 < 0){
                        System.out.println("Introduzca un valor positivo o 0");
                        p2 = entrada.nextInt();
                    }
                    num8=p2*p;
                    System.out.println("Ingrese la cantidad de Aguitas de Jamaica: ");
                    p3=entrada.nextInt();
                    while(p3 < 0){
                        System.out.println("Introduzca un valor positivo o 0");
                        p3 = entrada.nextInt();
                    }
                    num9=p3*a;
                    System.out.println("Ingrese la cantidad de Cacahuates Enchilados: ");
                    p4=entrada.nextInt();
                    while(p4 < 0){
                        System.out.println("Introduzca un valor positivo o 0");
                        p4 = entrada.nextInt();
                    }
                    num10=p4*c;
                    num11=p1+p2+p3+p4;
                    num12=num7+num8+num9+num10;
                    System.out.println("El numero total de productos es: "+num11);
                    System.out.println("El total a pagar por los productos es: "+num12);
                    System.out.println("Si desea repetir el programa precione 1, de lo contrario presione calquier tecla");
                    letra=entrada.next().charAt(0);
                }while(letra=='1');
            break;
            case 6:
                double radio=0;
                double base=0;
                double altura=0;
                double lado2=0;
                double lado3=0;
                do{
                    System.out.println("Seleccione el calculo que desee realizar: ");
                    System.out.println("1.- AREA Y PERIMETRO DE UN RECTANGULO");
                    System.out.println("2.- AREA Y PERIMETRO DE UN TRIANGULO");
                    System.out.println("3.- VOLUMEN DE UNA ESFERA");
                    System.out.println("4.- VOLUMEN DE UN CILINDRO");
                    System.out.println("5.- SALIR");
                    opcion=entrada.nextInt();
                    switch (opcion){
                        case 1:
                            System.out.println("Ingresa el valor de la base");
                            base = entrada.nextDouble();
                            while(base < 1){
                                System.out.println("Introduzca un valor positivo:");
                                base = entrada.nextDouble();
                            }
                            System.out.println("Ingresa el valor de la altura");
                            altura = entrada.nextDouble();
                            while(altura < 1){
                                System.out.println("Introduzca un valor positivo:");
                                altura = entrada.nextDouble();
                            }
                            num13 = base*altura;
        
                            num14 = 2*(base*altura);
        
                            System.out.println("El area del rectangulo es de: "+num13);
        
                            System.out.println("El perimetro del rectangulo es de: "+num14);
                        break;
                        case 2:
                            System.out.println("Ingresa el valor de la base o lado 1");
                            base = entrada.nextDouble();
                            while(base < 1){
                                System.out.println("Introduzca un valor positivo:");
                                base = entrada.nextDouble();
                            }
                            System.out.println("Ingresa el valor del lado 2");
                            lado2 = entrada.nextDouble();
                            while(lado2 < 1){
                                System.out.println("Introduzca un valor positivo:");
                                lado2 = entrada.nextDouble();
                            }
                            System.out.println("Ingresa el valor del lado 3");
                            lado3 = entrada.nextDouble();
                            while(lado3 < 1){
                                System.out.println("Introduzca un valor positivo:");
                                lado3 = entrada.nextDouble();
                            }
                            System.out.println("Ingresa el valor de la altura");
                            altura = entrada.nextDouble();
                            while(altura < 1){
                                System.out.println("Introduzca un valor positivo:");
                                altura = entrada.nextDouble();
                            }
                            num13 = (base*altura)/2;
            
                            num14 = base+lado2+lado3;
            
                            System.out.println("El area del triangulo es de: "+num13);
            
                            System.out.println("El perimetro del triangulo es de: "+num14);
                        break;
                        case 3:
                            System.out.println("Ingresa el valor del radio: ");
                            radio=entrada.nextDouble();
                            while(radio < 1){
                                System.out.println("Introduzca un valor positivo:");
                                radio = entrada.nextDouble();
                            }
                            num5=(4/3)*3.1416*(radio*radio*radio);
                            System.out.println("El volumen de la esfera es de: "+num5);
                        break;
                        case 4:
                            System.out.println("Ingresa el valor del radio: ");
                            radio=entrada.nextDouble();
                            while(radio < 1){
                                System.out.println("Introduzca un valor positivo:");
                                radio = entrada.nextDouble();
                            }
                            System.out.println("Ingresa el valor de la altura: ");
                            altura=entrada.nextDouble();
                            while(altura < 1){
                                System.out.println("Introduzca un valor positivo:");
                                altura = entrada.nextDouble();
                            }
                            num13=3.1416*(radio*radio)*altura;
                            System.out.println("El volumen de el cilindro es de: "+num13);
                        break;
                    }
                    System.out.println("Si desea repetir el programa presione 1, de lo contrario presione calquier tecla");
                    letra=entrada.next().charAt(0);
                }while(letra=='1');
            break;
            case 7:
                do{
                    System.out.println("                TABLA DE VALORES");
                    System.out.println("");
                    System.out.println("\tN\t\t\t");
                    System.out.println("\t1\t10\t100\t1000");
                    System.out.println("\t2\t20\t200\t2000");
                    System.out.println("\t3\t30\t300\t3000");
                    System.out.println("\t4\t40\t400\t4000");
                    System.out.println("\t5\t50\t500\t5000");
                    System.out.println("\t6\t60\t600\t6000");
                    System.out.println("\t7\t70\t700\t7000");
                    System.out.println("\t8\t80\t800\t8000");
                    System.out.println("\t9\t90\t900\t9000");
                    System.out.println("\t10\t100\t1000\t1000");
                    System.out.println("");
                    System.out.println("Si desea repetir el programa presione 1, de lo contrario presione calquier tecla");
                    letra=entrada.next().charAt(0);
                }while(letra=='1');
            break;
            case 8:
                
                do{
                    double np=0;
                    double factorial=1;
                    System.out.println("Introduce el numero (entero no negativo) del cual quieras su factorial: ");
                    np=entrada.nextDouble();
                    while (np<0){
                        System.out.println("Introduce un valor valido el cual sea entero no negativo: ");
                        np=entrada.nextDouble();
                    }
                    while (np != 0){
                        factorial = factorial * np;
    
                        np--;
                    }

                    System.out.println("El resultado del factorial del numero es: "+factorial);
                    
                    System.out.println("Si desea repetir el programa presione 1, de lo contrario presione calquier tecla");
                    letra=entrada.next().charAt(0);
                }while(letra=='1');
            break;
            case 9:
            do{
                int resultado = 0;

                int solucion = 1;

                int resta = 0;
                System.out.println("CALCULADORA CONVENCIONAL");
                System.out.println("De las siguientes operaciones cual deseas realizar: ");
                System.out.println("1.- Suma");
                System.out.println("2.- Resta");
                System.out.println("3.- Multiplicacion");
                System.out.println("4.- Divison");
                System.out.println("5.- Salir");
                opcion=entrada.nextInt();
                switch (opcion){
                    case 1:
                        do{
                            System.out.println("Introduzca el numero, cuando termine introduzca el numero 0");
                            num = entrada.nextInt();
        
                            while(num<0){
                            System.out.println("Valor no valido. Introduzca nuevamente, recuerda que debe ser positivo");
                            num = entrada.nextInt();}
        
                            resultado = resultado + num;
                        }while(num != 0);
    
                        System.out.println("El resultado de la suma es: "+resultado);
                    break;
                    case 2:
                        System.out.println("Introduzca el primer numero, cuando termine introduzca el numero 0");
                        resta = entrada.nextInt();
        
                        while(resta < 0){
                            System.out.println("Valor no valido. Introduzca nuevamente, recuerda que debe ser negativo");
                            resta = entrada.nextInt();
                        }
                        do{
        
                            System.out.println("Introduzca el numero, cuando termine introduzca el numero 0");
                            num = entrada.nextInt();
        
                            resta = resta + num*(-1);
        
                        }while(num != 0);
        
                        System.out.println("El resultado de la resta es: "+resta);
    
                    break;
                    case 3:
                        do{
                            System.out.println("Introduzca el numero, cuando termine introduzca el numero 1");
                            num = entrada.nextInt();
            
                            while(num<0){
                                System.out.println("Valor no valido. Introduzca nuevamente, recuerda que debe ser positivo");
                                num = entrada.nextInt();}
            
                            solucion = solucion * num;
                        }while(num != 1);
            
                        System.out.println("El resultado de la multiplicacion es: "+solucion);
                    break;
                    case 4:
                    do{
                        System.out.println("Introduzca el numero, cuando termine introduzca el numero 1");
                        num = entrada.nextInt();
        
                        while(num<0){
                            System.out.println("Valor no valido. Introduzca nuevamente, recuerda que debe ser positivo");
                            num = entrada.nextInt();
                        }
        
                        solucion = num / solucion;
        
                    }while(num != 1);
        
                        System.out.println("El resultado de la division es: "+solucion);
                    break;
                    default:
                    System.out.println("Sigue participando :3");
                }
                System.out.println("Si desea repetir el programa presione 1, de lo contrario presione calquier tecla");
                letra=entrada.next().charAt(0);
            }while(letra=='1');
            break;
            default:
            System.out.println("Gracias por su preferencia, besitos besitos chau chau uwu");
        }
        System.out.println("Deseas volver a al menu principal?, si lo deseas escriba s, de lo contrario ingrese cualquier tecla");
        letra=entrada.next().charAt(0);
    }while(letra == 's');
    }
}