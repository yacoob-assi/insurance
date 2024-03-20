/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insurance;

import com.sun.javafx.tk.Toolkit;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import sun.security.util.PropertyExpander;

/**
 *
 * @author Ammar
 */
public class holy extends javax.swing.JFrame {

    /**
     * Creates new form holy
     */
    boolean click,click1,click2,click3,click4;
    boolean m1,m2,m3,m4;
    public holy() {
        initComponents();
         click4=click1=click2=click3=false;
         m1=m2=m3=m4=false;
     click=true;
         this.background.setSize(this.getWidth(), this.getHeight());
      
         this.jPanel4.setBackground(new Color(0,0,0,100));

         this.p2.setBackground(new Color(0,0,0,100));
         this.p3.setBackground(new Color(0,0,0,100));
         this.p4.setBackground(new Color(0,0,0,100));
         this.p5.setBackground(new Color(0,0,0,100));
         this.b1.setBackground(new Color(0,0,0,100));
         this.b2.setBackground(new Color(0,0,0,100));
         this.b3.setBackground(new Color(0,0,0,100));
         this.b4.setBackground(new Color(0,0,0,100));
         t1e1.setVisible(false);
         t2e1.setVisible(false);
         t3e1.setVisible(false);
         this.t1e2.setVisible(false);
         this.t2e2.setVisible(false);
         this.t3e2.setVisible(false);
         this.s2.setBackground(new Color(255,255,255,100));
         this.s3.setBackground(new Color(255,255,255,100));
         this.s4.setBackground(new Color(255,255,255,100));
         this.pp.setBackground(new Color(255,255,255,100));
         this.s5.setBackground(new Color(255,255,255,100));
         this.s8.setBackground(new Color(0,0,0,100));
         this.s9.setBackground(new Color(0,0,0,100));
         this.t1.setCaretColor(Color.WHITE);
         this.t2.setCaretColor(Color.WHITE);
         this.t3.setCaretColor(Color.WHITE);
         redp.setVisible(false);
           setLocation(300, 10);
         
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        t2e1 = new javax.swing.JLabel();
        t3e1 = new javax.swing.JLabel();
        t1e1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        p2 = new javax.swing.JPanel();
        s8 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        lightt1 = new javax.swing.JPanel();
        linee1 = new javax.swing.JPanel();
        s9 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        s4 = new javax.swing.JPanel();
        s3 = new javax.swing.JPanel();
        s2 = new javax.swing.JPanel();
        t1e2 = new javax.swing.JLabel();
        t2e2 = new javax.swing.JLabel();
        t3e2 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        lightt2 = new javax.swing.JPanel();
        p3 = new javax.swing.JPanel();
        p4 = new javax.swing.JPanel();
        p5 = new javax.swing.JPanel();
        t2 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        lightt3 = new javax.swing.JPanel();
        linee3 = new javax.swing.JPanel();
        s5 = new javax.swing.JPanel();
        b2 = new javax.swing.JPanel();
        pp = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        b1 = new javax.swing.JPanel();
        b4 = new javax.swing.JPanel();
        b3 = new javax.swing.JPanel();
        pp1 = new javax.swing.JPanel();
        pp4 = new javax.swing.JPanel();
        pp2 = new javax.swing.JPanel();
        pp3 = new javax.swing.JPanel();
        linee2 = new javax.swing.JPanel();
        linee4 = new javax.swing.JPanel();
        lightt4 = new javax.swing.JPanel();
        blue = new javax.swing.JPanel();
        pi = new javax.swing.JLabel();
        redp = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        t2e1.setForeground(new java.awt.Color(204, 255, 255));
        t2e1.setText("Last name is requred");
        getContentPane().add(t2e1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 400, 130, -1));

        t3e1.setForeground(new java.awt.Color(204, 255, 255));
        t3e1.setText("Ssn is requred");
        getContentPane().add(t3e1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 480, 120, -1));

        t1e1.setBackground(new java.awt.Color(204, 255, 255));
        t1e1.setForeground(new java.awt.Color(204, 255, 255));
        t1e1.setText("First name is requred");
        getContentPane().add(t1e1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 320, 140, -1));

        jPanel4.setToolTipText("Member Login");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Vocation");
        jLabel1.setToolTipText("");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(145, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, 420, -1));

        javax.swing.GroupLayout p2Layout = new javax.swing.GroupLayout(p2);
        p2.setLayout(p2Layout);
        p2Layout.setHorizontalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );
        p2Layout.setVerticalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(p2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, 410, -1));

        javax.swing.GroupLayout s8Layout = new javax.swing.GroupLayout(s8);
        s8.setLayout(s8Layout);
        s8Layout.setHorizontalGroup(
            s8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        s8Layout.setVerticalGroup(
            s8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );

        getContentPane().add(s8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, -1, 560));

        jPanel13.setBackground(new java.awt.Color(11, 99, 171));
        jPanel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel13MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel13MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel13MouseExited(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 204, 204));
        jLabel18.setText("Sick leave");
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel18MouseEntered(evt);
            }
        });

        lightt1.setBackground(new java.awt.Color(11, 99, 171));

        javax.swing.GroupLayout lightt1Layout = new javax.swing.GroupLayout(lightt1);
        lightt1.setLayout(lightt1Layout);
        lightt1Layout.setHorizontalGroup(
            lightt1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 11, Short.MAX_VALUE)
        );
        lightt1Layout.setVerticalGroup(
            lightt1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 11, Short.MAX_VALUE)
        );

        linee1.setBackground(new java.awt.Color(11, 99, 171));

        javax.swing.GroupLayout linee1Layout = new javax.swing.GroupLayout(linee1);
        linee1.setLayout(linee1Layout);
        linee1Layout.setHorizontalGroup(
            linee1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        linee1Layout.setVerticalGroup(
            linee1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(linee1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(lightt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lightt1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(linee1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 560, 160, 40));

        javax.swing.GroupLayout s9Layout = new javax.swing.GroupLayout(s9);
        s9.setLayout(s9Layout);
        s9Layout.setHorizontalGroup(
            s9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        s9Layout.setVerticalGroup(
            s9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );

        getContentPane().add(s9, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 290, 10, 430));

        jPanel12.setBackground(new java.awt.Color(11, 99, 171));
        jPanel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel12MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel12MouseExited(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 204, 204));
        jLabel17.setText("Unpaid leave");
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel17MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 17, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        getContentPane().add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 670, 130, 30));

        s4.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout s4Layout = new javax.swing.GroupLayout(s4);
        s4.setLayout(s4Layout);
        s4Layout.setHorizontalGroup(
            s4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        s4Layout.setVerticalGroup(
            s4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        getContentPane().add(s4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, -1, -1));

        s3.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout s3Layout = new javax.swing.GroupLayout(s3);
        s3.setLayout(s3Layout);
        s3Layout.setHorizontalGroup(
            s3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        s3Layout.setVerticalGroup(
            s3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        getContentPane().add(s3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 370, -1, -1));

        s2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout s2Layout = new javax.swing.GroupLayout(s2);
        s2.setLayout(s2Layout);
        s2Layout.setHorizontalGroup(
            s2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        s2Layout.setVerticalGroup(
            s2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        getContentPane().add(s2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 450, -1, -1));

        t1e2.setForeground(new java.awt.Color(204, 255, 255));
        t1e2.setText("First name just alphabets");
        getContentPane().add(t1e2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 330, 160, -1));

        t2e2.setForeground(new java.awt.Color(204, 255, 255));
        t2e2.setText("Last name alphabets");
        getContentPane().add(t2e2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 410, 140, -1));

        t3e2.setForeground(new java.awt.Color(204, 255, 255));
        t3e2.setText("Ssn is 9 numbers");
        getContentPane().add(t3e2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 480, 120, 20));

        t1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        t1.setForeground(new java.awt.Color(204, 204, 204));
        t1.setText("First name");
        t1.setBorder(null);
        t1.setOpaque(false);
        t1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t1MouseExited(evt);
            }
        });
        t1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                t1CaretPositionChanged(evt);
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
        getContentPane().add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 290, 330, 70));

        jPanel11.setBackground(new java.awt.Color(11, 99, 171));
        jPanel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel11MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel11MouseExited(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setText("Maternity leave");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel16MouseEntered(evt);
            }
        });

        lightt2.setBackground(new java.awt.Color(11, 99, 171));

        javax.swing.GroupLayout lightt2Layout = new javax.swing.GroupLayout(lightt2);
        lightt2.setLayout(lightt2Layout);
        lightt2Layout.setHorizontalGroup(
            lightt2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 11, Short.MAX_VALUE)
        );
        lightt2Layout.setVerticalGroup(
            lightt2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 11, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lightt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(lightt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 600, 160, 30));

        javax.swing.GroupLayout p3Layout = new javax.swing.GroupLayout(p3);
        p3.setLayout(p3Layout);
        p3Layout.setHorizontalGroup(
            p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        p3Layout.setVerticalGroup(
            p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(p3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 440, 400, 10));

        javax.swing.GroupLayout p4Layout = new javax.swing.GroupLayout(p4);
        p4.setLayout(p4Layout);
        p4Layout.setHorizontalGroup(
            p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        p4Layout.setVerticalGroup(
            p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(p4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, 400, -1));

        javax.swing.GroupLayout p5Layout = new javax.swing.GroupLayout(p5);
        p5.setLayout(p5Layout);
        p5Layout.setHorizontalGroup(
            p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        p5Layout.setVerticalGroup(
            p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(p5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 520, 400, -1));

        t2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        t2.setForeground(new java.awt.Color(204, 204, 204));
        t2.setText("Last name");
        t2.setBorder(null);
        t2.setOpaque(false);
        t2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t2MouseExited(evt);
            }
        });
        t2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t2KeyPressed(evt);
            }
        });
        getContentPane().add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 370, 330, 70));

        t3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        t3.setForeground(new java.awt.Color(204, 204, 204));
        t3.setText("Ssn");
        t3.setBorder(null);
        t3.setOpaque(false);
        t3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t3MouseExited(evt);
            }
        });
        t3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t3KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t3KeyReleased(evt);
            }
        });
        getContentPane().add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 450, 330, 70));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("The leave type");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 570, 170, 30));

        jPanel8.setBackground(new java.awt.Color(11, 99, 171));
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel8MouseExited(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Annual leave");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
        });

        lightt3.setBackground(new java.awt.Color(11, 99, 171));

        javax.swing.GroupLayout lightt3Layout = new javax.swing.GroupLayout(lightt3);
        lightt3.setLayout(lightt3Layout);
        lightt3Layout.setHorizontalGroup(
            lightt3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 11, Short.MAX_VALUE)
        );
        lightt3Layout.setVerticalGroup(
            lightt3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 11, Short.MAX_VALUE)
        );

        linee3.setBackground(new java.awt.Color(11, 99, 171));
        linee3.setFocusable(false);

        javax.swing.GroupLayout linee3Layout = new javax.swing.GroupLayout(linee3);
        linee3.setLayout(linee3Layout);
        linee3Layout.setHorizontalGroup(
            linee3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        linee3Layout.setVerticalGroup(
            linee3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(linee3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(lightt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(lightt3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(linee3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 640, 150, 30));

        s5.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout s5Layout = new javax.swing.GroupLayout(s5);
        s5.setLayout(s5Layout);
        s5Layout.setHorizontalGroup(
            s5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        s5Layout.setVerticalGroup(
            s5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );

        getContentPane().add(s5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 530, -1, 190));

        javax.swing.GroupLayout b2Layout = new javax.swing.GroupLayout(b2);
        b2.setLayout(b2Layout);
        b2Layout.setHorizontalGroup(
            b2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        b2Layout.setVerticalGroup(
            b2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        getContentPane().add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 720, 150, 120));

        pp.setBackground(new java.awt.Color(204, 204, 204));
        pp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ppMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ppMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ppMouseExited(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Save");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
        });
        jLabel3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel3KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout ppLayout = new javax.swing.GroupLayout(pp);
        pp.setLayout(ppLayout);
        ppLayout.setHorizontalGroup(
            ppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ppLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel3)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        ppLayout.setVerticalGroup(
            ppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ppLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(pp, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 740, -1, -1));

        javax.swing.GroupLayout b1Layout = new javax.swing.GroupLayout(b1);
        b1.setLayout(b1Layout);
        b1Layout.setHorizontalGroup(
            b1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        b1Layout.setVerticalGroup(
            b1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        getContentPane().add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 720, 140, 120));

        javax.swing.GroupLayout b4Layout = new javax.swing.GroupLayout(b4);
        b4.setLayout(b4Layout);
        b4Layout.setHorizontalGroup(
            b4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        b4Layout.setVerticalGroup(
            b4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        getContentPane().add(b4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 800, 120, 40));

        javax.swing.GroupLayout b3Layout = new javax.swing.GroupLayout(b3);
        b3.setLayout(b3Layout);
        b3Layout.setHorizontalGroup(
            b3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        b3Layout.setVerticalGroup(
            b3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 720, 120, 10));

        pp1.setBackground(new java.awt.Color(4, 73, 150));

        javax.swing.GroupLayout pp1Layout = new javax.swing.GroupLayout(pp1);
        pp1.setLayout(pp1Layout);
        pp1Layout.setHorizontalGroup(
            pp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        pp1Layout.setVerticalGroup(
            pp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(pp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 730, -1, -1));

        pp4.setBackground(new java.awt.Color(4, 73, 150));

        javax.swing.GroupLayout pp4Layout = new javax.swing.GroupLayout(pp4);
        pp4.setLayout(pp4Layout);
        pp4Layout.setHorizontalGroup(
            pp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        pp4Layout.setVerticalGroup(
            pp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        getContentPane().add(pp4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 730, -1, -1));

        pp2.setBackground(new java.awt.Color(4, 73, 150));

        javax.swing.GroupLayout pp2Layout = new javax.swing.GroupLayout(pp2);
        pp2.setLayout(pp2Layout);
        pp2Layout.setHorizontalGroup(
            pp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        pp2Layout.setVerticalGroup(
            pp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(pp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 790, -1, -1));

        pp3.setBackground(new java.awt.Color(4, 73, 150));

        javax.swing.GroupLayout pp3Layout = new javax.swing.GroupLayout(pp3);
        pp3.setLayout(pp3Layout);
        pp3Layout.setHorizontalGroup(
            pp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        pp3Layout.setVerticalGroup(
            pp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        getContentPane().add(pp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 730, -1, -1));

        linee2.setBackground(new java.awt.Color(11, 99, 171));

        javax.swing.GroupLayout linee2Layout = new javax.swing.GroupLayout(linee2);
        linee2.setLayout(linee2Layout);
        linee2Layout.setHorizontalGroup(
            linee2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        linee2Layout.setVerticalGroup(
            linee2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        getContentPane().add(linee2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 631, 140, 1));

        linee4.setBackground(new java.awt.Color(11, 99, 171));

        javax.swing.GroupLayout linee4Layout = new javax.swing.GroupLayout(linee4);
        linee4.setLayout(linee4Layout);
        linee4Layout.setHorizontalGroup(
            linee4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        linee4Layout.setVerticalGroup(
            linee4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        getContentPane().add(linee4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 700, 140, 1));

        lightt4.setBackground(new java.awt.Color(11, 99, 171));

        javax.swing.GroupLayout lightt4Layout = new javax.swing.GroupLayout(lightt4);
        lightt4.setLayout(lightt4Layout);
        lightt4Layout.setHorizontalGroup(
            lightt4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 11, Short.MAX_VALUE)
        );
        lightt4Layout.setVerticalGroup(
            lightt4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 11, Short.MAX_VALUE)
        );

        getContentPane().add(lightt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 680, 11, 11));

        blue.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/insurance/2.png"))); // NOI18N
        pi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                piMouseEntered(evt);
            }
        });
        blue.add(pi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 55));

        getContentPane().add(blue, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 0, 60, 50));

        redp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                redpMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                redpMouseExited(evt);
            }
        });
        redp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/insurance/3.png"))); // NOI18N
        jLabel10.setText("jLabel4");
        redp.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 66, 55));

        getContentPane().add(redp, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 0, 60, 50));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/insurance/all.jpg"))); // NOI18N
        background.setText("jLabel1");
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -20, 1300, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t1KeyPressed
        if(evt.getKeyCode()!=KeyEvent.VK_ENTER&&evt.getKeyCode()!=KeyEvent.VK_UP&&
                   evt.getKeyCode()!=KeyEvent.VK_DOWN){
            this.t1e1.setVisible(false);m1=true;
            if(this.t1.getText().equals("First name"))
            this.t1.setText("");
        }
             else if(evt.getKeyCode()==KeyEvent.VK_UP){
                  this.t3.requestFocus(rootPaneCheckingEnabled);
                if(this.t1.getText().equals("")&&m1)
                {this.t1.setText("First name");this.t1e1.setVisible(false);this.t1e2.setVisible(false);}
                else if(this.t1.getText().equals("First name")&&m1)this.t1e2.setVisible(false);
             else{
                    if(m1){
                 int number=0;
                 for(int i=0;i<this.t1.getText().length();i++)
                     if(Character.isAlphabetic(this.t1.getText().charAt(i)))number++;
                 if(number==this.t1.getText().length()){this.t1e2.setVisible(false);}else this.t1e2.setVisible(true);
             }}}
        else if(evt.getKeyCode()==KeyEvent.VK_DOWN){
             this.t2.requestFocus(rootPaneCheckingEnabled);
                if(this.t1.getText().equals("")&&m1)
                {this.t1.setText("First name");this.t1e1.setVisible(false);this.t1e2.setVisible(false);}
                else if(this.t1.getText().equals("First name")&&m1)this.t1e2.setVisible(false);
             else{
                    if(m1){
                 int number=0;
                 for(int i=0;i<this.t1.getText().length();i++)
                     if(Character.isAlphabetic(this.t1.getText().charAt(i)))number++;
                 if(number==this.t1.getText().length()){this.t1e2.setVisible(false);}else this.t1e2.setVisible(true);}}}
        else{
           this.t2.requestFocus(rootPaneCheckingEnabled);
           if(this.t1.getText().equals("First name")&&m1){ this.t1e1.setVisible(false);this.t1e2.setVisible(false);}
        else    if(this.t1.getText().equals("")&&m1){this.t1.setText("First name");
            this.t1e1.setVisible(false);this.t1e2.setVisible(false);}
       else{
            if(m1){
                 int number=0;
                 for(int i=0;i<this.t1.getText().length();i++)
                     if(Character.isAlphabetic(this.t1.getText().charAt(i)))number++;
                 if(number==this.t1.getText().length()){this.t1e2.setVisible(false);}else this.t1e2.setVisible(true);
             }}}
    }//GEN-LAST:event_t1KeyPressed

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
   
    }//GEN-LAST:event_t1ActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
click1=false;click2=false;click3=true;click4=false;
 this.linee3.setBackground(new Color(11,99,171));
        this.linee4.setBackground(new Color(11,99,171));
        this.linee2.setBackground(new Color(11,99,171));
        this.linee1.setBackground(new Color(11,99,171));
        this.lightt4.setBackground(new Color(11,99,171));
        this.lightt2.setBackground(new Color(11,99,171));
        this.lightt3.setBackground(new Color(255,255,255));
          this.lightt1.setBackground(new Color(11,99,171));
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
if(click1||click2||click3||click4||click){
        this.linee3.setBackground(new Color(1,58,137));
        this.linee4.setBackground(new Color(11,99,171));
        this.linee2.setBackground(new Color(11,99,171));
          this.linee1.setBackground(new Color(11,99,171));
}
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jPanel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseEntered

if(click1||click2||click3||click4||click){       
       this.linee3.setBackground(new Color(1,58,137));
        this.linee4.setBackground(new Color(11,99,171));
        this.linee2.setBackground(new Color(11,99,171));
         this.linee1.setBackground(new Color(11,99,171));
}
    }//GEN-LAST:event_jPanel8MouseEntered

    private void jPanel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseExited
if(click1||click2||click3||click4||click)        this.linee3.setBackground(new Color(11,99,171));
       
    }//GEN-LAST:event_jPanel8MouseExited

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
click1=false;click2=true;click3=false;click4=false;
 this.linee3.setBackground(new Color(11,99,171));
        this.linee4.setBackground(new Color(11,99,171));
        this.linee2.setBackground(new Color(11,99,171));
        this.linee1.setBackground(new Color(11,99,171));
        lightt2.setBackground(Color.WHITE);
       this.lightt3.setBackground(new Color(11,99,171));
        this.lightt4.setBackground(new Color(11,99,171));
         this.lightt1.setBackground(new Color(11,99,171));
       
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel16MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseEntered
if(click1||click2||click3||click4||click){
        this.linee2.setBackground(new Color(1,58,137));
         this.linee3.setBackground(new Color(11,99,171));
         this.linee4.setBackground(new Color(11,99,171));
          this.linee1.setBackground(new Color(11,99,171));
          
}
    }//GEN-LAST:event_jLabel16MouseEntered

    private void jPanel11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MouseEntered
if(click1||click2||click3||click4||click){
        this.linee2.setBackground(new Color(1,58,137));
          this.linee3.setBackground(new Color(11,99,171));
        this.linee4.setBackground(new Color(11,99,171));
         this.linee1.setBackground(new Color(11,99,171));
}
    }//GEN-LAST:event_jPanel11MouseEntered

    private void jPanel11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MouseExited
if(click1||click2||click3||click4||click)     this.linee2.setBackground(new Color(11,99,171));
    }//GEN-LAST:event_jPanel11MouseExited

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
click1=false;click2=false;click3=false;click4=true;
 this.linee3.setBackground(new Color(11,99,171));
        this.linee4.setBackground(new Color(11,99,171));
        this.linee2.setBackground(new Color(11,99,171));
        this.linee1.setBackground(new Color(11,99,171));
        this.lightt4.setBackground(Color.WHITE);
          this.lightt3.setBackground(new Color(11,99,171));
        this.lightt2.setBackground(new Color(11,99,171));
         this.lightt1.setBackground(new Color(11,99,171));
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel17MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseEntered
if(click1||click2||click3||click4||click){
        this.linee4.setBackground(new Color(1,58,137));
          this.linee3.setBackground(new Color(11,99,171));
        this.linee2.setBackground(new Color(11,99,171));
         this.linee1.setBackground(new Color(11,99,171));
}
         
    }//GEN-LAST:event_jLabel17MouseEntered

    private void jPanel12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel12MouseEntered
if(click1||click2||click3||click4||click){
        this.linee4.setBackground(new Color(1,58,137));
          this.linee3.setBackground(new Color(11,99,171));
        this.linee2.setBackground(new Color(11,99,171));
         this.linee3.setBackground(new Color(11,99,171));
}
    }//GEN-LAST:event_jPanel12MouseEntered

    private void jPanel12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel12MouseExited
if(click1||click2||click3||click4)      this.linee4.setBackground(new Color(11,99,171));
       
    }//GEN-LAST:event_jPanel12MouseExited

    private void t2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t2KeyPressed
         if(evt.getKeyCode()!=KeyEvent.VK_ENTER&&evt.getKeyCode()!=KeyEvent.VK_UP&&
                   evt.getKeyCode()!=KeyEvent.VK_DOWN){
             m2=true;this.t2e1.setVisible(false);
            if(this.t2.getText().equals("Last name"))
            this.t2.setText("");
        }
            else if(evt.getKeyCode()==KeyEvent.VK_UP){
                  this.t1.requestFocus(rootPaneCheckingEnabled);
                if(this.t2.getText().equals("")&&m2)
                {this.t2.setText("Last name");this.t2e1.setVisible(false);this.t2e2.setVisible(false);}
                else if(this.t2.getText().equals("Last name")&&m2)this.t2e2.setVisible(false);
             else{
                    if(m2){
                 int number=0;
                 for(int i=0;i<this.t2.getText().length();i++)
                     if(Character.isAlphabetic(this.t2.getText().charAt(i)))number++;
                 if(number==this.t2.getText().length()){this.t2e2.setVisible(false);}else this.t2e2.setVisible(true);
             }}}
             else if(evt.getKeyCode()==KeyEvent.VK_DOWN){
             this.t3.requestFocus(rootPaneCheckingEnabled);
                if(this.t2.getText().equals("")&&m2)
                {this.t2.setText("Last name");this.t2e1.setVisible(false);this.t2e2.setVisible(false);}
                else if(this.t2.getText().equals("Last name")&&m2)this.t2e2.setVisible(false);
                          else{
                    if(m2){
                 int number=0;
                 for(int i=0;i<this.t2.getText().length();i++)
                     if(Character.isAlphabetic(this.t2.getText().charAt(i)))number++;
                 if(number==this.t2.getText().length()){this.t2e2.setVisible(false);}else this.t2e2.setVisible(true);}}}
          else{
                  this.t3.requestFocus(rootPaneCheckingEnabled);
                  if(this.t2.getText().equals("")&&m2){this.t2.setText("Last name");this.t2e1.setVisible(false);this.t2e2.setVisible(false);}
                  else if(this.t2.getText().equals("Last name")&&m2){this.t2e1.setVisible(false);this.t2e2.setVisible(false);}
                  else{
                      if(m2){
                  int number=0;
                 for(int i=0;i<this.t2.getText().length();i++)
                     if(Character.isAlphabetic(this.t2.getText().charAt(i)))number++;
                 if(number==this.t2.getText().length()){this.t2e2.setVisible(false);}else this.t2e2.setVisible(true);
             }}
             
             
             }
           
        
    }//GEN-LAST:event_t2KeyPressed

    private void t3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t3KeyPressed
          if(evt.getKeyCode()!=KeyEvent.VK_ENTER&&evt.getKeyCode()!=KeyEvent.VK_UP&&
                   evt.getKeyCode()!=KeyEvent.VK_DOWN){
              m3=true;this.t3e1.setVisible(false);
              int number=0;int length=0;
              for(int i=0;i<this.t3.getText().length();i++){
                  length++;if(Character.isDigit(this.t3.getText().charAt(i)))number++;
                  
              }
              if(number==this.t3.getText().length()&&length==8){
                  this.t3e2.setVisible(false);
              }
             
              
            if(this.t3.getText().equals("Ssn"))
            this.t3.setText("");
        }
           else if(evt.getKeyCode()==KeyEvent.VK_UP){
                  this.t2.requestFocus(rootPaneCheckingEnabled);
                if(this.t3.getText().equals("")&&m3)
                {this.t3.setText("Ssn");this.t3e1.setVisible(false);this.t3e2.setVisible(false);}
                else if(this.t3.getText().equals("Ssn")&&m3)this.t3e2.setVisible(false);
             else{
                    if(m3){
                 int number=0;int length=0;
                 for(int i=0;i<this.t3.getText().length();i++){length++;
                     if(Character.isDigit(this.t3.getText().charAt(i)))number++;}
                 if(number==this.t3.getText().length()&&length==9){this.t3e2.setVisible(false);}else this.t3e2.setVisible(true);
             }}}
                      else if(evt.getKeyCode()==KeyEvent.VK_DOWN){
                  this.t1.requestFocus(rootPaneCheckingEnabled);
                if(this.t3.getText().equals("")&&m3)
                {this.t3.setText("Ssn");this.t3e1.setVisible(false);this.t3e2.setVisible(false);}
                else if(this.t3.getText().equals("Ssn")&&m3)this.t3e2.setVisible(false);
             else{
                    if(m3){
                 int number=0;int length=0;
                 for(int i=0;i<this.t3.getText().length();i++){length++;
                     if(Character.isDigit(this.t3.getText().charAt(i)))number++;}
                 if(number==this.t3.getText().length()&&length==9){this.t3e2.setVisible(false);}else this.t3e2.setVisible(true);
             }}}
        else{
             click=false;
          m1=m2=m3=false;

boolean b1,b2,b3,b4;
        if(this.t1.getText().equals("")){this.t1e1.setVisible(true);b1=false;}
        else if(this.t1.getText().equals("First name")){this.t1e1.setVisible(true);this.t1.setText("");b1=false;}
        else{ 
            int number=0;
            for(int i=0;i<this.t1.getText().length();i++)if(Character.isAlphabetic(this.t1.getText().charAt(i)))number++;
            if(number==this.t1.getText().length()){this.t1e2.setVisible(false);b1=true;}else{
            this.t1e2.setVisible(true);b1=false;}
          }
        
        if(this.t2.getText().equals("")){this.t2e1.setVisible(true);b2=false;}
        else if(this.t2.getText().equals("Last name")){this.t2e1.setVisible(true);this.t2.setText("");b2=false;}
        else{ 
            int number=0;
            for(int i=0;i<this.t2.getText().length();i++)if(Character.isAlphabetic(this.t2.getText().charAt(i)))number++;
            if(number==this.t2.getText().length()){this.t2e2.setVisible(false);b2=true;}else{
            this.t2e2.setVisible(true);b2=false;}
           }
       
        if(this.t3.getText().equals("")){this.t3e1.setVisible(true);b3=false;}
        else if(this.t3.getText().equals("Ssn")){this.t3e1.setVisible(true);this.t3.setText("");b3=false;}
        else {
            int number=0;int length=0;
            for(int i=0;i<this.t3.getText().length();i++){
                length++;if(Character.isDigit(this.t3.getText().charAt(i)))number++;
            }
            if(number==this.t3.getText().length()&&length==9){this.t3e2.setVisible(false);b3=true;}
            else{this.t3e2.setVisible(true);b3=false;}
        }
        if(!click1&&!click2&&!click3&&!click4){
            b4=false;
        this.linee2.setBackground(Color.RED);
         this.linee1.setBackground(Color.RED);
          this.linee4.setBackground(Color.RED);
           this.linee3.setBackground(Color.RED);
        }else b4=true;
        ////////////////////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////////////////////////////
        if(b1&&b2&&b3&&b4){
            //////////////////////////////////////////////////////
            
            //Raed//
            ///////////////////////////////////////////////////////
           boolean f=true;
                  try { EntityManagerFactory emf = Persistence.createEntityManagerFactory("Insurance_1PU");
            EntityManager em=emf.createEntityManager();
                Vacation voc=new Vacation();
                String s1=t1.getText();
                String s2=t2.getText();
                String s3=t3.getText();
                String s4="";
                if(click1)
                    s4="Sick leave";
                if(click2)
                    s4="Maternity leave";
                    if(click3)
                        s4="Annual leave";
                        if(click4)
                            s4="Unpaid leave";
            voc.setFirstName(s1);
            voc.setLastName(s2);
            voc.setSsn(Integer.parseInt(s3));
            voc.setVType(s4);
            em.getTransaction().begin();
            em.persist(voc);
            em.getTransaction().commit();
            em.close();}
                  catch(Exception ex){
                   JOptionPane.showMessageDialog(null,"Employee Ssn Wrong");
                   f=false;
                  }
                  if(f==true){
                      JOptionPane.showMessageDialog(null,"Done");
          t1e1.setVisible(false);
         t2e1.setVisible(false);
         t3e1.setVisible(false);
         this.t1e2.setVisible(false);
         this.t2e2.setVisible(false);
         this.t3e2.setVisible(false);
         click4=click1=click2=click3=false;
         m1=m2=m3=m4=false;
         click=true;
         t1.setText("First name");
         t2.setText("Last name");
         t3.setText("Ssn");
         this.t1.requestFocus(rootPaneCheckingEnabled);
         lightt1.setBackground(new Color(11,99,171));
         lightt2.setBackground(new Color(11,99,171));
         lightt2.setBackground(new Color(11,99,171));
         lightt4.setBackground(new Color(11,99,171));
         linee1.setBackground(new Color(11,99,171));
         linee2.setBackground(new Color(11,99,171));
         linee3.setBackground(new Color(11,99,171));
         linee4.setBackground(new Color(11,99,171));
         
          }
           
        }
        }
    }//GEN-LAST:event_t3KeyPressed

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
click1=true;click2=false;click3=false;click4=false;
  this.linee3.setBackground(new Color(11,99,171));
        this.linee4.setBackground(new Color(11,99,171));
        this.linee2.setBackground(new Color(11,99,171));
        this.linee1.setBackground(new Color(11,99,171));
        this.lightt1.setBackground(Color.WHITE);
          this.lightt3.setBackground(new Color(11,99,171));
        this.lightt2.setBackground(new Color(11,99,171));
                this.lightt4.setBackground(new Color(11,99,171));
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel18MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseEntered
if(click1||click2||click3||click4||click){
        this.linee1.setBackground(new Color(1,58,137));
          this.linee3.setBackground(new Color(11,99,171));
        this.linee4.setBackground(new Color(11,99,171));
        this.linee2.setBackground(new Color(11,99,171));}
        
    }//GEN-LAST:event_jLabel18MouseEntered

    private void jPanel13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel13MouseEntered
if(click1||click2||click3||click4||click){
        this.linee1.setBackground(new Color(1,58,137));
          this.linee3.setBackground(new Color(11,99,171));
        this.linee4.setBackground(new Color(11,99,171));
        this.linee2.setBackground(new Color(11,99,171));
}
    }//GEN-LAST:event_jPanel13MouseEntered

    private void jPanel13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel13MouseExited
if(click1||click2||click3||click4||click)
        this.linee1.setBackground(new Color(11,99,171));
    }//GEN-LAST:event_jPanel13MouseExited

    private void jPanel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseClicked
    click3=true;
 this.linee3.setBackground(new Color(11,99,171));
        this.linee4.setBackground(new Color(11,99,171));
        this.linee2.setBackground(new Color(11,99,171));
        this.linee1.setBackground(new Color(11,99,171));
        this.lightt4.setBackground(new Color(11,99,171));
        this.lightt2.setBackground(new Color(11,99,171));
        this.lightt3.setBackground(new Color(255,255,255));
          this.lightt1.setBackground(new Color(11,99,171));
    }//GEN-LAST:event_jPanel8MouseClicked

    private void jPanel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel13MouseClicked
    click1=true;
  this.linee3.setBackground(new Color(11,99,171));
        this.linee4.setBackground(new Color(11,99,171));
        this.linee2.setBackground(new Color(11,99,171));
        this.linee1.setBackground(new Color(11,99,171));
        this.lightt1.setBackground(Color.WHITE);
          this.lightt3.setBackground(new Color(11,99,171));
        this.lightt2.setBackground(new Color(11,99,171));
                this.lightt4.setBackground(new Color(11,99,171));
    }//GEN-LAST:event_jPanel13MouseClicked

    private void jPanel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel12MouseClicked
      click4=true;
 this.linee3.setBackground(new Color(11,99,171));
        this.linee4.setBackground(new Color(11,99,171));
        this.linee2.setBackground(new Color(11,99,171));
        this.linee1.setBackground(new Color(11,99,171));
        this.lightt4.setBackground(Color.WHITE);
          this.lightt3.setBackground(new Color(11,99,171));
        this.lightt2.setBackground(new Color(11,99,171));
    }//GEN-LAST:event_jPanel12MouseClicked

    private void jPanel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MouseClicked
 click2=true;
 this.linee3.setBackground(new Color(11,99,171));
        this.linee4.setBackground(new Color(11,99,171));
        this.linee2.setBackground(new Color(11,99,171));
        this.linee1.setBackground(new Color(11,99,171));
        lightt2.setBackground(Color.WHITE);
       this.lightt3.setBackground(new Color(11,99,171));
        this.lightt4.setBackground(new Color(11,99,171));
         this.lightt1.setBackground(new Color(11,99,171));
    }//GEN-LAST:event_jPanel11MouseClicked

    private void jLabel3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel3KeyPressed


    }//GEN-LAST:event_jLabel3KeyPressed

    private void ppMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ppMouseClicked
m1=m2=m3=click=false;
 
boolean b1,b2,b3,b4;
        if(this.t1.getText().equals("")){this.t1e1.setVisible(true);b1=false;}
        else if(this.t1.getText().equals("First name")){this.t1e1.setVisible(true);this.t1.setText("");b1=false;}
        else{ 
            int number=0;
            for(int i=0;i<this.t1.getText().length();i++)if(Character.isAlphabetic(this.t1.getText().charAt(i)))number++;
            if(number==this.t1.getText().length()){this.t1e2.setVisible(false);b1=true;}else{
            this.t1e2.setVisible(true);b1=false;}
            }
        
        if(this.t2.getText().equals("")){this.t2e1.setVisible(true);b2=false;}
        else if(this.t2.getText().equals("Last name")){this.t2e1.setVisible(true);this.t2.setText("");b2=false;}
        else{ 
            int number=0;
            for(int i=0;i<this.t2.getText().length();i++)if(Character.isAlphabetic(this.t2.getText().charAt(i)))number++;
            if(number==this.t2.getText().length()){this.t2e2.setVisible(false);b2=true;}else{
            this.t2e2.setVisible(true);b2=false;}
           }
       
        if(this.t3.getText().equals("")){this.t3e1.setVisible(true);b3=false;}
        else if(this.t3.getText().equals("Ssn")){this.t3e1.setVisible(true);this.t3.setText("");b3=false;}
        else {
            int number=0;int length=0;
            for(int i=0;i<this.t3.getText().length();i++){
                length++;if(Character.isDigit(this.t3.getText().charAt(i)))number++;
            }
            if(number==this.t3.getText().length()&&length==9){this.t3e2.setVisible(false);b3=true;}
            else{this.t3e2.setVisible(true);b3=false;}
        }
        if(!click1&&!click2&&!click3&&!click4){
            b4=false;
        this.linee2.setBackground(Color.RED);
         this.linee1.setBackground(Color.RED);
          this.linee4.setBackground(Color.RED);
           this.linee3.setBackground(Color.RED);
        }else b4=true;
        ////////////////////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////////////////////////////
        if(b1&&b2&&b3&&b4){
           //////////////////////////////////////////////////////
            
            //Raed//
            
            
            ///////////////////////////////////////////////////////
         boolean f=true;
                  try { EntityManagerFactory emf = Persistence.createEntityManagerFactory("Insurance_1PU");
            EntityManager em=emf.createEntityManager();
                Vacation voc=new Vacation();
                String s1=t1.getText();
                String s2=t2.getText();
                String s3=t3.getText();
                String s4="";
                if(click1)
                    s4="Sick leave";
                if(click2)
                    s4="Maternity leave";
                    if(click3)
                        s4="Annual leave";
                        if(click4)
                            s4="Unpaid leave";
            voc.setFirstName(s1);
            voc.setLastName(s2);
            voc.setSsn(Integer.parseInt(s3));
            voc.setVType(s4);
            em.getTransaction().begin();
            em.persist(voc);
            em.getTransaction().commit();
            em.close();}
                  catch(Exception ex){
                   JOptionPane.showMessageDialog(null,"Employee Ssn Wrong");
                   f=false;
                  }
                  if(f==true){
                      JOptionPane.showMessageDialog(null,"Done");
          t1e1.setVisible(false);
         t2e1.setVisible(false);
         t3e1.setVisible(false);
         this.t1e2.setVisible(false);
         this.t2e2.setVisible(false);
         this.t3e2.setVisible(false);
         click4=click1=click2=click3=false;
         m1=m2=m3=m4=false;
         click=true;
         t1.setText("First name");
         t2.setText("Last name");
         t3.setText("Ssn");
         this.t1.requestFocus(rootPaneCheckingEnabled);
         lightt1.setBackground(new Color(11,99,171));
         lightt2.setBackground(new Color(11,99,171));
         lightt2.setBackground(new Color(11,99,171));
         lightt4.setBackground(new Color(11,99,171));
         linee1.setBackground(new Color(11,99,171));
         linee2.setBackground(new Color(11,99,171));
         linee3.setBackground(new Color(11,99,171));
         linee4.setBackground(new Color(11,99,171));
         
          }
        }
    }//GEN-LAST:event_ppMouseClicked

    private void ppMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ppMouseEntered
        this.pp1.setOpaque(false);
        this.pp1.repaint();
        this.pp2.setOpaque(false);
        this.pp2.repaint();
        this.pp3.setOpaque(false);
        this.pp3.repaint();
        this.pp4.setOpaque(false);
        this.pp4.repaint();
    }//GEN-LAST:event_ppMouseEntered

    private void ppMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ppMouseExited
        this.pp1.setOpaque(true);
        this.pp1.repaint();
        this.pp2.setOpaque(true);
        this.pp2.repaint();
        this.pp3.setOpaque(true);
        this.pp3.repaint();
        this.pp4.setOpaque(true);
        this.pp4.repaint();
    }//GEN-LAST:event_ppMouseExited

    private void t1CaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_t1CaretPositionChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_t1CaretPositionChanged

    private void t1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t1MouseExited
        if(this.t1.getText().equals("")&&m1)
                {this.t1.setText("First name");this.t1e1.setVisible(false);this.t1e2.setVisible(false);}
                else if(this.t1.getText().equals("First name")&&m1)this.t1e2.setVisible(false);
             else{
                    if(m1){
                 int number=0;
                 for(int i=0;i<this.t1.getText().length();i++)
                     if(Character.isAlphabetic(this.t1.getText().charAt(i)))number++;
                 if(number==this.t1.getText().length()){this.t1e2.setVisible(false);}else this.t1e2.setVisible(true);
                    
                    }}  
    }//GEN-LAST:event_t1MouseExited

    private void t2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t2MouseExited
     if(this.t2.getText().equals("")&&m2)
                {this.t2.setText("Last name");this.t2e1.setVisible(false);this.t2e2.setVisible(false);}
                else if(this.t2.getText().equals("Last name")&&m2)this.t2e2.setVisible(false);
             else{
                    if(m2){
                 int number=0;
                 for(int i=0;i<this.t2.getText().length();i++)
                     if(Character.isAlphabetic(this.t2.getText().charAt(i)))number++;
                 if(number==this.t2.getText().length()){this.t2e2.setVisible(false);}else this.t2e2.setVisible(true);
                    
                    }} 
    }//GEN-LAST:event_t2MouseExited

    private void t3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t3MouseExited
       if(this.t3.getText().equals("")&&m3)
                {this.t3.setText("Ssn");this.t3e1.setVisible(false);this.t3e2.setVisible(false);}
                else if(this.t3.getText().equals("Ssn")&&m3)this.t3e2.setVisible(false);
             else{
                    if(m3){
                 int number=0;int length=0;
                 for(int i=0;i<this.t3.getText().length();i++){length++;
                     if(Character.isDigit(this.t3.getText().charAt(i)))number++;}
                 if(number==this.t3.getText().length()&&length==9){this.t3e2.setVisible(false);}else this.t3e2.setVisible(true);
             }}     
    }//GEN-LAST:event_t3MouseExited

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
      m1=m2=m3=click=false;
     
boolean b1,b2,b3,b4;
        if(this.t1.getText().equals("")){this.t1e1.setVisible(true);b1=false;}
        else if(this.t1.getText().equals("First name")){this.t1e1.setVisible(true);this.t1.setText("");b1=false;}
        else{ 
            int number=0;
            for(int i=0;i<this.t1.getText().length();i++)if(Character.isAlphabetic(this.t1.getText().charAt(i)))number++;
            if(number==this.t1.getText().length()){this.t1e2.setVisible(false);b1=true;}else{
            this.t1e2.setVisible(true);b1=false;}
            }
        
        if(this.t2.getText().equals("")){this.t2e1.setVisible(true);b2=false;}
        else if(this.t2.getText().equals("Last name")){this.t2e1.setVisible(true);this.t2.setText("");b2=false;}
        else{ 
            int number=0;
            for(int i=0;i<this.t2.getText().length();i++)if(Character.isAlphabetic(this.t2.getText().charAt(i)))number++;
            if(number==this.t2.getText().length()){this.t2e2.setVisible(false);b2=true;}else{
            this.t2e2.setVisible(true);b2=false;}
           }
       
        if(this.t3.getText().equals("")){this.t3e1.setVisible(true);b3=false;}
        else if(this.t3.getText().equals("Ssn")){this.t3e1.setVisible(true);this.t3.setText("");b3=false;}
        else {
            int number=0;int length=0;
            for(int i=0;i<this.t3.getText().length();i++){
                length++;if(Character.isDigit(this.t3.getText().charAt(i)))number++;
            }
            if(number==this.t3.getText().length()&&length==9){this.t3e2.setVisible(false);b3=true;}
            else{this.t3e2.setVisible(true);b3=false;}
        }
        if(!click1&&!click2&&!click3&&!click4){
            b4=false;
        this.linee2.setBackground(Color.RED);
         this.linee1.setBackground(Color.RED);
          this.linee4.setBackground(Color.RED);
           this.linee3.setBackground(Color.RED);
        }else b4=true;
       ////////////////////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////////////////////////////
        if(b1&&b2&&b3&&b4){
          //////////////////////////////////////////////////////
            
            //Raed//
            
            
            ///////////////////////////////////////////////////////
         boolean f=true;
                  try { EntityManagerFactory emf = Persistence.createEntityManagerFactory("Insurance_1PU");
            EntityManager em=emf.createEntityManager();
                Vacation voc=new Vacation();
                String s1=t1.getText();
                String s2=t2.getText();
                String s3=t3.getText();
                String s4="";
                if(click1)
                    s4="Sick leave";
                if(click2)
                    s4="Maternity leave";
                    if(click3)
                        s4="Annual leave";
                        if(click4)
                            s4="Unpaid leave";
            voc.setFirstName(s1);
            voc.setLastName(s2);
            voc.setSsn(Integer.parseInt(s3));
            voc.setVType(s4);
            em.getTransaction().begin();
            em.persist(voc);
            em.getTransaction().commit();
            em.close();}
                  catch(Exception ex){
                   JOptionPane.showMessageDialog(null,"Employee Ssn Wrong");
                   f=false;
                  }
                  if(f==true){
                      JOptionPane.showMessageDialog(null,"Done");
          t1e1.setVisible(false);
         t2e1.setVisible(false);
         t3e1.setVisible(false);
         this.t1e2.setVisible(false);
         this.t2e2.setVisible(false);
         this.t3e2.setVisible(false);
         click4=click1=click2=click3=false;
         m1=m2=m3=m4=false;
         click=true;
         t1.setText("First name");
         t2.setText("Last name");
         t3.setText("Ssn");
         this.t1.requestFocus(rootPaneCheckingEnabled);
         lightt1.setBackground(new Color(11,99,171));
         lightt2.setBackground(new Color(11,99,171));
         lightt2.setBackground(new Color(11,99,171));
         lightt4.setBackground(new Color(11,99,171));
         linee1.setBackground(new Color(11,99,171));
         linee2.setBackground(new Color(11,99,171));
         linee3.setBackground(new Color(11,99,171));
         linee4.setBackground(new Color(11,99,171));
         
          }
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void t3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t3KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t3KeyReleased

    private void piMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_piMouseEntered
        blue.setVisible(false);
        redp.setVisible(true);
    }//GEN-LAST:event_piMouseEntered

    private void redpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_redpMouseClicked
        // TODO add your handling code hereset
        setVisible(false);
    }//GEN-LAST:event_redpMouseClicked

    private void redpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_redpMouseExited
        redp.setVisible(false);
        blue.setVisible(true);
    }//GEN-LAST:event_redpMouseExited

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        this.pp1.setOpaque(false);
        this.pp1.repaint();
        this.pp2.setOpaque(false);
        this.pp2.repaint();
        this.pp3.setOpaque(false);
        this.pp3.repaint();
        this.pp4.setOpaque(false);
        this.pp4.repaint();
    }//GEN-LAST:event_jLabel3MouseEntered

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new holy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel b1;
    private javax.swing.JPanel b2;
    private javax.swing.JPanel b3;
    private javax.swing.JPanel b4;
    private javax.swing.JLabel background;
    private javax.swing.JPanel blue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel lightt1;
    private javax.swing.JPanel lightt2;
    private javax.swing.JPanel lightt3;
    private javax.swing.JPanel lightt4;
    private javax.swing.JPanel linee1;
    private javax.swing.JPanel linee2;
    private javax.swing.JPanel linee3;
    private javax.swing.JPanel linee4;
    private javax.swing.JPanel p2;
    private javax.swing.JPanel p3;
    private javax.swing.JPanel p4;
    private javax.swing.JPanel p5;
    private javax.swing.JLabel pi;
    private javax.swing.JPanel pp;
    private javax.swing.JPanel pp1;
    private javax.swing.JPanel pp2;
    private javax.swing.JPanel pp3;
    private javax.swing.JPanel pp4;
    private javax.swing.JPanel redp;
    private javax.swing.JPanel s2;
    private javax.swing.JPanel s3;
    private javax.swing.JPanel s4;
    private javax.swing.JPanel s5;
    private javax.swing.JPanel s8;
    private javax.swing.JPanel s9;
    private javax.swing.JTextField t1;
    private javax.swing.JLabel t1e1;
    private javax.swing.JLabel t1e2;
    private javax.swing.JTextField t2;
    private javax.swing.JLabel t2e1;
    private javax.swing.JLabel t2e2;
    private javax.swing.JTextField t3;
    private javax.swing.JLabel t3e1;
    private javax.swing.JLabel t3e2;
    // End of variables declaration//GEN-END:variables
}
