import java.io.*;
public class jugar{
  //Variables.  
  protected char [] [] tablero;
  protected char jugadorUno;
  protected char jugadorDos;
  protected boolean turno;
  protected int contador;
  //Objetos
 
  //Constructor
  public jugar(){
       
    tablero      = new char[3][3];               
    jugadorUno   = 'X';
    jugadorDos   = 'O';
    turno        = true;  
    int contador = 0;     
    inicializarTablero();  
  }
  public jugar(char [][] tablero, char jugadorUno, char jugadorDos, boolean turno, int contador){

    this.tablero = tablero;
    this.jugadorUno = jugadorUno;
    this.jugadorDos = jugadorDos;
    this.turno = turno;
    this.contador = contador;
  }

  //Inicia El Arreglo, Especifica El Numero Que Le Corresponde A Cada Casilla.
  public void inicializarTablero(){
       
    int posicion = 1;
       
    for(int i=0;i<3;i++){
               
      for(int j=0; j<3;j++){
                       
        tablero[i][j] = Integer.toString(posicion).charAt(0);
        posicion++;
      }                      
    }
  }

  
  public void indicarPosicionArreglo(int a, int b, char c){
    tablero [a][b]=c;
  }
 
  public void setTurno(boolean d){
    turno=d;
  }
  
  public void setContador(int e){
    contador=e;
  }
   
 
  public char getPosicionArreglo(int a, int b){
    return tablero[a][b];
  }
       
  
  public char getJugadorUno(){
    return jugadorUno;
  }            
   
  
  public char getJugadorDos(){
    return jugadorDos;
  }            
 
  
  public boolean getTurno(){
    return turno;
  }
               
  public int getContador(){
    return contador;
  }

}