/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tic.tac;
 

/**
 *
 * @author user
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
public class Controlador{
    
    public int cuenta;
    public String ka;
    
    public ArrayList<Informacion> listaInformacion = new ArrayList<>();
    
    public void createInformacion(Informacion p) throws IOException, FileNotFoundException, ClassNotFoundException{

        if(cuenta<=9){
            listaInformacion.add(p);
            serializar();
            //escribir();
            //ArrayList<Informacion> leer = leer();
            //leer();
            cuenta++;
        }
        
    }
    
    public String updateInformacion(Informacion p) throws IOException{
        int indice=0;
        String busqueda=null;
        for(int x=0 ;x< listaInformacion.size();x++){
            if(p.getScore()==listaInformacion.get(x).getScore()){
                indice=x;
                listaInformacion.set(indice, p);
            }           
        }
        if(indice==0){
            busqueda="Inexistente";
            
        }
        else{
            busqueda="ok";
        }
        serializar();
        return busqueda ;
        
    }
    public String deleteInformacion(Informacion p) throws IOException{
        int indice=0;
        String busqueda=null;
        for(int x=0 ;x< listaInformacion.size();x++){
            if(p.getId()==listaInformacion.get(x).getId()){
                indice=x;
                listaInformacion.remove(indice);
            }
           
            
        }
        if(indice==0){
            busqueda="Inexistente";
            
        }
        else{
            busqueda="Eliminado";
        }
        serializar();
        return busqueda ;
        
    }
    public String deleteInformacionId(String Id) throws IOException{
        int indice=0;
        String busqueda;
        for(int x=0 ;x< listaInformacion.size();x++){
            if(Id.equals(listaInformacion.get(x).getId())){
                indice=x;
                listaInformacion.remove(indice);
            }
           
            
        }
        if(indice==0){
            busqueda="Inexistente";
            
        }
        else{
            busqueda="Eliminado";
        }
        serializar();
        return busqueda ;
    }
    public void showInformacion(){
        for(int x=0;x<listaInformacion.size();x++ ){
            System.out.println(listaInformacion.get(x).getId());
            System.out.println(listaInformacion.get(x).getEdad());
            System.out.println(listaInformacion.get(x).getScore());
            System.out.println(listaInformacion.get(x).getNombre());
            
        }
    }    
    
    public void serializar() throws FileNotFoundException, IOException{
      
        FileOutputStream oos = new FileOutputStream("Datos.txt");
        ObjectOutputStream escribir = new ObjectOutputStream(oos);
        escribir.writeObject(listaInformacion);
        escribir.close();

    }
    
    public /*ArrayList<Informacion>*/ void leer() throws FileNotFoundException, IOException, ClassNotFoundException{
        
        FileInputStream archiv = new FileInputStream("Datos.txt");
        
        ObjectInputStream entrada = new ObjectInputStream(archiv);
        
        listaInformacion = (ArrayList)entrada.readObject();
        /*
        for (int x=0; x<listaInformacion.size(); x++){
            Informacion obj = (Informacion)listaInformacion.get(x);
            
            JOptionPane.showMessageDialog(null, "\n"
                    + "N° Alumno: " + obj.getId() + "\n"
                    + "Nombre: " + obj.getNombre()+ "\n"
                    + "Edad: " + obj.getEdad()+ "\n"
                    + "Boleta: " + obj.getScore()+ "\n");
        }*/
        //return listaInformacion;
    }
    /*
    public void leer(){
        
        try {
            
            for (Informacion Info : listaInformacion){
                ka+= Info+",";
            }            
           
            File archivo = new File("Datos.txt");
            Scanner lector = new Scanner(archivo);
            
            while(lector.hasNextLine()){
                String Data = lector.nextLine();
                System.out.println(Data);
            }
            
            lector.close();
            
        } catch (IOException e){
            System.out.println(e.toString());
        }
        
        String employee = ka;
        String delims = "[,]";
        String[] tokens = employee.split(delims);
        
        
    }
    
    
    public void escribir(){
        
        try{
            FileWriter escrito = new FileWriter("Datos.txt");
            
            for (Informacion Info : listaInformacion){
                ka+= Info+",";
            }            
            
            
            for(int x = 0 ; x < 10 ; x++ ){
                escrito.write(ka);
            }
            
            
            
            escrito.close();
        }catch (IOException e){
            System.out.println(e.toString());
        }
        
        String employee = ka;
        String delims = "[,]";
        String[] tokens = employee.split(delims);
        
    }*/
    
    
    
}
