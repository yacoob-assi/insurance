
package insurance;
import com.sun.javafx.tk.Toolkit.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GraphicsDevice;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Toolkit;




public class Start extends javax.swing.JFrame  {

  boolean m1,m2;
    public Start() {
        initComponents();
        m1=m2=false;

     Dimension screensize= Toolkit.getDefaultToolkit().getScreenSize();
     background.setSize(screensize.width,screensize.height);
         this.setSize(screensize.width,screensize.height);

        ImageIcon myimage=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("start.jpg")));
        Image img1=myimage.getImage();
        Image img2=img1.getScaledInstance(background.getWidth(),background.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon i=new ImageIcon(img2);
        background.setIcon(i);
         jPanel1.setLocation(screensize.width/3+20, screensize.height/3-80);
    jPanel1.setSize(screensize.width/3, screensize.height/2+10);
   

      
        
        this.t1e1.setVisible(false);
        this.t1e2.setVisible(false); 
         this.t2e.setVisible(false); 
         
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        t1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        t2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        t1e1 = new javax.swing.JLabel();
        t2e = new javax.swing.JLabel();
        t1e2 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/insurance/alalmi.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(34, 32, 194, 119);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(449, 32, 0, 0);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        t1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t1.setForeground(new java.awt.Color(102, 102, 102));
        t1.setText("Employee number");
        t1.setBorder(null);
        t1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        t1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t1MouseExited(evt);
            }
        });
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        t1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t1KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(t1, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(t1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addGap(2, 2, 2))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(46, 198, 182, 37);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setForeground(new java.awt.Color(204, 204, 204));

        t2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t2.setForeground(new java.awt.Color(102, 102, 102));
        t2.setText("Password");
        t2.setBorder(null);
        t2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t2MouseExited(evt);
            }
        });
        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });
        t2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t2KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t2KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(t2, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(t2, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addGap(2, 2, 2))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(46, 301, 182, 37);

        jButton1.setBackground(new java.awt.Color(51, 51, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Login");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(120, 420, 159, 36);

        t1e1.setForeground(new java.awt.Color(255, 0, 0));
        t1e1.setText("number is required");
        jPanel1.add(t1e1);
        t1e1.setBounds(246, 207, 120, 16);

        t2e.setForeground(new java.awt.Color(255, 0, 0));
        t2e.setText("Password is required");
        jPanel1.add(t2e);
        t2e.setBounds(246, 310, 122, 28);

        t1e2.setForeground(new java.awt.Color(255, 0, 0));
        t1e2.setText("Employee number is 4 numbers");
        jPanel1.add(t1e2);
        t1e2.setBounds(246, 223, 184, 16);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(428, 294, 530, 600);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/insurance/start.jpg"))); // NOI18N
        background.setText("jLabel1");
        getContentPane().add(background);
        background.setBounds(0, 0, 1395, 1157);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
    
    }//GEN-LAST:event_t1ActionPerformed

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
      
    }//GEN-LAST:event_t2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  boolean b1,b2;
             if(this.t1.getText().equals("")||t1.equals("Employee number")){
                 this.t1e1.setVisible(true);b1=false;t1e2.setVisible(false);
             }
             else{
                 int length=0;int number=0;  
                 for(int i=0;i<this.t1.getText().length();i++){
                     length++;
                 if(Character.isDigit(this.t1.getText().charAt(WIDTH)))number++;}
                 if(number==this.t1.getText().length()&&length==4){
                     this.t1e2.setVisible(false);b1=true;}
                     else{
                             this.t1e2.setVisible(true);b1=false;
                             }
                 
             }
             if(t2.getText().equals("")||this.t2.getText().equals("Password")){
                 this.t2e.setVisible(true);b2=false;}
         
         else{
             int length=0;boolean c=false;
             for(int i=0;i<this.t2.getText().length();i++){
                 length++;
                 if(Character.isDigit(this.t2.getText().charAt(i)))c=true;
             }
             if(c&&length>=5){this.t2e.setVisible(false);b2=true;}
             else{
                 this.t2e.setVisible(true);b2=false;JOptionPane.showMessageDialog(null, "The Password must be more than five simpols "
                            + "and contains one number at least");
             
             }
             }
              ////////////////////////////////////////////////////////////////////////////
            /////////////////////////////////////////////////////////////////////////////
            ///////////////////////////////////////////////////////////////////////////////
            if (b1 && b2) {
             //Raed //
               
               Employee_user v= new Employee_user();
                            v.setExtendedState(JFrame.MAXIMIZED_BOTH);

                v.setDefaultCloseOperation(WIDTH);
                v.setVisible(true);
            }
         


    }//GEN-LAST:event_jButton1ActionPerformed

    private void t1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t1KeyPressed
           if(evt.getKeyCode()!=KeyEvent.VK_ENTER&&evt.getKeyCode()!=KeyEvent.VK_UP&&
                   evt.getKeyCode()!=KeyEvent.VK_DOWN){
              m1=true;this.t1e1.setVisible(false);
           
            if(this.t1.getText().equals("Employee number"))
            this.t1.setText("");
              int number=0;int length=0;
                if(evt.getKeyCode()==8){   
             for(int i=0;i<this.t1.getText().length();i++){length++;
        if (Character.isDigit(this.t1.getText().charAt(i)))number++;}
         if((number==this.t1.getText().length()&&length==5)){
                  this.t1e2.setVisible(false);}}
         
              for(int i=0;i<this.t1.getText().length();i++){length++;
        if (Character.isDigit(this.t1.getText().charAt(i)))number++;}
         if(number==this.t1.getText().length()&&length==3){
                  this.t1e2.setVisible(false);}
             
        } 
           else if(evt.getKeyCode()==KeyEvent.VK_UP){
                  this.t2.requestFocus(rootPaneCheckingEnabled);
                if(this.t1.getText().equals("")&&m1)
                {this.t1.setText("Employee number");this.t1e1.setVisible(false);this.t1e2.setVisible(false);}
                else if(this.t1.getText().equals("Employee number")&&m1)this.t1e2.setVisible(false);
              else{
                    if(m1){
                 int number=0;int length=0;
                 for(int i=0;i<this.t1.getText().length();i++){length++;
                     if(Character.isDigit(this.t1.getText().charAt(i)))number++;}
                 if(number==this.t1.getText().length()&&length==4){this.t1e2.setVisible(false);}else this.t1e2.setVisible(true);
             }}}
                      else if(evt.getKeyCode()==KeyEvent.VK_DOWN){
                  this.t2.requestFocus(rootPaneCheckingEnabled);
                if(this.t1.getText().equals("")&&m1)
                {this.t1.setText("Employee number");this.t1e1.setVisible(false);this.t1e2.setVisible(false);}
                else if(this.t1.getText().equals("Employee number")&&m1)this.t1e2.setVisible(false);
             else{
                    if(m1){
                 int number=0;int length=0;
                 for(int i=0;i<this.t1.getText().length();i++){length++;
                     if(Character.isDigit(this.t1.getText().charAt(i)))number++;}
                 if(number==this.t1.getText().length()&&length==4){this.t1e2.setVisible(false);}else this.t1e2.setVisible(true);
             }}}
        else{
             this.t2.requestFocus(rootPaneCheckingEnabled);
            if(this.t1.getText().equals("")&&m1)
            {this.t1.setText("Employee number");this.t1e1.setVisible(false);this.t1e2.setVisible(false);}
            else if(this.t1.getText().equals("Employee number")&&m1){this.t1e1.setVisible(false);this.t1e2.setVisible(false);}
            else{
                if(m1){
                  int number=0;int length=0;
                 for(int i=0;i<this.t1.getText().length();i++){length++;
                     if(Character.isDigit(this.t1.getText().charAt(i)))number++;}
                 if(number==this.t1.getText().length()&&length==4){this.t1e2.setVisible(false);}else this.t1e2.setVisible(true);
                } }
        }
    }//GEN-LAST:event_t1KeyPressed

    private void t2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t2KeyPressed
     
         if(evt.getKeyCode()!=KeyEvent.VK_ENTER&&evt.getKeyCode()!=KeyEvent.VK_UP&&
                   evt.getKeyCode()!=KeyEvent.VK_DOWN){
             t2e.setVisible(false);
             if(t2.getText().equals("Password"))this.t2.setText("");
         }
         else if(evt.getKeyCode()==KeyEvent.VK_UP||evt.getKeyCode()==KeyEvent.VK_DOWN){
             this.t2.requestFocus(rootPaneCheckingEnabled);
             if(this.t2.getText().equals("Password")||this.t2.getText().equals(""))this.t2e.setVisible(true);
             else t2e.setVisible(false);
             

         }
         else if(evt.getKeyCode()==KeyEvent.VK_ENTER){
             boolean b1,b2;
             if(this.t1.getText().equals("")||t1.equals("Employee number")){
                 this.t1e1.setVisible(true);b1=false;t1e2.setVisible(false);
             }
             else{
                 int length=0;int number=0;  
                 for(int i=0;i<this.t1.getText().length();i++){
                     length++;
                 if(Character.isDigit(this.t1.getText().charAt(WIDTH)))number++;}
                 if(number==this.t1.getText().length()&&length==4){
                     this.t1e2.setVisible(false);b1=true;}
                     else{
                             this.t1e2.setVisible(true);b1=false;
                             }
                 
             }
             if(t2.getText().equals("")||this.t2.getText().equals("Password")){
                 this.t2e.setVisible(true);b2=false;}
         
         else{
             int length=0;boolean c=false;
             for(int i=0;i<this.t2.getText().length();i++){
                 length++;
                 if(Character.isDigit(this.t2.getText().charAt(i)))c=true;
             }
             if(c&&length>=5){this.t2e.setVisible(false);b2=true;}
             else{
                 this.t2e.setVisible(true);b2=false;JOptionPane.showMessageDialog(null, "The Password must be more than five simpols "
                            + "and contains one number at least");
             
             }
             }
              ////////////////////////////////////////////////////////////////////////////
            /////////////////////////////////////////////////////////////////////////////
            ///////////////////////////////////////////////////////////////////////////////
            if (b1 && b2) {
             //Raed //
               
               About_E v= new About_E();
                            v.setExtendedState(JFrame.MAXIMIZED_BOTH);

                v.setDefaultCloseOperation(WIDTH);
                v.setVisible(true);
            }
         }
         
    }//GEN-LAST:event_t2KeyPressed

    private void t1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t1MouseExited
        if (this.t1.getText().equals("")) {
            this.t1.setForeground(new Color(102, 102, 102));
            this.t1.setText("Employee number");
        }


    }//GEN-LAST:event_t1MouseExited

    private void t2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t2MouseExited
        if (this.t2.getText().equals("")) {
            this.t2.setForeground(new Color(102, 102, 102));
            this.t2.setText("Password");

        }


    }//GEN-LAST:event_t2MouseExited

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed

      
    }//GEN-LAST:event_jButton1KeyPressed

    private void t2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t2KeyTyped

    }//GEN-LAST:event_t2KeyTyped

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked


              
    }//GEN-LAST:event_jButton1MouseClicked

    
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Start().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField t1;
    private javax.swing.JLabel t1e1;
    private javax.swing.JLabel t1e2;
    private javax.swing.JTextField t2;
    private javax.swing.JLabel t2e;
    // End of variables declaration//GEN-END:variables

    

       
    }

