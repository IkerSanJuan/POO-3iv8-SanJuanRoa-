import java.io.*;
import java.util.Scanner;

public class magiaG extends jugar{
  menuGato mg = new menuGato();
  jugar jg = new jugar();
  char letra;
  public magiaG(){
    
  }

  public magiaG(char [][] tablero, char jugadorUno, char jugadorDos, boolean turno, int contador){
    super(tablero, jugadorUno, jugadorDos, turno, contador);
    this.letra = letra;
  }

  //Imprime El Formato Del Tablero.
  public void imprimirTablero(){
               
    for(int i=0;i<3;i++){
               
      for(int j=0;j<3;j++){
                       
        if(j<2){
                       
          System.out.print(" " + tablero[i][j] + " |");
                       
        }else{
                               
          System.out.print(" " + tablero[i][j] + " ");
        }                                                
      }
               
      if(i<2){
                       
        System.out.println("\n___________");
      }                                                               
    }
      System.out.println();
      System.out.println();
      System.out.println();
  }

  public void indicarTurno(){
       
    if(getTurno()==true)
           
      System.out.println("JUGADOR 1: Elija Una Casilla Ingresando El Numero Correspondiente.");
           
    else
           
      System.out.println("JUGADOR 2: Elija Una Casilla Ingresando El Numero Correspondiente.");      
  }
  
  //Regresa El Caracter De Tipo Char Para Posteriormente Ingresarlo A Alguna Posicion Del Arreglo, Usandolo En Otro Metodo.
  public char obtenerFigura(){
    
    if(getTurno()==true)
          
            return jugadorUno;
          
    else
          
            return jugadorDos;     
  }

  //Metodo Que Hace Uso De Un "switch" Para Indicar La Posicion Del Arreglo Que El Jugador Elijio En El Juego.  
  public void elegirPosicion(int posicion){
                              
    switch(posicion){
                    
      //Comprueba Si La Posicion Esta Disponible
      case 1: comprobarEspacio(getPosicionArreglo(0,0),0,0);break;
      case 2: comprobarEspacio(getPosicionArreglo(0,1),0,1);break;
      case 3: comprobarEspacio(getPosicionArreglo(0,2),0,2);break;
      case 4: comprobarEspacio(getPosicionArreglo(1,0),1,0);break;
      case 5: comprobarEspacio(getPosicionArreglo(1,1),1,1);break;
      case 6: comprobarEspacio(getPosicionArreglo(1,2),1,2);break;
      case 7: comprobarEspacio(getPosicionArreglo(2,0),2,0);break;
      case 8: comprobarEspacio(getPosicionArreglo(2,1),2,1);break;
      case 9: comprobarEspacio(getPosicionArreglo(2,2),2,2);break;
      default:
      //Imprime El Siguiente Mensaje En Caso De Que El "switch" No Reciba Un Digito Del 1 al 9.    
      System.out.println("Por Favor, Ingrese Solo Un Digito Del 1 al 9.");break;                          
    }          
  }  
  
      
  public void cambiarTurno(){        
    
    if(obtenerFigura()=='X') 
          
            setTurno(false);
  
    else
          
            setTurno(true);
  }

  //Verifica Si La Posicion Del Arreglo Al Que El Jugador Desea Ingresar El Caracter No Fue Utilizada Antes.  
  public void comprobarEspacio(char espacio, int posicionUno, int posicionDos){
  
    //Si Se Cumple La Condicion Se Ingresa El Valor En La Posicion Del Arreglo Especificada. 
      if(espacio!=getJugadorUno()&&espacio!=getJugadorDos()){
            
        indicarPosicionArreglo(posicionUno, posicionDos,obtenerFigura());
        cambiarTurno();                                                  
        contador++;                                                                  
      }
    
      else
      
      //Imprime El Siguiente Mensaje En Caso De Que No Se Cumpla La Anterior Condicion.                             
        System.out.println("La Casilla Esta Ocupada, Elija Otra Por Favor");                
  }

  public void decirGanador(char a){

    Scanner entrada = new Scanner(System.in);    
        
    if(a=='X'){
                            
      System.out.println("FIN DEL JUEGO: FELICIDADES JUGADOR 1!, HA GANADO!.");
    
            
    }else if(a=='O'){
                        
      System.out.println("FIN DEL JUEGO: FELICIDADES JUGADOR 2!, HA GANADO!.");
                            
    }
    System.out.println("Si desea repetir el programa presione r\nDe lo contrario presione cualquier tecla");
    letra = entrada.next().charAt(0);
    while(letra == 'r'){
      mg.jugarGato();
    }       
    System.exit(0);           
  }
   
  //Verifica Las Unicas 8 Combinaciones Que Pueden Dar La Victoria A Uno De Los Jugadores.         
  public void buscarGanador(){
                 
    //Ciclo Con Instrucciones Para Comprobar Las 3 Posibilidades De Ganar De Forma Horizontal.
    for(int i=0;i<3;i++){
             
      for(int j=1;j<2;j++){
                     
        if(tablero[i][j]==tablero[i][j-1]&&tablero[i][j]==tablero[i][j+1]){
                                                     
          decirGanador(tablero[i][j]);
          imprimirTablero();
          setContador(10);
        }                              
      }                      
    }
 
    //Ciclo Con Instrucciones Para Comprobar Las 3 Posibilidades De Ganar De Forma Vertical.  
    for(int i=0;i<3;i++){
             
      for(int j=1;j<2;j++){
                     
        if(tablero[j][i]==tablero[j-1][i]&&tablero[j][i]==tablero[j+1][i]){
                     
          decirGanador(tablero[j][i]);
          imprimirTablero();
          setContador(10);
        }                              
      }
    }
     
    //Instrucciones Para Comprobar La Unica Posibilidad De Ganar De Forma Diagonal.  
    if(tablero[1][1]==tablero[0][0]&&tablero[1][1]==tablero[2][2]){
     
      decirGanador(tablero[1][1]);
      imprimirTablero();
      setContador(10);
    }  
         
    //Ciclo Con Instrucciones Para Comprobar La Unica Posibilidade De Ganar De Forma Diagonal Inversa.
    if(tablero[1][1]==tablero[0][2]&&tablero[1][1]==tablero[2][0]){
             
      decirGanador(tablero[1][1]);
      imprimirTablero();                  
      setContador(10);
    }      
  }
   
}