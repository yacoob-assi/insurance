
package insurance;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Pay_custmor extends javax.swing.JFrame {

   
     
    boolean click=true;
boolean m1,m2,m3,m4,m5,day,month,year,d1,d2,d3;
    public Pay_custmor() {
        initComponents();
        d1=d2=d3=true;
        m1=m2=m3=m4=m5=day=month=year=false;
       
         this.background.setSize(this.getWidth(), this.getHeight());
       
         this.b1.setBackground(new Color(0,0,0,100));
         this.b2.setBackground(new Color(0,0,0,100));
         this.b3.setBackground(new Color(0,0,0,100));
         this.b4.setBackground(new Color(0,0,0,100));
         this.t1e1.setVisible(false);
         this.t2e1.setVisible(false);
         this.t3e1.setVisible(false);
         this.t4e.setVisible(false);
         this.t1e2.setVisible(false);
         this.t2e2.setVisible(false);
         this.t3e2.setVisible(false);
         redp.setVisible(false);
         this.title.setBackground(new Color(0,0,0,100));
         this.l1.setBackground(new Color(0,0,0,100));
         this.l2.setBackground(new Color(0,0,0,100));
         this.l3.setBackground(new Color(0,0,0,100));
         this.l4.setBackground(new Color(0,0,0,100));
         this.l5.setBackground(new Color(0,0,0,100));
         this.l6.setBackground(new Color(0,0,0,100));
         this.l7.setBackground(new Color(0,0,0,100));
         this.s1.setBackground(new Color(255,255,255,100));
         this.s2.setBackground(new Color(255,255,255,100));
         this.s3.setBackground(new Color(255,255,255,100));
         this.s4.setBackground(new Color(255,255,255,100));
         this.s5.setBackground(new Color(255,255,255,100));
         this.pp.setBackground(new Color(255,255,255,100));
         this.t1.setCaretColor(Color.WHITE);
         this.t2.setCaretColor(Color.WHITE);
         this.t3.setCaretColor(Color.WHITE);
         this.t4.setCaretColor(Color.WHITE);
         this.t51.setCaretColor(Color.WHITE);
         this.t522.setCaretColor(Color.WHITE);
         this.t53.setCaretColor(Color.WHITE);
           setLocation(300, 10);
          
         
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        b1 = new javax.swing.JPanel();
        t5e = new javax.swing.JLabel();
        title = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        l1 = new javax.swing.JPanel();
        l2 = new javax.swing.JPanel();
        s1 = new javax.swing.JPanel();
        s2 = new javax.swing.JPanel();
        l4 = new javax.swing.JPanel();
        l3 = new javax.swing.JPanel();
        l5 = new javax.swing.JPanel();
        s3 = new javax.swing.JPanel();
        s4 = new javax.swing.JPanel();
        l6 = new javax.swing.JPanel();
        l7 = new javax.swing.JPanel();
        t1e1 = new javax.swing.JLabel();
        t2e1 = new javax.swing.JLabel();
        t3e1 = new javax.swing.JLabel();
        t1e2 = new javax.swing.JLabel();
        t4e = new javax.swing.JLabel();
        t2e2 = new javax.swing.JLabel();
        t3e2 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        s5 = new javax.swing.JPanel();
        pp = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        b4 = new javax.swing.JPanel();
        b3 = new javax.swing.JPanel();
        b2 = new javax.swing.JPanel();
        pp1 = new javax.swing.JPanel();
        pp2 = new javax.swing.JPanel();
        pp3 = new javax.swing.JPanel();
        pp4 = new javax.swing.JPanel();
        dayline = new javax.swing.JPanel();
        monthline = new javax.swing.JPanel();
        yearline = new javax.swing.JPanel();
        t51 = new javax.swing.JTextField();
        t53 = new javax.swing.JTextField();
        redp = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        t522 = new javax.swing.JTextField();
        blue = new javax.swing.JPanel();
        pi = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout b1Layout = new javax.swing.GroupLayout(b1);
        b1.setLayout(b1Layout);
        b1Layout.setHorizontalGroup(
            b1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        b1Layout.setVerticalGroup(
            b1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        getContentPane().add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 730, 380, 70));

        t5e.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        t5e.setForeground(new java.awt.Color(204, 204, 204));
        t5e.setText("Date");
        getContentPane().add(t5e, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 580, 50, 30));

        title.setToolTipText("Member Login");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Payment");
        jLabel1.setToolTipText("");

        javax.swing.GroupLayout titleLayout = new javax.swing.GroupLayout(title);
        title.setLayout(titleLayout);
        titleLayout.setHorizontalGroup(
            titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titleLayout.createSequentialGroup()
                .addContainerGap(125, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121))
        );
        titleLayout.setVerticalGroup(
            titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 400, -1));

        javax.swing.GroupLayout l1Layout = new javax.swing.GroupLayout(l1);
        l1.setLayout(l1Layout);
        l1Layout.setHorizontalGroup(
            l1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        l1Layout.setVerticalGroup(
            l1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );

        getContentPane().add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 10, 570));

        javax.swing.GroupLayout l2Layout = new javax.swing.GroupLayout(l2);
        l2.setLayout(l2Layout);
        l2Layout.setHorizontalGroup(
            l2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        l2Layout.setVerticalGroup(
            l2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 380, 10));

        s1.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout s1Layout = new javax.swing.GroupLayout(s1);
        s1.setLayout(s1Layout);
        s1Layout.setHorizontalGroup(
            s1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        s1Layout.setVerticalGroup(
            s1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        getContentPane().add(s1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 70, 70));

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

        getContentPane().add(s2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, 70, 70));

        javax.swing.GroupLayout l4Layout = new javax.swing.GroupLayout(l4);
        l4.setLayout(l4Layout);
        l4Layout.setHorizontalGroup(
            l4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        l4Layout.setVerticalGroup(
            l4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );

        getContentPane().add(l4, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 230, 10, 570));

        javax.swing.GroupLayout l3Layout = new javax.swing.GroupLayout(l3);
        l3.setLayout(l3Layout);
        l3Layout.setHorizontalGroup(
            l3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        l3Layout.setVerticalGroup(
            l3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(l3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, 380, 10));

        javax.swing.GroupLayout l5Layout = new javax.swing.GroupLayout(l5);
        l5.setLayout(l5Layout);
        l5Layout.setHorizontalGroup(
            l5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        l5Layout.setVerticalGroup(
            l5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(l5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 390, 380, 10));

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

        getContentPane().add(s3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 400, 70, 70));

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

        getContentPane().add(s4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 480, 70, 70));

        javax.swing.GroupLayout l6Layout = new javax.swing.GroupLayout(l6);
        l6.setLayout(l6Layout);
        l6Layout.setHorizontalGroup(
            l6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        l6Layout.setVerticalGroup(
            l6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(l6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 470, 380, 10));

        javax.swing.GroupLayout l7Layout = new javax.swing.GroupLayout(l7);
        l7.setLayout(l7Layout);
        l7Layout.setHorizontalGroup(
            l7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        l7Layout.setVerticalGroup(
            l7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(l7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 550, 380, 10));

        t1e1.setForeground(new java.awt.Color(204, 255, 255));
        t1e1.setText("First name is requred");
        getContentPane().add(t1e1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 274, 140, 10));

        t2e1.setForeground(new java.awt.Color(204, 255, 255));
        t2e1.setText("Last name is requred");
        t2e1.setToolTipText("");
        getContentPane().add(t2e1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 350, 140, -1));

        t3e1.setForeground(new java.awt.Color(204, 255, 255));
        t3e1.setText("Ssn is requred");
        getContentPane().add(t3e1, new org.netbeans.lib.awtextra.AbsoluteConstraints(684, 430, 100, -1));

        t1e2.setForeground(new java.awt.Color(204, 255, 255));
        t1e2.setText("First name just alphabes");
        getContentPane().add(t1e2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 270, 150, -1));

        t4e.setForeground(new java.awt.Color(204, 255, 255));
        t4e.setText("Amount requred");
        getContentPane().add(t4e, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 510, 110, -1));

        t2e2.setBackground(new java.awt.Color(204, 255, 255));
        t2e2.setForeground(new java.awt.Color(204, 255, 255));
        t2e2.setText("Last name just alphabes");
        getContentPane().add(t2e2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 350, 150, -1));

        t3e2.setForeground(new java.awt.Color(204, 255, 255));
        t3e2.setText("Ssn is 9 numbers");
        getContentPane().add(t3e2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 430, 110, 20));

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
        t1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t1KeyReleased(evt);
            }
        });
        getContentPane().add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(469, 240, 310, 70));

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
        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });
        t2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t2KeyPressed(evt);
            }
        });
        getContentPane().add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(469, 320, 310, 70));

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
        t3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t3ActionPerformed(evt);
            }
        });
        t3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t3KeyPressed(evt);
            }
        });
        getContentPane().add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(469, 400, 310, 70));

        t4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        t4.setForeground(new java.awt.Color(204, 204, 204));
        t4.setText("Amount paid");
        t4.setBorder(null);
        t4.setOpaque(false);
        t4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t4MouseExited(evt);
            }
        });
        t4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t4ActionPerformed(evt);
            }
        });
        t4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t4KeyPressed(evt);
            }
        });
        getContentPane().add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 480, 310, 70));

        s5.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout s5Layout = new javax.swing.GroupLayout(s5);
        s5.setLayout(s5Layout);
        s5Layout.setHorizontalGroup(
            s5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        s5Layout.setVerticalGroup(
            s5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        getContentPane().add(s5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 560, 70, 70));

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
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ppLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3)
                .addGap(21, 21, 21))
        );
        ppLayout.setVerticalGroup(
            ppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ppLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(pp, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 670, 100, -1));

        javax.swing.GroupLayout b4Layout = new javax.swing.GroupLayout(b4);
        b4.setLayout(b4Layout);
        b4Layout.setHorizontalGroup(
            b4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        b4Layout.setVerticalGroup(
            b4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(b4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 630, 130, 100));

        javax.swing.GroupLayout b3Layout = new javax.swing.GroupLayout(b3);
        b3.setLayout(b3Layout);
        b3Layout.setHorizontalGroup(
            b3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        b3Layout.setVerticalGroup(
            b3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 630, 120, 30));

        javax.swing.GroupLayout b2Layout = new javax.swing.GroupLayout(b2);
        b2.setLayout(b2Layout);
        b2Layout.setHorizontalGroup(
            b2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        b2Layout.setVerticalGroup(
            b2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 630, 130, 100));

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

        getContentPane().add(pp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 660, 100, 10));

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

        getContentPane().add(pp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 720, 100, 10));

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

        getContentPane().add(pp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 660, 10, 70));

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

        getContentPane().add(pp4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 660, 10, 70));

        dayline.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout daylineLayout = new javax.swing.GroupLayout(dayline);
        dayline.setLayout(daylineLayout);
        daylineLayout.setHorizontalGroup(
            daylineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        daylineLayout.setVerticalGroup(
            daylineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        getContentPane().add(dayline, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 620, 60, 1));

        monthline.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout monthlineLayout = new javax.swing.GroupLayout(monthline);
        monthline.setLayout(monthlineLayout);
        monthlineLayout.setHorizontalGroup(
            monthlineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        monthlineLayout.setVerticalGroup(
            monthlineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        getContentPane().add(monthline, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 620, 60, 1));

        javax.swing.GroupLayout yearlineLayout = new javax.swing.GroupLayout(yearline);
        yearline.setLayout(yearlineLayout);
        yearlineLayout.setHorizontalGroup(
            yearlineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        yearlineLayout.setVerticalGroup(
            yearlineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        getContentPane().add(yearline, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 620, 60, 1));

        t51.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t51.setForeground(new java.awt.Color(204, 204, 204));
        t51.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t51.setText("Day");
        t51.setBorder(null);
        t51.setOpaque(false);
        t51.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t51MouseExited(evt);
            }
        });
        t51.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t51KeyPressed(evt);
            }
        });
        getContentPane().add(t51, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 580, 60, 40));

        t53.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t53.setForeground(new java.awt.Color(204, 204, 204));
        t53.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t53.setText("Year");
        t53.setBorder(null);
        t53.setOpaque(false);
        t53.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t53MouseExited(evt);
            }
        });
        t53.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t53KeyPressed(evt);
            }
        });
        getContentPane().add(t53, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 580, 60, 40));

        redp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                redpMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                redpMouseExited(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/insurance/3.png"))); // NOI18N
        jLabel4.setText("jLabel4");

        javax.swing.GroupLayout redpLayout = new javax.swing.GroupLayout(redp);
        redp.setLayout(redpLayout);
        redpLayout.setHorizontalGroup(
            redpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(redpLayout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        redpLayout.setVerticalGroup(
            redpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(redpLayout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        getContentPane().add(redp, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 0, 60, 50));

        t522.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t522.setForeground(new java.awt.Color(204, 204, 204));
        t522.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t522.setText("Month");
        t522.setBorder(null);
        t522.setOpaque(false);
        t522.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t522MouseExited(evt);
            }
        });
        t522.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t522KeyPressed(evt);
            }
        });
        getContentPane().add(t522, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 580, 60, 40));

        blue.setLayout(null);

        pi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/insurance/2.png"))); // NOI18N
        pi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                piMouseEntered(evt);
            }
        });
        blue.add(pi);
        pi.setBounds(0, 0, 60, 55);

        getContentPane().add(blue, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 0, 60, 50));

        background.setBackground(new java.awt.Color(204, 204, 204));
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/insurance/all.jpg"))); // NOI18N
        background.setText("jLabel1");
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t3ActionPerformed
        
    }//GEN-LAST:event_t3ActionPerformed

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
       
    }//GEN-LAST:event_t2ActionPerformed

    private void jLabel3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel3KeyPressed
  
      
    }//GEN-LAST:event_jLabel3KeyPressed

    private void ppMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ppMouseClicked
        boolean b1,b2,b3,b4,b5,b6,b7;
        m1=m2=m3=m4=d1=d2=d3=false;

        if(this.t1.getText().equals("")){this.t1e1.setVisible(true);b1=false;}
        else if(this.t1.getText().equals("First name")){this.t1e1.setVisible(true);this.t1.setText("");b1=false;}
        else{ 
            int number=0;
            for(int i=0;i<this.t1.getText().length();i++)if(Character.isAlphabetic(this.t1.getText().charAt(i)))number++;
            if(number==this.t1.getText().length()){this.t1e2.setVisible(false);b1=true;}else{
            this.t1e2.setVisible(true);b1=false;}
           }
        
        if(this.t2.getText().equals("")){this.t2e1.setVisible(true);b2=false;this.t2e2.setVisible(false);}
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
     if(this.t4.getText().equals("")){this.t4e.setVisible(true);b4=false;}
        else if(this.t4.getText().equals("Amount paid")){this.t4e.setVisible(true);this.t4.setText("");b4=false;}
        else{ 
            int number=0;
            for(int i=0;i<this.t4.getText().length();i++)if(Character.isDigit(this.t4.getText().charAt(i)))number++;
            if(number==this.t4.getText().length()){this.t4e.setVisible(false);b4=true;}else{
            this.t4e.setVisible(true);b4=false;}
           }
        
        
           if(this.t51.getText().equals("")){this.dayline.setBackground(Color.RED);b5=false;}
               else if(this.t51.getText().equals("Day")){this.dayline.setBackground(Color.RED);b5=false;}
               else{        int number=0;
              for(int i=0;i<this.t51.getText().length();i++)if(Character.isDigit(this.t51.getText().charAt(i)))number++;  
               if(number==this.t51.getText().length()){
                   if(Integer.parseInt(this.t51.getText())>=1&&Integer.parseInt(this.t51.getText())<=31){
                   this.dayline.setBackground(new Color(204,204,204));b5=true;}
                   else{this.dayline.setBackground(Color.RED);b5=false;}
                       } else{this.dayline.setBackground(Color.RED);b5=false;}
               }
        if(this.t522.getText().equals("")){this.monthline.setBackground(Color.RED);b6=false;}
               else if(this.t522.getText().equals("Month")){this.monthline.setBackground(Color.RED);b6=false;}
               else{        int number=0;
              for(int i=0;i<this.t522.getText().length();i++)if(Character.isDigit(this.t522.getText().charAt(i)))number++;  
               if(number==this.t522.getText().length()){
                   if(Integer.parseInt(this.t522.getText())>=1&&Integer.parseInt(this.t522.getText())<=12){
                   this.monthline.setBackground(new Color(204,204,204));b6=true;}
                   else{this.monthline.setBackground(Color.RED);b6=false;}
                       } else{this.monthline.setBackground(Color.RED);b6=false;}
               }
         if(this.t53.getText().equals("")){this.background.setBackground(Color.RED);b7=false;}
               else if(this.t53.getText().equals("Year")){this.background.setBackground(Color.RED);b7=false;}
               else{        int number=0;
              for(int i=0;i<this.t53.getText().length();i++)if(Character.isDigit(this.t53.getText().charAt(i)))number++;  
               if(number==this.t53.getText().length()){
                   if(Integer.parseInt(this.t53.getText())>1980&&Integer.parseInt(this.t53.getText())<2020){
                   this.background.setBackground(new Color(204,204,204));b7=true;}
                   else{this.background.setBackground(Color.RED);b7=false;}
                       } else{this.background.setBackground(Color.RED);b7=false;}
               
               }

         /////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////
        if(b1&&b2&&b3&&b4&&b5&&b6&&b7){
       /////////////////////////////////////////////////////////////////////////////
       
       
       
       
       //raed
       
       
       //////////////////////////////////////////////////
             boolean f=true;
         try{
             EntityManagerFactory emf = Persistence.createEntityManagerFactory("Insurance_1PU");
            EntityManager em=emf.createEntityManager();
            Payment pay=new Payment();
            String s1=t1.getText();
            String s2=t2.getText();
            String s3=t3.getText();
            String s4=t4.getText();
            String s6=t51.getText();
            String s7=t522.getText();
            String s8=t53.getText();
            switch(Integer.parseInt(s7)){
                case 1: s7="JAN"; break; 
                case 2: s7="FEB"; break; 
                case 3: s7="MAR"; break; 
                case 4: s7="APR"; break; 
                case 5: s7="MAY"; break; 
                case 6: s7="JUN"; break; 
                case 7: s7="JUL"; break; 
                case 8: s7="AUG"; break; 
                case 9: s7="SEP"; break; 
                case 10: s7="OCT"; break; 
                case 11: s7="NOV"; break; 
                case 12: s7="DEC"; break; 
                 }
            String s9=s6+"-"+s7+"-"+s8;
            Date date=new Date(s9);
                 pay.setFirstName(s1);
                 pay.setLastName(s2);
                 pay.setSsn(Long.parseLong(s3));
                 pay.setAmountHePaid(Integer.parseInt(s4));
            em.getTransaction().begin();
            em.persist(pay);
            em.getTransaction().commit();
            em.close();}
         
            catch(Exception ex){
          JOptionPane.showMessageDialog(null, "This customer exist or customer does not exist,\n please check data you entered");
          f=false;
         }
         if(f==true){JOptionPane.showMessageDialog(null, "Done");
        t1.setText("First name");
        t2.setText("Last name");
        t3.setText("Ssn");
        t4.setText("Amount paid");
        t51.setText("Day");
        t522.setText("Month");
        t53.setText("Year");
         this.t1.requestFocus(rootPaneCheckingEnabled);
          this.t1e1.setVisible(false);
         this.t2e1.setVisible(false);
         this.t3e1.setVisible(false);
         this.t4e.setVisible(false);
         this.t1e2.setVisible(false);
         this.t2e2.setVisible(false);
         this.t3e2.setVisible(false);
         dayline.setBackground(new Color(240,240,240));
         yearline.setBackground(new Color(240,240,240));
         monthline.setBackground(new Color(240,240,240));
         redp.setVisible(false);d1=d2=d3=true;
        m1=m2=m3=m4=m5=day=month=year=false;
       click=true;
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

    private void t4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t4ActionPerformed
       
    }//GEN-LAST:event_t4ActionPerformed

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
                else if(this.t2.getText().equals("Last name")&&m2)this.t2e2.setVisible(false);}
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
             }
                  }
             
             }
    }//GEN-LAST:event_t2KeyPressed

    private void t3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t3KeyPressed
         if(evt.getKeyCode()!=KeyEvent.VK_ENTER&&evt.getKeyCode()!=KeyEvent.VK_UP&&
                   evt.getKeyCode()!=KeyEvent.VK_DOWN){
             if(this.t3.getText().equals("Ssn"))
            this.t3.setText("");
             
              m3=true;this.t3e1.setVisible(false);
              int number=0;int length=0;
             
                 if(evt.getKeyCode()==8){   
             for(int i=0;i<this.t3.getText().length();i++){length++;
        if (Character.isDigit(this.t3.getText().charAt(i)))number++;}
         if((number==this.t3.getText().length()&&length==10)){
                  this.t3e2.setVisible(false);}}
         
              for(int i=0;i<this.t3.getText().length();i++){length++;
        if (Character.isDigit(this.t3.getText().charAt(i)))number++;}
         if(number==this.t3.getText().length()&&length==8){
                  this.t3e2.setVisible(false);}
             
              
            
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
                  this.t4.requestFocus(rootPaneCheckingEnabled);
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
               this.t4.requestFocus(rootPaneCheckingEnabled);
            if(this.t3.getText().equals("")&&m3)
            {this.t3.setText("Ssn");this.t3e1.setVisible(false);this.t3e2.setVisible(false);}
            else if(this.t3.getText().equals("Ssn")&&m3){this.t3e1.setVisible(false);this.t3e2.setVisible(false);}
            else{
                if(m3){
                  int number=0;int length=0;
                 for(int i=0;i<this.t3.getText().length();i++){length++;
                     if(Character.isDigit(this.t3.getText().charAt(i)))number++;}
                 if(number==this.t3.getText().length()&&length==9){this.t3e2.setVisible(false);}else this.t3e2.setVisible(true);
            }}
        }
    }//GEN-LAST:event_t3KeyPressed

    private void t4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t4KeyPressed
    if(evt.getKeyCode()!=KeyEvent.VK_ENTER&&evt.getKeyCode()!=KeyEvent.VK_UP&&
                   evt.getKeyCode()!=KeyEvent.VK_DOWN){
             m4=true;this.t4e.setVisible(false);
            if(this.t4.getText().equals("Amount paid"))
            this.t4.setText("");
        }
            else if(evt.getKeyCode()==KeyEvent.VK_UP){
                  this.t3.requestFocus(rootPaneCheckingEnabled);
                if(this.t4.getText().equals("")&&m4)
                {this.t4.setText("Amount paid");this.t4e.setVisible(false);this.t4e.setVisible(false);}
                else if(this.t4.getText().equals("Amount paid")&&m4)this.t4e.setVisible(false);
             else{
                    if(m4){
                 int number=0;
                 for(int i=0;i<this.t4.getText().length();i++)
                     if(Character.isDigit(this.t4.getText().charAt(i)))number++;
                 if(number==this.t4.getText().length()){this.t4e.setVisible(false);}else this.t4e.setVisible(true);
             }}}
             else if(evt.getKeyCode()==KeyEvent.VK_DOWN){
             this.t51.requestFocus(rootPaneCheckingEnabled);
                if(this.t4.getText().equals("")&&m4)
                {this.t4.setText("Amount paid");this.t4e.setVisible(false);this.t4e.setVisible(false);}
                else if(this.t4.getText().equals("Amount paid")&&m4)this.t4e.setVisible(false);
              else{
                    if(m4){
                  int number=0;
                 for(int i=0;i<this.t4.getText().length();i++)
                     if(Character.isDigit(this.t4.getText().charAt(i)))number++;
                 if(number==this.t4.getText().length()){this.t4e.setVisible(false);}else this.t4e.setVisible(true);}}}
          else{
                  this.t51.requestFocus(rootPaneCheckingEnabled);
                  if(this.t4.getText().equals("")&&m4){this.t4.setText("Amount paid");this.t4e.setVisible(false);this.t4e.setVisible(false);}
                  else if(this.t4.getText().equals("Amount paid")&&m4){this.t4e.setVisible(false);this.t4e.setVisible(false);}
                  else{
                      if(m4){
                  int number=0;
                 for(int i=0;i<this.t4.getText().length();i++)
                     if(Character.isDigit(this.t4.getText().charAt(i)))number++;
                 if(number==this.t4.getText().length()){this.t4e.setVisible(false);}else this.t4e.setVisible(true);
             }
                  }
             
             }
    }//GEN-LAST:event_t4KeyPressed

    private void t4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t4MouseExited
       
        if(this.t4.getText().equals("")&&m4)
                {this.t4.setText("Amount paid");this.t4e.setVisible(false);this.t4e.setVisible(false);}
                else if(this.t4.getText().equals("Amount paid")&&m4)this.t4e.setVisible(false);
             else{
                    if(m4){
                 int number=0;
                 for(int i=0;i<this.t4.getText().length();i++)
                     if(Character.isDigit(this.t4.getText().charAt(i)))number++;
                 if(number==this.t4.getText().length()){this.t4e.setVisible(false);}else this.t4e.setVisible(true);
             }}
    }//GEN-LAST:event_t4MouseExited
    
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
             }}    }//GEN-LAST:event_t3MouseExited

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
                    }  }    }//GEN-LAST:event_t2MouseExited

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
                    
                    }
             }    }//GEN-LAST:event_t1MouseExited

    private void t51KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t51KeyPressed
            if(evt.getKeyCode()!=KeyEvent.VK_ENTER&&evt.getKeyCode()!=KeyEvent.VK_LEFT&&
                   evt.getKeyCode()!=KeyEvent.VK_RIGHT){
          day=true;
          if(t51.getText().equals("Day"))this.t51.setText("");
          
      }
            else if(evt.getKeyCode()==KeyEvent.VK_LEFT){ 
               if(this.t51.getText().equals("")){this.dayline.setBackground(Color.RED);this.t51.setText("Day");d1=false;}
               else if(this.t51.getText().equals("Day")&&d1)this.dayline.setBackground(new Color(204,204,204));
               else{        int number=0;
              for(int i=0;i<this.t51.getText().length();i++)if(Character.isDigit(this.t51.getText().charAt(i)))number++;  
               if(number==this.t51.getText().length()){
                   if(Integer.parseInt(this.t51.getText())>=1&&Integer.parseInt(this.t51.getText())<31){
                   this.dayline.setBackground(new Color(204,204,204));d1=true;}
                   else{this.dayline.setBackground(Color.RED);}
                       } else{this.dayline.setBackground(Color.RED);}
               }
      
              this.t53.requestFocus(rootPaneCheckingEnabled);}
            
              else if(evt.getKeyCode()==KeyEvent.VK_RIGHT || evt.getKeyCode()==KeyEvent.VK_ENTER){ 
                  this.t522.requestFocus(rootPaneCheckingEnabled);
                  if(this.t51.getText().equals("")){this.dayline.setBackground(Color.RED);this.t51.setText("Day");d1=false;}
                   else if(this.t51.getText().equals("Day")&&d1){this.dayline.setBackground(new Color(204,204,204));}
               else{  
                         
                            int number=0;
              for(int i=0;i<this.t51.getText().length();i++)if(Character.isDigit(this.t51.getText().charAt(i)))number++;  
               if(number==this.t51.getText().length()){
                   if(Integer.parseInt(this.t51.getText())>=1&&Integer.parseInt(this.t51.getText())<=31){
                   this.dayline.setBackground(new Color(204,204,204));d1=true;}
                   else{this.dayline.setBackground(Color.RED);}
                       } else{this.dayline.setBackground(Color.RED);}
               }
                   
              }
    }//GEN-LAST:event_t51KeyPressed

    private void t522KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t522KeyPressed
        if(evt.getKeyCode()!=KeyEvent.VK_ENTER&&evt.getKeyCode()!=KeyEvent.VK_LEFT&&
                   evt.getKeyCode()!=KeyEvent.VK_RIGHT){
          month=true;
          if(t522.getText().equals("Month"))this.t522.setText("");
          
      }
            else if(evt.getKeyCode()==KeyEvent.VK_LEFT){ 
               if(this.t522.getText().equals("")){this.monthline.setBackground(Color.RED);this.t522.setText("Month");d2=false;}
                else if(this.t522.getText().equals("Month")&&d2)this.monthline.setBackground(new Color(204,204,204));
               else{        int number=0;
              for(int i=0;i<this.t522.getText().length();i++)if(Character.isDigit(this.t522.getText().charAt(i)))number++;  
               if(number==this.t522.getText().length()){
                   if(Integer.parseInt(this.t522.getText())>=1&&Integer.parseInt(this.t522.getText())<=12){
                     
                   this.monthline.setBackground(new Color(204,204,204));d2=true;}
                   else{this.monthline.setBackground(Color.RED);}
                       } else{this.monthline.setBackground(Color.RED);}
               }
      
              this.t51.requestFocus(rootPaneCheckingEnabled);}
              else if(evt.getKeyCode()==KeyEvent.VK_RIGHT||evt.getKeyCode()==KeyEvent.VK_ENTER){ 
                  this.t53.requestFocus(rootPaneCheckingEnabled);
                  if(this.t522.getText().equals("")){this.monthline.setBackground(Color.RED);this.t522.setText("Month");d2=false;}
                    else if(this.t522.getText().equals("Month")&&d2)this.monthline.setBackground(new Color(204,204,204));
               else{     
                     
                 
                      int number=0;
              for(int i=0;i<this.t522.getText().length();i++)if(Character.isDigit(this.t522.getText().charAt(i)))number++;  
               if(number==this.t522.getText().length()){
                   if(Integer.parseInt(this.t522.getText())>=1&&Integer.parseInt(this.t522.getText())<=12){
                   this.monthline.setBackground(new Color(204,204,204));d2=true;}
                   else{this.monthline.setBackground(Color.RED);}
                       } else{this.monthline.setBackground(Color.RED);}
               }
                    
      
              }
    }//GEN-LAST:event_t522KeyPressed

    private void t53KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t53KeyPressed
               if(evt.getKeyCode()!=KeyEvent.VK_ENTER&&evt.getKeyCode()!=KeyEvent.VK_LEFT&&
                   evt.getKeyCode()!=KeyEvent.VK_RIGHT){
          year=true;
          if(t53.getText().equals("Year"))this.t53.setText("");
          
      }
            else if(evt.getKeyCode()==KeyEvent.VK_LEFT){ 
                   this.t522.requestFocus(rootPaneCheckingEnabled);
               if(this.t53.getText().equals("")){this.yearline.setBackground(Color.RED);this.t53.setText("Year");d3=false;}
                else if(this.t53.getText().equals("Year")&&d3)this.yearline.setBackground(new Color(204,204,204));
               else{        int number=0;
              for(int i=0;i<this.t53.getText().length();i++)if(Character.isDigit(this.t53.getText().charAt(i)))number++;  
               if(number==this.t53.getText().length()){
                   if(Integer.parseInt(this.t53.getText())>1980&&Integer.parseInt(this.t53.getText())<2021){
                   this.yearline.setBackground(new Color(204,204,204));d3=true;}
                   else{this.yearline.setBackground(Color.RED);}
                       } else{this.yearline.setBackground(Color.RED);}
               }
      
           }
              else if(evt.getKeyCode()==KeyEvent.VK_RIGHT){ 
                  this.t51.requestFocus(rootPaneCheckingEnabled);
                  if(this.t53.getText().equals("")){this.background.setBackground(Color.RED);this.t53.setText("Year");d3=false;}
                      else if(this.t53.getText().equals("Year")&&d3)this.yearline.setBackground(new Color(204,204,204));
               else{   
                            
                      
                          int number=0;
              for(int i=0;i<this.t53.getText().length();i++)if(Character.isDigit(this.t53.getText().charAt(i)))number++;  
               if(number==this.t53.getText().length()){
                   if(Integer.parseInt(this.t53.getText())>1980&&Integer.parseInt(this.t53.getText())<2020){
                   this.yearline.setBackground(new Color(204,204,204));d3=true;}
                   else{this.yearline.setBackground(Color.RED);}
                       } else{this.yearline.setBackground(Color.RED);}
               }
                      
      
            }
              else{
                   boolean b1,b2,b3,b4,b5,b6,b7;
                    d1=d2=d3=false;
      m1=m2=m3=m4=false;

        if(this.t1.getText().equals("")){this.t1e1.setVisible(true);b1=false;}
        else if(this.t1.getText().equals("First name")){this.t1e1.setVisible(true);this.t1.setText("");b1=false;}
        else{ 
            int number=0;
            for(int i=0;i<this.t1.getText().length();i++)if(Character.isAlphabetic(this.t1.getText().charAt(i)))number++;
            if(number==this.t1.getText().length()){this.t1e2.setVisible(false);b1=true;}else{
            this.t1e2.setVisible(true);b1=false;}
            }
        
        if(this.t2.getText().equals("")){this.t2e1.setVisible(true);b2=false;this.t2e2.setVisible(false);}
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
     if(this.t4.getText().equals("")){this.t4e.setVisible(true);b4=false;}
        else if(this.t4.getText().equals("Amount paid")){this.t4e.setVisible(true);this.t4.setText("");b4=false;}
        else{ 
            int number=0;
            for(int i=0;i<this.t4.getText().length();i++)if(Character.isDigit(this.t4.getText().charAt(i)))number++;
            if(number==this.t4.getText().length()){this.t4e.setVisible(false);b4=true;}else{
            this.t4e.setVisible(true);b4=false;}
           }
        
        
           if(this.t51.getText().equals("")){this.dayline.setBackground(Color.RED);b5=false;}
               else if(this.t51.getText().equals("Day")){this.dayline.setBackground(Color.RED);b5=false;}
               else{        int number=0;
              for(int i=0;i<this.t51.getText().length();i++)if(Character.isDigit(this.t51.getText().charAt(i)))number++;  
               if(number==this.t51.getText().length()){
                   if(Integer.parseInt(this.t51.getText())>=1&&Integer.parseInt(this.t51.getText())<=31){
                   this.dayline.setBackground(new Color(204,204,204));b5=true;}
                   else{this.dayline.setBackground(Color.RED);b5=false;}
                       } else{this.dayline.setBackground(Color.RED);b5=false;}
               }
        if(this.t522.getText().equals("")){this.monthline.setBackground(Color.RED);b6=false;}
               else if(this.t522.getText().equals("Month")){this.monthline.setBackground(Color.RED);b6=false;}
               else{        int number=0;
              for(int i=0;i<this.t522.getText().length();i++)if(Character.isDigit(this.t522.getText().charAt(i)))number++;  
               if(number==this.t522.getText().length()){
                   if(Integer.parseInt(this.t522.getText())>=1&&Integer.parseInt(this.t522.getText())<=12){
                   this.monthline.setBackground(new Color(204,204,204));b6=true;}
                   else{this.monthline.setBackground(Color.RED);b6=false;}
                       } else{this.monthline.setBackground(Color.RED);b6=false;}
               }
         if(this.t53.getText().equals("")){this.yearline.setBackground(Color.RED);b7=false;}
               else if(this.t53.getText().equals("Year")){this.yearline.setBackground(Color.RED);b7=false;}
               else{        int number=0;
              for(int i=0;i<this.t53.getText().length();i++)if(Character.isDigit(this.t53.getText().charAt(i)))number++;  
               if(number==this.t53.getText().length()){
                   if(Integer.parseInt(this.t53.getText())>1980&&Integer.parseInt(this.t53.getText())<2020){
                   this.yearline.setBackground(new Color(204,204,204));b7=true;}
                   else{this.yearline.setBackground(Color.RED);b7=false;}
                       } else{this.yearline.setBackground(Color.RED);b7=false;}
               
               }

      
        /////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////
        if(b1&&b2&&b3&&b4&&b5&&b6&&b7){
      /////////////////////////////////////////////////////////////////////////////
       
       
       
       
       //raed
       
       
       //////////////////////////////////////////////////
            
             boolean f=true;
         try{
             EntityManagerFactory emf = Persistence.createEntityManagerFactory("Insurance_1PU");
            EntityManager em=emf.createEntityManager();
            Payment pay=new Payment();
            String s1=t1.getText();
            String s2=t2.getText();
            String s3=t3.getText();
            String s4=t4.getText();
            String s6=t51.getText();
            String s7=t522.getText();
            String s8=t53.getText();
            switch(Integer.parseInt(s7)){
                case 1: s7="JAN"; break; 
                case 2: s7="FEB"; break; 
                case 3: s7="MAR"; break; 
                case 4: s7="APR"; break; 
                case 5: s7="MAY"; break; 
                case 6: s7="JUN"; break; 
                case 7: s7="JUL"; break; 
                case 8: s7="AUG"; break; 
                case 9: s7="SEP"; break; 
                case 10: s7="OCT"; break; 
                case 11: s7="NOV"; break; 
                case 12: s7="DEC"; break; 
                 }
            String s9=s6+"-"+s7+"-"+s8;
            Date date=new Date(s9);
                 pay.setFirstName(s1);
                 pay.setLastName(s2);
                 pay.setSsn(Long.parseLong(s3));
                 pay.setAmountHePaid(Integer.parseInt(s4));
            em.getTransaction().begin();
            em.persist(pay);
            em.getTransaction().commit();
            em.close();}
         
            catch(Exception ex){
          JOptionPane.showMessageDialog(null, "This customer exist or customer does not exist,\n please check data you entered");
          f=false;
         }
         if(f==true){JOptionPane.showMessageDialog(null, "Done");
        t1.setText("First name");
        t2.setText("Last name");
        t3.setText("Ssn");
        t4.setText("Amount paid");
        t51.setText("Day");
        t522.setText("Month");
        t53.setText("Year");
         this.t1.requestFocus(rootPaneCheckingEnabled);
          this.t1e1.setVisible(false);
         this.t2e1.setVisible(false);
         this.t3e1.setVisible(false);
         this.t4e.setVisible(false);
         this.t1e2.setVisible(false);
         this.t2e2.setVisible(false);
         this.t3e2.setVisible(false);
         dayline.setBackground(new Color(240,240,240));
         yearline.setBackground(new Color(240,240,240));
         monthline.setBackground(new Color(240,240,240));
         redp.setVisible(false);d1=d2=d3=true;
        m1=m2=m3=m4=m5=day=month=year=false;
       click=true;
         }
        
        }
        
              }
    }//GEN-LAST:event_t53KeyPressed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
      boolean b1,b2,b3,b4,b5,b6,b7;
      d1=d2=d3=false;
      m1=m2=m3=m4=false;

        if(this.t1.getText().equals("")){this.t1e1.setVisible(true);b1=false;}
        else if(this.t1.getText().equals("First name")){this.t1e1.setVisible(true);this.t1.setText("");b1=false;}
        else{ 
            int number=0;
            for(int i=0;i<this.t1.getText().length();i++)if(Character.isAlphabetic(this.t1.getText().charAt(i)))number++;
            if(number==this.t1.getText().length()){this.t1e2.setVisible(false);b1=true;}else{
            this.t1e2.setVisible(true);b1=false;}
            this.t1e1.setVisible(false);b1=true;}
        
        if(this.t2.getText().equals("")){this.t2e1.setVisible(true);b2=false;this.t2e2.setVisible(false);}
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
     if(this.t4.getText().equals("")){this.t4e.setVisible(true);b4=false;}
        else if(this.t4.getText().equals("Amount paid")){this.t4e.setVisible(true);this.t4.setText("");b4=false;}
        else{ 
            int number=0;
            for(int i=0;i<this.t4.getText().length();i++)if(Character.isDigit(this.t4.getText().charAt(i)))number++;
            if(number==this.t4.getText().length()){this.t4e.setVisible(false);b4=true;}else{
            this.t4e.setVisible(true);b4=false;}
           }
        
        
           if(this.t51.getText().equals("")){this.dayline.setBackground(Color.RED);b5=false;}
               else if(this.t51.getText().equals("Day")){this.dayline.setBackground(Color.RED);b5=false;}
               else{        int number=0;
              for(int i=0;i<this.t51.getText().length();i++)if(Character.isDigit(this.t51.getText().charAt(i)))number++;  
               if(number==this.t51.getText().length()){
                   if(Integer.parseInt(this.t51.getText())>=1&&Integer.parseInt(this.t51.getText())<=31){
                   this.dayline.setBackground(new Color(204,204,204));b5=true;}
                   else{this.dayline.setBackground(Color.RED);b5=false;}
                       } else{this.dayline.setBackground(Color.RED);b5=false;}
               }
        if(this.t522.getText().equals("")){this.monthline.setBackground(Color.RED);b6=false;}
               else if(this.t522.getText().equals("Month")){this.monthline.setBackground(Color.RED);b6=false;}
               else{        int number=0;
              for(int i=0;i<this.t522.getText().length();i++)if(Character.isDigit(this.t522.getText().charAt(i)))number++;  
               if(number==this.t522.getText().length()){
                   if(Integer.parseInt(this.t522.getText())>=1&&Integer.parseInt(this.t522.getText())<=12){
                   this.monthline.setBackground(new Color(204,204,204));b6=true;}
                   else{this.monthline.setBackground(Color.RED);b6=false;}
                       } else{this.monthline.setBackground(Color.RED);b6=false;}
               }
         if(this.t53.getText().equals("")){this.yearline.setBackground(Color.RED);b7=false;}
               else if(this.t53.getText().equals("Year")){this.yearline.setBackground(Color.RED);b7=false;}
               else{        int number=0;
              for(int i=0;i<this.t53.getText().length();i++)if(Character.isDigit(this.t53.getText().charAt(i)))number++;  
               if(number==this.t53.getText().length()){
                   if(Integer.parseInt(this.t53.getText())>1980&&Integer.parseInt(this.t53.getText())<2020){
                   this.yearline.setBackground(new Color(204,204,204));b7=true;}
                   else{this.yearline.setBackground(Color.RED);b7=false;}
                       } else{this.yearline.setBackground(Color.RED);b7=false;}
               
               }

         /////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////
        if(b1&&b2&&b3&&b4&&b5&&b6&&b7){
        /////////////////////////////////////////////////////////////////////////////
       
       
       
       
       //raed
       
       
       //////////////////////////////////////////////////
            
            boolean f=true;
         try{
             EntityManagerFactory emf = Persistence.createEntityManagerFactory("Insurance_1PU");
            EntityManager em=emf.createEntityManager();
            Payment pay=new Payment();
            String s1=t1.getText();
            String s2=t2.getText();
            String s3=t3.getText();
            String s4=t4.getText();
            String s6=t51.getText();
            String s7=t522.getText();
            String s8=t53.getText();
            switch(Integer.parseInt(s7)){
                case 1: s7="JAN"; break; 
                case 2: s7="FEB"; break; 
                case 3: s7="MAR"; break; 
                case 4: s7="APR"; break; 
                case 5: s7="MAY"; break; 
                case 6: s7="JUN"; break; 
                case 7: s7="JUL"; break; 
                case 8: s7="AUG"; break; 
                case 9: s7="SEP"; break; 
                case 10: s7="OCT"; break; 
                case 11: s7="NOV"; break; 
                case 12: s7="DEC"; break; 
                 }
            String s9=s6+"-"+s7+"-"+s8;
            Date date=new Date(s9);
                 pay.setFirstName(s1);
                 pay.setLastName(s2);
                 pay.setSsn(Long.parseLong(s3));
                 pay.setAmountHePaid(Integer.parseInt(s4));
            em.getTransaction().begin();
            em.persist(pay);
            em.getTransaction().commit();
            em.close();}
         
            catch(Exception ex){
          JOptionPane.showMessageDialog(null, "This customer exist or customer does not exist,\n please check data you entered");
          f=false;
         }
         if(f==true){JOptionPane.showMessageDialog(null, "Done");
        t1.setText("First name");
        t2.setText("Last name");
        t3.setText("Ssn");
        t4.setText("Amount paid");
        t51.setText("Day");
        t522.setText("Month");
        t53.setText("Year");
         this.t1.requestFocus(rootPaneCheckingEnabled);
          this.t1e1.setVisible(false);
         this.t2e1.setVisible(false);
         this.t3e1.setVisible(false);
         this.t4e.setVisible(false);
         this.t1e2.setVisible(false);
         this.t2e2.setVisible(false);
         this.t3e2.setVisible(false);
         dayline.setBackground(new Color(240,240,240));
         yearline.setBackground(new Color(240,240,240));
         monthline.setBackground(new Color(240,240,240));
         redp.setVisible(false);d1=d2=d3=true;
        m1=m2=m3=m4=m5=day=month=year=false;
       click=true;
         }
        
        }
        
    }//GEN-LAST:event_jLabel3MouseClicked

    private void t1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t1KeyReleased
      
    }//GEN-LAST:event_t1KeyReleased

    private void t51MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t51MouseExited
          if(this.t51.getText().equals("")){this.dayline.setBackground(Color.RED);this.t51.setText("Day");d1=false;}
               else if(this.t51.getText().equals("Day")&&d1)this.dayline.setBackground(new Color(204,204,204));
               else{        int number=0;
              for(int i=0;i<this.t51.getText().length();i++)if(Character.isDigit(this.t51.getText().charAt(i)))number++;  
               if(number==this.t51.getText().length()){
                   if(Integer.parseInt(this.t51.getText())>=1&&Integer.parseInt(this.t51.getText())<31){
                   this.dayline.setBackground(new Color(204,204,204));d1=true;}
                   else{this.dayline.setBackground(Color.RED);}
                       } else{this.dayline.setBackground(Color.RED);}}
    }//GEN-LAST:event_t51MouseExited

    private void t522MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t522MouseExited
      if(this.t522.getText().equals("")){this.monthline.setBackground(Color.RED);this.t522.setText("Month");d2=false;}
                else if(this.t522.getText().equals("Month")&&d2)this.monthline.setBackground(new Color(204,204,204));
               else{        int number=0;
              for(int i=0;i<this.t522.getText().length();i++)if(Character.isDigit(this.t522.getText().charAt(i)))number++;  
               if(number==this.t522.getText().length()){
                   if(Integer.parseInt(this.t522.getText())>=1&&Integer.parseInt(this.t522.getText())<=12){
                     
                   this.monthline.setBackground(new Color(204,204,204));d2=true;}
                   else{this.monthline.setBackground(Color.RED);}
                       } else{this.monthline.setBackground(Color.RED);}}
    }//GEN-LAST:event_t522MouseExited

    private void t53MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t53MouseExited
      if(this.t53.getText().equals("")){this.yearline.setBackground(Color.RED);this.t53.setText("Year");d3=false;}
                else if(this.t53.getText().equals("Year")&&d3)this.yearline.setBackground(new Color(204,204,204));
               else{        int number=0;
              for(int i=0;i<this.t53.getText().length();i++)if(Character.isDigit(this.t53.getText().charAt(i)))number++;  
               if(number==this.t53.getText().length()){
                   if(Integer.parseInt(this.t53.getText())>1980&&Integer.parseInt(this.t53.getText())<2021){
                   this.yearline.setBackground(new Color(204,204,204));d3=true;}
                   else{this.yearline.setBackground(Color.RED);}
                       } else{this.yearline.setBackground(Color.RED);}
               }
    }//GEN-LAST:event_t53MouseExited

    private void redpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_redpMouseClicked
        // TODO add your handling code hereset
        setVisible(false);

    }//GEN-LAST:event_redpMouseClicked

    private void redpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_redpMouseExited
        redp.setVisible(false);
        blue.setVisible(true);
    }//GEN-LAST:event_redpMouseExited

    private void piMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_piMouseEntered
        blue.setVisible(false);
        redp.setVisible(true);

    }//GEN-LAST:event_piMouseEntered

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
                new Pay_custmor().setVisible(true);
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
    private javax.swing.JPanel dayline;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel l1;
    private javax.swing.JPanel l2;
    private javax.swing.JPanel l3;
    private javax.swing.JPanel l4;
    private javax.swing.JPanel l5;
    private javax.swing.JPanel l6;
    private javax.swing.JPanel l7;
    private javax.swing.JPanel monthline;
    private javax.swing.JLabel pi;
    private javax.swing.JPanel pp;
    private javax.swing.JPanel pp1;
    private javax.swing.JPanel pp2;
    private javax.swing.JPanel pp3;
    private javax.swing.JPanel pp4;
    private javax.swing.JPanel redp;
    private javax.swing.JPanel s1;
    private javax.swing.JPanel s2;
    private javax.swing.JPanel s3;
    private javax.swing.JPanel s4;
    private javax.swing.JPanel s5;
    private javax.swing.JTextField t1;
    private javax.swing.JLabel t1e1;
    private javax.swing.JLabel t1e2;
    private javax.swing.JTextField t2;
    private javax.swing.JLabel t2e1;
    private javax.swing.JLabel t2e2;
    private javax.swing.JTextField t3;
    private javax.swing.JLabel t3e1;
    private javax.swing.JLabel t3e2;
    private javax.swing.JTextField t4;
    private javax.swing.JLabel t4e;
    private javax.swing.JTextField t51;
    private javax.swing.JTextField t522;
    private javax.swing.JTextField t53;
    private javax.swing.JLabel t5e;
    private javax.swing.JPanel title;
    private javax.swing.JPanel yearline;
    // End of variables declaration//GEN-END:variables
}
