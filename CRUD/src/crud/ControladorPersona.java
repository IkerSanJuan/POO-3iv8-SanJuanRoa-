/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;
import java.util.ArrayList;
/**
 *
 * @author user
 */
public class ControladorPersona {
    
    public ArrayList<Persona> listaPersona = new ArrayList<Persona>();
    
    public void agragarPersona(Persona p){
        
        listaPersona.add(p);
    }
    
    public Persona buscarPersona(int id){
        
        Persona encontrada = new Persona();
        
        for(Persona p: listaPersona){
            if(id == p.getId()){
                encontrada = p;
            }
            else{
                System.out.println("No existe el registro");   
            }
        }
        return encontrada;
    }
    
    public void actualizarPersona(Persona actualizada){
        
        Persona actualizar = buscarPersona(actualizada.getId());
        
        listaPersona.remove(actualizar);
        listaPersona.add(actualizada);
    }
    
    public void eliminarPersona(Persona eliminar){
        listaPersona.remove(eliminar);
    }
    
    public ArrayList<Persona> mostrarPersona(){
        return listaPersona;
    }
    
}
