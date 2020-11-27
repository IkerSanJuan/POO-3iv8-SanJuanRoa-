import java.io.*;
public class menuGato{

    //Metodo Que Contiene El Flujo Y El Orden Del Juego.
    public void jugarGato(){

        jugar jg = new jugar();
        magiaG mga = new magiaG();
        
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("BIENVENIDO A GATO");      
                
        do{
        
            mga.indicarTurno();                
            mga.imprimirTablero();     

            try{
                
                mga.elegirPosicion(Integer.parseInt(entrada.readLine()));

            }catch(IOException e){

            }catch(NumberFormatException e){
                            
                if(jg.getTurno()==true)
                                
                System.out.println("ERROR!: Ingreso Un Caracter No Valido, Por Favor, Intente Nuevamente JUGADOR 1.");
                            
                else
                                    
                System.out.println("ERROR!: Ingreso Un Caracter No Valido, Por Favor, Intente Nuevamente JUGADOR 2.");      
            }
                                
            mga.buscarGanador();
        
        }while(jg.getContador()<9);
        
        if(jg.getContador()==9){
                
            System.out.println("JUEGO EMPATADO");                                        
            mga.imprimirTablero();
            System.out.println("GRACIAS POR JUGAR");             
        }
                    
    }
}