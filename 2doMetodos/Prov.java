import javax.swing.JOptionPane;

public class Prov{
    private String nomc;
    private int i, j;
    private int[] cost = new int[10];
    private int[] ex = new int[10];
    private String[] produ = new String[10];
    private float sumcost, max, min, pro;

    public void MenuPR(){
        nomc = JOptionPane.showInputDialog("                    Bienvenido\nIngrese el nombre de su cliente: ");
        try{
            JOptionPane.showMessageDialog(null, "Ingrese el nombre y el costo de los productos uno por uno: ");
            for(i = 0; i < cost.length; i++){
                produ[i] = JOptionPane.showInputDialog("Nombre del producto numero " + (i + 1) + ": ");
                cost[i] = Integer.parseInt(JOptionPane.showInputDialog("Costo numero " + (i + 1) + ": "));
                sumcost += cost[i];
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Ingresa solo valores enteros\nError: "+e.getMessage());
        }

        min = max = cost[0];
        for (i = 0; i < cost.length; i++){
            if(cost[i] > max){
                max = cost[i];
            }
            else if(cost [i] < min){
                min = cost[i];
            }
        }

        JOptionPane.showMessageDialog(null, "Ingrese las existencias de sus productos uno por uno: "); 
        for(j = 0; j < ex.length; j++){
            ex[j] = Integer.parseInt(JOptionPane.showInputDialog("Existencia " + (j + 1) + ":"));
        }
        provR();
    }

    public void provR(){
        JOptionPane.showMessageDialog(null, "El total de costos es de: " + sumcost + " $\nCosto mayor: " + max + " $\nCosto menor: " + min + " $");
        pro = sumcost/cost.length;
        JOptionPane.showMessageDialog(null, "El promedio de los costos es de: " + pro + " $ ");
        
        JOptionPane.showMessageDialog(null,"Su cliente es: " + nomc + "\nY sus productos son:\n1.-"+produ[0]+" con existencia "+ex[0]+" y costo " +(cost[0] * ex[0])+"\n2.-"+produ[1]+" con existencia "+ex[1]+" y costo " +(cost[1] * ex[1])+" $\n3.-"+produ[2]+" con existencia "+ex[2]+" y costo " +(cost[2] * ex[2])+" $\n4.-"+produ[3]+" con existencia "+ex[3]+" y costo " +(cost[3] * ex[3])+" $\n5.-"+produ[4]+" con existencia "+ex[4]+" y costo " +(cost[4] * ex[4])+" $\n6.-"+produ[5]+" con existencia "+ex[5]+" y costo " +(cost[5] * ex[5])+" $\n7.-"+produ[6]+" con existencia "+ex[6]+" y costo " +(cost[6] * ex[6])+" $\n8.-"+produ[7]+" con existencia "+ex[7]+" y costo " +(cost[7] * ex[7])+" $\n9.-"+produ[8]+" con existencia "+ex[8]+" y costo " +(cost[8] * ex[8])+" $\n10.-"+produ[9]+" con existencia "+ex[9]+" y costo " +(cost[9] * ex[9])+" $");
    }
}