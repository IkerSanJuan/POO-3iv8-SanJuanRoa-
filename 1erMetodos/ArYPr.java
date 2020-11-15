import javax.swing.JOptionPane;

public class ArYPr{
    //variables
    private double a, p, l, l2, l3;
    private int opm,opr;
    private String selec, texto;
    //Metodo donde se despliegan las opciones
    public void APm(){
        do{
            selec = JOptionPane.showInputDialog("Areas y Peimetros\nSeleccione la opcion deseada:\n1) Circulo\n2) Rectangulo\n3) Cuadrado\n4) Triangulo");
            opm = Integer.parseInt(selec);

            switch (opm) {
                case 1:
                    circulo();
                    break;
                case 2:
                    rectangulo();
                    break;
                case 3:
                    cuadrado();
                    break;
                case 4:
                    triangulo();
                    break;
                default:
                    break;
            } 
            texto = JOptionPane.showInputDialog("Si desea repetir el programa de Areas y Perimetros presione 1 \n De lo contrario pulse 0");
            opr = Integer.parseInt(texto);
        }while(opr==1);
        
    }
    //Metodos donde se calculara Area y Perimetros de cada figura
    public void circulo(){
        JOptionPane.showMessageDialog(null,"Bienvenido\nA continuacion sabra el Area y Perimetro de un Circulo");
        texto = JOptionPane.showInputDialog("Ingrese el radio");
        l = Double.parseDouble(texto);
        if (l<=0){
            JOptionPane.showMessageDialog(null,"Valor Invalido\nA continuacion ingrese un valor positivo");
            texto = JOptionPane.showInputDialog("Ingrese el radio");
            l = Double.parseDouble(texto);
        }
        a = 3.1416*(l*l);
        p = 3.1416*(l*2);
        JOptionPane.showMessageDialog(null,"El Area es de "+a+" u^2 y un Perimetro un de "+p+" u");
        
    }

    public void rectangulo(){
        JOptionPane.showMessageDialog(null,"Bienvenido\nA continuacion sabra el Area y Perimetro de un Rectangulo");
        texto = JOptionPane.showInputDialog("Ingrese la base");
        l = Double.parseDouble(texto);
        if (l<=0){
            JOptionPane.showMessageDialog(null,"Valor Invalido\nA continuacion ingrese un valor positivo");
            texto = JOptionPane.showInputDialog("Ingrese la base");
            l = Double.parseDouble(texto);
        }
        texto = JOptionPane.showInputDialog("Ingrese la altura");
        l2 = Double.parseDouble(texto);
        if (l2<=0){
            JOptionPane.showMessageDialog(null,"Valor Invalido\nA continuacion ingrese un valor positivo");
            texto = JOptionPane.showInputDialog("Ingrese la altura");
            l2 = Double.parseDouble(texto);
        }
        a = l*l2;
        p = (l*2)+(l2*2);
        JOptionPane.showMessageDialog(null,"El Area es de "+a+" u^2 y un Perimetro un de "+p+" u");
    }

    public void cuadrado(){
        JOptionPane.showMessageDialog(null,"Bienvenido\nA continuacion sabra el Area y Perimetro de un Cuadrado");
        texto = JOptionPane.showInputDialog("Ingrese el lado");
        l = Double.parseDouble(texto);
        if (l<=0){
            JOptionPane.showMessageDialog(null,"Valor Invalido\nA continuacion ingrese un valor positivo");
            texto = JOptionPane.showInputDialog("Ingrese la base");
            l = Double.parseDouble(texto);
        }
        a = l*l;
        p = (l*2)+(l*2);
        JOptionPane.showMessageDialog(null,"El Area es de "+a+" u^2 y un Perimetro un de "+p+" u");
    }

    public void triangulo(){
        JOptionPane.showMessageDialog(null,"Bienvenido\nA continuacion sabra el Area y Perimetro de un Triangulo");
        texto = JOptionPane.showInputDialog("Ingrese la base");
        l = Double.parseDouble(texto);
        if (l<=0){
            JOptionPane.showMessageDialog(null,"Valor Invalido\nA continuacion ingrese un valor positivo");
            texto = JOptionPane.showInputDialog("Ingrese la base");
            l = Double.parseDouble(texto);
        }
        texto = JOptionPane.showInputDialog("Ingrese un lado");
        l2 = Double.parseDouble(texto);
        if (l2<=0){
            JOptionPane.showMessageDialog(null,"Valor Invalido\nA continuacion ingrese un valor positivo");
            texto = JOptionPane.showInputDialog("Ingrese la base");
            l2 = Double.parseDouble(texto);
        }
        texto = JOptionPane.showInputDialog("Ingrese el otro lado");
        l3 = Double.parseDouble(texto);
        if (l3<=0){
            JOptionPane.showMessageDialog(null,"Valor Invalido\nA continuacion ingrese un valor positivo");
            texto = JOptionPane.showInputDialog("Ingrese la base");
            l3 = Double.parseDouble(texto);
        }
        a = l*l2;
        p = (l*2)+(l2*2);
        JOptionPane.showMessageDialog(null,"El Area es de "+a+" u^2 y un Perimetro un de "+p+" u");
    }
}