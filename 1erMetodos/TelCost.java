import javax.swing.JOptionPane;

public class TelCost{

    //variables
    private int cr, opr, op, ac, nln, nli, nlc, ct;
    private long nc;
    private float ln=0.5f, li=0.6f, lc=0.2f, tcs=0.0f;
    private String texto,selec;
    //menu para seleccionar opciones
    public void mll(){
        texto = JOptionPane.showInputDialog("Ingresa tu numero telefonico: ");
        nc = Long.parseLong(texto);
        texto = JOptionPane.showInputDialog("Ingresa tu credito actual: ");
        cr = Integer.parseInt(texto);
        ct=cr;
        do{
            selec = JOptionPane.showInputDialog("Bienvenido a PilloFon\nSeleccione la opcion deseada:\n1) Calcular costo de llamadas\n2) Recarga\n3) Consultar Credrito");
            op = Integer.parseInt(selec);

            switch (op) {
                case 1:
                    cll();
                    break;
                case 2:
                    rc();
                    break;
                case 3:
                    cc();
                    break;
                default:
                    break;
            }
            texto = JOptionPane.showInputDialog("Si desea repetir el programa de Llamadas Telefonicas presione 1 \n si quiere ingresar otro numero celular regrese al menu principal presionando 0");
            opr = Integer.parseInt(texto);
        }while(opr==1);
    }

    public void cll(){
        texto = JOptionPane.showInputDialog("Ingrese la cantidad de llamadas Nacionales que va a realizar");
        nln = Integer.parseInt(texto);
        if(nln<0|nln>100){
            JOptionPane.showMessageDialog(null,"La cantidad ingresada no es valida intente de nuevo");
            texto = JOptionPane.showInputDialog("Ingrese la cantidad de llamadas Nacionales");
            nln = Integer.parseInt(texto);
        }
        ln= ln*nln;
        texto = JOptionPane.showInputDialog("Ingrese la cantidad de llamadas Internacionales que va a realizar");
        nli = Integer.parseInt(texto);
        if(nli<0|nli>100){
            JOptionPane.showMessageDialog(null,"La cantidad ingresada no es valida intente de nuevo");
            texto = JOptionPane.showInputDialog("Ingrese la cantidad de llamadas Internacionales");
            nli = Integer.parseInt(texto);
        }
        li= li*nli;
        texto = JOptionPane.showInputDialog("Ingrese la cantidad de llamadas Celulares que va a realizar");
        nlc = Integer.parseInt(texto);
        if(nlc<0|nlc>100){
            JOptionPane.showMessageDialog(null,"La cantidad ingresada no es valida intente de nuevo");
            texto = JOptionPane.showInputDialog("Ingrese la cantidad de llamadas Internacionales");
            nlc = Integer.parseInt(texto);
        }
        lc = lc*nlc;
        tcs = ln+li+lc;
        ct = ct-(int)tcs;
        JOptionPane.showMessageDialog(null,"Su credito es despues de la realizar las llamadas sera de:\n"+ct+"$");
    }
    public void rc(){
        texto = JOptionPane.showInputDialog("Ingrese la cantidad que desee recargar entre 20$ y 200$");
        ac = Integer.parseInt(texto);
        if(ac<20|ac>200){
            JOptionPane.showMessageDialog(null,"La cantidad ingresada no es valida intente de nuevo");
            texto = JOptionPane.showInputDialog("Ingrese la cantidad que desee recargar");
            ac = Integer.parseInt(texto);
        }
        ct = ac + ct;
        JOptionPane.showMessageDialog(null,"Su credito es despues de la recarga de:\n"+ct+"$");
    }
    public void cc(){
        JOptionPane.showMessageDialog(null,"Su credito es de:\n"+ct+"$");
    }
}