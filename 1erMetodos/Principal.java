//Libreria
import javax.swing.JOptionPane;

public class Principal{
    //variables
    ContE ce = new ContE();
    ArYPr ap = new ArYPr();
    TelCost tc = new TelCost();

    //Funcion principal
    public static void main (String[] args){

        Principal menupr = new Principal();

        int opcionr;
        String texto;

        do{

            menupr.menuP();

            texto = JOptionPane.showInputDialog("Si desea volver al menu principal presione 1 \n De lo contrario pulse 0");
            opcionr = Integer.parseInt(texto);
        }while(opcionr == 1);
    }
    //Metodo donde se elige la opcion
    public void menuP(){
        //variables
        int opcionm;
        String selec;

        selec = JOptionPane.showInputDialog("3IV8_SANJUAN_ROA_IKERDEJESHUA\nSeleccione la opcion deseada:\n1) Calcular Edad\n2) Calcular Area y Perimetro\n3) Llamadas telefonicas");
        opcionm = Integer.parseInt(selec);

        switch (opcionm) {
            case 1:
                ce.CalE();
                break;
            case 2:
                ap.APm();
                break;
            case 3:
                tc.mll();
                break;
            default:
                break;
        }
    }
}