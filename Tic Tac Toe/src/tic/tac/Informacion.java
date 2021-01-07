/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tic.tac;

import java.io.Serializable;

/**
 *
 * @author user
 */
public class Informacion implements Serializable{
    
    
    
    private String Id;
    private String Nombre;
    private String Score;
    private String Edad;
    
    public Informacion(){
        
    }

    public Informacion(String Id, String Nombre, String Score, String Edad) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Score = Score;
        this.Edad = Edad;
        
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getScore() {
        return Score;
    }

    public void setScore(String Score) {
        this.Score = Score;
    }

    public String getEdad() {
        return Edad;
    }

    public void setEdad(String Edad) {
        this.Edad = Edad;
    }
}
