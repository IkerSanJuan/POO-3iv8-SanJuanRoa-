import java.util.*;
class pokedex{
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        int  idc=124;
        int idb=56;
        int ids=245;
        int energíavitalc=50;
        int energíavitalb=60;
        int energíavitals=40;
        int opcion;
        int defensab=70;
        int defensac=65;
        int defensas=40;
        int ataquec=30;
        int fuerzab=15;
        int fuerzac=25;
        int fuerzas=30;
        int ataqueb=22;
        int ataques=32;
        int ataque2c=30;
        int ataque2b=30;
        int ataque2s=30;
        int vidabulbasaur=40;
        int vidacharmander=35;
        int vidasquartel=27;
        int impacto=0;
        int impacto2=0;
        int impacto3=0;
        int nombre, nombre2;
        int cont=0;
        int cont1=0;
        int cont2=0;
        char letra, reinicio;
        do{
            System.out.println("3IV8_SANJUAN_ROA_IKERDEJESHUA");
            System.out.println("     POKEDEX ");
            System.out.println("Elija una opcion: ");
            System.out.println("1.- CHARMANDER");
            System.out.println("2.- BULBASAUR");
            System.out.println("3.- SQUARTLE");
            System.out.println("4.- BATALLA POKEMON");
            System.out.println("5.- SALIR");
            opcion=entrada.nextInt();
            switch (opcion) {
                case 1:
                    //despliega datos charmander
                    System.out.println("DATOS CHARMADER");
                    System.out.println("ID: "+idc);
                    System.out.println("ENERGIA VITAL: "+energíavitalc);
                    System.out.println("FUERZA: "+fuerzac);
                    System.out.println("SALUD: "+vidacharmander);
                    System.out.println("DEFENSA: "+defensac);
                    System.out.println("ATAQUE PRINCIPAL: "+ataquec);
                    System.out.println("ATAQUE SECUNDARIO: "+ataque2c);
                    break;
                case 2:
                    //despliega datos bulbasaur
                    System.out.println("DATOS BULBASAUR");
                    System.out.println("ID: "+idb);
                    System.out.println("ENERGIA VITAL: "+energíavitalb);
                    System.out.println("FUERZA: "+fuerzab);
                    System.out.println("SALUD: "+vidabulbasaur);
                    System.out.println("DEFENSA: "+defensab);
                    System.out.println("ATAQUE PRINCIPAL: "+ataqueb);
                    System.out.println("ATAQUE SECUNDARIO: "+ataque2b);
                    break;
                case 3:
                    //despliega datos squartle
                    System.out.println("DATOS SUARTLE");
                    System.out.println("ID: "+ids);
                    System.out.println("ENERGIA VITAL: "+energíavitals);
                    System.out.println("FUERZA: "+fuerzas);
                    System.out.println("SALUD: "+vidasquartel);
                    System.out.println("DEFENSA: "+defensas);
                    System.out.println("ATAQUE PRINCIPAL: "+ataques);
                    System.out.println("ATAQUE SECUNDARIO: "+ataque2s);
                    break;
                case 4:
                    //inicia batalla pokemon
                    do{
                        System.out.println("    BATALLA POKEMON");
                        System.out.println("PERSIONA 1 PARA CHARMANDER");
                        System.out.println("PERSIONA 2 PARA BULBASAOR");
                        System.out.println("PERSIONA 3 PARA SQUARTLE");
                        //SE SELECCIONA PRIMER POKEMON
                        System.out.println("SELECCIONA EL 1ER POKEMON");
                        nombre=entrada.nextInt();
                        if (nombre<1){
                            System.out.println("NUMERO NO VALIDO, POR FAVOR SELECCIONA OTRO POKEMON");
                        }
                        if (nombre>3){
                            System.out.println("NUMERO NO VALIDO, POR FAVOR SELECCIONA OTRO POKEMON");
                        }
                        System.out.println("SELECCIONA EL 2DO POKEMON");
                        //SE SELCCIONA EL SEGUNDO POKEMON
                        nombre2=entrada.nextInt();
                        if (nombre2<1){
                            System.out.println("NUMERO NO VALIDO, POR FAVOR SELECCIONA OTRO POKEMON");
                        }
                        if (nombre2>3){
                            System.out.println("NUMERO NO VALIDO, POR FAVOR SELECCIONA OTRO POKEMON");
                        }
                        //TE MUESTRA LOS DATOS DE TU PRIMER POKEMON
                        System.out.println("LOS DATOS DEL 1ER POKEMON: ");
                        if(nombre==1){
                            System.out.println("DATOS CHARMADER");
                            System.out.println("FUERZA: "+fuerzac);
                            System.out.println("DEFENSA: "+defensac);

                            impacto=(fuerzac*defensac)/3;

                        }
                        if(nombre==2){
                            System.out.println("DATOS BULBASAUR");
                            System.out.println("FUERZA: "+fuerzab);
                            System.out.println("DEFENSA: "+defensab);
                            impacto2=(fuerzab*defensab)/3;
                        }
                        if(nombre==3){
                            System.out.println("DATOS SUARTLE");
                            System.out.println("FUERZA: "+fuerzas);
                            System.out.println("DEFENSA: "+defensas);
                            impacto3=(fuerzas*defensas)/3;
                        }
                        // TE MUESTRA LOS DATOS DEL SEGUNDO POKEMON
                        System.out.println("LOS DATOS DEL 2DO POKEMON: ");
                        if(nombre2==1){
                            System.out.println("DATOS CHARMADER");
                            System.out.println("FUERZA: "+fuerzac);
                            System.out.println("DEFENSA: "+defensac);

                            impacto=(fuerzac*defensac)/3;

                        }
                        if(nombre2==2){
                            System.out.println("DATOS BULBASAUR");
                            System.out.println("FUERZA: "+fuerzab);
                            System.out.println("DEFENSA: "+defensab);
                            impacto2=(fuerzab*defensab)/3;
                        }
                        if(nombre2==3){
                            System.out.println("DATOS SQUARTLE");
                            System.out.println("FUERZA: "+fuerzas);
                            System.out.println("DEFENSA: "+defensas);
                            impacto3=(fuerzas*defensas)/3;
                        }
                        //ES DONDE SE DESAROLLA LA BATALLA
                        switch(nombre & nombre2){
                            case 1 & 2:
                                System.out.println("CHARMANDER ESTA CANSADO");
                                System.out.println("GANO BULBASAUR");
                            case 1 & 3:
                                System.out.println("SQUARTLE ESTA CANSADO");
                                System.out.println("GANO CHARMANDER");
                            break;
                            case 2 & 3:
                                System.out.println("BULBASAUR ESTA CANSADO");
                                System.out.println("GANO SQUARTLE");
                                break;
                        }
                        System.out.println("Deseas volver a iniciar la Batalla Pokemon?, si lo deseas escriba r, de lo contrario ingrese cualquier tecla");
                        reinicio=entrada.next().charAt(0);
                    }while(reinicio=='r');
                default:
                    System.out.println("Gracias por tu usarme uwu");
                    break;
            }
            //pregunta si se desea repetir
            System.out.println("Deseas volver a al menu del POKEDEX?, si lo deseas escriba s, de lo contrario ingrese cualquier tecla");
            letra=entrada.next().charAt(0);
        }while(letra == 's');
    }

}
