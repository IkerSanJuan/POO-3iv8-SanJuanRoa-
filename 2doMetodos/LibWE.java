import javax.swing.JOptionPane;
public class LibWE extends Lib{
    private String alerte;
    
    public LibWE(){
    }

    public LibWE(String nombre, String raza, int tipo_alimento, int edad, String alerte){
        super(nombre, raza, tipo_alimento, edad);
        this.alerte = alerte;
    }

    public String getalerte(){
        return alerte;
    }

    public void setalerte(String alerte){
        this.alerte = alerte;
    }

    public void mostrarLibWiVe(){
        JOptionPane.showMessageDialog(null,"\nLibro 1:\n\u00ab" + getNombre() + "\u00bb"
                            + ", de " + getRaza()
                            + "\nEjemplares disponibles: " + getTipoAlimento() + "."
                            + "\nEjemplares prestados: " + getEdad() + ".\n"
                            + getalerte());
    }
}