import javax.swing.JOptionPane;
public class LibLDC extends Lib{
    private String alerte;
    
    public LibLDC(){
    }

    public LibLDC(String nombre, String raza, int tipo_alimento, int edad, String alerte){
        super(nombre, raza, tipo_alimento, edad);
        this.alerte = alerte;
    }

    public String getalerte(){
        return alerte;
    }

    public void setalerte(String alerte){
        this.alerte = alerte;
    }

    public void mostrarLibLaDivCo(){
        JOptionPane.showMessageDialog(null,"\nLibro 2: " /*+ getNombre()+*/ 
                             ", de " /*+ getRaza()*/
                             "\nEjemplares disponibles: " + getTipoAlimento() + "."
                             "\nEjemplares prestados: " + getEdad() + ".\n"
                            + getalerte());
    }
}