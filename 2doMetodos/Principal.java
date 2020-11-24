import javax.swing.JOptionPane;
//donde se encuentra el menu principal y la opcion de repetir
public class Principal{
    //objetos para mandar a llamar clases
    Sueldo SO = new Sueldo();
    Prov PR = new Prov();
    EstanteP BL =new EstanteP();

    //funcion principal
    public static void main(String[] args) {
      
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
        int opcionm=0;
        String selec;
        try{
            selec = JOptionPane.showInputDialog("3IV8_SANJUAN_ROA_IKERDEJESHUA\nSeleccione la opcion deseada:\n1) Sueldo\n2) Proovedores\n3) Biblioteca");
            opcionm = Integer.parseInt(selec);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Ingresa solo valores enteros\nError: "+e.getMessage());
        }
        switch (opcionm) {
            case 1:
                SO.MenuS();
                break;
            case 2:
                PR.MenuPR();
                break;
            case 3:
                BL.Libros();
                break;
            default:
                break;
        }
    }
}