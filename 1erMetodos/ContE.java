import javax.swing.JOptionPane;

public class ContE{
    //variables
    private int ao1, ao2, ed, ed2;
    private String texto;

    //Metodo para dar a conocer edad
    public void CalE(){

        JOptionPane.showMessageDialog(null,"Bienvenido\nA continuacion sabra que tan viejo es");
        texto = JOptionPane.showInputDialog("Ingrese su ano de nacimiento");
        ao1 = Integer.parseInt(texto);
        if (ao1<=1900|ao1>=3000){
            JOptionPane.showMessageDialog(null,"Ano no valido volver a ingresar");
            texto = JOptionPane.showInputDialog("Ingrese su ano de nacimiento");
            ao1 = Integer.parseInt(texto);
        }
        texto = JOptionPane.showInputDialog("Ingrese el ano actual");
        ao2 = Integer.parseInt(texto);
        if (ao2<=ao1|ao1>=3000){
            JOptionPane.showMessageDialog(null,"Ano no valido volver a ingresar");
            texto = JOptionPane.showInputDialog("Ingrese su ano de actual");
            ao1 = Integer.parseInt(texto);
        }
        ed = ao2-ao1;
        ed2 = ed-1;
        JOptionPane.showMessageDialog(null,"Usted tiene entre "+ed+" y "+ed2+" anos de viejo unu");


    }
}