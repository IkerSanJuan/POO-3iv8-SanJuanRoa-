import javax.swing.JOptionPane;

public class Biblio{

    public void LibPres(){
        EstanteP menupb = new EstanteP();
        Principal menup = new Principal();
        int num;

        num = Integer.parseInt(JOptionPane.showInputDialog("\nSi desea retirar alg\u00fan libro, digite el n\u00famero asignado a este."));

        if((num  <= 1) || (num > 2)){
            num = Integer.parseInt(JOptionPane.showInputDialog("\nPor favor, digite un t\u00edtulo existente y con existencias."));
        }

        JOptionPane.showMessageDialog(null,"\nHa usted extra\u00eddo con \u00e9xito el libro");
        num = Integer.parseInt(JOptionPane.showInputDialog("\u00bfDesea devolver el libro o extraer otro?\nDigite 1 para devolver , 2 para extraer otro y 3 para salir"));

        if(num == 1){
            JOptionPane.showMessageDialog(null,"\nDevoluci\u00f3n realizada con \u00e9xito.");
            menupb.Libros();
        }
        else if(num == 2){
            num = Integer.parseInt(JOptionPane.showInputDialog("\nError. No se cuentan con existencias suficientes para un pr\u00e9stamo."
                                                                + "\nDevuelva el libro con el que cuenta actualmente digitando 1 o digite 2."));
                if(num == 1){
                    menupb.Libros();
                }
        }
    }
}