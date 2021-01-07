/*

REPOSITORIO GIT HUB

https://github.com/IkerSanJuan/POO-3iv8-SanJuanRoa-/tree/master/Tic%20Tac%20Toe


*/
package tic.tac;

import java.awt.Color;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
 
public class tictactoe extends javax.swing.JFrame{
    private String startGame = "X";
    private int xCount = 0;
    private int oCount = 0;
    public ArrayList<Informacion> Datos = new ArrayList<>();
    public Controlador c = new Controlador();
    public String IdSeleccionada;
    public Informacion p = new Informacion();

    public tictactoe() {
        initComponents();
    }
    public tictactoe(Controlador b) throws FileNotFoundException, IOException, ClassNotFoundException{
        
        initComponents();
        c=b;
        
        DefaultTableModel model = new DefaultTableModel();
        
        model.addColumn("ID");
        model.addColumn("Nombre");
        model.addColumn("Edad");
        model.addColumn("Score"); 
        
        for (int x=0; x<c.listaInformacion.size(); x++){       
           model.addRow(new Object[]{c.listaInformacion.get(x).getId(),c.listaInformacion.get(x).getNombre(),c.listaInformacion.get(x).getEdad(),c.listaInformacion.get(x).getScore()});
            System.out.println(c.listaInformacion.get(x).getId());
            System.out.println(c.listaInformacion.get(x).getNombre());
            System.out.println(c.listaInformacion.get(x).getEdad());
            System.out.println(c.listaInformacion.get(x).getScore());   
        }
        jTable1.setModel(model);
        jTable1.setEnabled(false);
        
    }
    
    private void gameScore(){
       
        playerx.setText(String.valueOf(xCount));
        playero.setText(String.valueOf(oCount));
    }
    
    private void choose_a_Player()
    {
        if(startGame.equalsIgnoreCase("X"))
        {
            startGame = "O";
        }
        else
        {
            startGame = "X";
        }
    }
    
    
    
    private void winningGame()
    {
        String b1 = txtbtn1.getText();
        String b2 = txtbtn2.getText();
        String b3 = txtbtn3.getText();
       
        String b4 = txtbtn4.getText();
        String b5 = txtbtn5.getText();
        String b6 = txtbtn6.getText();
        
        String b7 = txtbtn7.getText();
        String b8 = txtbtn8.getText();
        String b9 = txtbtn9.getText();
        
        
        // Jugador X
        
        if(b1 == ("X") && b2 ==("X") && b3 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Jugador X gana\nRecuerda tu Score\nPor si quieres registrarte\nY dejar huella uwu", "Gato", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            txtbtn1.setText(null);
            txtbtn2.setText(null);
            txtbtn3.setText(null);
        
            txtbtn4.setText(null);
            txtbtn5.setText(null);
            txtbtn6.setText(null);
        
            txtbtn7.setText(null);
            txtbtn8.setText(null);
            txtbtn9.setText(null);
        
            txtbtn1.setBackground(Color.LIGHT_GRAY);
            txtbtn2.setBackground(Color.LIGHT_GRAY);
            txtbtn3.setBackground(Color.LIGHT_GRAY);
        
            txtbtn4.setBackground(Color.LIGHT_GRAY);
            txtbtn5.setBackground(Color.LIGHT_GRAY);
            txtbtn6.setBackground(Color.LIGHT_GRAY);
        
            txtbtn7.setBackground(Color.LIGHT_GRAY);
            txtbtn8.setBackground(Color.LIGHT_GRAY);
            txtbtn9.setBackground(Color.LIGHT_GRAY);
            
        }
        
        if(b4 == ("X") && b5 ==("X") && b6 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Jugador X gana\nRecuerda tu Score\nPor si quieres registrarte\nY dejar huella uwu", "Gato", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            txtbtn1.setText(null);
            txtbtn2.setText(null);
            txtbtn3.setText(null);
        
            txtbtn4.setText(null);
            txtbtn5.setText(null);
            txtbtn6.setText(null);
        
            txtbtn7.setText(null);
            txtbtn8.setText(null);
            txtbtn9.setText(null);
        
            txtbtn1.setBackground(Color.LIGHT_GRAY);
            txtbtn2.setBackground(Color.LIGHT_GRAY);
            txtbtn3.setBackground(Color.LIGHT_GRAY);
        
            txtbtn4.setBackground(Color.LIGHT_GRAY);
            txtbtn5.setBackground(Color.LIGHT_GRAY);
            txtbtn6.setBackground(Color.LIGHT_GRAY);
        
            txtbtn7.setBackground(Color.LIGHT_GRAY);
            txtbtn8.setBackground(Color.LIGHT_GRAY);
            txtbtn9.setBackground(Color.LIGHT_GRAY);       
        }
         
        if(b7 == ("X") && b8 ==("X") && b9 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Jugador X gana\nRecuerda tu Score\nPor si quieres registrarte\nY dejar huella uwu", "Gato", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            txtbtn1.setText(null);
            txtbtn2.setText(null);
            txtbtn3.setText(null);
        
            txtbtn4.setText(null);
            txtbtn5.setText(null);
            txtbtn6.setText(null);
        
            txtbtn7.setText(null);
            txtbtn8.setText(null);
            txtbtn9.setText(null);
        
            txtbtn1.setBackground(Color.LIGHT_GRAY);
            txtbtn2.setBackground(Color.LIGHT_GRAY);
            txtbtn3.setBackground(Color.LIGHT_GRAY);
        
            txtbtn4.setBackground(Color.LIGHT_GRAY);
            txtbtn5.setBackground(Color.LIGHT_GRAY);
            txtbtn6.setBackground(Color.LIGHT_GRAY);
        
            txtbtn7.setBackground(Color.LIGHT_GRAY);
            txtbtn8.setBackground(Color.LIGHT_GRAY);
            txtbtn9.setBackground(Color.LIGHT_GRAY);        
        }
        
        if(b1 == ("X") && b4 ==("X") && b7 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Jugador X gana\nRecuerda tu Score\nPor si quieres registrarte\nY dejar huella uwu", "Gato", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            txtbtn1.setText(null);
            txtbtn2.setText(null);
            txtbtn3.setText(null);
        
            txtbtn4.setText(null);
            txtbtn5.setText(null);
            txtbtn6.setText(null);
        
            txtbtn7.setText(null);
            txtbtn8.setText(null);
            txtbtn9.setText(null);
        
            txtbtn1.setBackground(Color.LIGHT_GRAY);
            txtbtn2.setBackground(Color.LIGHT_GRAY);
            txtbtn3.setBackground(Color.LIGHT_GRAY);
        
            txtbtn4.setBackground(Color.LIGHT_GRAY);
            txtbtn5.setBackground(Color.LIGHT_GRAY);
            txtbtn6.setBackground(Color.LIGHT_GRAY);
        
            txtbtn7.setBackground(Color.LIGHT_GRAY);
            txtbtn8.setBackground(Color.LIGHT_GRAY);
            txtbtn9.setBackground(Color.LIGHT_GRAY);       
        }
        
        if(b2 == ("X") && b5 ==("X") && b8 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Jugador X gana\nRecuerda tu Score\nPor si quieres registrarte\nY dejar huella uwu", "Gato", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            txtbtn1.setText(null);
            txtbtn2.setText(null);
            txtbtn3.setText(null);
        
            txtbtn4.setText(null);
            txtbtn5.setText(null);
            txtbtn6.setText(null);
        
            txtbtn7.setText(null);
            txtbtn8.setText(null);
            txtbtn9.setText(null);
        
            txtbtn1.setBackground(Color.LIGHT_GRAY);
            txtbtn2.setBackground(Color.LIGHT_GRAY);
            txtbtn3.setBackground(Color.LIGHT_GRAY);
        
            txtbtn4.setBackground(Color.LIGHT_GRAY);
            txtbtn5.setBackground(Color.LIGHT_GRAY);
            txtbtn6.setBackground(Color.LIGHT_GRAY);
        
            txtbtn7.setBackground(Color.LIGHT_GRAY);
            txtbtn8.setBackground(Color.LIGHT_GRAY);
            txtbtn9.setBackground(Color.LIGHT_GRAY);          
        }
        if(b3 == ("X") && b6 ==("X") && b9 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Jugador X gana\nRecuerda tu Score\nPor si quieres registrarte\nY dejar huella uwu", "Gato", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            txtbtn1.setText(null);
            txtbtn2.setText(null);
            txtbtn3.setText(null);
        
            txtbtn4.setText(null);
            txtbtn5.setText(null);
            txtbtn6.setText(null);
        
            txtbtn7.setText(null);
            txtbtn8.setText(null);
            txtbtn9.setText(null);
        
            txtbtn1.setBackground(Color.LIGHT_GRAY);
            txtbtn2.setBackground(Color.LIGHT_GRAY);
            txtbtn3.setBackground(Color.LIGHT_GRAY);
        
            txtbtn4.setBackground(Color.LIGHT_GRAY);
            txtbtn5.setBackground(Color.LIGHT_GRAY);
            txtbtn6.setBackground(Color.LIGHT_GRAY);
        
            txtbtn7.setBackground(Color.LIGHT_GRAY);
            txtbtn8.setBackground(Color.LIGHT_GRAY);
            txtbtn9.setBackground(Color.LIGHT_GRAY);     
        }
        
        
        if(b1 == ("X") && b5 ==("X") && b9 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Jugador X gana\nRecuerda tu Score\nPor si quieres registrarte\nY dejar huella uwu", "Gato", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            txtbtn1.setText(null);
            txtbtn2.setText(null);
            txtbtn3.setText(null);
        
            txtbtn4.setText(null);
            txtbtn5.setText(null);
            txtbtn6.setText(null);
        
            txtbtn7.setText(null);
            txtbtn8.setText(null);
            txtbtn9.setText(null);
        
            txtbtn1.setBackground(Color.LIGHT_GRAY);
            txtbtn2.setBackground(Color.LIGHT_GRAY);
            txtbtn3.setBackground(Color.LIGHT_GRAY);
        
            txtbtn4.setBackground(Color.LIGHT_GRAY);
            txtbtn5.setBackground(Color.LIGHT_GRAY);
            txtbtn6.setBackground(Color.LIGHT_GRAY);
        
            txtbtn7.setBackground(Color.LIGHT_GRAY);
            txtbtn8.setBackground(Color.LIGHT_GRAY);
            txtbtn9.setBackground(Color.LIGHT_GRAY);       
        }
        
        if(b3 == ("X") && b5 ==("X") && b7 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Jugador X gana\nRecuerda tu Score\nPor si quieres registrarte\nY dejar huella uwu", "Gato", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            txtbtn1.setText(null);
            txtbtn2.setText(null);
            txtbtn3.setText(null);
        
            txtbtn4.setText(null);
            txtbtn5.setText(null);
            txtbtn6.setText(null);
        
            txtbtn7.setText(null);
            txtbtn8.setText(null);
            txtbtn9.setText(null);
        
            txtbtn1.setBackground(Color.LIGHT_GRAY);
            txtbtn2.setBackground(Color.LIGHT_GRAY);
            txtbtn3.setBackground(Color.LIGHT_GRAY);
        
            txtbtn4.setBackground(Color.LIGHT_GRAY);
            txtbtn5.setBackground(Color.LIGHT_GRAY);
            txtbtn6.setBackground(Color.LIGHT_GRAY);
        
            txtbtn7.setBackground(Color.LIGHT_GRAY);
            txtbtn8.setBackground(Color.LIGHT_GRAY);
            txtbtn9.setBackground(Color.LIGHT_GRAY);        
        }
        
        
        
        // Jugador O
        
        
        if(b1 == ("O") && b2 ==("O") && b3 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Jugador O gana\nRecuerda tu Score\nPor si quieres registrarte\nY dejar huella uwu", "Gato", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            txtbtn1.setText(null);
            txtbtn2.setText(null);
            txtbtn3.setText(null);
        
            txtbtn4.setText(null);
            txtbtn5.setText(null);
            txtbtn6.setText(null);
        
            txtbtn7.setText(null);
            txtbtn8.setText(null);
            txtbtn9.setText(null);
        
            txtbtn1.setBackground(Color.LIGHT_GRAY);
            txtbtn2.setBackground(Color.LIGHT_GRAY);
            txtbtn3.setBackground(Color.LIGHT_GRAY);
        
            txtbtn4.setBackground(Color.LIGHT_GRAY);
            txtbtn5.setBackground(Color.LIGHT_GRAY);
            txtbtn6.setBackground(Color.LIGHT_GRAY);
        
            txtbtn7.setBackground(Color.LIGHT_GRAY);
            txtbtn8.setBackground(Color.LIGHT_GRAY);
            txtbtn9.setBackground(Color.LIGHT_GRAY);
            
        }
        
        if(b4 == ("O") && b5 ==("O") && b6 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Jugador O gana\nRecuerda tu Score\nPor si quieres registrarte\nY dejar huella uwu", "Gato", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            txtbtn1.setText(null);
            txtbtn2.setText(null);
            txtbtn3.setText(null);
        
            txtbtn4.setText(null);
            txtbtn5.setText(null);
            txtbtn6.setText(null);
        
            txtbtn7.setText(null);
            txtbtn8.setText(null);
            txtbtn9.setText(null);
        
            txtbtn1.setBackground(Color.LIGHT_GRAY);
            txtbtn2.setBackground(Color.LIGHT_GRAY);
            txtbtn3.setBackground(Color.LIGHT_GRAY);
        
            txtbtn4.setBackground(Color.LIGHT_GRAY);
            txtbtn5.setBackground(Color.LIGHT_GRAY);
            txtbtn6.setBackground(Color.LIGHT_GRAY);
        
            txtbtn7.setBackground(Color.LIGHT_GRAY);
            txtbtn8.setBackground(Color.LIGHT_GRAY);
            txtbtn9.setBackground(Color.LIGHT_GRAY);         
        }
         
        if(b7 == ("O") && b8 ==("O") && b9 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Jugador O gana\nRecuerda tu Score\nPor si quieres registrarte\nY dejar huella uwu", "Gato", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            txtbtn1.setText(null);
            txtbtn2.setText(null);
            txtbtn3.setText(null);
        
            txtbtn4.setText(null);
            txtbtn5.setText(null);
            txtbtn6.setText(null);
        
            txtbtn7.setText(null);
            txtbtn8.setText(null);
            txtbtn9.setText(null);
        
            txtbtn1.setBackground(Color.LIGHT_GRAY);
            txtbtn2.setBackground(Color.LIGHT_GRAY);
            txtbtn3.setBackground(Color.LIGHT_GRAY);
        
            txtbtn4.setBackground(Color.LIGHT_GRAY);
            txtbtn5.setBackground(Color.LIGHT_GRAY);
            txtbtn6.setBackground(Color.LIGHT_GRAY);
        
            txtbtn7.setBackground(Color.LIGHT_GRAY);
            txtbtn8.setBackground(Color.LIGHT_GRAY);
            txtbtn9.setBackground(Color.LIGHT_GRAY);         
        }
        
        if(b1 == ("O") && b4 ==("O") && b7 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Jugador O gana\nRecuerda tu Score\nPor si quieres registrarte\nY dejar huella uwu", "Gato", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            txtbtn1.setText(null);
            txtbtn2.setText(null);
            txtbtn3.setText(null);
        
            txtbtn4.setText(null);
            txtbtn5.setText(null);
            txtbtn6.setText(null);
        
            txtbtn7.setText(null);
            txtbtn8.setText(null);
            txtbtn9.setText(null);
        
            txtbtn1.setBackground(Color.LIGHT_GRAY);
            txtbtn2.setBackground(Color.LIGHT_GRAY);
            txtbtn3.setBackground(Color.LIGHT_GRAY);
        
            txtbtn4.setBackground(Color.LIGHT_GRAY);
            txtbtn5.setBackground(Color.LIGHT_GRAY);
            txtbtn6.setBackground(Color.LIGHT_GRAY);
        
            txtbtn7.setBackground(Color.LIGHT_GRAY);
            txtbtn8.setBackground(Color.LIGHT_GRAY);
            txtbtn9.setBackground(Color.LIGHT_GRAY);          
        }
        
        if(b2 == ("O") && b5 ==("O") && b8 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Jugador O gana\nRecuerda tu Score\nPor si quieres registrarte\nY dejar huella uwu", "Gato", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            txtbtn1.setText(null);
            txtbtn2.setText(null);
            txtbtn3.setText(null);
        
            txtbtn4.setText(null);
            txtbtn5.setText(null);
            txtbtn6.setText(null);
        
            txtbtn7.setText(null);
            txtbtn8.setText(null);
            txtbtn9.setText(null);
        
            txtbtn1.setBackground(Color.LIGHT_GRAY);
            txtbtn2.setBackground(Color.LIGHT_GRAY);
            txtbtn3.setBackground(Color.LIGHT_GRAY);
        
            txtbtn4.setBackground(Color.LIGHT_GRAY);
            txtbtn5.setBackground(Color.LIGHT_GRAY);
            txtbtn6.setBackground(Color.LIGHT_GRAY);
        
            txtbtn7.setBackground(Color.LIGHT_GRAY);
            txtbtn8.setBackground(Color.LIGHT_GRAY);
            txtbtn9.setBackground(Color.LIGHT_GRAY);          
        }
        if(b3 == ("O") && b6 ==("O") && b9 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Jugador O gana\nRecuerda tu Score\nPor si quieres registrarte\nY dejar huella uwu", "Gato", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            txtbtn1.setText(null);
            txtbtn2.setText(null);
            txtbtn3.setText(null);
        
            txtbtn4.setText(null);
            txtbtn5.setText(null);
            txtbtn6.setText(null);
        
            txtbtn7.setText(null);
            txtbtn8.setText(null);
            txtbtn9.setText(null);
        
            txtbtn1.setBackground(Color.LIGHT_GRAY);
            txtbtn2.setBackground(Color.LIGHT_GRAY);
            txtbtn3.setBackground(Color.LIGHT_GRAY);
        
            txtbtn4.setBackground(Color.LIGHT_GRAY);
            txtbtn5.setBackground(Color.LIGHT_GRAY);
            txtbtn6.setBackground(Color.LIGHT_GRAY);
        
            txtbtn7.setBackground(Color.LIGHT_GRAY);
            txtbtn8.setBackground(Color.LIGHT_GRAY);
            txtbtn9.setBackground(Color.LIGHT_GRAY);          
        }
        
        
        if(b1 == ("O") && b5 ==("O") && b9 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Jugador O gana\nRecuerda tu Score\nPor si quieres registrarte\nY dejar huella uwu", "Gato", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            txtbtn1.setText(null);
            txtbtn2.setText(null);
            txtbtn3.setText(null);
        
            txtbtn4.setText(null);
            txtbtn5.setText(null);
            txtbtn6.setText(null);
        
            txtbtn7.setText(null);
            txtbtn8.setText(null);
            txtbtn9.setText(null);
        
            txtbtn1.setBackground(Color.LIGHT_GRAY);
            txtbtn2.setBackground(Color.LIGHT_GRAY);
            txtbtn3.setBackground(Color.LIGHT_GRAY);
        
            txtbtn4.setBackground(Color.LIGHT_GRAY);
            txtbtn5.setBackground(Color.LIGHT_GRAY);
            txtbtn6.setBackground(Color.LIGHT_GRAY);
        
            txtbtn7.setBackground(Color.LIGHT_GRAY);
            txtbtn8.setBackground(Color.LIGHT_GRAY);
            txtbtn9.setBackground(Color.LIGHT_GRAY);            
        }
        
        if(b3 == ("O") && b5 ==("O") && b7 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Jugador O gana\nRecuerda tu Score\nPor si quieres registrarte\nY dejar huella uwu", "Gato", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            txtbtn1.setText(null);
            txtbtn2.setText(null);
            txtbtn3.setText(null);
        
            txtbtn4.setText(null);
            txtbtn5.setText(null);
            txtbtn6.setText(null);
        
            txtbtn7.setText(null);
            txtbtn8.setText(null);
            txtbtn9.setText(null);
        
            txtbtn1.setBackground(Color.LIGHT_GRAY);
            txtbtn2.setBackground(Color.LIGHT_GRAY);
            txtbtn3.setBackground(Color.LIGHT_GRAY);
        
            txtbtn4.setBackground(Color.LIGHT_GRAY);
            txtbtn5.setBackground(Color.LIGHT_GRAY);
            txtbtn6.setBackground(Color.LIGHT_GRAY);
        
            txtbtn7.setBackground(Color.LIGHT_GRAY);
            txtbtn8.setBackground(Color.LIGHT_GRAY);
            txtbtn9.setBackground(Color.LIGHT_GRAY);           
        }
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtbtn1 = new javax.swing.JButton();
        txtbtn2 = new javax.swing.JButton();
        txtbtn3 = new javax.swing.JButton();
        txtbtn4 = new javax.swing.JButton();
        txtbtn5 = new javax.swing.JButton();
        txtbtn6 = new javax.swing.JButton();
        txtbtn7 = new javax.swing.JButton();
        txtbtn8 = new javax.swing.JButton();
        txtbtn9 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        playerx = new javax.swing.JLabel();
        playero = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        IrARegistrarse = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TIC TAC TOE GAME");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("GATO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(497, 497, 497))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtbtn1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        txtbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn1ActionPerformed(evt);
            }
        });

        txtbtn2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        txtbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn2ActionPerformed(evt);
            }
        });

        txtbtn3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        txtbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn3ActionPerformed(evt);
            }
        });

        txtbtn4.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        txtbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn4ActionPerformed(evt);
            }
        });

        txtbtn5.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        txtbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn5ActionPerformed(evt);
            }
        });

        txtbtn6.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        txtbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn6ActionPerformed(evt);
            }
        });

        txtbtn7.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        txtbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn7ActionPerformed(evt);
            }
        });

        txtbtn8.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        txtbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn8ActionPerformed(evt);
            }
        });

        txtbtn9.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        txtbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn9ActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.darkGray));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("PUNTOS X:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("PUNTOS O:");

        playerx.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        playerx.setForeground(new java.awt.Color(0, 102, 255));
        playerx.setText("0");

        playero.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        playero.setForeground(new java.awt.Color(0, 102, 255));
        playero.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(77, 77, 77)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playero)
                    .addComponent(playerx))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(playerx))
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(playero))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        jButton10.setBackground(new java.awt.Color(0, 204, 204));
        jButton10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton10.setText("REINICIAR");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(51, 153, 0));
        jButton11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton11.setText("SALIR");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Edad", "Score"
            }
        ));
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(jTable1);

        IrARegistrarse.setBackground(new java.awt.Color(153, 153, 255));
        IrARegistrarse.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        IrARegistrarse.setText("REGISTRO");
        IrARegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IrARegistrarseActionPerformed(evt);
            }
        });

        jButton1.setText("ELIMINAR JUGADOR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("REFRESCAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("EDITAR JUAGDOR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Yu Gothic", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 51));
        jLabel4.setText("SI NO TE APARECE NADA EN LA TABLA");

        jLabel5.setFont(new java.awt.Font("Yu Gothic", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 51));
        jLabel5.setText("PRESIONA REFRESCAR VARIAS VECES");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(143, 143, 143)
                                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(145, 145, 145))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(IrARegistrarse)
                                        .addGap(228, 228, 228)))))
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 231, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(201, 201, 201))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(19, 19, 19)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IrARegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(583, 583, 583)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        
        txtbtn1.setText(null);
        txtbtn2.setText(null);
        txtbtn3.setText(null);
        
        txtbtn4.setText(null);
        txtbtn5.setText(null);
        txtbtn6.setText(null);
        
        txtbtn7.setText(null);
        txtbtn8.setText(null);
        txtbtn9.setText(null);
        
        txtbtn1.setBackground(Color.LIGHT_GRAY);
        txtbtn2.setBackground(Color.LIGHT_GRAY);
        txtbtn3.setBackground(Color.LIGHT_GRAY);
        
        txtbtn4.setBackground(Color.LIGHT_GRAY);
        txtbtn5.setBackground(Color.LIGHT_GRAY);
        txtbtn6.setBackground(Color.LIGHT_GRAY);
        
        txtbtn7.setBackground(Color.LIGHT_GRAY);
        txtbtn8.setBackground(Color.LIGHT_GRAY);
        txtbtn9.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_jButton10ActionPerformed
    
    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        
        
        JFrame frame = new JFrame("Salir");
        if (JOptionPane.showConfirmDialog(frame, "Seguro que quieres salir?", 
                "Gato",
                JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
            
    }//GEN-LAST:event_jButton11ActionPerformed

    private void txtbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn1ActionPerformed
        
        
        txtbtn1.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
           txtbtn1.setForeground(Color.RED);
        }
        else
        {
            txtbtn1.setForeground(Color.MAGENTA);
        }
        
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_txtbtn1ActionPerformed

    private void txtbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn2ActionPerformed
        
        
        txtbtn2.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
           txtbtn2.setForeground(Color.RED);
        }
        else
        {
            txtbtn2.setForeground(Color.MAGENTA);
        }
        
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_txtbtn2ActionPerformed

    private void txtbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn3ActionPerformed
        
        txtbtn3.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
           txtbtn3.setForeground(Color.RED);
        }
        else
        {
            txtbtn3.setForeground(Color.MAGENTA);
        }
        
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_txtbtn3ActionPerformed

    private void txtbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn4ActionPerformed
        
        txtbtn4.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
           txtbtn4.setForeground(Color.RED);
        }
        else
        {
            txtbtn4.setForeground(Color.MAGENTA);
        }
        
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_txtbtn4ActionPerformed

    private void txtbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn5ActionPerformed
        
        txtbtn5.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
           txtbtn5.setForeground(Color.RED);
        }
        else
        {
            txtbtn5.setForeground(Color.MAGENTA);
        }
        
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_txtbtn5ActionPerformed

    private void txtbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn6ActionPerformed
        
        txtbtn6.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
           txtbtn6.setForeground(Color.RED);
        }
        else
        {
            txtbtn6.setForeground(Color.MAGENTA);
        }
        
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_txtbtn6ActionPerformed

    private void txtbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn9ActionPerformed
        
        txtbtn9.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
           txtbtn9.setForeground(Color.RED);
        }
        else
        {
            txtbtn9.setForeground(Color.MAGENTA);
        }
        
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_txtbtn9ActionPerformed

    private void txtbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn8ActionPerformed
        
        txtbtn8.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
           txtbtn8.setForeground(Color.RED);
        }
        else
        {
            txtbtn8.setForeground(Color.MAGENTA);
        }
        
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_txtbtn8ActionPerformed

    private void txtbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn7ActionPerformed
        
        txtbtn7.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
           txtbtn7.setForeground(Color.RED);
        }
        else
        {
            txtbtn7.setForeground(Color.MAGENTA);
        }
        
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_txtbtn7ActionPerformed

    private void IrARegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IrARegistrarseActionPerformed
        Crear obj = new Crear(c);
        this.setVisible(false);
        obj.setVisible(true);
    }//GEN-LAST:event_IrARegistrarseActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        Borrar objetito = new Borrar(c);
        
        objetito.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        DefaultTableModel model = new DefaultTableModel();
               model.addColumn("ID");
               model.addColumn("Nombre");
               model.addColumn("Edad");
               model.addColumn("Score");
        for(int x=0;x<c.listaInformacion.size();x++ ){
            model.addRow(new Object[]{c.listaInformacion.get(x).getId(),c.listaInformacion.get(x).getNombre(),c.listaInformacion.get(x).getEdad(),c.listaInformacion.get(x).getScore()});
            System.out.println(c.listaInformacion.get(x).getId());
            System.out.println(c.listaInformacion.get(x).getNombre());
            System.out.println(c.listaInformacion.get(x).getEdad());
            System.out.println(c.listaInformacion.get(x).getScore());

        }
        jTable1.setModel(model);
        jTable1.setEnabled(false);
        try {
            // TODO add your handling code here:
            c.leer();
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(tictactoe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Editar obj = new Editar(c);
        obj.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    
    public static void main(String args[]) throws FileNotFoundException, IOException {
        
        
        try {
            
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }     catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tictactoe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tictactoe().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton IrARegistrarse;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel playero;
    private javax.swing.JLabel playerx;
    private javax.swing.JButton txtbtn1;
    private javax.swing.JButton txtbtn2;
    private javax.swing.JButton txtbtn3;
    private javax.swing.JButton txtbtn4;
    private javax.swing.JButton txtbtn5;
    private javax.swing.JButton txtbtn6;
    private javax.swing.JButton txtbtn7;
    private javax.swing.JButton txtbtn8;
    private javax.swing.JButton txtbtn9;
    // End of variables declaration//GEN-END:variables
}
