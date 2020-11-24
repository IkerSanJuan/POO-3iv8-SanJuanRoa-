import javax.swing.JOptionPane;

public class Prov{
    String nomc;
    int i, j;
    int[] costo = new int[10];
    int[] ex = new int[10];
    String[] producto = new String[10];
    float suma_costo, max, min, pro;

    public void MenuPR(){
        nomc = JOptionPane.showInputDialog("Ingrese el nombre de su cliente:");

        JOptionPane.showMessageDialog(null, "Digite el costo y el nombre de sus productos uno a uno.");
        for(i = 0; i < costo.length; i++){
            costo[i] = Integer.parseInt(JOptionPane.showInputDialog("Costo " + (i + 1) + ":"));
            suma_costo += costo[i];
            producto[i] = JOptionPane.showInputDialog("Producto " + (i + 1) + ":");
        }

        min = max = costo[0];
        for (i = 0; i < costo.length; i++){
            if(costo[i] > max){
                max = costo[i];
            }
            else if(costo [i] < min){
                min = costo[i];
            }
        }

        JOptionPane.showMessageDialog(null, "Digite las existencias de sus productos uno a uno."); 
        for(j = 0; j < existencia.length; j++){
            existencia[j] = Integer.parseInt(JOptionPane.showInputDialog("Existencia " + (j + 1) + ":"));
        }
        NegocioR();
    }

    public void provR(){
        JOptionPane.showMessageDialog(null, "El total de costos es de: " + suma_costo + " $.");
        JOptionPane.showMessageDialog(null, "Costo mayor: " + max + " $.");
        JOptionPane.showMessageDialog(null, "Costo menor: " + min + " $.");
        pro = suma_costo/costo.length;
        JOptionPane.showMessageDialog(null, "El promedio de los costos es de: " + pro + " $ .");
        
        JOptionPane.showMessageDialog(null, "Su cliente es: " + nomc + ".");
        JOptionPane.showMessageDialog(null, "(" + existencia[0] + ") " + producto[0] + " cost\u00f3 " + (costo[0] * existencia[0]) + " $.");
        JOptionPane.showMessageDialog(null, "(" + existencia[1] + ") " + producto[1] + " cost\u00f3 " + (costo[1] * existencia[1]) + " $.");
        JOptionPane.showMessageDialog(null, "(" + existencia[2] + ") " + producto[2] + " cost\u00f3 " + (costo[2] * existencia[2]) + " $.");
        JOptionPane.showMessageDialog(null, "(" + existencia[3] + ") " + producto[3] + " cost\u00f3 " + (costo[3] * existencia[3]) + " $.");
        JOptionPane.showMessageDialog(null, "(" + existencia[4] + ") " + producto[4] + " cost\u00f3 " + (costo[4] * existencia[4]) + " $.");
        JOptionPane.showMessageDialog(null, "(" + existencia[5] + ") " + producto[5] + " cost\u00f3 " + (costo[5] * existencia[5]) + " $.");
        JOptionPane.showMessageDialog(null, "(" + existencia[6] + ") " + producto[6] + " cost\u00f3 " + (costo[6] * existencia[6]) + " $.");
        JOptionPane.showMessageDialog(null, "(" + existencia[7] + ") " + producto[7] + " cost\u00f3 " + (costo[7] * existencia[7]) + " $.");
        JOptionPane.showMessageDialog(null, "(" + existencia[8] + ") " + producto[8] + " cost\u00f3 " + (costo[8] * existencia[8]) + " $.");
        JOptionPane.showMessageDialog(null, "(" + existencia[9] + ") " + producto[9] + " cost\u00f3 " + (costo[9] * existencia[9]) + " $.");
    }
}