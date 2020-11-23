import javax.swing.;
//donde se encuentra el menu principal y la opcion de repetir
public class Principal{
    //funcion principal
    //objetos para mandar a llamar clases

    public private static void main(String[] args) {
      
        //variables
        int opcionr;
        String texto;
        //objetos para mandar a llamar clases
        Principal menupr = new Principal();
        
        do{

            menupr.menuP();

            texto = JOptionPane.showInputDialog("Si desea volver al menu principal presione 1 \n De lo contrario pulse 0");
            opcionr = Integer.parseInt(texto);
        }while(opcionr == 1);
    }
    //Donde dra la opcion para poder 
    public void menuP(){
        //variables
        int opcionm;
        String selec;

        selec = JOptionPane.showInputDialog("3IV8_SANJUAN_ROA_IKERDEJESHUA\nSeleccione la opcion deseada:\n1) Sueldo\n2) Proovedores\n3) Biblioteca");
        opcionm = Integer.parseInt(selec);

        switch (opcionm) {
            case 1:
                
                break;
            case 2:
                
                break;
            case 3:
                
                break;
            default:
                break;
        }
    }
}