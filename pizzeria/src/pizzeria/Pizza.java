/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria;

/**
 *
 * @author user
 */
public class Pizza {
    
    protected String masa;
    protected String salsa;
    protected String[] ingredientes;
    
    public Pizza(){
        
    }

    public Pizza(String masa, String salsa, String[] ingredientes) {
        this.masa = "Orilla de queso";
        this.salsa = "Tomate";
        this.ingredientes = ingredientes;
    }

    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public String getSalsa() {
        return salsa;
    }

    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }

    public String[] getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String[] ingredientes) {
        this.ingredientes = ingredientes;
    }
    
    public void preparar(){
        
        System.out.println("La masa preparada es de: "+this.masa);
        System.out.println("Se agrega la salsa de: "+this.salsa);
        System.out.println("Se agraga los ingredientes de: ");
        for(int i=0; i<this.ingredientes.length; i++){
            System.out.println(this.ingredientes[i] + " , ");
        }
        System.out.println(this.ingredientes[this.ingredientes.length]);
    }
    
    public void hornear(){
        System.out.println("Se hornea en 15 min");
    }
    
    public void cortar(){
        System.out.println("Se corta en 12 rebanadas");
    }
}
